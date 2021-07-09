package org.acme;

import io.smallrye.mutiny.Uni;
import org.hibernate.reactive.mutiny.Mutiny;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class FoodsService {
    @Inject
    Mutiny.Session mutinySession;

    public Uni<Food> getFoods(){
        return Uni
                .combine()
                .all()
                .unis(mutinySession.find(Vegetable.class, 1), mutinySession.find(Fruit.class, 1))
                .asTuple()
                .map(fruitVegetable -> new Food(fruitVegetable.getItem1(), fruitVegetable.getItem2()));
    }
}
