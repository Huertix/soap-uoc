package huertix.uoc.soap.server;


import huertix.uoc.soap.server.shape.ShapeCalculatorImp;

import javax.xml.ws.Endpoint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SoapServer {

    public static final String HOSTNAME = "0.0.0.0";
    public static final String SOAP_PATH = "shape";

    public static void main(String[] args) {

        int serverPort = System.getenv("SOAP_SERVER_PORT") == null ?
                8000 : Integer.valueOf(System.getenv("SOAP_SERVER_PORT"));

        ExecutorService es = Executors.newFixedThreadPool(5);
        Endpoint ep = Endpoint.create(new ShapeCalculatorImp());
        ep.setExecutor(es);
        ep.publish(String.format("http://%s:%s/%s", HOSTNAME, serverPort, SOAP_PATH));

        System.out.println(
                String.format("SOAP service running on address: %s:%d status: %s ",
                                                    HOSTNAME, serverPort, ep.isPublished()));
    }
}
