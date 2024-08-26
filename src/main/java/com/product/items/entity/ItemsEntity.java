package com.product.items.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "BooksTable")
public class ItemsEntity {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long Id;
     @Column(name = "Name")
     private String name;
}
