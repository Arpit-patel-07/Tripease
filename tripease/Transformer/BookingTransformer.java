package com.example.tripease.Transformer;

import com.example.tripease.Entities.Booking;
import com.example.tripease.Entities.Cab;
import com.example.tripease.Entities.Customer;
import com.example.tripease.Entities.Driver;
import com.example.tripease.Enum.Trip;
import com.example.tripease.dto.BookingRequest;
import com.example.tripease.dto.BookingResponse;

import javax.swing.plaf.basic.BasicSliderUI;

public class BookingTransformer {

        public static Booking bookingRequestToBooking(BookingRequest  bookingRequest, Double perKmRate){
                Booking booking = new Booking();
                booking.setPickup(bookingRequest.getPickup());
                booking.setDestination(bookingRequest.getDestination());
                booking.setTripDistanceInKm(bookingRequest.getTripDistanceInKm());
                booking.setTripStatus(Trip.In_PROGRESS);
                booking.setBillAmount(bookingRequest.getTripDistanceInKm()*perKmRate);
                return booking;
        }

        public static BookingResponse bookingTobookingResponse(Booking booking, Customer customer, Cab cab,Driver driver){

            BookingResponse bookingResponse = new BookingResponse();
            bookingResponse.setBookedAt(booking.getBookedAt());
            bookingResponse.setPickup(booking.getPickup());
            bookingResponse.setBillAmount(booking.getBillAmount());
            bookingResponse.setDestination(booking.getDestination());
            bookingResponse.setTripStatus(booking.getTripStatus());
            bookingResponse.setLastUpdateAt(booking.getLastUpdateAt());
            bookingResponse.setTripDistanceInKm(booking.getTripDistanceInKm());
            bookingResponse.setCab(CabTransformer.cabToCabResponse(cab,driver));
            bookingResponse.setCustomerResponse(CustomerTransformer.customerToCustomerResponse(customer));
            return bookingResponse;
        }
}
