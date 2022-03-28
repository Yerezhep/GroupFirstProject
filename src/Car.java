public class Car {

    private String name;
    private int speed;
    private CarModel model;

    public Car(String name, int speed, CarModel model) {
        this.name = name;
        this.speed = speed;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public CarModel getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", model=" + model +
                '}';
    }
}
