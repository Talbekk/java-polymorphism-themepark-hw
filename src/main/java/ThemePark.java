import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();

    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public ArrayList<Attraction> getAttractions(){
        ArrayList<Attraction> attractionsList = new ArrayList<>(this.attractions);
        return attractionsList;
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public ArrayList<Stall> getStalls(){
        ArrayList<Stall> stallList = new ArrayList<>(this.stalls);
        return stallList;
    }
}
