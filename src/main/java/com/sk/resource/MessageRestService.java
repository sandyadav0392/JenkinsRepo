package com.sk.resource;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class MessageRestService {

	@GET
	@Path("/m1")
//	@Produces(MediaType.TEXT_HTML)
	public Response printMessage() {
		System.out.println("MessageRestService.printMessage()");
		String result = "Restful example : ";

		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/m2/{name}/{model}")
//	@Produces(MediaType.TEXT_HTML)
	public Response getCarInfo(@PathParam("name") String name, @PathParam("model") int model,
			@MatrixParam("color") String color) {
		System.out.println("MessageRestService.printMessage()");
		System.out.println("Name:: " + name);
		System.out.println("Color:: " + color);
		System.out.println("Model:: " + model);
		String msg = "Avalable";
		return Response.status(200).entity(msg).build();
	}

}
