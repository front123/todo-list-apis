package com.thoughtworks.springbootemployee.dto;

public class ItemResponseDto {
    private String id;
    private String text;
    private Boolean done;

    public ItemResponseDto(){

    }
    public ItemResponseDto(String id, String text, Boolean done){
        this.id = id;
        this.text = text;
        this.done = done;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
