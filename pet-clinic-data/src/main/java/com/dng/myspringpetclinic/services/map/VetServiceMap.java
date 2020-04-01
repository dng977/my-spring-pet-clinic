package com.dng.myspringpetclinic.services.map;

import com.dng.myspringpetclinic.model.Vet;
import com.dng.myspringpetclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet object) {
        return super.save(object, object.getId());
    }
}
