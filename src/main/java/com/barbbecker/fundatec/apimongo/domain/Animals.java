package com.barbbecker.fundatec.apimongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Animals {

    private String name;
    private String breed;
    private String owner;

    @Id
    private String nroChip;
    private LocalDate dateOfBirth;
    private String typeOfAnimal;
    private String color;

    public Animals(String name, String breed, String owner, String nroChip, LocalDate dateOfBirth, String typeOfAnimal, String color) {
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.nroChip = nroChip;
        this.dateOfBirth = dateOfBirth;
        this.typeOfAnimal = typeOfAnimal;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getOwner() {
        return owner;
    }

    public String getNroChip() {
        return nroChip;
    }

    public void setNroChip(String nroChip) {
        this.nroChip = nroChip;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public String getColor() {
        return color;
    }

}
