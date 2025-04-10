package com.pokemon.service;

import net.tcgdex.sdk.TCGdex;
import net.tcgdex.sdk.models.Card;
import net.tcgdex.sdk.models.Set;
import net.tcgdex.sdk.models.SetResume;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PokemonCardService {
    private final TCGdex api;

    public PokemonCardService() {
        this.api = new TCGdex("en");
    }

    public List<SetResume> getAllSets() {
        try {
            return Arrays.asList(api.fetchSets());
        } catch (Exception e) {
            throw new RuntimeException("Error fetching sets: " + e.getMessage());
        }
    }

    public Set getSet(String setId) {
        try {
            return api.fetchSet(setId);
        } catch (Exception e) {
            throw new RuntimeException("Error fetching set: " + e.getMessage());
        }
    }

    public Card getCard(String setId, String cardNumber) {
        try {
            return api.fetchCard(setId, cardNumber);
        } catch (Exception e) {
            throw new RuntimeException("Error fetching card: " + e.getMessage());
        }
    }
} 