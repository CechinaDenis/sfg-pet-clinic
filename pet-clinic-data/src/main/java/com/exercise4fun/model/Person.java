package com.exercise4fun.model;

import lombok.Getter;
import lombok.Setter;

public class Person extends BaseEntity{

    @Getter@Setter
    private String firstName;
    @Getter@Setter
    private String lastName;


}
