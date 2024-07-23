package com.example.app.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class product {

        private int ProductId;
        private String ProductName;
        private int Price;

}
