package com.exercise4fun.model;

import lombok.Setter;

import java.io.Serializable;

public class BaseEntity implements Serializable {

//    @Getter
    @Setter
    private Long id;

    public Long getId() {
        return id;
    }
}
