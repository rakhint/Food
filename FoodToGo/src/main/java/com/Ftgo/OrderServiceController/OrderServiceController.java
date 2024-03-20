package com.Ftgo.OrderServiceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Ftgo.OrderService.OrderService;
import com.order.dto.OrderRequest;
import com.order.dto.OrderResponse;

@RequestMapping("/order")
@RestController

public class OrderServiceController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value="/neworder/",method=RequestMethod.POST)
	
	public ResponseEntity<?> createNewOrder(@RequestBody  OrderRequest orderRequest) {
		if(orderRequest!=null) {
		OrderResponse orderResponse	=orderService.createOrder(orderRequest);
		return ResponseEntity.ok(orderResponse);	
		}
		else {
			return ResponseEntity.ok("Invalid Request");	
		}
		}
}
