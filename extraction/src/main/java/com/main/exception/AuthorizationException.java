package com.main.exception;

public class AuthorizationException extends RuntimeException {

    public AuthorizationException(String message) {
        super(message);
    }
    public AuthorizationException(Throwable t) {
        super(t);
    }
}
