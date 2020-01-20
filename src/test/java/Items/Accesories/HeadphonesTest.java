package Items.Accesories;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HeadphonesTest {

    Headphones headphones;

    @Before
    public void setUp() {
        headphones = new Headphones(50.00, 75.00, "Studio");
    }

    @Test
    public void shouldHavePriceBuy(){
        assertEquals(50.00, headphones.getPriceBuy(), 0.01);
    }

    @Test
    public void shouldHavePriceSell(){
        assertEquals(75.00, headphones.getPriceSell(),0.001);
    }

    @Test
    public void shouldHaveCategory(){
        assertEquals("Studio", headphones.getCategory());
    }

    @Test
    public void shouldSetCategory(){
        headphones.setCategory("Recording");
        assertEquals("Recording", headphones.getCategory() );
    }


}