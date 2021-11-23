import org.junit.Before;

import java.util.ArrayList;

public class DealershipTest {

    Dealership dealership;
    PetrolCar petrolCar;
    ElectricCar electricCar;
    Tyres tyres1;
    Engine engine1;
    Tyres tyres2;
    Engine engine2;

    @Before
    public void before(){
        ArrayList<Car> ownedCars = new ArrayList<>();
        dealership = new Dealership(30000);
        tyres1 = new Tyres(20, 45);
        engine1 = new Engine("petrol");
        tyres2 = new Tyres(16, 32);
        engine2 = new Engine("electric");
        petrolCar = new PetrolCar(8000, "green", tyres1, engine1);
        electricCar = new ElectricCar(5000, "black", tyres2, engine2);
        ownedCars.add(petrolCar);
        ownedCars.add(electricCar);
    }
}


