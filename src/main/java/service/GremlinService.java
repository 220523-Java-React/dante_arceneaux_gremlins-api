package service;

import model.Gremlin;
import repository.GremlinRepository;

import java.util.ArrayList;
import java.util.List;

public class GremlinService {

    GremlinRepository gremlinRepository = new GremlinRepository();
    Gremlin gremlin = new Gremlin();

   public List<Gremlin> getAllGremlins() {
       return gremlinRepository.getAllGremlins();
    }

    public Gremlin createGremlin(Gremlin gremlin) {
        return gremlinRepository.create(gremlin);
    }
}
