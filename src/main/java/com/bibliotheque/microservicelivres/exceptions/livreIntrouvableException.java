package com.bibliotheque.microservicelivres.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class livreIntrouvableException extends RuntimeException {
    public livreIntrouvableException(String s) {
        super(s);
    }
}
