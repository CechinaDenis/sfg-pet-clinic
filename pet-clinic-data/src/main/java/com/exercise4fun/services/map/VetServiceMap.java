package com.exercise4fun.services.map;

import com.exercise4fun.model.Vet;
import com.exercise4fun.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapServices<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
