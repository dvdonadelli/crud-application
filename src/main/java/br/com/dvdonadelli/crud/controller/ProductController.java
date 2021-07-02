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
    public void create(@RequestBody ProductDto product) {
        service.create(product);
    }
    
    @GetMapping
    public List<ProductDto> findAll(){
        return service.findAll();
    }

}
