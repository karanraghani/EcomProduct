package com.Ecom.ProductService.controller;

import com.Ecom.ProductService.dto.ProductResponseDto;
import com.Ecom.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    @Qualifier("FakeStoreApi")
    ProductService productService;
    @GetMapping("/products/{id}")
    public ResponseEntity getProduct(@PathVariable String id){
        ProductResponseDto productResponseDto = productService.getProduct(Integer.parseInt(id));
        return ResponseEntity.ok(productResponseDto);
    }

}
