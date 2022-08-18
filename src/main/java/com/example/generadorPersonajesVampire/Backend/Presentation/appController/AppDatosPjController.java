package com.example.generadorPersonajesVampire.Backend.Presentation.appController;

import com.example.generadorPersonajesVampire.Backend.Model.DatosPj.DatosPj;
import com.example.generadorPersonajesVampire.Backend.Repositories.DatosPjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppDatosPjController {

        @Autowired
        private DatosPjRepository datosPjRepository;

        @GetMapping("/vampapp/datospjs")
        public ModelAndView getDatosPj(){

            List<DatosPj> datosPjs = datosPjRepository.findAll();
            ModelAndView mav = new ModelAndView("datosPj");
            mav.addObject("datosPj",datosPjs);

            return mav;

        }
}
