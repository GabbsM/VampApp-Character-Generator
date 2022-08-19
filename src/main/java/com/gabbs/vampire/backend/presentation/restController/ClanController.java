package com.gabbs.vampire.backend.presentation.restController;

import com.gabbs.vampire.backend.model.Clan.Clan;
import com.gabbs.vampire.backend.repositories.ClanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClanController {

    @Autowired
    private ClanRepository clanRepository;

    @GetMapping("/clanes")
    public List<Clan> getAll(){

        return clanRepository.findAll();

    }
}
