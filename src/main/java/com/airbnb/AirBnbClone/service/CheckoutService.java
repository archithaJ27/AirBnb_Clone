package com.airbnb.AirBnbClone.service;

import com.airbnb.AirBnbClone.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
