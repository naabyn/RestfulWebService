package com.nabin.ConsumingaRestfulWebService.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResource {
    private int id;
    private String book_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getBook_name() {

        return book_name;
    }

    public void setBook_name(String book_name) {

        this.book_name = book_name;
    }
}