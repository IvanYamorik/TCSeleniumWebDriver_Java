package shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualItemTests {
    @Test
    void virtualItemToString_returnExpectedValues() {
        final String testName = "testName";
        final double testPrice = 50.5;
        final double SizeOnDisk = 1024.2;
        VirtualItem testItem = new VirtualItem();
        testItem.setName(testName);
        testItem.setPrice(testPrice);
        testItem.setSizeOnDisk(SizeOnDisk);

        String actualValues = testItem.toString();
        System.out.println(actualValues);
        String expectedValues = "Class: class shop.VirtualItem; Name: testName; Price: 50.5; Size on disk: 1024.2";

        assertEquals(expectedValues, actualValues);
    }
}
