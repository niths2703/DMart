package com.dmartready.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmartready.demo.model.StoreLocation;

@Repository
public interface StoreLocationRepository extends JpaRepository<StoreLocation , Long> {

}
