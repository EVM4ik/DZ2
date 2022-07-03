package domain;

public class Car {
    public String model;
    public String ownerFullName;
    public double engineVolume;
    public int yearOfCreation;

    public Car() {
    }

    public Car(String model, String ownerFullName, double engineVolume, int yearOfCreation) {
        this.model = model;
        this.ownerFullName = ownerFullName;
        this.engineVolume = engineVolume;
        this.yearOfCreation = yearOfCreation;
    }

    public int getMp(int a, int b) {
        return a * b;
    }

    public double getMp(double a, double b) {
        return a * b;
    }
}
