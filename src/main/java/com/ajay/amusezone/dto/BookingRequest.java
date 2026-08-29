package com.ajay.amusezone.dto;
import jakarta.validation.Valid; import jakarta.validation.constraints.*; import java.time.LocalDate; import java.util.List;
public record BookingRequest(@NotNull Long userId,@NotNull Long entryTicketId,@FutureOrPresent LocalDate visitDate,@Min(1) int adults,@Min(0) int children,String offerCode,@Valid List<BookingRideRequest> rides){}
