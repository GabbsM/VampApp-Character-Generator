package com.example.generadorPersonajesVampire.Backend.Presentation.appController;

import com.example.generadorPersonajesVampire.Backend.Model.Ventajas.Ventajas;
import com.example.generadorPersonajesVampire.Backend.Repositories.VentajasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppVentajasController {

    @Autowired
    VentajasRepository ventajasRepository;

    @GetMapping("vampapp/ventajas")
    public ModelAndView getVentajas(){

        List<Ventajas> ventajas = ventajasRepository.findAll();
        ModelAndView mav = new ModelAndView("ventajas");
        mav.addObject("ventajas",ventajas);

        return mav;
    }
}
