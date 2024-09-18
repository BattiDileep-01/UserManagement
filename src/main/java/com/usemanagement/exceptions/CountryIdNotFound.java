package com.usemanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CountryIdNotFound  extends  RuntimeException{

    public CountryIdNotFound(String message){
        super(message);
    }
}
