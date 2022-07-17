package com.mel.domain;

import com.mel.service.CarInterface;

public class Car implements CarInterface, Comparable<Car> {

    private String manufacturing;

    private String model;

    private String gas;

    private String engineType;

    private String transmission;

    private int yearOfIssue;

    private double engineVolume;

    private double enginePower;


    public Car() {
    }

    public Car(String manufacturing, String model, String gas, String engineType, String transmission, int yearOfIssue, double engineVolume, double enginePower) {
        this.manufacturing = manufacturing;
        this.model = model;
        this.gas = gas;
        this.engineType = engineType;
        this.transmission = transmission;
        this.yearOfIssue = yearOfIssue;
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
    }


    public String getManufacturing() {
        return manufacturing;
    }

    public String getModel() {
        return model;
    }

    public String getGas() {
        return gas;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setManufacturing(String manufacturing) {
        this.manufacturing = manufacturing;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfIssue != car.yearOfIssue) return false;
        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (Double.compare(car.enginePower, enginePower) != 0) return false;
        if (manufacturing != null ? !manufacturing.equals(car.manufacturing) : car.manufacturing != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (gas != null ? !gas.equals(car.gas) : car.gas != null) return false;
        if (engineType != null ? !engineType.equals(car.engineType) : car.engineType != null) return false;
        return transmission != null ? transmission.equals(car.transmission) : car.transmission == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = manufacturing != null ? manufacturing.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (gas != null ? gas.hashCode() : 0);
        result = 31 * result + (engineType != null ? engineType.hashCode() : 0);
        result = 31 * result + (transmission != null ? transmission.hashCode() : 0);
        result = 31 * result + yearOfIssue;
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(enginePower);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturing='" + manufacturing + '\'' +
                ", model='" + model + '\'' +
                ", gas='" + gas + '\'' +
                ", engineType='" + engineType + '\'' +
                ", transmission='" + transmission + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", engineVolume=" + engineVolume +
                ", enginePower=" + enginePower +
                '}';
    }

    @Override
    public void run() {
        System.out.println("GO");

    }

    @Override
    public int move() {
        return 0;
    }

    @Override
    public int compareTo(Car o) {
        return this.getYearOfIssue() - o.yearOfIssue;
    }

}
