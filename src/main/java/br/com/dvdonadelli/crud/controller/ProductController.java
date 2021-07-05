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
        return this.service.listProducts();
    }

    @GetMapping("/{id}")
    public ProductDto getProduct(@PathVariable Long id) { return this.service.getProduct(id); }

    @PutMapping("/{id}")
    public ProductDto updateProducts(@PathVariable Long id, @RequestBody ProductDto productDto) {
        return this.service.updateProducts(id, productDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducts(@PathVariable Long id) {
        this.service.deleteProducts(id);
    }

}
