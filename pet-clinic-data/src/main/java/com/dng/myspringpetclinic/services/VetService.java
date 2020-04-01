package com.dng.myspringpetclinic.services;

import com.dng.myspringpetclinic.model.Pet;
import com.dng.myspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
