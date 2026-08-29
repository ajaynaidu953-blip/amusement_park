package com.ajay.amusezone.repository;
import com.ajay.amusezone.entity.Payment; import org.springframework.data.jpa.repository.JpaRepository; import java.util.Optional;
public interface PaymentRepository extends JpaRepository<Payment,Long>{Optional<Payment> findByBookingId(Long bookingId);}
