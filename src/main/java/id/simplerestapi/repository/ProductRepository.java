package id.simplerestapi.repository;

import id.simplerestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByName(String name);

    Product findProductById(Long id);

}
