package com.example.demo.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity // entity에 등록 관리
@Data
public class Product {
    @Id
    private int id;
    private String name;
    private int price;
    private String description;
}
