package serverwars;

import com.google.gson.Gson;
import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import serverwars.dto.Heartbeat;

public class HeartbeatVerticle extends AbstractVerticle {

    private final Gson gson = new Gson();

    @Override
    public void start() {
        Router router = Router.router(vertx);
        router.route().handler(BodyHandler.create());

        router.post("/heartbeat").handler(this::handleHeartbeat);

        vertx.createHttpServer().requestHandler(router).listen(8080);
    }

    private void handleHeartbeat(RoutingContext routingContext) {
        Heartbeat heartbeat = gson.fromJson(routingContext.getBodyAsString(), Heartbeat.class);

        routingContext.response().write("success");
        routingContext.response().end();
    }

}
