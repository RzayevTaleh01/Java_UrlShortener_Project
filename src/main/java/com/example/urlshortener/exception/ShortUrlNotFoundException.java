package com.example.urlshortener.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ShortUrlNotFoundException extends RuntimeException{
    public  ShortUrlNotFoundException(String message){
        super(message);
    }
}
