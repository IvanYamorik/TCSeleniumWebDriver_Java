package parser;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import shop.Cart;
import shop.RealItem;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class JsonParserTests {
    private static Parser parser;

    @BeforeAll
    static void createParser() {
        parser = new JsonParser();
    }

    @AfterAll
    static void deleteParser() {
        parser = null;
    }

    @Test
    @Disabled("The Reason is p.5 from task 10")
    void readFromFile_worksCorrectly() {

        Cart cartFromFile = parser.readFromFile(new File("src/main/resources/eugen-cart.json"));
        assertEquals("eugen-cart", cartFromFile.getCartName());
    }

    @Test
    void writeToFile_createsFile_ivanCart() {
        Cart ivanCart = new Cart("ivan-cart");

        parser.writeToFile(ivanCart);
        File f = new File("src/main/resources/ivan-cart.json");
        assertTrue(f.exists());
    }

    @Test
    void writeToFile_createsItemInFile() throws IOException {
        String expectedJson = "{\"cartName\":\"test-cart\",\"realItems\":[{\"weight\":0.0,\"name\":\"testName\",\"price\":0.0}],\"virtualItems\":[],\"total\":0.0}";
        Cart testCart = new Cart("test-cart");
        RealItem testItem = new RealItem();
        testItem.setName("testName");
        testCart.addRealItem(testItem);

        parser.writeToFile(testCart);
        File f = new File("src/main/resources/test-cart.json");
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String actualJson = reader.readLine();
        assertEquals(expectedJson, actualJson);
    }

    @ParameterizedTest
    @ValueSource(strings = {"notexists-cart.json", "1.json", "2.json", "3.json", "newcart.json"})
    public void readFromFile_throwsNoSuchFileException(String fileName) {

        assertThrows(NoSuchFileException.class, () -> {
            parser.readFromFile(new File("src/main/resources/" + fileName));
        });
    }

}
