package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository {
    private Map<Integer, String> db = new HashMap<>();
    private int id= 1;

    public String findProduct(){
        return db.get(1);
    }
    public void save(String productName){ //상품 저장
        db.put(id++ ,productName);
    }
}
