package com.example.app.Server;

import com.example.app.model.product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServer {


            List<product> Product = Arrays.asList(
                    new product(1,"APPLE WATCH",48000),
                    new product(2,"CANON CAMERA",122000),
                    new product(3,"SAMSUNG S24 ULTRA",83000));

        public List<product> getProduct(){
            return Product;
        }

}
