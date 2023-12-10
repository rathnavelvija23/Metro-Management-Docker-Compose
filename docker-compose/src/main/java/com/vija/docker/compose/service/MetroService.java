package com.vija.docker.compose.service;

import com.vija.docker.compose.model.Rail;
import com.vija.docker.compose.repo.MetroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MetroService {

    @Autowired
    private MetroRepository railRepository;


    public Rail addRail(Rail rail) {

        rail.setRailId(UUID.randomUUID().toString().split("-")[0]);
        return railRepository.save(rail);

    }


    public List<Rail> findAllRails(){
        return railRepository.findAll();
    }
}
