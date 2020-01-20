package Items.Instruments;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar(100.00, 150.00, "Wood", "Red/White", "Acoustic", 6);
    }

    @Test
    public void shouldHavePriceBuy(){
        assertEquals(100.00, guitar.getPriceBuy(), 0.01);
    }

    @Test
    public void shouldHavePriceSell(){
        assertEquals(150.00, guitar.getPriceSell(), 0.01);
    }

    @Test
    public void ShouldHaveMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void shouldHaveColour(){
        assertEquals("Red/White", guitar.getColour());
    }

    @Test
    public void shouldHaveType(){
        assertEquals("Acoustic", guitar.getType());
    }

    @Test
    public void shouldHaveSound(){
        assertEquals("Cling", guitar.playSound());
    }

    @Test
    public void shouldCalculateMarkup(){
        assertEquals(50.00, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void shouldHaveNumOfStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void shouldSetTheNumOfStrings(){
        guitar.setNumOfStrings(8);
        assertEquals(8, guitar.getNumOfStrings());
    }

    @Test
    public void shouldSetColour(){
        guitar.setColour("Green");
        assertEquals("Green", guitar.getColour());
    }
}