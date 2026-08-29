package com.ajay.amusezone.entity;
import jakarta.persistence.*;
@Entity @Table(name="water_rides")
public class WaterRide {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private String name; private String description; private double price; private int minAge; private boolean active=true;
 public WaterRide(){} public Long getId(){return id;} public void setId(Long v){id=v;} public String getName(){return name;} public void setName(String v){name=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;} public double getPrice(){return price;} public void setPrice(double v){price=v;} public int getMinAge(){return minAge;} public void setMinAge(int v){minAge=v;} public boolean isActive(){return active;} public void setActive(boolean v){active=v;}
}
