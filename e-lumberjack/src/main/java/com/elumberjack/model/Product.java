package com.elumberjack.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {

    private Long id;
    private Float cost;
    private Integer addedValuePercentage;
    private String name;

    public Float calculatePrize() {
        return calculateCost() *addedValuePercentage/100;
    }

    public Float calculateCost() {
        return cost;
    }
}