package com.example.generadorPersonajesVampire.Backend.Repositories;

import com.example.generadorPersonajesVampire.Backend.Model.Clan.Clan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClanRepository extends JpaRepository<Clan,Integer> {
}
