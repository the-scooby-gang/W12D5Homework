import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){ passenger = new Passenger("Aimee", 1);}

    @Test
    public void canGetName(){
        assertEquals("Aimee", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }


}
