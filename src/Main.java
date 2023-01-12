import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {

    Car car1 = new Car("Lada","Granta", 1.7, "желтый", 0,
            "Россия", "A", "sedan", 233, 4, 220);
    Car Car2 = new Car("Audi", "A8 50 L TDI quattro",
            3.0, "черный", 2020, "Германия","A",
            "sedan", 23432, 4, 240 );
    Car car3 = new Car ("BMW", "Z8", 3.0, "черный", 2021,
            "Германия", "A", "sedan", 333, 4, 244);
    Car car4 = new Car ("Kia", "Sportage",2.4,
            "Красный", 2018, "Южная корея", "A", "sedan", 453, 4, 0 );
    Car car5 = new Car ("Hyundai", "Avante", 1.6,
            "оранжевый", 2016, "Южная корея","A", "sedan", 675, 4, 320);

        System.out.println(car1);
        car1.new Key(false, false);

        Bus bus1 = new Bus("Луаз", "bus", 2012, "Россия", "Белый", 100);
        Bus bus2 = new Bus("Паз", "автобус", 2010, "Россия", "жёлтый", 360);
        Bus bus3 = new Bus("Volvo", "tt", 2012, "Германия", "Серый", 120);

        System.out.println(bus3);






    }

}