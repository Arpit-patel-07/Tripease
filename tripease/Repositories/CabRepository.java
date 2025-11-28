package com.example.tripease.Repositories;

import com.example.tripease.Entities.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CabRepository extends JpaRepository<Cab,Integer> {

    @Query("SELECT c FROM Cab c WHERE c.available = true ORDER BY function('RAND')")
    public Cab findOneRandomAvailableCab();

}
