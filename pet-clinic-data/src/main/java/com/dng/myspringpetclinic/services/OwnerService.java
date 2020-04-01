package com.dng.myspringpetclinic.services;

import com.dng.myspringpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(Long id);
}
