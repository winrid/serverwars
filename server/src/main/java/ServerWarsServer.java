import io.vertx.core.Vertx;
import serverwars.HeartbeatVerticle;

public class ServerWarsServer {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new HeartbeatVerticle());
    }

}
