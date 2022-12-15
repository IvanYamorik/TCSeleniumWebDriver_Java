package shop;

import org.junit.jupiter.api.Test;

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
}
