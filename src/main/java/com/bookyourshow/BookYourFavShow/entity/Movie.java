package com.bookyourshow.BookYourFavShow.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="movie")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie implements Serializable {
    private long movieId;
    private String movieName;
    private Genre genre;

    public Movie() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id",unique = true,nullable = false)
    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    @Column(name="movie_name",length = 100)
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genre_id")
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
