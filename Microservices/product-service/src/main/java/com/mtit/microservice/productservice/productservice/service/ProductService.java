package com.mtit.microservice.productservice.productservice.service;

import com.mtit.microservice.productservice.productservice.dao.ProductDao;
import com.mtit.microservice.productservice.productservice.dto.ProductRequest;
import com.mtit.microservice.productservice.productservice.dto.ProductResponce;
import com.mtit.microservice.productservice.productservice.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productDao.save(product);
        log.info("Product {} is saved", product.getId());
    }

        public List<ProductResponce> getAllProducts() {
            List<Product> products = productDao.findAll();

            return products.stream().map(this::mapToProductResponse).toList();
        }

    private ProductResponce mapToProductResponse(Product product) {
        return ProductResponce.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

    public Boolean getById(int id){
        return productDao.existsById(id);
    }
}
