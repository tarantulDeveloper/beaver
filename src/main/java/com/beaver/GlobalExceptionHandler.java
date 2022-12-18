package com.beaver;

import com.beaver.exceptions.JwtException;
import com.beaver.exceptions.RegistrationException;
import com.beaver.exceptions.ResourceNotFoundException;
import com.beaver.payload.response.MyError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<MyError> catchResourceNotFound(ResourceNotFoundException e) {
        log.error(e.getMessage(), e);
        return new ResponseEntity<>(
                new MyError(HttpStatus.NOT_FOUND.value(), e.getMessage()),
                HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(JwtException.class)
    public ResponseEntity<MyError> catchJwtException(JwtException e) {
        log.error(e.getMessage(), e);
        return new ResponseEntity<>(
                new MyError(HttpStatus.UNAUTHORIZED.value(), e.getMessage()),
                HttpStatus.UNAUTHORIZED
        );
    }

    @ExceptionHandler(RegistrationException.class)
    public ResponseEntity<MyError> catchRegistrationException(RegistrationException e) {
        log.error(e.getMessage(), e);
        return new ResponseEntity<>(
                new MyError(HttpStatus.BAD_REQUEST.value(), e.getMessage()),
                HttpStatus.BAD_REQUEST
        );
    }


}
