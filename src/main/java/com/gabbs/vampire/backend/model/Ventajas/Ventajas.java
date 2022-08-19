package com.gabbs.vampire.backend.model.Ventajas;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Ventajas")
public class Ventajas {

    @Id
    private int id;

    int aliados;
    int contactos;
    int generacion;
    int criados;
    int influencia;
    int mentor;
    int rebanio;
    int recursos;
    int posicion;
}
