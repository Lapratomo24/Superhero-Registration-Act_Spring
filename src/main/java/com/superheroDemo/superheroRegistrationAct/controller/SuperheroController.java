package com.superheroDemo.superheroRegistrationAct.controller;

import com.superheroDemo.superheroRegistrationAct.exception.ResourceNotFoundException;
import com.superheroDemo.superheroRegistrationAct.model.Superhero;
import com.superheroDemo.superheroRegistrationAct.repo.SuperheroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{id}")
    public ResponseEntity<Superhero> getSuperheroById(@PathVariable Long id) {
        Superhero superhero = superheroRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Superhero with the ID " + id + " does not exist."));
        return ResponseEntity.ok(superhero);
    }



}
