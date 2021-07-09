package org.acme;

import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("foods")
public class FoodsApi {
    @Inject
    FoodsService foodsService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Food> getFood() {
        return foodsService.getFoods();
    }
}
