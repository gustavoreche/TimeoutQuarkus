package teste;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RoutingExchange;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class ControllerTeste {
	
	@Inject
    @RestClient
    ClientTeste client;

	@Route(path = "/teste", methods = Route.HttpMethod.GET)
    Uni<String> teste(RoutingExchange ex) { 
        return this.client
        		.teste(); 
    }
	
}
