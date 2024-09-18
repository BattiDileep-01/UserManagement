package com.usemanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StateIdNotFound extends RuntimeException{

    public StateIdNotFound(String message){
        super(message);
    }
}
