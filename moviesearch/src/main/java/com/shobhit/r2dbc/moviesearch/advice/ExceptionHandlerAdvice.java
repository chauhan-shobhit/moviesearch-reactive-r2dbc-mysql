package com.shobhit.r2dbc.moviesearch.advice;

import com.shobhit.r2dbc.moviesearch.model.CustomErrorResponse;
import com.shobhit.r2dbc.moviesearch.model.exception.MovieAlreadyExistException;
import com.shobhit.r2dbc.moviesearch.model.exception.MovieNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

  @ExceptionHandler({ MovieAlreadyExistException.class })
  public ResponseEntity<CustomErrorResponse> handleProductAlreadyExistException(Throwable e) {
    CustomErrorResponse response = new CustomErrorResponse("100", "Movie Already Exists");
    return new ResponseEntity<>(response, HttpStatus.CONFLICT);
  }

  @ExceptionHandler({ MovieNotFoundException.class })
  public ResponseEntity<CustomErrorResponse> handleProductNotFoundException(Throwable e) {
    CustomErrorResponse response = new CustomErrorResponse("404", "Book Not Found");
    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
  }

}
