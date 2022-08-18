package com.example.generadorPersonajesVampire.Backend.Model.Clan;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Clan")
public class Clan {

    @Id
    private int id;

    private String clan;
    private String disciplina1;
    private String disciplina2;
    private String disciplina3;

}
