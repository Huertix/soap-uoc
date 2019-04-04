package huertix.uoc.soap.server.shape;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface ShapeCalculator {

    @WebMethod
    @WebResult(name = "volume")
    public double squarePyramidVolume(
            @WebParam(name="side") double side,
            @WebParam(name="height") double height);

    @WebMethod
    @WebResult(name = "area")
    public double squarePyramidArea(
            @WebParam(name="side") double side,
            @WebParam(name="height") double height);

}
