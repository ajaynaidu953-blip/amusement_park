package com.ajay.amusezone.service;
import com.ajay.amusezone.entity.Ride; import com.ajay.amusezone.repository.RideRepository; import org.springframework.stereotype.Service; import java.util.List;
@Service public class RideService { private final RideRepository repo; public RideService(RideRepository repo){this.repo=repo;} public List<Ride> all(){return repo.findAll();} public Ride get(Long id){return repo.findById(id).orElseThrow(()->new RuntimeException("Ride not found"));} public Ride save(Ride r){return repo.save(r);} public void delete(Long id){repo.deleteById(id);} }
