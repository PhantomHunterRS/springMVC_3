package com.phantom.service;

import com.phantom.model.Product;
import com.phantom.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> showAll(){
        return productRepository.findAll();
    }
    public Product getFindById(int id){
        return productRepository.getFindById(id).orElse(new Product());
    }

    public Product getRandomProduct(){
        return productRepository.getRandomProduct();
    }
    public void create(Product product){
        productRepository.create(product);
    }

}

