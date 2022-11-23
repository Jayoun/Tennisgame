
import static org.junit.Assert.assertTrue;

import org.junit.*;



public class TennisGameTest {

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testAlquiler() {

        String salidaEsperada = new String("Rental Record for Manuel\n"
                + "\tSky Captain\t15.0\n" + "\tAccion Mutante\t2.0\n"
                + "\tHermano Oso\t12.0\n" + "Amount owed is 29.0\n"
                + "You earned 4 frequent renter points");

        assertTrue("Calcula mal el alquiler", salidaEsperada.equals("hello"));

    }

}
