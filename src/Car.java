public class Car {
        private String brand;
        private String model;
        private double engineVolume;
        private String color;
        private int year;
        private  String country;

        public Car(String brand, String model, double engineVolume, String color, int year, String country) {

          if (brand == null) {brand = "default";}
            this.brand = brand;

          if (model == null) {model = "default";}
            this.model = model;

          if (country==null) {country ="default";}
            this.country = country;

          if (engineVolume<=0) {engineVolume = 1.5;}
            this.engineVolume = engineVolume;

          if (color == null) {color = "Белый";}
            this.color =color;

          if (year <=0) {year = 2000; }
            this.year = year;

        }
@Override
        public String toString() {
                return "Марка " + brand + " модель " + model + " Объем двигателя " + engineVolume +
                        " цвет " + color + " год производства " + year + " страна производитель " + country;

}



}
