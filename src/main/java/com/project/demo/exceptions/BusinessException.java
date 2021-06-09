package com.project.demo.exceptions;

import com.project.demo.util.MessageUtils;

public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
