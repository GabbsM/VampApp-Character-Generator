package com.gabbs.vampire.repository;

import lombok.Builder;
import lombok.Data;


import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "personaje")
public class PersonajeDAO {


    //Este model es exclusivamente para acceder a la base de datos.

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    private String nombre;
    private Integer edad;



    //DTO
/*    public com.gabbs.vampire.model.Personaje convertirAPersonaje(){

        return com.gabbs.vampire.model.Personaje.builder()
                .id(id)
                .name(nombre)
                .edad(edad)
                .build();
    }


    public PersonajeDAO(com.gabbs.vampire.model.Personaje personaje){
        this.id = personaje.getId();
        this.nombre = personaje.getName();
        this.edad = personaje.getEdad();
    }*/
}
