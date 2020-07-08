package id.simplerestapi.service.impl;

import id.simplerestapi.entity.Product;
import id.simplerestapi.repository.ProductRepository;
import id.simplerestapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findAllProductByName(String name) {
        return productRepository.findAllByName(name);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findProductById(Long id) {
        return productRepository.findProductById(id);
    }
}
