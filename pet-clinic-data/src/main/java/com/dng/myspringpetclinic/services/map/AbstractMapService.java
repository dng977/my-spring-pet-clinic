package com.dng.myspringpetclinic.services.map;

import com.dng.myspringpetclinic.model.BaseEntity;
import com.dng.myspringpetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID>{
    protected Map<ID, T> map = new HashMap<>();

    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    public T findById(ID id){
        return map.get(id);
    }

    public T save(T object, ID id){
        map.put(id, object);
        return object;
    }

    public void deleteById(ID id ){
        map.remove(id);
    }

    public void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
