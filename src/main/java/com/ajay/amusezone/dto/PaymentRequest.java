package com.ajay.amusezone.dto;
import jakarta.validation.constraints.*;
public record PaymentRequest(@NotNull Long bookingId,@Positive double amount,@NotBlank String method){}
