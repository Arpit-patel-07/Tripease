package com.example.tripease.Transformer;

import com.example.tripease.Entities.Cab;
import com.example.tripease.Entities.Driver;
import com.example.tripease.dto.CabRequest;
import com.example.tripease.dto.CabResponse;

public class CabTransformer {

    public static Cab cabRequestToCab(CabRequest cabRequest){
        Cab cab = new Cab();
        cab.setCabModal(cabRequest.getCabModal());
        cab.setCabNumber(cabRequest.getCabNumber());
        cab.setPerKmRate(cabRequest.getPerKmRate());
        cab.setAvailable(true);
        return cab;
    }

    public static CabResponse cabToCabResponse(Cab cab,Driver driver){

        CabResponse cabResponse = new CabResponse();
        cabResponse.setCabModal(cab.getCabModal());
        cabResponse.setCabNumber(cab.getCabNumber());
        cabResponse.setAvailable(cab.isAvailable());
        cabResponse.setPerKmRate(cab.getPerKmRate());
        cabResponse.setDriver(DriverTransformer.driverToDriverResponse(driver));
        return cabResponse;
    }
}