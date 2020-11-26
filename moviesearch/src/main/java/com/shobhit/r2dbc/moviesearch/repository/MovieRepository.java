package com.shobhit.r2dbc.moviesearch.repository;

import com.shobhit.r2dbc.moviesearch.model.Movie;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Flux;

public interface MovieRepository extends ReactiveCrudRepository<Movie, String> {

  @Query("SELECT * FROM movie WHERE director = :director AND year = :year")
  Flux<Movie> findByDirectorAndYear(String name, int year);

}
