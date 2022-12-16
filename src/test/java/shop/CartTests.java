package shop;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTests {
    @Test
    void checkGetCartName_returnsCorrectName() {
        Cart newCart = new Cart("redCart");

        assertEquals("redCart", newCart.getCartName());
    }

    @Test
    void checkTotal_isChanged_whenProductsAdded() {
        Cart testCart = new Cart("test");
        double cartTotal = testCart.getTotalPrice();
        assertEquals(0.0d, cartTotal);

        RealItem bread = new RealItem();
        bread.setName("Ranak");
        bread.setPrice(1.5);
        bread.setWeight(0.9);
        testCart.addRealItem(bread);
        cartTotal = testCart.getTotalPrice();

        assertEquals(1.8, cartTotal);

        VirtualItem movie = new VirtualItem();
        movie.setName("Batman");
        movie.setPrice(4.5);
        movie.setSizeOnDisk(2.2);
        testCart.addVirtualItem(movie);
        cartTotal = testCart.getTotalPrice();

        assertEquals(7.2, cartTotal);
    }
}
