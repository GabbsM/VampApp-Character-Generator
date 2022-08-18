package com.example.generadorPersonajesVampire.Backend.Repositories;

import com.example.generadorPersonajesVampire.Backend.Model.DatosPj.DatosPj;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatosPjRepository extends JpaRepository<DatosPj,Integer> {
}
