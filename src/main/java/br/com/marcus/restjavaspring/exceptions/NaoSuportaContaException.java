package br.com.marcus.restjavaspring.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NaoSuportaContaException extends RuntimeException{
    public NaoSuportaContaException() {
    }

    public NaoSuportaContaException(String message) {
        super(message);
    }

    public NaoSuportaContaException(String message, Throwable cause) {
        super(message, cause);
    }

    public NaoSuportaContaException(Throwable cause) {
        super(cause);
    }

    public NaoSuportaContaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
