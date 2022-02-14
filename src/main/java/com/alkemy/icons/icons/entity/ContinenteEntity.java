package com.alkemy.icons.icons.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="continente")
@Getter
@Setter

public class ContinenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Va a ser una secuencia ej; 1, 2, 3,4...
    private Long id;
    private String imagen;
    private String denominacion;


}
