package com.mtit.microservice.productservice.productservice.Controller;

import com.mtit.microservice.productservice.productservice.dto.ProductRequest;
import com.mtit.microservice.productservice.productservice.dto.ProductResponce;
import com.mtit.microservice.productservice.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    @PostMapping("/Product")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping("/Product")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponce> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/Product/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isItemAvaliable(@PathVariable("id") int id){return  productService.getById(id);}
}
