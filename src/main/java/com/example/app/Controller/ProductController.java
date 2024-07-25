package com.example.app.Controller;

import com.example.app.Server.ProductServer;
import com.example.app.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

            @Autowired
            private ProductServer server;

            @GetMapping("/product")
            public List<product> ok(){
                return server.getProduct();
            }

            @GetMapping("/product/{Productid}")
            public product getId(@PathVariable int Productid){
                return server.getid(Productid) ;
            }
            @PostMapping("/product")
            public void addProduct(@RequestBody product pro){
                System.out.println(pro);
                server.addProduct(pro);
            }

}
