package teste;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.smallrye.mutiny.Uni;

@RegisterRestClient(configKey="client-teste")
public interface ClientTeste {

    @GET
    @Path("/ola-mundo")
    Uni<String> teste();

}
