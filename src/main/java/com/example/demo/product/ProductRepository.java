package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Repository
public class ProductRepository {
    private Map<Integer, Product> db = new HashMap<>();
    private int id= 1;

    public Product findProduct(int idx){
        return db.get(idx);
    }

    public void save(Product product){ //상품 저장
       db.put(id++ ,product);
    }

    public List<Product> findAllProducts() {
        return new ArrayList<>(db.values()); // map db에 넣어둔 values 값
    }
}

/*
    public void save(Product product){
        db.put(id++, product);
    }

 */

/*
 public void delete (int idx){
        db.remove(idx);
    }
    public Product findAllProduct(){
        return findAllProduct();
    }

 */