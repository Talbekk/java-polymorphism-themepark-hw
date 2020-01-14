import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> items;

    public ThemePark(){
        this.items = new ArrayList<>();

    }

    public void addItem(IReviewed item){
        this.items.add(item);
    }

    public ArrayList<IReviewed> getItems(){
        ArrayList<IReviewed> itemsList = new ArrayList<>(this.items);
        return itemsList;
    }
}
