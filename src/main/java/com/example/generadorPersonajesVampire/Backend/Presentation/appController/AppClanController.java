package com.example.generadorPersonajesVampire.Backend.Presentation.appController;

import com.example.generadorPersonajesVampire.Backend.Model.Clan.Clan;
import com.example.generadorPersonajesVampire.Backend.Repositories.ClanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.ConditionalOnGraphQlSchema;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppClanController {

    @Autowired
    private ClanRepository clanRepository;

    @GetMapping("/")
    public String mensaje(){
        return "Esto es una prueba de conexion";
    }

    @GetMapping("/vampapp/clanes")
    public ModelAndView getClanes() {
        List<Clan> clans = clanRepository.findAll();
        ModelAndView mav = new ModelAndView("clan");
        mav.addObject("clan", clans);

        return mav;
    }
}


