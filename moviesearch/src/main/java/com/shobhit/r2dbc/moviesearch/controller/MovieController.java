package com.shobhit.r2dbc.moviesearch.controller;

import com.shobhit.r2dbc.moviesearch.model.Movie;
import com.shobhit.r2dbc.moviesearch.service.MovieService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movies")
public class MovieController {

  private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

  @Autowired
  private MovieService movieService;

  @PostMapping("/create")
  public Mono<Movie> createMovie(@RequestBody Movie movie) {

    LOGGER.info("Creating Movie with name ", movie.getName());

    return movieService.createMovie(movie);
  }

  @GetMapping("{id}")

  public Mono<Movie> findMovieById(@PathVariable String id) {

    LOGGER.info("Getting Movie with id ", id);

    return movieService.findById(id);

  }

  @GetMapping("/getAll")
  public Flux<Movie> findAllMovies() {

    return movieService.findAll();
  }

  @GetMapping
  public Flux<Movie> findMoviesByDirectorAndYear(@RequestParam(value = "director") String director,
      @RequestParam(value = "year") int year) {

    return movieService.findByDirectorAndYear(director, year);
  }

  @PutMapping("/{id}")
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
