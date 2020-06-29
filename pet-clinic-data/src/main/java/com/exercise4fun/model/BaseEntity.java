package com.exercise4fun.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    public void setId(Long id) {this.id = id;}

//    @Getter
//    @Setter
    private Long id;

    public Long getId() {
        return id;
    }
}
