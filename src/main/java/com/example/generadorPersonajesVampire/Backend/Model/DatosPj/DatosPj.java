package com.example.generadorPersonajesVampire.Backend.Model.DatosPj;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "DatosPj")
public class DatosPj {

    @Id
    private int id;

    private String nombre;
    private String jugador;
    private String cronica;
    private String conducta;
    private String concepto;
    private final int generacion = 13;
    private String clan;
    private String refugio;
}
