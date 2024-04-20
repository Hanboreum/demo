package com.example.demo.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//데이터 관리하는 (주고받고) 하는 클래스
//@Repository
public class ProductRepository {

    @Autowired
    EntityManager entityManager;
    //DataSource dataSource;
    private Map<Integer, Product> db = new HashMap<>();
    private int id= 1;

    /*
    //datasource로 터널 만들기
    public void makeConnection (){
        DataSourceUtils.getConnection(dataSource);
        //연결하기 , 안되면 에러남
    }
*/
    public Product findProduct(int idx){
        return db.get(idx);
    }

    public void save(Product product){ //상품 저장
        System.out.println(product.getName());
       //db.put(id++ ,product);
        entityManager.persist(product);
    }

    public List<Product> findAllProducts() {
        //return new ArrayList<>(db.values()); // map db에 넣어둔 values 값
        TypedQuery<Product> query =  entityManager //entity 매니저에게
                .createQuery("  SELECT p FROM Product p",Product.class ); //이 쿼리 만들어서 (원하는 sql ,entity)
                 List<Product> productsList = query.getResultList();
                 return productsList;
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