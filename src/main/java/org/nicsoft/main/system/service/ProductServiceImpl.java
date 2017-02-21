package org.nicsoft.main.system.service;

import java.util.List;

import org.nicsoft.main.system.entity.Product;
import org.nicsoft.main.system.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper productMapper;
	
	
	
	
	@Override
	public List<Product> findAll() {
		
		
		return productMapper.findAll();
	}




	@Override
	public int deleteOne(int id) {
		
		return productMapper.deleteOne(id);
	}




	@Override
	public void saveOne(Product product) {
		productMapper.saveOne(product);
		
	}




	



	public Product findone(int id) {
		
		return productMapper.findOne(id);
	}




	@Override
	public void update(Product product) {
		
		productMapper.updateProduct(product);
	}

}
