package com.younggam.morethanchat.exception;

public class EmptyException extends RuntimeException {
    public EmptyException(){}

    public EmptyException(String message) {
        super(message);
    }
}
