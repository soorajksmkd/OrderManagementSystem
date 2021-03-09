package com.infosys.project.order.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.project.order.dto.BuyerDTO;
import com.infosys.project.order.dto.OrdersDTO;
import com.infosys.project.order.entity.Orders;
import com.infosys.project.order.service.OrderService;

@RestController
@CrossOrigin
public class OrderController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrderService orderService;
	
	//place order
	@PostMapping(value="/orders/placeOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addOrder(@RequestBody OrdersDTO orderDTO) {
		logger.info("Order Placed {}", orderDTO);
		orderService.placeOrder(orderDTO);
	}
	
	//remove order
	@DeleteMapping(value="/orders/{orderId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Long> removeOrder(@PathVariable Long orderId)
	{
		boolean isRemoved = orderService.removeOrder(orderId);
		
		if (!isRemoved) 
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		logger.info("Deletion request for order {}", orderId);

        return new ResponseEntity<>(orderId, HttpStatus.OK);
	}
	
	
	//get orderlist by buyerid
	@GetMapping(value="/orders/{buyerId}", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<OrdersDTO> getOrders(@PathVariable Integer buyerId) {
        
        
        logger.info("Order Details request for buyer {}", buyerId);
        
        return orderService.getBuyerOrders(buyerId);
    }
	
	//reorder
	
	@PostMapping(value="/orders/reOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void reOrder(@RequestBody OrdersDTO orderDTO) {
		logger.info("ReOrder Placed {}", orderDTO);
		orderService.reOrder(orderDTO);
	}
}
