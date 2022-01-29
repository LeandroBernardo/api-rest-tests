package br.com.projectwithtests.api.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException(String message) {
        super(message);
    }
}
