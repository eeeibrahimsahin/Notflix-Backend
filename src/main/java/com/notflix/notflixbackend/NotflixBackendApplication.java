package com.notflix.notflixbackend;

import com.notflix.notflixbackend.models.Movie;
import com.notflix.notflixbackend.repositories.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class NotflixBackendApplication implements CommandLineRunner {
    @Autowired
    private IMovieRepository movieRepository;

    public static void main(String[] args) {
        SpringApplication.run(NotflixBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Movie> movieList = new ArrayList<>(Arrays.asList(
                new Movie(
                        1,
                        "John Wick",
                        "Nice movie",
                        "Action",
                        4,
                        "https://m.media-amazon.com/images/M/MV5BMTU2NjA1ODgzMF5BMl5BanBnXkFtZTgwMTM2MTI4MjE@._V1_.jpg",
                        "https://www.youtube.com/embed/2AUmvWm5ZDQ"
                ),
                new Movie(

                        2,
                        "John Wick-2",
                        "Nice movie",
                        "Action",
                        5,
                        "https://m.media-amazon.com/images/M/MV5BMjE2NDkxNTY2M15BMl5BanBnXkFtZTgwMDc2NzE0MTI@._V1_FMjpg_UX1000_.jpg",
                        "https://www.youtube.com/embed/XGk2EfbD_Ps"
                ),
                new Movie(
                        3,
                        "Ice Age",
                        "Nice movie",
                        "Animation",
                        5,
                        "https://m.media-amazon.com/images/M/MV5BMmYxZWY2NzgtYzJjZC00MDFmLTgxZTctMjRiYjdjY2FhODg3XkEyXkFqcGdeQXVyNjk1Njg5NTA@._V1_FMjpg_UX1000_.jpg",
                        "https://www.youtube.com/embed/i4noiCRJRoE"
                )
        ));

        movieRepository.saveAll(movieList);

    }
}
