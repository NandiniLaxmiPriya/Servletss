package com.web.restprac;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("student")
public class Studentsresource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Students> getDetails()
	{
		System.out.println("inside re");
		Students st = new Students();
		st.setRollno(1);
		st.setSname("Nandy");
		Students st2 = new Students();
		st2.setRollno(1);
		st2.setSname("Nandy");
		List<Students> ll = Arrays.asList(st,st2);
		return ll;
	}

}
