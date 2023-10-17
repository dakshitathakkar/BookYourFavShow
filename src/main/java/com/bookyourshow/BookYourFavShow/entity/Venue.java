package com.bookyourshow.BookYourFavShow.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="venue")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Venue implements Serializable {
    private long venueId;
    private String venueName;
    private City city;
    private Long numberOfSeats;
    private VenueType venueType;
    private CurrentStatus currentStatus;

    public Venue() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="venue_id",unique = true,nullable = false)
    public long getVenueId() {
        return venueId;
    }

    public void setVenueId(long venueId) {
        this.venueId = venueId;
    }

    @Column(name = "name",length = 100)
    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="city_id")
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Column(name = "number_of_seats")
    public Long getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Long numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type_id")
    public VenueType getVenueType() {
        return venueType;
    }

    public void setVenueType(VenueType venueType) {
        this.venueType = venueType;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "status_id")
    public CurrentStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(CurrentStatus currentStatus) {
        this.currentStatus = currentStatus;
    }
}
