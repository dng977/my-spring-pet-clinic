package com.dng.myspringpetclinic.services;

import com.dng.myspringpetclinic.model.Owner;
import com.dng.myspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
