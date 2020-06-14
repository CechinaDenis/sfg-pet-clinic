package com.exercise4fun.services;

import com.exercise4fun.model.Owner;

import java.util.Set;

public interface PersonService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
