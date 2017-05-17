package org.rsac.bmserver.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/calculator")
public class Calculator {

	@GET
	@Path("/calc")
	@Produces("application/json")
    public  String Test(){
	    return ("hi12");
    }

    
}
