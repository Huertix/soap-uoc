package huertix.uoc.soap.server;


import huertix.uoc.soap.server.shape.ShapeCalculatorImp;

import javax.xml.ws.Endpoint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SoapServer {

    public static final String URI = "http://localhost:8000/shape";

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        Endpoint ep = Endpoint.create(new ShapeCalculatorImp());
        ep.setExecutor(es);
        ep.publish(URI);

        System.out.println(
                String.format("Web service status: %s ", ep.isPublished()));
    }
}


