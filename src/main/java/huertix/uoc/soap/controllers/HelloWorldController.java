package huertix.uoc.soap.controllers;

import org.jooby.Request;
import org.jooby.Result;
import org.jooby.Results;
import org.jooby.mvc.GET;
import org.jooby.mvc.Path;

@Path("/")
public class HelloWorldController {

    @GET
    public String helloWorld(Request req) {

        return "Hello World";


    }
}
