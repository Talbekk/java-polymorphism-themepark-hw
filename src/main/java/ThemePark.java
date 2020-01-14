import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap<String, Integer> getReviewList() {
        HashMap<String, Integer> reviewList = new HashMap<String, Integer>();
        ArrayList<IReviewed> itemList = this.items;

        for (IReviewed currentItem : itemList){
            reviewList.put(currentItem.getName(), currentItem.getRating());
        }
        return reviewList;
    }

}
