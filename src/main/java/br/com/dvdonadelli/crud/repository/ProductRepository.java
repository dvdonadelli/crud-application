package br.com.dvdonadelli.crud.repository;

import br.com.dvdonadelli.crud.entity.ProductEntity;
import br.com.dvdonadelli.crud.model.ProductDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
