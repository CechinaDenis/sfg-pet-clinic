package com.exercise4fun.model;

import lombok.Getter;

public class Person extends BaseEntity {

    //    @Setter
    @Getter
    private String firstName;

    //    @Setter
    @Getter
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
