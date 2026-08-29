package com.ajay.amusezone.entity;
import jakarta.persistence.*;
@Entity @Table(name="offers")
public class Offer {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(unique=true,nullable=false) private String code; private String description; private double discountPercent; private boolean active=true;
 public Offer(){} public Offer(String code,String description,double discountPercent){this.code=code;this.description=description;this.discountPercent=discountPercent;} public Long getId(){return id;} public void setId(Long v){id=v;} public String getCode(){return code;} public void setCode(String v){code=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;} public double getDiscountPercent(){return discountPercent;} public void setDiscountPercent(double v){discountPercent=v;} public boolean isActive(){return active;} public void setActive(boolean v){active=v;}
}
