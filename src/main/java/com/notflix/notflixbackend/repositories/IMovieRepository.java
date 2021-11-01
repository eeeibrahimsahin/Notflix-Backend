package com.notflix.notflixbackend.repositories;

import com.notflix.notflixbackend.models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovieRepository extends CrudRepository<Movie,Integer> {
}
