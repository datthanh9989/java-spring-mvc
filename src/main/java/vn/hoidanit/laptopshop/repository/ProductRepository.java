package vn.hoidanit.laptopshop.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.hoidanit.laptopshop.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    Product save(Product eric);
    List<Product> findAll();
    Optional <Product> findById(long id);
    void deleteById(long id);
}

