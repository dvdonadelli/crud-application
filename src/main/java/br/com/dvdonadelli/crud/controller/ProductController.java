package br.com.dvdonadelli.crud.controller;

import br.com.dvdonadelli.crud.model.Product;
import br.com.dvdonadelli.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public Product criarProdutos(@RequestBody Product product) {
        return this.repository.save(product);
    }
    
    @GetMapping
    public List<Product> listarTodos(){
        return repository.findAll();
    }

}
