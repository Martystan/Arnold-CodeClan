import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Tyres tyres;
    Engine engine;

    @Before
    public void before() {
        tyres = new Tyres(18, 40);
        engine = new Engine("electric");
        electricCar = new ElectricCar(10000,"red", tyres, engine);

    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, electricCar.getTyres());
        assertEquals(18, electricCar.-a getTyres().getSize());
        assertEquals(40, electricCar.getTyres().getPsi());
    }

    @Test
    public void hasPrice() {
        assertEquals(10000, electricCar.getPrice());
    }

    @Test
    public void


}
