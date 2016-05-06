package br.com.ws.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("")
public class HelloWorld {
	
	
	@GET
	@Path("/helloWorld")
	@Produces("application/json")
	public Response getHelloWorld() {
		String value = "Hello world - Atualizado 2";
		return Response.status(200).entity(value).build();
	}
}
