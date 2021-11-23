public abstract class Car {
    private int price;
    private String colour;
    private Tyres tyres;
    private Engine engine;

    public Car(int price, String colour, Tyres tyres, Engine engine) {
        this.price = price;
        this.colour = colour;
        this.tyres = tyres;
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }
}
