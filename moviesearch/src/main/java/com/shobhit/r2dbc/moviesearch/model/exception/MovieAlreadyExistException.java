package com.shobhit.r2dbc.moviesearch.model.exception;

public class MovieAlreadyExistException extends RuntimeException {

  private static final long serialVersionUID = 1L;
  private String message;

  public MovieAlreadyExistException(String message) {
    super(message);
    this.message = message;
  }

  public MovieAlreadyExistException() {
    super();
  }

  public String getFieldName() {
    return message;
  }

  public void setFieldName(String message) {
    this.message = message;
  }

}
