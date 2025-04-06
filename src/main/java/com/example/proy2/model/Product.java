package com.example.proy2.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity //para convertir una clase en una tabla
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
}
