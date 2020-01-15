import attractions.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Visitor visitor;


    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 7);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 5);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 8);
        visitor = new Visitor(14, 1.2, 40.0);

        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollerCoaster);
        themePark.addItem(candyflossStall);
        themePark.addItem(tobaccoStall);
        themePark.addItem(iceCreamStall);
    }

    @Test
    public void theThemeParkHasAttractionsAndStalls(){
        assertEquals(7, themePark.getItems().size());
    }

    @Test
    public void canAddAttractionToListAndIncreaseVisitedCountByOne(){
        themePark.visit(visitor, dodgems);
        Assert.assertEquals(1, visitor.getAttractionsVisited().size());
        Assert.assertEquals(1, dodgems.getVisitCount());
    }

    @Test
    public void canAddAttractions(){
        themePark.addAttraction(dodgems);
        assertEquals(1, themePark.getAttractions().size());
    }

    @Test
    public void canAddStalls(){
        themePark.addStall(candyflossStall);
        assertEquals(1, themePark.getStalls().size());
    }

    @Test
    public void canGetAListOfSpotsAndReview(){
        assertEquals(7, themePark.getReviewList().size());
    }

    @Test
    public void canGetAListOfAllowedAttractions(){
        assertEquals(1, themePark.getAttractionsAllowedFor(visitor).size());
    }
}
