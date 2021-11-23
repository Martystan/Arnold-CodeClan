import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Car> ownedCars;

    public Customer(int money) {
        this.money = money;
        ArrayList<Car> ownedCars = new ArrayList<>();

    }

    public int getMoney() {
        return money;
    }


    public int getNumberOfOwnedCars() {
        return this.ownedCars.size();
    }
}
