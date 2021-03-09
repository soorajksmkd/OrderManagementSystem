package com.infosys.project.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.project.product.dto.ProductDTO;
import com.infosys.project.product.entity.Product;
import com.infosys.project.product.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {
	
Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ProductService productService;
	
	
	//Search product based on category and product name
	@RequestMapping(value="/api/products/{category}/{productName}", produces= MediaType.APPLICATION_JSON_VALUE)
	public ProductDTO getProductByCatergoryAndProductName(@PathVariable String category, @PathVariable String productName){
		logger.info("Product search : productName - {}, category -{}",productName,category);
		
		return null;
	}
	
	//Add product
	@PostMapping(value="/api/subscriprions/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addProduct(@RequestBody ProductDTO productDTO) {
		logger.info("Creation request for product {}", productDTO);
		productService.addProduct(productDTO);
	}
	
	//Remove product
	@DeleteMapping(value="/api/subscriprions/{productId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Long> removeProduct(@PathVariable Long productId)
	{
		boolean isRemoved = productService.removeProduct(productId);
		
		if (!isRemoved) 
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		logger.info("Deletion request for product {}", productId);

        return new ResponseEntity<>(productId, HttpStatus.OK);
	}
	
	
	//Product details for visitors
	@GetMapping(value="/api/products", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<ProductDTO> getOrders() {
        
        logger.info("Product Details request");
        
        return productService.getProducts;
    }
	
	
	
	

}
