package com.wozu.labA.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String color;
    private Boolean needsToBePeeled;
    private String size;
    private Boolean isTropical;

    public Fruit(){}

    public  Fruit(String color, Boolean needsToBePeeled, String size, String name){
        this.color = color;
        this.name = name;
        this.needsToBePeeled = needsToBePeeled;
        this.size = size;
        this.isTropical = isTropical;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getNeedsToBePeeled() {
        return needsToBePeeled;
    }

    public void setNeedsToBePeeled(Boolean needsToBePeeled) {
        this.needsToBePeeled = needsToBePeeled;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getTropical() {
        return isTropical;
    }

    public void setTropical(Boolean tropical) {
        isTropical = tropical;
    }
}
