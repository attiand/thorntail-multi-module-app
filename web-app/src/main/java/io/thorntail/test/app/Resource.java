package io.thorntail.test.app;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.thorntail.test.api.Message;
import io.thorntail.test.lib.Service;

@Path("/")
public class Resource {

	@Inject
	private Service service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage() {
		return service.getMessage();
	}

}
