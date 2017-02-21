package org.nicsoft.main.system.service;

import java.util.List;

import org.nicsoft.main.system.entity.Product;

public interface ProductService {
	
	List<Product> findAll();

	int deleteOne(int id);
	
	void saveOne(Product product);

	Product findone(int id);

	void update(Product product);


}
