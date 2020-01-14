package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        double height = visitor.getHeight();
        return (visitor.getAge() > 12) && (height > 145.0);
    }


    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        double height = visitor.getHeight() * 100;
        if ( height > 200.0){
            return this.defaultPrice() * 2;
        } else {
            return this.defaultPrice();
        }
    }
}
