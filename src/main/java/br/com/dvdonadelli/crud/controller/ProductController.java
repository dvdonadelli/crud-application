package br.com.dvdonadelli.crud.controller;

import br.com.dvdonadelli.crud.model.ProductDto;
import br.com.dvdonadelli.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ProductDto createProducts(@RequestBody ProductDto productDto) {
        return this.service.create(productDto);
    }

    @GetMapping
    public List<ProductDto> listProducts() {
        return service.listProducts();
    }

}
