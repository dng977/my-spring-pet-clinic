package com.dng.myspringpetclinic.services.map;

import com.dng.myspringpetclinic.model.Owner;
import com.dng.myspringpetclinic.services.CrudService;
import com.dng.myspringpetclinic.services.OwnerService;
import com.dng.myspringpetclinic.services.map.AbstractMapService;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

    @Override
    public Owner findByLastName(Long id) {
        return null;
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object, object.getId());
    }
}

