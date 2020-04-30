package siddhant.cg.gla.spring.service;

import java.util.List;

import siddhant.cg.gla.spring.entity.Product;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<Product> reterive();

}
