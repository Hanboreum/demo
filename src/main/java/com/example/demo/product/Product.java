package com.example.demo.product;

import jakarta.persistence.Entity;
import lombok.Data;
@Entity // entity에 등록 관리
@Data
public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
}
