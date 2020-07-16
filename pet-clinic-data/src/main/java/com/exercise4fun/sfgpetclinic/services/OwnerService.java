package com.exercise4fun.sfgpetclinic.services;

import com.exercise4fun.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
