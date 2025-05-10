package com.vishal.SpringWebApp.service;

import com.vishal.SpringWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),  // This is actually correct!
            new Product(102, "Canon Camera", 70000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .get();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = getIndex(prod.getProdId());
        products.set(index, prod);
    }

    public void deleteProduct(int prodId) {
        int index = getIndex(prodId);
        products.remove(index);
    }

    public Integer getIndex(int prodId) {
        int index = 0;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;
            }
        }

        return index;
    }
}
