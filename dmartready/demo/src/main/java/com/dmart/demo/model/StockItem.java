package com.dmart.demo.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

public class StockItem {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    // Other stock item properties
	    
	    @ManyToMany(mappedBy = "stockItems")
	    private Set<StoreLocation> locations = new HashSet<>();
	    
}
