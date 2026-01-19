package com.jsp.ecommerce.service;

import java.util.Map;

public interface CustomerService {

	Map<String, Object> getProducts(int page, int size, String sort, boolean desc, String name, String category,
			String lower, String higher);

	Map<String, Object> addToCart(Long id, String email, String size);

}
