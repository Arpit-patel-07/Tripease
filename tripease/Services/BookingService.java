package com.example.tripease.Services;

import com.example.tripease.Entities.Booking;
import com.example.tripease.Entities.Cab;
import com.example.tripease.Entities.Customer;
import com.example.tripease.Entities.Driver;
import com.example.tripease.Exception.CabNotAvailableException;
import com.example.tripease.Exception.CustomerNotFoundException;
import com.example.tripease.Repositories.BookingRepository;
import com.example.tripease.Repositories.CabRepository;
import com.example.tripease.Repositories.CustomerRepository;
import com.example.tripease.Repositories.DriverRepository;
import com.example.tripease.Transformer.BookingTransformer;
import com.example.tripease.dto.BookingRequest;
import com.example.tripease.dto.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private CabRepository cabRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public BookingResponse bookingCab(BookingRequest bookingRequest,int customerId){

        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);

        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException("Invalided customer");
        }

        Customer customer = optionalCustomer.get();
        Cab avialivaleCab = cabRepository.findOneRandomAvailableCab();

        if(avialivaleCab == null){
            throw new CabNotAvailableException("Cab not available");
        }

        Booking booking = BookingTransformer.bookingRequestToBooking(bookingRequest,avialivaleCab.getPerKmRate());
        Booking saveBooking = bookingRepository.save(booking);
        avialivaleCab.setAvailable(false);
        customer.getBookingList().add(saveBooking);

        Driver driver = driverRepository.findDriverByCabId(avialivaleCab.getCabId());
        driver.getBookingList().add(saveBooking);

        Customer saveCustomer = customerRepository.save(customer);
        Driver saveDriver = driverRepository.save(driver);

        return  BookingTransformer.bookingTobookingResponse(saveBooking,saveCustomer,avialivaleCab,saveDriver);

    }
}