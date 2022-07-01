package controller;

import io.javalin.http.Handler;
import model.Gremlin;
import repository.GremlinRepository;



public class GremlinController {
    GremlinRepository gremlinRepository = new GremlinRepository();

    public Handler getAllGremlins = ctx -> {
        ctx.json(gremlinRepository.getAllGremlins());
        ctx.status(201);
    };

    public Handler createGremlin = ctx -> {
        Gremlin gremlin = ctx.bodyAsClass(Gremlin.class);
        gremlinRepository.create(gremlin);
        ctx.status(201);
    };

}
