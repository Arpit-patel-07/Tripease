package com.example.tripease.Repositories;

import com.example.tripease.Entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DriverRepository extends JpaRepository<Driver,Integer>{

    @Query(value = "SELECT * FROM driver WHERE cab_id = :cabId",nativeQuery = true)
    public Driver findDriverByCabId(@Param("cabId") int cabId);

}