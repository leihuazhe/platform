package org.nicsoft.main.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.nicsoft.main.system.entity.Product;
@Mapper
public interface ProductMapper {

	
	/**
	 * 
	 * @return
	 */
	
	List<Product> findAll();
	
	
	@Select(value="select * from product where id=#{id}")
	Product findOne(int id);

	@Delete(value="delete from product where id=#{id}")
	int deleteOne(int id);

	/*@Insert(value="insert into product values")*/
		void saveOne(Product product);


		void updateProduct(Product product);


		List<Product> searchProduct(Product pro);
		
		
}
