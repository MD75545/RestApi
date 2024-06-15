package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.product;
import com.service.productRepository;
@RestController
@CrossOrigin
public class ProductController {
	@Autowired
	productRepository repo;
	
	@PostMapping("/add")
	public void addRecord(@RequestBody product pro) {
		System.out.println(pro);
		repo.save(pro);
	}
	
	@GetMapping("/all")
	public List<product> getall(){
		return repo.findAll();
		
	}
	@DeleteMapping("/delete")
	public void deleteRecord(@RequestBody product pro) {
		System.out.println(pro);
		repo.save(pro);
	}
	@GetMapping("/byNm/{name}")
	public List<product> findBypName(@PathVariable String name){
		return repo.findBypName(name);
	}
	
	@GetMapping("/byId/{id}")
	public product findByPid(@PathVariable int id){
		return repo.findById(id).orElse(null);
	}
}