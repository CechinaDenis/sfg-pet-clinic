package com.exercise4fun.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

//    @Getter
//    @Setter
    private Long id;

    public void setId(Long id) {this.id = id;}

    public Long getId() {
        return id;
    }
}
