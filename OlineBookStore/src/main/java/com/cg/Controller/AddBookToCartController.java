package com.cg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Dto.CartDto;
import com.cg.Service.AddBookToCartServiceImpl;

@RestController
@RequestMapping("/Cart")
public class AddBookToCartController {
	
	@Autowired
	private AddBookToCartServiceImpl service;
	
	public AddBookToCartServiceImpl getService() {
		return service;
	}
	
	@PostMapping("/AddToCart")
	public String addBookToCart(@RequestBody CartDto cart) {
		if ((service.addBookToCart(cart))!=null) {
			return "Added Sucessfully";
		} else
			return "Unsucessful";
	}

}
