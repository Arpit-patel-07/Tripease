package com.example.tripease.Services;

import com.example.tripease.Entities.Cab;
import com.example.tripease.Entities.Driver;
import com.example.tripease.Exception.DriverNotFoundException;
import com.example.tripease.Repositories.CabRepository;
import com.example.tripease.Repositories.DriverRepository;
import com.example.tripease.Transformer.CabTransformer;
import com.example.tripease.Transformer.DriverTransformer;
import com.example.tripease.dto.CabRequest;
import com.example.tripease.dto.CabResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class CabServices {

    @Autowired
    private  CabRepository cabRepository;

    @Autowired
    private DriverRepository driverRepository;

    public CabResponse registerCab(CabRequest cabRequest, int driverId){

        Optional<Driver> optionalDriver = driverRepository.findById(driverId);

        if(optionalDriver.isEmpty()){
            throw new DriverNotFoundException("Invailed Driver Id");
        }

        Driver driver = optionalDriver.get();
        Cab cab = CabTransformer.cabRequestToCab(cabRequest);
        driver.setCab(cab);
        Driver savaDriver = driverRepository.save(driver);
        return CabTransformer.cabToCabResponse(savaDriver.getCab(),savaDriver);
    }
}
