package com.bookyourshow.BookYourFavShow.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="venue_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VenueType implements Serializable {

    private long venueTypeId;
    private String name;
    public VenueType() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="venue_type_id",unique = true,nullable = false)
    public long getVenueTypeId() {
        return venueTypeId;
    }

    public void setVenueTypeId(long venueTypeId) {
        this.venueTypeId = venueTypeId;
    }

    @Column(name="name",length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
