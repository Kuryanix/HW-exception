package Transport;

public abstract class Car {

    protected String brand;
    protected String model;
    protected double engine;

    public Car(String brand, String model, double engine) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Инфо отсуствует";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "Инфо отсуствует";
        } else {
            this.model = model;
        }

        setEngine(engine);
    }

    public final String getBrand() {
        return brand;
    }

    public final String getModel() {
        return model;
    }

    public final double getEngine() {
        return engine;
    }

    protected final void setEngine(double engine) {
        if (engine <= 1) {
            this.engine = 2;
        } else {
            this.engine = engine;
        }
    }

    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void stopMoving() {
        System.out.println("Закончить движение");
    }

    public void getInfoCar() {
        System.out.println("Название: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngine());
    }

    public abstract void printType();

    public abstract boolean diagnostic();
}
