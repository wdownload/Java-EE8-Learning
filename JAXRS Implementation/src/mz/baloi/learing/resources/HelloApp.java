package mz.baloi.learing.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("hello")
public class HelloApp {

 @GET
 @Path("{name}")
 // /resources/hello/name
 public Response sayHello(@PathParam("name") String name){

     String hello = "Hello " + name;
     return Response.ok(hello).build();
 }

 @GET
 @Path("greet")

 public Response greet(){

     return Response.ok("Hello there!").build();
 }
}
