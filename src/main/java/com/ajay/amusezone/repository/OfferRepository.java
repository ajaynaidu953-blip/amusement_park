package com.ajay.amusezone.repository;
import com.ajay.amusezone.entity.Offer; import org.springframework.data.jpa.repository.JpaRepository; import java.util.Optional;
public interface OfferRepository extends JpaRepository<Offer,Long>{Optional<Offer> findByCodeIgnoreCase(String code);}
