package org.acme;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "fruits")
public class Fruit {
    @Id
    @Column(name = "fruit_id")
    private int id;
    private String name;
}
