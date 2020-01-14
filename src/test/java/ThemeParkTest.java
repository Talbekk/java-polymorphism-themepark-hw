import attractions.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
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
    }

    @Test
    public void theThemeParkHasAttractions(){
        themePark.addAttraction(dodgems);
        assertEquals(1, themePark.getAttractions().size());
    }

    @Test
    public void theThemeParkHasStalls(){
        themePark.addStall(candyflossStall);
        assertEquals(1, themePark.getStalls().size());
    }

    @Test
    public void theThemeParkHasAttractionsAndStalls(){
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollerCoaster);
        themePark.addStall(candyflossStall);
        themePark.addStall(tobaccoStall);
        themePark.addStall(iceCreamStall);
        assertEquals(4, themePark.getAttractions().size());
        assertEquals(3, themePark.getStalls().size());
    }
}
