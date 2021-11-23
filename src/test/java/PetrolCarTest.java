import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Tyres tyres;
    Engine engine;

    @Before
    public void before() {
        tyres = new Tyres(20, 45);
        engine = new Engine("petrol");
        petrolCar = new PetrolCar(8000,"blue", tyres, engine);

    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, petrolCar.getTyres());
        assertEquals(20, petrolCar.getTyres().getSize());
        assertEquals(45, petrolCar.getTyres().getPsi());
    }

    @Test
    public void hasPrice() {
        assertEquals(8000, petrolCar.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("blue", petrolCar.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals("petrol", petrolCar.getEngine().getType());
    }

}
