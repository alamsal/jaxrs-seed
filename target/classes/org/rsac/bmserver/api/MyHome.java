package org.rsac.bmserver.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/home")
public class MyHome {
    @GET
    @Path("/myhome")

    public  String Test(){
        return ("myhome");
    }
}
