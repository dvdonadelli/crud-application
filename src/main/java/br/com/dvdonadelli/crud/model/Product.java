package br.com.dvdonadelli.crud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

}
