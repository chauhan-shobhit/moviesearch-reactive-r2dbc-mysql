package com.shobhit.r2dbc.moviesearch.model;

import org.springframework.data.annotation.Id;

public class Movie {

  @Id
  private int id;

  private String name;
  private String production;
  private String director;
  private int year;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getProduction() {
    return production;
  }

  public void setProduction(String production) {
    this.production = production;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Movie(int id, String name, String production, String director, int year) {
    this.id = id;
    this.name = name;
    this.production = production;
    this.director = director;
    this.year = year;
  }

  public Movie() {
  }

  @Override
  public String toString() {
    return "Movie [Id=" + id + ", director=" + director + ", name=" + name + ", production=" + production + ", year="
        + year + "]";
  }

}
