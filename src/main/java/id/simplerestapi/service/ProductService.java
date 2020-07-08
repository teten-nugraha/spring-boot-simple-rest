package id.simplerestapi.service;

import id.simplerestapi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllProduct();
    List<Product> findAllProductByName(String name);
    Product saveProduct(Product product);
    Product findProductById(Long id);

}
