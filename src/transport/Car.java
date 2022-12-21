package transport;

import java.lang.annotation.Native;
import java.util.Calendar;

public class Car {
    public class Key {
        private boolean intremoteEngineStart;
        private boolean engineStart;

        public Key(boolean remoteEngineStart, boolean engineStart) {

            this.intremoteEngineStart = false;
            this.engineStart = false;}

        public boolean getEngineStart() {return false;}
        public boolean getRemoteEngineStart() {return false;}
        public boolean getModel() {return false;}
        public void setIntremoteEngineStart(boolean intremoteEngineStart) {
            this.intremoteEngineStart = intremoteEngineStart;}
        public void setEngineStart(boolean engineStart) {
            this.engineStart = engineStart;
        }


    }
        private final String brand;
        private final String model;
        private double engineVolume;
        private String color;
        private final int year;
        private  final String country;

        private String transmission;
        private final String bodyType;
        private int registrationNumber;
        private final int numberOfSeats;
        private int autoRubberWinter;
        private Key key;

        public Car(String brand, String model, double engineVolume, String color, int year, String country,
                   String transmission, String bodyType, int registrationNumber, int numberOfSeats) {
            if (transmission == null) { transmission = "MKPP";}
            this.transmission = transmission;

            if (bodyType == null) {bodyType = "Sedan";}
            this.bodyType = bodyType;

            if (registrationNumber == 0) { registrationNumber = 000;}
            this.registrationNumber = registrationNumber;
            if (numberOfSeats == 0) {numberOfSeats = 4;}
            this.numberOfSeats = numberOfSeats;

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
          this.year = year;}
    public String getBrand() { return brand;}
    public String getModel() {return model;}
    public int getYear() {return year;}
    public String getCountry() {return country;}
    public String getBodyType() {return bodyType;}
    public int getNumberOfSeats() {return numberOfSeats;}
    public double getEngineVolume() {return engineVolume;}
    public String getTransmission() {return transmission;}
    public int getRegistrationNumber() { return registrationNumber;}
    public void setRegistrationNumber(int registrationNumber) { this.registrationNumber = registrationNumber;}
    public void setTransmission(String transmission) {this.transmission = transmission;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public void setEngineVolume(double engineVolume) {this.engineVolume = engineVolume;}


    public void setKey(boolean key) {
        key = key;
    }

    public int AutoRubberWinter () {
            Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        if (month<4||month>9) {
            System.out.println("Машина на зимней резине");}
        return autoRubberWinter;

    }
    @Override
        public String toString() {
                return "Марка " + brand + " модель " + model + " Объем двигателя " + engineVolume +
                        " цвет " + color + " год производства  " + year + " страна производитель " + country;

}



}
