package com.shobhit.r2dbc.moviesearch.model;

import org.springframework.data.annotation.Id;

public class Movie {

  @Id
  private String Id;

  private String name;
  private String production;
  private String director;
  private int year;

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    Id = id;
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

  public Movie(String id, String name, String production, String director, int year) {
    Id = id;
    this.name = name;
    this.production = production;
    this.director = director;
    this.year = year;
  }

  public Movie() {
  }

  @Override
  public String toString() {
    return "Movie [Id=" + Id + ", director=" + director + ", name=" + name + ", production=" + production + ", year="
        + year + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((Id == null) ? 0 : Id.hashCode());
    result = prime * result + ((director == null) ? 0 : director.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((production == null) ? 0 : production.hashCode());
    result = prime * result + year;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Movie other = (Movie) obj;
    if (Id == null) {
      if (other.Id != null)
        return false;
    } else if (!Id.equals(other.Id))
      return false;
    if (director == null) {
      if (other.director != null)
        return false;
    } else if (!director.equals(other.director))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (production == null) {
      if (other.production != null)
        return false;
    } else if (!production.equals(other.production))
      return false;
    if (year != other.year)
      return false;
    return true;
  }

}
