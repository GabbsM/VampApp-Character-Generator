package com.gabbs.vampire.repository;


import com.gabbs.vampire.model.Personaje;

public class PersonajeDTO {

    public static Personaje construirPersonaje(PersonajeDAO personajeDAO, TransfondoDAO transfondoDAO){

        return Personaje.builder()
                .name(personajeDAO.getNombre())
                .edad(personajeDAO.getEdad())
                .id(personajeDAO.getId())
                .transfondo(transfondoDAO.getTransfondo())
                .build();

    }

    public static PersonajeDAO extraerPersonaje(Personaje personaje){

        return PersonajeDAO.builder()
                .id(personaje.getId())
                .nombre(personaje.getName())
                .edad(personaje.getEdad())
                .build();
    }

    public static TransfondoDAO extraerTransfondo (Personaje personaje){


        return TransfondoDAO.builder()
                .personajeId(personaje.getId())
                .transfondo(personaje.getTransfondo())
                .build();
    }
}
