package com.bookyourshow.BookYourFavShow.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieLanguageId implements Serializable {
    private Movie movie;
    private Language language;

    public MovieLanguageId() {
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id")
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="language_id")
    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieLanguageId that = (MovieLanguageId) o;
        return Objects.equals(movie, that.movie) && Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, language);
    }
}
