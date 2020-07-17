package com.cg.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Dto.CartDto;

@Repository
public interface AddBookToCartDao extends JpaRepository<CartDto, String> {

}
