package com.mel;

import com.mel.domain.Car;
import com.mel.service.CarInterface;
import com.mel.util.CarUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car[] cars = CarUtil.generateCar(10);
        System.out.println(cars.toString());


        CarInterface carInterface = new Car();

        carInterface.run();
        carInterface.move();

        Arrays.sort(cars);
        for (Car car: cars) {
            System.out.println(car);
        }
    }
}
