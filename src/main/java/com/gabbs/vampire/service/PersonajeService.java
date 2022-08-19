package com.gabbs.vampire.service;

import com.gabbs.vampire.model.Personaje;
import com.gabbs.vampire.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonajeService {


    private final PersonajeRepository personajeRepository;
    private final TransfondoRepository transfondoRepository;

    // Metodo que guarda personajes
    public Personaje create(Personaje personaje){



        PersonajeDAO  personajeDAO = PersonajeDTO.extraerPersonaje(personaje);
        TransfondoDAO transfondoDAO = PersonajeDTO.extraerTransfondo(personaje);

        personajeDAO = personajeRepository.save(personajeDAO);
        transfondoDAO.setPersonajeId(personajeDAO.getId());
        transfondoDAO = transfondoRepository.save(transfondoDAO);

        return PersonajeDTO.construirPersonaje(personajeDAO,transfondoDAO);
    }

    // Metodo para buscar personaje por ID
    //todo implementar con DTO.
    public Optional<Personaje> findById(int id){

        //return personajeRepository.findById(id).map(PersonajeDAO::convertirAPersonaje);
        return Optional.empty();
    }

    // Metodo para modificar pj
    public Personaje update(Personaje personaje){
        //TODO verificar que el pj dado exista.Buscar por ID. Si existe este ID , actualizar los datos y guardar
       // return  personajeRepository.save(new PersonajeDAO(personaje)).convertirAPersonaje();
        return null;
    }

    //Metodo para borrar por ID.
    public void delete(int id){

        personajeRepository.deleteById(id);
    }

}
