package com.thoughtworks.springbootemployee.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String text;
    @NotNull
    private Boolean isDone;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Boolean getDone() {
        return isDone;
    }
}
