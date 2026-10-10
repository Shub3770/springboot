package com.example.jpa.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="orders")
public class order {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String product_name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usr_id")
    private user usr;

}
