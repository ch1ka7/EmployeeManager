package com.chyngyz.employeemanager.exception;

/**
 * Created by Chyngyz on 3/14/2021.
 */

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
