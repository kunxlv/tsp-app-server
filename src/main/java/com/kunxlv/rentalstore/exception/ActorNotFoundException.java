package com.kunxlv.rentalstore.exception;

public class ActorNotFoundException extends RuntimeException {
    public ActorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}