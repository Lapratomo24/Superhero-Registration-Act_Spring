package com.superheroDemo.superheroRegistrationAct.controller;

import com.superheroDemo.superheroRegistrationAct.model.Superhero;
import com.superheroDemo.superheroRegistrationAct.repo.SuperheroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // create rest api
@RequestMapping("/superhero")
public class SuperheroController {

    @Autowired
    private SuperheroRepo superheroRepo;

    @GetMapping("/all")
    public List<Superhero> getAllSuperheroes() {
        return superheroRepo.findAll();
    }

    @PostMapping("/add")
    public Superhero addSuperhero(@RequestBody Superhero superhero) {
        return superheroRepo.save(superhero);
    }

}
