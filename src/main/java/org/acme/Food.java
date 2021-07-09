package org.acme;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "food_id")
public class Food {
    @Id
    @Column(name = "food_id")
    private int id;
    @OneToOne
    @JoinColumn(name = "vegetable_id")
    private Vegetable vegetable;
    @OneToOne
    @JoinColumn(name = "fruit_id")
    private Fruit fruit;

    public Food(Vegetable vegetable, Fruit fruit) {
        this.vegetable = vegetable;
        this.fruit = fruit;
    }
}
