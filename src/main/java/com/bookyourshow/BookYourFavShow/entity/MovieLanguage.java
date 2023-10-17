package com.bookyourshow.BookYourFavShow.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "movie_language")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieLanguage implements Serializable {
    private MovieLanguageId movieLanguageId;
    private Date releaseDate;

    public MovieLanguage() {
    }

    @EmbeddedId
    public MovieLanguageId getMovieLanguageId() {
        return movieLanguageId;
    }

    public void setMovieLanguageId(MovieLanguageId movieLanguageId) {
        this.movieLanguageId = movieLanguageId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="release_date")
    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
