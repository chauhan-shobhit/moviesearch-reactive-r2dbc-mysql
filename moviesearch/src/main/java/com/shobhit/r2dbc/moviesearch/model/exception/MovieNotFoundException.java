package com.shobhit.r2dbc.moviesearch.model.exception;

public class MovieNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 1L;
  private String message;

  public MovieNotFoundException(String message) {
    super(message);
    this.message = message;
  }

  public MovieNotFoundException() {
    super();
  }

  public String getFieldName() {
    return message;
  }

  public void setFieldName(String message) {
    this.message = message;
  }
}
