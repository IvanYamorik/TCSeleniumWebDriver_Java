package shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualItemTests {
    @Test
    void toString_returnsExpectedValues() {
        final String testName = "testName";
        final double testPrice = 50.5;
        final double testSizeOnDisk = 1024.2;
        VirtualItem testItem = new VirtualItem();
        testItem.setName(testName);
        testItem.setPrice(testPrice);
        testItem.setSizeOnDisk(testSizeOnDisk);
        final String expectedValues = "Class: class shop.VirtualItem; Name: testName; Price: 50.5; Size on disk: 1024.2";

        String actualValues = testItem.toString();

        assertEquals(expectedValues, actualValues);
    }

    //p.6 from task 10. Implemented assertAll
    @Test
    void checkAssertAll_forGetMethodsVirtualItem() {
        final String itemName = "Toy";
        final double testPrice = 20.99;
        final double testSizeOnDisk = 256;
        VirtualItem newItem = new VirtualItem();
        newItem.setName(itemName);
        newItem.setPrice(testPrice);
        newItem.setSizeOnDisk(testSizeOnDisk);

        String actualName = newItem.getName();
        double actualPrice = newItem.getPrice();
        double actualWeight = newItem.getSizeOnDisk();

        assertAll("Should return values of virtual item",
                () -> assertEquals(itemName, actualName),
                () -> assertEquals(testPrice, actualPrice),
                () -> assertEquals(testSizeOnDisk, actualWeight)
        );
    }
}
