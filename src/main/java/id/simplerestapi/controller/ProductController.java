package id.simplerestapi.controller;

import id.simplerestapi.entity.Product;
import id.simplerestapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public List<Product> findAllProduct() {
        return productService.findAllProduct();
    }

    @GetMapping("/name/{name}")
    public List<Product> findAllProductByName(@PathVariable String name) {
        return productService.findAllProductByName(name);
    }

    @PostMapping("")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/id/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.findProductById(id);
    }
}
