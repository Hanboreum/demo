package com.example.demo.product;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//controller의 지시를 받고 repo에서 데이터를 가져옴
@Service

public class ProductService {

    @Autowired
    private SpringDataJPAProductRepository springDataJPAProductRepository;
    /*private ProductRepository productRepository; //생성자가 생긴다고 필드가 사라지진 않는다.

    @Autowired // 생성자로DI
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }*/

    /*public void makeConnection(){
        productRepository.makeConnection();
    }
     */

    public Product findProduct(int id){
        return springDataJPAProductRepository.findById(id).get();
    }
   @Transactional
    public void saveProduct(Product product){
       springDataJPAProductRepository.save(product);
    }
    public List<Product>findAllProducts() {
        return springDataJPAProductRepository.findAll();
    }
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