package br.com.dvdonadelli.crud.controller;

import br.com.dvdonadelli.crud.model.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @PostMapping
    public void create(@RequestBody ProductDto product) {

    }

}
