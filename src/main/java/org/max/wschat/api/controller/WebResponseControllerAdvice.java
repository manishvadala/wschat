package org.max.wschat.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class WebResponseControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public String handleRunTimeException(final RuntimeException e) {
        return "a";
    }
}
