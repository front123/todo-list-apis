package com.thoughtworks.springbootemployee.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ItemDtoRequest {

    @NotBlank
    @Size(min = 1, max = 100)
    private String text;
    @NotNull
    private Boolean done;

    public ItemDtoRequest(){}
    public ItemDtoRequest(String text, Boolean done){
        this.text = text;
        this.done = done;
    }


    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
