package com.gabbs.vampire.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder

//Este modelo es el que voy a utilizar en el controller y el que va a devolver el Service
public class Personaje {

    private String name;
    private int id;
    private int edad;
    private String transfondo;




}
