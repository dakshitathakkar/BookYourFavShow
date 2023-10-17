package com.bookyourshow.BookYourFavShow.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="seat_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeatType implements Serializable {
    private long seatTypeId;
    private String seatTypeName;

    public SeatType() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_type",unique = true,nullable = false)
    public long getSeatTypeId() {
        return seatTypeId;
    }

    public void setSeatTypeId(long seatTypeId) {
        this.seatTypeId = seatTypeId;
    }

    @Column(name="seat_type_name",length = 100)
    public String getSeatTypeName() {
        return seatTypeName;
    }

    public void setSeatTypeName(String seatTypeName) {
        this.seatTypeName = seatTypeName;
    }
}
