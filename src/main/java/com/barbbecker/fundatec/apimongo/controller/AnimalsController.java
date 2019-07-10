package com.barbbecker.fundatec.apimongo.controller;

import com.barbbecker.fundatec.apimongo.domain.Animals;
import com.barbbecker.fundatec.apimongo.repository.AnimalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/apimongo")
public class AnimalsController {

    @Autowired
    private AnimalsRepository animalsRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Animals> getAllAnimals() {
        return animalsRepository.findAll();
    }

    @RequestMapping(value = "/{nroChip}", method = RequestMethod.GET)
    public Animals getAnimalByNroChip(@PathVariable("nroChip") String nroChip) {
        return animalsRepository.findByNroChip(nroChip);
    }

    @RequestMapping(value = "/{nroChip}", method = RequestMethod.DELETE)
    public void deleteAnimalByNroChip(@PathVariable("nroChip") String nroChip) {
        animalsRepository.delete(animalsRepository.findByNroChip(nroChip));
    }

    @RequestMapping(value = "/{nroChip}", method = RequestMethod.PUT)
    public void updateAnimalByNroChip(@PathVariable("nroChip") String nroChip, @Valid @RequestBody Animals animal) {
        animal.setNroChip(nroChip);
        animalsRepository.save(animal);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Animals addAnimal(@Valid @RequestBody Animals animal) {
        animal.setNroChip(animal.getNroChip());
        animalsRepository.save(animal);
        return animal;
    }

}
