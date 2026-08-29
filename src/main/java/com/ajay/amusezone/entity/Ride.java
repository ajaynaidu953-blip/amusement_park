package com.ajay.amusezone.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity @Table(name="rides")
public class Ride {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String name; private String description; private String category;
 @PositiveOrZero private double price; private int minAge; private boolean active=true;
 public Ride(){} public Ride(String name,String description,String category,double price,int minAge){this.name=name;this.description=description;this.category=category;this.price=price;this.minAge=minAge;}
 public Long getId(){return id;} public void setId(Long id){this.id=id;} public String getName(){return name;} public void setName(String v){name=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;} public String getCategory(){return category;} public void setCategory(String v){category=v;} public double getPrice(){return price;} public void setPrice(double v){price=v;} public int getMinAge(){return minAge;} public void setMinAge(int v){minAge=v;} public boolean isActive(){return active;} public void setActive(boolean v){active=v;}
}
