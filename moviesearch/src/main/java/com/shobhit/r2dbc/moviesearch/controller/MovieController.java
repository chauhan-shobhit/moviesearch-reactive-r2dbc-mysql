package com.shobhit.r2dbc.moviesearch.controller;

import com.shobhit.r2dbc.moviesearch.model.Movie;
import com.shobhit.r2dbc.moviesearch.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movies")
public class MovieController {

  @Autowired
  private MovieService movieService;

  @PostMapping("/create")
  public Mono<Movie> createMovie(@RequestBody Movie movie) {

    return movieService.createMovie(movie);
  }

  @GetMapping("{id}")
  public Mono<Movie> findById(@PathVariable String id) {

    return movieService.findById(id);

  }

  @GetMapping("/getAll")
  public Flux<Movie> findAll() {

    return movieService.findAll();
  }

  @PutMapping("/id")
  public Mono<Movie> updateMovie(@PathVariable String id, @RequestBody Movie movie) {

    return movieService.updateMovie(id, movie);

  }

  @DeleteMapping("{id}")
  public Mono<Void> deleteMovieById(@PathVariable String id) {

    return movieService.deleteMovieById(id);

  }

  @DeleteMapping("/deleteAll")
  public Mono<Void> deleteAllMovies() {

    return movieService.deleteAll();
  }

}
