package controller;

import io.javalin.http.Handler;
import model.Gremlin;
import repository.GremlinRepository;
import service.GremlinService;


public class GremlinController {
    GremlinService gremlinService = new GremlinService();

    public Handler getAllGremlins = ctx -> {
        ctx.json(gremlinService.getAllGremlins());
        ctx.status(201);
    };

    public Handler createGremlin = ctx -> {
        Gremlin gremlin = ctx.bodyAsClass(Gremlin.class);
        gremlinService.createGremlin(gremlin);
        ctx.status(201);
    };

}
