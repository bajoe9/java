package com.example.restaurant;


import javax.persistence.*;

@Entity
public class orderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @OneToOne
    private Produse produs;

    private Integer quantity;



}
