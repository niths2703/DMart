package com.dmartready.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dmartready.demo.model.StockItem;
import com.dmartready.demo.service.StockService;

@RestController
@RequestMapping("/api/stock")
public class StockController {

	StockService stockService;
	
   

    @PostMapping("/items")
    public ResponseEntity<StockItem> addStockItem(@RequestBody StockItem stockItem) {
        StockItem sItem=stockService.addStockItem(stockItem);
        
        return new ResponseEntity<>(sItem,HttpStatus.CREATED);
    }

    @PutMapping("/items/{stockItemId}")
    public  ResponseEntity<StockItem> updateStockItem(@PathVariable Long stockItemId,@RequestBody StockItem stockItem) {
    	
    	
    	 StockItem sItem= stockService.updateStockItem(stockItemId,stockItem);
    	 
    	 return new ResponseEntity<>(sItem,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/items/{stockItemId}")
    public  ResponseEntity<StockItem> deleteStockItem(@PathVariable Long stockItemId) {
       
    	StockItem sItem=stockService.deleteStockItem(stockItemId);
    	
    	return new ResponseEntity<>(sItem,HttpStatus.ACCEPTED);
    }

    @PutMapping("/items/move/{stockItemId}/{sourceLocationId}/{destinationLocationId}/{quantity}")
    public  ResponseEntity<String> moveStockItem( @PathVariable Long stockItemId,  @PathVariable Long sourceLocationId,@PathVariable Long destinationLocationId,@PathVariable Long quantity
    ) {
    	String message=stockService.moveStockItem( stockItemId,  sourceLocationId, destinationLocationId, quantity);
    
    	return new ResponseEntity<>(message,HttpStatus.OK);
    }

    @GetMapping("/items/quantity/{storeLocationId}")
    public  ResponseEntity<List<StockItem>> getStockItemQuantityByLocation(@PathVariable Long storeLocationId) {
    	List<StockItem> stocks=stockService.getStockItemQuantity(storeLocationId);
    	
    	return new ResponseEntity<>(stocks,HttpStatus.OK);
    }
}
