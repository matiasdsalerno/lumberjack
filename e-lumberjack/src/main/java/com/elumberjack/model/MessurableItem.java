package com.elumberjack.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class MessurableItem extends Item {

    private Integer size;

    public Float calculatePrize() {
        return size*super.calculatePrize();
    }

    public Float calculateCost() {
        return size*super.calculateCost();
    }
}
