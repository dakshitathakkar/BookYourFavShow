package com.bookyourshow.BookYourFavShow.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="booking")
public class Booking implements Serializable {

    private long bookingId;
    private UserAccount userAccount;
    private EventShowtime eventShowtime;
    private Long numberOfSeats;
    private Long payableAmount;

    public Booking() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="booking_id")
    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "showtime_id")
    public EventShowtime getEventShowtime() {
        return eventShowtime;
    }

    public void setEventShowtime(EventShowtime eventShowtime) {
        this.eventShowtime = eventShowtime;
    }

    @Column(name = "number_of_seats")
    public Long getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Long numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Column(name = "payable_amount")
    public Long getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(Long payableAmount) {
        this.payableAmount = payableAmount;
    }
}
