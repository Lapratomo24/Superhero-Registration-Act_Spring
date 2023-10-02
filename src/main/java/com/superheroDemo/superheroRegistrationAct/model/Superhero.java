package com.superheroDemo.superheroRegistrationAct.model;

import jakarta.persistence.*;

@Entity
@Table(name="superheroes")
public class Superhero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Superhero")
    private String heroName;
    @Column(name="First Name")
    private String firstName;
    @Column(name="Last Name")
    private String lastName;
    @Column(name="Base of Operation")
    private String baseOfOperation;
    @Column(name="Affiliation")
    private String affiliation;

    public Superhero() {}

    public Superhero(String heroName, String firstName, String lastName, String baseOfOperation, String affiliation) {
        this.heroName = heroName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseOfOperation = baseOfOperation;
        this.affiliation = affiliation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBaseOfOperation() {
        return baseOfOperation;
    }

    public void setBaseOfOperation(String baseOfOperation) {
        this.baseOfOperation = baseOfOperation;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "id=" + id +
                ", heroName='" + heroName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", baseOfOperation='" + baseOfOperation + '\'' +
                ", affiliation='" + affiliation + '\'' +
                '}';
    }

}
