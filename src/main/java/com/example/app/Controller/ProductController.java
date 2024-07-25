package com.example.app.Controller;

import com.example.app.Server.ProductServer;
import com.example.app.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

            @Autowired
            private ProductServer server;

            @RequestMapping("/product")

            public List<product> ok(){
                return server.getProduct();
            }

            @RequestMapping("/product/{Productid}")
            public product getId(@PathVariable int Productid){
                return server.getid(Productid) ;
            }

}
