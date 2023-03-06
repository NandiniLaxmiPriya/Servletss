package com.web.restprac;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("string")
public class Helloworldresource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String print()
	{
		Helloworld h = new Helloworld();
		
		return h.s;
	}
}
