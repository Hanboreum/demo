package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody // 바디에 담아서 던져준다.?
public class ProductController {
    // 사용자의 요청이 오면(이걸 컨트롤러가 받는다.)
    //요청에 맞는 메소드 실행.

    // 그에 맞는 서비스에게 전달. //handler?
    @Autowired
    private ProductService productService; //필드는 private으로

    //조회, 사용자가 요청한거니까 사용자 입장에서 네이밍
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET) // 괄호안 내용(url,GET) 요청이 오면 이걸 실행
    public String findProduct(@PathVariable("id")int id ){
       // ProductService productService = new ProductService();
        return productService.findProduct(id);
    }

    //등록. @RequestMapping? 괄호안 url, method가 오면 아래 메서드 출력
    //localhost:8080/products
    @RequestMapping(value = "products",method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }
}

/*
 @RequestMapping(value = "products",method = RequestMethod.POST)
    public void saveProduct(@RequestParam (value ="name")String productName){
        //localhost:8080/product?name=____ <- 이걸 productName에 담아줌
        productService.saveProduct(productName);
    }
 */