package com.example.restaurant;


import javax.persistence.*;
import java.util.List;

@Entity
@GeneratedValue(strategy = GenerationType.IDENTITY)
public class Order {

    private Integer id;

    @OneToOne
    @JoinColumn(name = "table_id")
    private Table table;

    @OneToMany
    @JoinColumn(name = "product_id")
    private List<orderProduct> produs;

}
