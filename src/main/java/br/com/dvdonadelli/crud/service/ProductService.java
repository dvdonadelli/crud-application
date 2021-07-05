package br.com.dvdonadelli.crud.service;

import br.com.dvdonadelli.crud.entity.ProductEntity;
import br.com.dvdonadelli.crud.model.ProductDto;
import br.com.dvdonadelli.crud.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ModelMapper mapper;

    public ProductDto criar(ProductDto productDto) {
        ProductEntity entity = this.repository.save(convertToEntity(productDto));
        return convertToDto(entity);
    }

    public List<ProductDto> listarTodos() {
        List<ProductEntity> entities = this.repository.findAll();

        return entities.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private ProductEntity convertToEntity(ProductDto product) {
        return mapper.map(product, ProductEntity.class);
    }

    private ProductDto convertToDto(ProductEntity product) {
        return mapper.map(product, ProductDto.class);
    }
}
