package com.thoughtworks.springbootemployee.dto;

public class ItemResponseDto {
    private Integer id;
    private String text;
    private Boolean done;

    public ItemResponseDto(){

    }
    public ItemResponseDto(Integer id, String text, Boolean done){
        this.id = id;
        this.text = text;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
