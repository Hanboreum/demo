package com.example.demo;

//config : 설정용. 데이터를 위해 만드는 파일
import com.example.demo.product.Product;
import com.example.demo.product.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean //아래 메서드를 반환하는 "객체" 를 스프링 빈으로 등록해줘
    public ProductRepository productRepository(){ //데이터를 뜻하니까 메소드 네이밍이 아님. 데이터를 뜻함
        return new ProductRepository();
    }
}
