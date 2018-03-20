package com.elumberjack.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @CollectionTable(name = "items")
    private List<Item> items;

    public double calculateTotal() {
        return items.stream().mapToDouble(Item::calculatePrize).sum();
    }

    public double calculateTotalCost() {
        return items.stream().mapToDouble(Item::calculateCost).sum();
    }

    public double calculateAverageAddedValuePercentage() {
        return items.stream().mapToInt(value -> value.getProduct().getAddedValuePercentage()).average().orElse(0.0);
    }
}
