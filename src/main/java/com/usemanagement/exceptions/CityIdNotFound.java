package com.usemanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CityIdNotFound extends RuntimeException{

    public CityIdNotFound(String message){
        super(message);
    }
}
