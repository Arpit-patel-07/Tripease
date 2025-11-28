package com.example.tripease.Controllers;

import com.example.tripease.Entities.Driver;
import com.example.tripease.Services.DriverServices;
import com.example.tripease.Transformer.DriverTransformer;
import com.example.tripease.dto.DriverRequest;
import com.example.tripease.dto.DriverResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("driver")
public class DriverController {

    @Autowired
    private DriverServices driverServices;

    @PostMapping("/add")
    public DriverResponse addDriver(@RequestBody DriverRequest driverRequest){
        Driver driver = DriverTransformer.driverRequestToDriver(driverRequest);
        return driverServices.addDriver(driver);
    }
}
