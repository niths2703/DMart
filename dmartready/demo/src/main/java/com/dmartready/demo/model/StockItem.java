package com.dmartready.demo.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.dmartready.demo.model.StoreLocation;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class StockItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long stockItemId;
	
	@Column(name="name")
	String name;
	
	@Column(name="description")
	String description;
	
	@Column(name="category")
	Category category;
	
	@Column(name="price")
	Integer price;
	
	@Column(name="quantity")
    private Long quantity;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  
	
//	@JoinTable(name="location_stockItems_Table" ,
//	joinColumns= {
//			@JoinColumn(name="stockItemId",referencedColumnName="stockItemId"),
//	}
//	,
//	inverseJoinColumns= {
//			@JoinColumn(name="locationId", referencedColumnName="locationId")
//	})
	private List<StoreLocation> storeLocations = new ArrayList<StoreLocation>();
}


