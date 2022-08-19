package com.gabbs.vampire.controller;

import com.gabbs.vampire.model.Personaje;
import com.gabbs.vampire.service.PersonajeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/personaje")
public class PersonajeController {

    private final PersonajeService personajeService;

    //Creacion personaje
    @PostMapping("")
    public Personaje crear(@RequestBody Personaje personaje){

       return personajeService.create(personaje);

    }

    //Lectura de personaje
    @GetMapping("")
    public Personaje leer(@RequestParam int id){

        return personajeService.findById(id).orElse(null);
    }

    @PutMapping("")
    public Personaje actualizar(@RequestBody Personaje personaje){

        return personajeService.update(personaje);
    }

    @DeleteMapping("")
    public void  borrar(@RequestParam int id){

          personajeService.delete(id);
    }

}
