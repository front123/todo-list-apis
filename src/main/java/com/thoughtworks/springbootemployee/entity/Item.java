package com.thoughtworks.springbootemployee.entity;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;
    @Column(name = "is_done")
    private Boolean done;

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }



    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }



    public Item(String text) {
        this.text = text;
    }
    public Item(String text, Boolean done){
        this.text = text;
        this.done = done;
    }

    public Item() {
    }
}
