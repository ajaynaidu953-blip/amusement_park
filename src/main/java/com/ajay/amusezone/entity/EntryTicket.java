package com.ajay.amusezone.entity;
import jakarta.persistence.*;
@Entity @Table(name="entry_tickets")
public class EntryTicket {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String ticketType; private double price; private boolean active=true;
 public EntryTicket(){} public EntryTicket(String ticketType,double price){this.ticketType=ticketType;this.price=price;} public Long getId(){return id;} public void setId(Long v){id=v;} public String getTicketType(){return ticketType;} public void setTicketType(String v){ticketType=v;} public double getPrice(){return price;} public void setPrice(double v){price=v;} public boolean isActive(){return active;} public void setActive(boolean v){active=v;}
}
