package com.Ecom.ProductService.service;

import com.Ecom.ProductService.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {
    // could be implemented for 3rd party API, or in-house implementation
    public ProductResponseDto getProduct(int id);
    public List<ProductResponseDto> getProductList();
}
