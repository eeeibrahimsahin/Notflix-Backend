package com.notflix.notflixbackend.controllers;

import com.notflix.notflixbackend.models.Movie;
import com.notflix.notflixbackend.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("/all")
    public List<Movie> getMovies(){
        return movieService.getMovies();
    }
    @PostMapping()
    public Movie createMovie(@RequestBody Movie movie){
        return movieService.createMovie(movie);
    }
}
