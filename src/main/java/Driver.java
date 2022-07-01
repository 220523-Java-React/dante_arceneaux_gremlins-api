import controller.GremlinController;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;
import repository.GremlinRepository;

public class Driver {

    public static void main(String[] args) {

        GremlinController gremlinController = new GremlinController();
        //enable Cors for javalin
        Javalin app = Javalin.create(JavalinConfig::enableCorsForAllOrigins).start(8080);

        app.get("/", ctx -> ctx.result("Don't feed the Mogwai after Midnight!!! *BEWARE OF DAYLIGHT SAVINGS!!!"));
        app.get("/gremlins", gremlinController.getAllGremlins);
        app.post("/gremlins/add", gremlinController.createGremlin);

    }
}
