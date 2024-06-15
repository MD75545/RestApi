package com.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.product;

public interface productRepository extends JpaRepository<product, Integer> {
	List<product> findBypName(String nm);
	List<product> findByPid(int i);
	List<product> findBypQtyBetween(double min,double max);

}
