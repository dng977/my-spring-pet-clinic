package com.dng.myspringpetclinic.model;


import com.sun.xml.bind.v2.model.core.ID;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
