package com.example.tripease.Services;

import com.example.tripease.Entities.Driver;
import com.example.tripease.Repositories.DriverRepository;
import com.example.tripease.Transformer.DriverTransformer;
import com.example.tripease.dto.DriverResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class DriverServices {

    @Autowired
    private  DriverRepository driverRepository;

    public DriverResponse addDriver(Driver driver){
        Driver saveDriver = driverRepository.save(driver);
        return DriverTransformer.driverToDriverResponse(saveDriver);
    }
}
