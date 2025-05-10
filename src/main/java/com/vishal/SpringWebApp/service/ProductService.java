package com.vishal.SpringWebApp.service;

import com.vishal.SpringWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "Iphone", 50000),  // This is actually correct!
            new Product(102, "Canon Camera", 70000)
    );

    public List<Product> getProducts() {
        return products;
    }
}
