package com.gabbs.vampire.backend.model.Habilidades;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Habilidades")
public class Habilidades {

    @Id
    private int id;

    private int talentos;
    private int tecnicas;
    private int conocimientos;
}
