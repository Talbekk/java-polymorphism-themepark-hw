import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import behaviours.ISecurity;
import org.w3c.dom.Attr;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> items;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.items = new ArrayList<>();
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();

    }

    public void addItem(IReviewed item) {
        this.items.add(item);
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }


    public ArrayList<IReviewed> getItems() {
        ArrayList<IReviewed> itemsList = new ArrayList<>(this.items);
        return itemsList;
    }

    public ArrayList<Attraction> getAttractions() {
        ArrayList<Attraction> attractionsList = new ArrayList<Attraction>(this.attractions);
        return attractionsList;
    }

    public ArrayList<Stall> getStalls() {
        ArrayList<Stall> stallsList = new ArrayList<Stall>(this.stalls);
        return stallsList;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addAttraction(attraction);
        attraction.incrementVisitCount(1);
    }

    public HashMap<String, Integer> getReviewList() {
        HashMap<String, Integer> reviewList = new HashMap<String, Integer>();
        ArrayList<IReviewed> itemList = this.items;

        for (IReviewed currentItem : itemList) {
            reviewList.put(currentItem.getName(), currentItem.getRating());
        }
        return reviewList;
    }

    public ArrayList<IReviewed> getAttractionsAllowedFor(Visitor visitor) {

        ArrayList<IReviewed> allowedAttractions = new ArrayList<IReviewed>();

        for (Attraction currentAttraction : this.attractions) {
            if (currentAttraction instanceof ISecurity) {
                if (((ISecurity) currentAttraction).isAllowedTo(visitor)) {
                    allowedAttractions.add(currentAttraction);
                }
            }
        }
        return allowedAttractions;
    }
}

