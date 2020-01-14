import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;
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

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addAttraction(attraction);
        attraction.incrementVisitCount(1);
    }
}
