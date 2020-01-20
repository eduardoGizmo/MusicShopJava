package Items.Instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano(500.00, 800.00, "Oak", "Black", "Electric", 64);
    }

    @Test
    public void shouldHaveSound(){
        assertEquals("Clong", piano.playSound());
    }

    @Test
    public void shouldHaveNumOfKeys(){
        assertEquals(64, piano.getNumOfKeys());
    }

    @Test
    public void shouldSetNumOfKeys(){
        piano.setNumOfKeys(72);
        assertEquals(72, piano.getNumOfKeys());
    }
}