package org.factoriaf5.store.controllers;

import org.factoriaf5.store.model.Product;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController {
    @GetMapping("/health")
    public String check(){
        String greeting = "Hello! I'm a server.";
        return greeting;
    }
    private final List<Product> products;
    public ProductController() {products = new ArrayList<>();}

    @GetMapping("/products")
    public List<Product> allProducts(){
    return products;
}
    @PostMapping("/products")
    public void addProduct(Product product) {
        products.add(product);

    }



}






