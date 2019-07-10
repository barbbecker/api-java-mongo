package com.barbbecker.fundatec.apimongo.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class AnimalsTest {

    @Test
    public void deveValidarAnimal() {
        LocalDate dataNascimento = LocalDate.of(2017, 9, 11);
        Animals animal = new Animals("Snow", "Shih-Tzu", "Bárbara Becker", "564478", dataNascimento, "dog", "white and brown");

        assertEquals("Snow", animal.getName());
        assertEquals("Shih-Tzu", animal.getBreed());
        assertEquals("Bárbara Becker", animal.getOwner());
        assertEquals("564478", animal.getNroChip());
        assertEquals(dataNascimento, animal.getDateOfBirth());
        assertEquals("dog", animal.getTypeOfAnimal());
        assertEquals("white and brown", animal.getColor());
    }
}
