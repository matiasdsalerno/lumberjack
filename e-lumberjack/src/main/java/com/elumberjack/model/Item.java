package com.elumberjack.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "items")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Item {

    @Id
    @GeneratedValue
    private Long id;
    private Product product;
    private Integer quantity;

    public Float calculatePrize() {
        return quantity*getProduct().calculatePrize();
    }

    public Float calculateCost() {
        return quantity*getProduct().calculateCost();
    }
}
