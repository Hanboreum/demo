package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository; //생성자가 생긴다고 필드가 사라지진 않는다.

    @Autowired // 생성자로DI
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public String findProduct(int id){
        return productRepository.findProduct(id);
    }
    public void saveProduct(Product product){
        productRepository.save(product);
    }

}

/*
public void saveProduct(String productName){
        productRepository.save(productName);
    }
 */