package com.tasklist.system.domain.exception;

public class ResourceNotMappedException extends RuntimeException{
    public ResourceNotMappedException(String message) {
        super(message);
    }
}
