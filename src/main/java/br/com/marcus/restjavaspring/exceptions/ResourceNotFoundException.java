package br.com.marcus.restjavaspring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialversionuid = 1l;

    public ResourceNotFoundException(String ex) {
        super(ex);
    }
}
