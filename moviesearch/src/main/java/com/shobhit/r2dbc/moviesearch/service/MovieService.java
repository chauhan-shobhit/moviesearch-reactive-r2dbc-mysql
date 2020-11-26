package com.shobhit.r2dbc.moviesearch.service;

import com.shobhit.r2dbc.moviesearch.model.Movie;
import com.shobhit.r2dbc.moviesearch.repository.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MovieService {

  @Autowired
  private MovieRepository movieRepository;

  public Mono<Movie> createMovie(Movie movie) {
    return movieRepository.save(movie);
  }

  public Mono<Movie> findById(String id) {
    return movieRepository.findById(id);
  }

  public Flux<Movie> findAll() {
    return movieRepository.findAll();
  }

  public Mono<Movie> updateMovie(String id, Movie movie) {
    return movieRepository.save(movie);
  }

  public Mono<Void> deleteMovieById(String id) {
    return movieRepository.deleteById(id);
  }

  public Mono<Void> deleteAll() {
    return movieRepository.deleteAll();
  }

  public Flux<Movie> findByDirectorAndYear(String name, int year) {

    return movieRepository.findByDirectorAndYear(name, year);

  }

}
