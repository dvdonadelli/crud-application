package br.com.dvdonadelli.crud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
public class ProductDto {

    private Long id;
    private String name;
    private String description;

}
