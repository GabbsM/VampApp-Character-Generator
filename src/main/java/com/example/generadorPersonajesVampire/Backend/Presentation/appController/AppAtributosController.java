package com.example.generadorPersonajesVampire.Backend.Presentation.appController;

import com.example.generadorPersonajesVampire.Backend.Model.Atributos.Atributos;
import com.example.generadorPersonajesVampire.Backend.Repositories.AtributoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppAtributosController {

    AtributoRepository atributoRepository;

    @GetMapping("vampapp/atributos")
    public ModelAndView getAtributos(){
        List<Atributos> atributos = atributoRepository.findAll();
        ModelAndView mav = new ModelAndView("atributos");
        mav.addObject("atributos",atributos);

        return mav;
    }

}
