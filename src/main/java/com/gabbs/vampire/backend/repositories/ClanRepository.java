package com.gabbs.vampire.backend.repositories;

import com.gabbs.vampire.backend.model.Clan.Clan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClanRepository extends JpaRepository<Clan,Integer> {
}
