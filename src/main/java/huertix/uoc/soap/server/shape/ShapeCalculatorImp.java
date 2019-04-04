package huertix.uoc.soap.server.shape;

import javax.jws.WebService;


@WebService(endpointInterface = "huertix.uoc.soap.server.shape.ShapeCalculator")
public class ShapeCalculatorImp implements ShapeCalculator{

    private double getApothem(double side, double height) {
        double apbase = side / 2;
        double hypo = Math.sqrt(Math.pow(height, 2) + Math.pow(apbase, 2));
        return hypo;
    }

    @Override
    public double squarePyramidVolume(double side, double height) {
        double volume = (Math.pow(side, 2) * height) / 3;
        return volume;
    }

    @Override
    public double squarePyramidArea(double side, double height) {
        double apothem = getApothem(side, height);
        double area = side * ((2 * apothem) + side);
        return area;
    }
}
