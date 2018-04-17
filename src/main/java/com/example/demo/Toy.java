package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String brand;
    private String model;
    private String dateOfMaunfacture;
    private boolean inStock;
}
