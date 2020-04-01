package com.dng.myspringpetclinic.services.map;

import com.dng.myspringpetclinic.model.Pet;
import com.dng.myspringpetclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet object) {
        return super.save(object, object.getId());
    }
}
