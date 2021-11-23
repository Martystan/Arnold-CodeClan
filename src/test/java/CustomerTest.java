import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {


    Customer customer;
    PetrolCar petrolCar;
    ElectricCar electricCar;
    Tyres tyres1;
    Engine engine1;
    Tyres tyres2;
    Engine engine2;

    @Before
    public void before() {
        ArrayList<Car> ownedCars = new ArrayList<>();
        tyres1 = new Tyres(20, 45);
        engine1 = new Engine("petrol");
        tyres2 = new Tyres(16, 32);
        engine2 = new Engine("electric");
        customer = new Customer(15000);
        petrolCar = new PetrolCar(8000, "green", tyres1, engine1);
        electricCar = new ElectricCar(5000, "black", tyres2, engine2);
        ownedCars.add(petrolCar);
        ownedCars.add(electricCar);
    }

    @Test
    public void hasMoney() {
        assertEquals(15000, customer.getMoney());
    }

    @Test
    public void getOwnedCars() {
        assertEquals(2, customer.getNumberOfOwnedCars());
    }

}
