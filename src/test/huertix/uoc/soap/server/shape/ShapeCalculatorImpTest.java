package huertix.uoc.soap.server.shape;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;


@RunWith(JUnit4.class)
public class ShapeCalculatorImpTest {

    private ShapeCalculatorImp shapeCalculatorImp;

    @Before
    public void setUp() throws Exception {
        shapeCalculatorImp = new ShapeCalculatorImp();
    }

    @Test
    public void squarePyramidVolume() {
        double area = shapeCalculatorImp.squarePyramidVolume(10,12);
        assertEquals(400, area, 0.001);
    }

    @Test
    public void squarePyramidArea() {
        double area = shapeCalculatorImp.squarePyramidArea(10,12);
        assertEquals(360, area, 0.001);
    }
}