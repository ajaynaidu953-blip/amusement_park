package com.ajay.amusezone.entity;
import jakarta.persistence.*; import java.time.LocalDate; import java.util.*;
@Entity @Table(name="bookings")
public class Booking {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) private User user; @ManyToOne(optional=false) private EntryTicket entryTicket;
 private LocalDate visitDate; private int adults; private int children; private double totalAmount; private String status="CONFIRMED"; private String offerCode;
 @OneToMany(mappedBy="booking",cascade=CascadeType.ALL,orphanRemoval=true) private List<BookingRide> rides=new ArrayList<>();
 public Long getId(){return id;} public void setId(Long v){id=v;} public User getUser(){return user;} public void setUser(User v){user=v;} public EntryTicket getEntryTicket(){return entryTicket;} public void setEntryTicket(EntryTicket v){entryTicket=v;} public LocalDate getVisitDate(){return visitDate;} public void setVisitDate(LocalDate v){visitDate=v;} public int getAdults(){return adults;} public void setAdults(int v){adults=v;} public int getChildren(){return children;} public void setChildren(int v){children=v;} public double getTotalAmount(){return totalAmount;} public void setTotalAmount(double v){totalAmount=v;} public String getStatus(){return status;} public void setStatus(String v){status=v;} public String getOfferCode(){return offerCode;} public void setOfferCode(String v){offerCode=v;} public List<BookingRide> getRides(){return rides;} public void setRides(List<BookingRide> v){rides=v;}
}
