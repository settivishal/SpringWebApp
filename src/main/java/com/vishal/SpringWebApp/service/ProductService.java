package com.vishal.SpringWebApp.service;

import com.vishal.SpringWebApp.model.Product;
import com.vishal.SpringWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 50000),  // This is actually correct!
//            new Product(102, "Canon Camera", 70000)
//    ));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

//    public Integer getIndex(int prodId) {
//        int index = 0;
//
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prodId) {
//                index = i;
//            }
//        }
//
//        return index;
//    }
}
