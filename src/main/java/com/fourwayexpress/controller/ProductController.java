package com.fourwayexpress.controller;

import com.fourwayexpress.api.ProductApi;
import com.fourwayexpress.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController implements ProductApi {
    @Override
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(List.of());
    }
}
