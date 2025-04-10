package com.pokemon.controller;

import com.pokemon.service.PokemonCardService;
import net.tcgdex.sdk.models.Card;
import net.tcgdex.sdk.models.Set;
import net.tcgdex.sdk.models.SetResume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class PokemonCardController {

    @Autowired
    private PokemonCardService pokemonCardService;

    @GetMapping("/")
    public String home(Model model) {
        List<SetResume> sets = pokemonCardService.getAllSets();
        model.addAttribute("sets", sets);
        return "index";
    }

    @GetMapping("/set/{setId}")
    public String getSet(@PathVariable String setId, Model model) {
        Set set = pokemonCardService.getSet(setId);
        model.addAttribute("set", set);
        return "set";
    }

    @GetMapping("/card/{setId}/{cardNumber}")
    public String getCard(@PathVariable String setId, @PathVariable String cardNumber, Model model) {
        Card card = pokemonCardService.getCard(setId, cardNumber);
        model.addAttribute("card", card);
        return "card";
    }
} 