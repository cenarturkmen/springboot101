package com.caner.springbootmySQL.controller;

import com.caner.springbootmySQL.exception.ProductNotFoundException;
import com.caner.springbootmySQL.model.Product;
import com.caner.springbootmySQL.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();

    }
    @GetMapping("/products/{pId}")
    public Product getProduct(@PathVariable("pId") Long id){
        return productService.getProduct(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PutMapping("/products/{pId}")
    public void updateProduct(@PathVariable("pId") Long id, Product product) {
        productService.updateProduct(id, product);
    }

    @DeleteMapping("/products/{pId}")
    public void deleteProduct(@PathVariable("pId") Long id){
        productService.deleteProduct(id);
    }
}
