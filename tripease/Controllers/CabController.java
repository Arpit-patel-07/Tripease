package com.example.tripease.Controllers;

import com.example.tripease.Entities.Cab;
import com.example.tripease.Services.CabServices;
import com.example.tripease.Transformer.CabTransformer;
import com.example.tripease.dto.CabRequest;
import com.example.tripease.dto.CabResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cab")
public class CabController {

    @Autowired
    private CabServices cabServices;

    @PostMapping("/registerCab/driver/{driverid}")
    public CabResponse registerCab(@RequestBody CabRequest cabRequest, @PathVariable("driverid") int driverId){
        return cabServices.registerCab(cabRequest,driverId);
    }
}
