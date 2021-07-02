package br.com.dvdonadelli.crud.service;

import br.com.dvdonadelli.crud.entity.ProductEntity;
import br.com.dvdonadelli.crud.model.ProductDto;
import br.com.dvdonadelli.crud.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public void create(ProductDto product) {

    }

    public List<ProductDto> findAll() {
        List<ProductDto> ret;
        List<ProductEntity> entities = this.repository.findAll();
        return entities.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private ProductEntity convertToEntity(ProductDto dto) {
        return modelMapper.map(dto, ProductEntity.class);
    }

    private ProductDto convertToDto(ProductEntity entity) {
        return modelMapper.map(entity, ProductDto.class);
    }
}
