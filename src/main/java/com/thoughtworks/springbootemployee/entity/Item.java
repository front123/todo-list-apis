package com.thoughtworks.springbootemployee.entity;

public class Item {
    private Integer id;
    private String text;
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
