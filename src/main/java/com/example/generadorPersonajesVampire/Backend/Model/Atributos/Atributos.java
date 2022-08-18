package com.example.generadorPersonajesVampire.Backend.Model.Atributos;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Atributos")
public class Atributos {

    @Id
    private int id;

    private int Fisicos ;
    private int Sociales;
    private int Mentales;
}
