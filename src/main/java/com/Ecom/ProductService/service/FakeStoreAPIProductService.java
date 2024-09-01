package com.Ecom.ProductService.service;

import com.Ecom.ProductService.dto.ProductResponseDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("FakeStoreApi")
public class FakeStoreAPIProductService implements ProductService{
    RestTemplateBuilder restTemplateBuilder;
    FakeStoreAPIProductService(RestTemplateBuilder restTemplateBuilder){
        // dependency will be passed by framework
        this.restTemplateBuilder = restTemplateBuilder;
    }
    @Override
    public ProductResponseDto getProduct(int id) {
        // make a call to 3rd party API, fetch product detail
        String url = "https://fakestoreapi.com/products/" + id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        return restTemplate.getForObject(url, ProductResponseDto.class);
    }

    @Override
    public List<ProductResponseDto> getProductList() {
        return null;
    }
}
