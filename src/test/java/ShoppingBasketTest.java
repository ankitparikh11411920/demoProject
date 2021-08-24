import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingBasketTest {

    @Test
    void totalOfEmptyBasket(){
        ShoppingBasket basket = new ShoppingBasket();
        assertEquals(0, basket.getTotal(), 0);
    }
}