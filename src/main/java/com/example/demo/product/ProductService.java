package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//controller의 지시를 받고 repo에서 데이터를 가져옴
@Service
public class ProductService {

    private ProductRepository productRepository; //생성자가 생긴다고 필드가 사라지진 않는다.

    @Autowired // 생성자로DI
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    /*public void makeConnection(){
        productRepository.makeConnection();
    }
     */

    public Product findProduct(int id){
        return productRepository.findProduct(id);
    }
    public void saveProduct(Product product){
        productRepository.save(product);
    }
    public List<Product>findAllProducts() { return productRepository.findAllProducts();}
}

/*
public void saveProduct(String productName){
        productRepository.save(productName);
    }
 */
/*
  public void deleteProduct(int id) {  productRepository.delete(id);}
    public Product findAllProduct(){return productRepository.findAllProduct();}

 */