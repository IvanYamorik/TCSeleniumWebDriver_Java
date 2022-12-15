package shop;

import org.junit.jupiter.api.Test;
import parser.JsonParser;
import parser.Parser;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealItemTests {
    @Test
    void realItemGetMethods_returnExpectedValues() {
        final String testName = "testName";
        final double testPrice = 10000.5;
        final double testWeight = 2500.2;
        RealItem testItem = new RealItem();
        testItem.setName(testName);
        testItem.setPrice(testPrice);
        testItem.setWeight(testWeight);

        String actualName = testItem.getName();
        double actualPrice = testItem.getPrice();
        double actualWeight = testItem.getWeight();

        assertEquals(testName, actualName);
        assertEquals(testPrice, actualPrice);
        assertEquals(testWeight, actualWeight);
    }
}
