package com.bookyourshow.BookYourFavShow.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "event_showtime")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventShowtime implements Serializable {
    private long showtimeId;
    private Event event;
    private Venue venue;
    private Date startTime;
    private Date endTime;
    private MovieLanguage movieLanguage;

    public EventShowtime() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "showtime_id",unique = true,nullable = false)
    public long getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(long showtimeId) {
        this.showtimeId = showtimeId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "event_id")
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="venue_id")
    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_time")
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_time")
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name = "movie_id",referencedColumnName = "movie_id"),
            @JoinColumn(name = "language_id", referencedColumnName = "language_id")
    })
    public MovieLanguage getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(MovieLanguage movieLanguage) {
        this.movieLanguage = movieLanguage;
    }
}
