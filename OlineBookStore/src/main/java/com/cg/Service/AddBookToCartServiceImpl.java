package com.cg.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.AddBookToCartDao;
import com.cg.Dto.CartDto;
import com.cg.Service.AddBookToCartService;

@Service
@Transactional
public class AddBookToCartServiceImpl implements AddBookToCartService{
	
	  @Autowired
	    private AddBookToCartDao dao;
	  
	  public AddBookToCartDao getDao(){
	        return dao;
	    }

	@Override
	public Object addBookToCart(CartDto cart) {
		// TODO Auto-generated method stub
		CartDto addtocart = dao.save(cart);
		if (addtocart != null)
			return true;
		else
			return false;
	}


}
