package com.vija.docker.compose.controller;

import com.vija.docker.compose.model.Rail;
import com.vija.docker.compose.service.MetroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metro")
public class MetroController {

    @Autowired
    MetroService metroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Rail addCollege(@RequestBody Rail rail) {

        return metroService.addRail(rail);

    }

    @GetMapping
    public List<Rail> getAllColleges(String railId){
        return metroService.findAllRails();

    }

}
