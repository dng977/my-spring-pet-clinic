package com.dng.myspringpetclinic.services;

import com.dng.myspringpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(Long id);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
