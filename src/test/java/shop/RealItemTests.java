package shop;

import org.junit.jupiter.api.Test;
import parser.JsonParser;
import parser.Parser;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealItemTests {
    @Test
    void getMethods_forRealItem() {
        RealItem car = new RealItem();
        car.setName("Audi");
        car.setPrice(32026.9);
        car.setWeight(1560);
        assertEquals("Audi", car.getName());
        assertEquals(32026.9, car.getPrice());
        assertEquals(1560, car.getWeight());
    }
}
