package com.ajay.amusezone.dto;
import jakarta.validation.constraints.*;
public record BookingRideRequest(@NotNull Long rideId,@Min(1) int quantity){}
