package com.Delivery.DeliveryApp.FoodDelivery.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;
@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private PdfGeneratorService pdfGeneratorService;

	@GetMapping("/order/{order_Id}/generateBill")
	public ResponseEntity<String> generateBill(@PathVariable int order_Id,HttpServletResponse response){
		pdfGeneratorService.generateBill(order_Id, response);
		return new ResponseEntity<>("Bill generated Successfully", HttpStatus.OK);
	}
	
	@PostMapping("/place/order")
	public ResponseEntity<Orders> placeOrder(@RequestBody Orders order){
		return ResponseEntity.ok(orderService.placeOrder(order));
	}

}
