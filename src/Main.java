import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //add Car Array list

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Carolla", 200, CarModel.TOYOTA));
        cars.add(new Car("B6", 180, CarModel.AUDI));

        //print cars list
        for (Car c: cars) {
            System.out.println(c);
        }

    }
}
