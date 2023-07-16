package com.dmartready.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmartready.demo.model.StockItem;

@Repository
public interface StockItemRepository extends JpaRepository< StockItem , Long>{

}
