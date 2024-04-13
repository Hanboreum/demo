package com.example.demo.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody // 바디에 담아서 던져준다.?
public class ProductController {
    // 사용자의 요청이 오면(이걸 컨트롤러가 받는다.)
    //요청에 맞는 메소드 실행.

    // 그에 맞는 서비스에게 전달.
    //handler?

    //조회, 사용자가 요청한거니까 사용자 입장에서 네이밍
    @RequestMapping(value = "", method = RequestMethod.GET) // 괄호안 내용(url,GET) 요청이 오면 이걸 실행
    public String findProduct(){
        return "notebook";
    }

}
