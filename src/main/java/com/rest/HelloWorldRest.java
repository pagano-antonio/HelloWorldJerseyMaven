package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
	public class HelloWorldRest {

		//http://localhost:8080/HelloWorldJerseyMaven-0.0.1-SNAPSHOT/api/hello
	    @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String hello() {
	        return "Ciao dal servizio REST con Jersey!";
	    }
	}