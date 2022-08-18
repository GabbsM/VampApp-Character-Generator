package com.example.generadorPersonajesVampire.Backend.Presentation.appController;

import com.example.generadorPersonajesVampire.Backend.Model.Habilidades.Habilidades;
import com.example.generadorPersonajesVampire.Backend.Repositories.HabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppHabilidadesController {

    @Autowired
    HabilidadesRepository habilidadesRepository;

    @GetMapping("vampapp/habilidades")
    public ModelAndView getHabilidades(){
        List<Habilidades> habilidades = habilidadesRepository.findAll();
        ModelAndView mav = new ModelAndView("habilidades");
        mav.addObject("habilidades",habilidades);

        return mav;
    }
}
