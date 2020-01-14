package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(11, 1.2, 40.0);
        visitor = new Visitor(30, 2.1, 120.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canChargeAChildLessForTheDodgems(){
        assertEquals(2.25, dodgems.priceFor(visitor1), 0.1);
    }

    @Test
    public void canChargeRegularPriceForSomeoneOlderThanTwelve(){
        assertEquals(4.50, dodgems.priceFor(visitor), 0.1);
    }

    @Test
    public void canIncrementTheVisitorCountByOne(){
        dodgems.incrementVisitCount(1);
        assertEquals(1, dodgems.getVisitCount());
    }

}
