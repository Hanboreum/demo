package com.example.demo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataJPAProductRepository  extends JpaRepository<Product, Integer> {
    List<Product> findByPrice( int price);
    //select * from table where price order by desc;
    List<Product> findByPriceLessThan(int price);
    List<Product> findByName(String name);

}
