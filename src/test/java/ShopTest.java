import Items.Behaviours.ISell;
import Items.Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {

    ArrayList<ISell> stock;
    Guitar guitar1;

    @Before
    public void setUp(){
        stock = new ArrayList<ISell>();
        guitar1 = new Guitar(100.00, 150.00, "Wood", "Red/White", "Acoustic", 6);
    }

    @Test
    public void shouldStartWithEmptyStock(){
        assertEquals(0, stock.size() );
    }

   @Test
    public void shouldAddItemToStock(){
        stock.add(guitar1);
        assertEquals(1, stock.size());
   }

   @Test
    public void shouldRemoveItemFromStock(){
        stock.add(guitar1);
        stock.remove(guitar1);
        assertEquals(0, stock.size());

   }
}