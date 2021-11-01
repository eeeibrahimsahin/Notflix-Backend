package com.notflix.notflixbackend.services;

import com.notflix.notflixbackend.models.Movie;

import java.util.List;

public interface IMovieService {
    List<Movie> getMovies();

    Movie createMovie(Movie movie);

    Movie updateMovie(Movie movie);
}
