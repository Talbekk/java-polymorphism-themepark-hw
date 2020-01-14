package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(14, 1.2, 40.0);
        visitor1 = new Visitor(30, 2.1, 120.0);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canPassAgeLimit(){ assertTrue(playground.isAllowedTo(visitor));}

    @Test
    public void canFailAgeLimit(){ assertFalse(playground.isAllowedTo(visitor1));}
}
