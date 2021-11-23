import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> cars;
    private int till;

    public Dealership(int till) {
        this.till = till;
        ArrayList<Car> cars = new ArrayList<>();
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public int getTill() {
        return till;
    }
}
