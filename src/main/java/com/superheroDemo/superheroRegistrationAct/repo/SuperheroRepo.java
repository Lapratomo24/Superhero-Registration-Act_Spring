package com.superheroDemo.superheroRegistrationAct.repo;

import com.superheroDemo.superheroRegistrationAct.model.Superhero;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperheroRepo extends JpaRepository<Superhero, Long> {

}
