package com.ajay.amusezone.entity;
import jakarta.persistence.*; import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity @Table(name="booking_rides")
public class BookingRide {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @JsonIgnore @ManyToOne(optional=false) private Booking booking; @ManyToOne(optional=false) private Ride ride; private int quantity; private double price;
 public Long getId(){return id;} public void setId(Long v){id=v;} public Booking getBooking(){return booking;} public void setBooking(Booking v){booking=v;} public Ride getRide(){return ride;} public void setRide(Ride v){ride=v;} public int getQuantity(){return quantity;} public void setQuantity(int v){quantity=v;} public double getPrice(){return price;} public void setPrice(double v){price=v;}
}
