package com.exercise4fun.services;

import com.exercise4fun.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
