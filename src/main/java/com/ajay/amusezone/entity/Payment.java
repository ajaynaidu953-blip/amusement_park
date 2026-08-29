package com.ajay.amusezone.entity;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="payments")
public class Payment {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @OneToOne(optional=false) private Booking booking; private double amount; private String method; private String status="SUCCESS"; private LocalDateTime paidAt=LocalDateTime.now();
 public Long getId(){return id;} public void setId(Long v){id=v;} public Booking getBooking(){return booking;} public void setBooking(Booking v){booking=v;} public double getAmount(){return amount;} public void setAmount(double v){amount=v;} public String getMethod(){return method;} public void setMethod(String v){method=v;} public String getStatus(){return status;} public void setStatus(String v){status=v;} public LocalDateTime getPaidAt(){return paidAt;} public void setPaidAt(LocalDateTime v){paidAt=v;}
}
