package com.example.tripease.Transformer;

import com.example.tripease.Entities.Driver;
import com.example.tripease.dto.DriverRequest;
import com.example.tripease.dto.DriverResponse;

public class DriverTransformer {


    public static Driver driverRequestToDriver(DriverRequest driverRequest){
        Driver driver = new Driver();
        driver.setName(driverRequest.getName());
        driver.setAge(driverRequest.getAge());
        driver.setDriverId(driverRequest.getDriverId());
        driver.setEmailId(driverRequest.getEmailId());
        return driver;
    }


    public static DriverResponse driverToDriverResponse(Driver driver){
        DriverResponse driverResponse = new DriverResponse();
        driverResponse.setAge(driver.getAge());
        driverResponse.setName(driver.getName());
        driverResponse.setEmailId(driver.getEmailId());
        driverResponse.setDriveId(driver.getDriverId());
        return driverResponse;
    }
}
