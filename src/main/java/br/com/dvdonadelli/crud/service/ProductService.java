package br.com.dvdonadelli.crud.service;

import br.com.dvdonadelli.crud.entity.ProductEntity;
import br.com.dvdonadelli.crud.model.ProductDto;
import br.com.dvdonadelli.crud.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
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

    public ProductDto create(ProductDto productDto) {
        ProductEntity entity = this.repository.save(convertToEntity(productDto));
        return convertToDto(entity);
    }

    public List<ProductDto> listProducts() {
        List<ProductEntity> entities = this.repository.findAll();

        return entities.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    public ProductDto updateProducts(Long id, ProductDto productDto) {
        ProductEntity ret = this.repository.findById(id).get();
        BeanUtils.copyProperties(convertToEntity(productDto), ret, "id");
        return convertToDto(this.repository.save(ret));
    }

    public void deleteProducts(Long id) {
        this.repository.deleteById(id);
    }

    public ProductDto getProduct(Long id) {
        ProductEntity ret = this.repository.findById(id).get();
        return convertToDto(ret);
    }

    private ProductEntity convertToEntity(ProductDto product) {
        return mapper.map(product, ProductEntity.class);
    }

    private ProductDto convertToDto(ProductEntity product) {
        return mapper.map(product, ProductDto.class);
    }

}
