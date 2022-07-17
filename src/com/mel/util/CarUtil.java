package com.mel.util;

import com.mel.domain.Car;

import java.util.Random;

import static com.mel.service.CarInterface.*;

public class CarUtil {

    public static Car[] generateCar(int arraySize) {
        Car[] carArray = new Car[arraySize];
        for (int i = 0; i < arraySize; i++) {
            Car car = new Car();

            car.setManufacturing(generateManufacturing());
            car.setModel(generateModel());
            car.setGas(generateGas());
            car.setEngineType(generateEngineType());
            car.setTransmission(generateTransmission());
            car.setYearOfIssue(generateYearOfIssue());
            car.setEngineVolume(generateEngineVolume());
            car.setEnginePower(generateEnginePower());

            carArray[i] = car;
            System.out.println(carArray[i]);
        }
        return (carArray);
    }

    private static String generateManufacturing() {
        String[] arrayManufacturing = {CAR1, CAR2, CAR3, CAR4, CAR5};
        Random random = new Random();
        int n = random.nextInt(arrayManufacturing.length);
        return (arrayManufacturing[n]);
    }

    private static String generateModel() {
        String[] arrayModel = {"XC90", "530", "Tiguan", "GS", "Camry"};
        Random random = new Random();
        int n = random.nextInt(arrayModel.length);
        return (arrayModel[n]);
    }

    private static String generateGas() {
        String[] arrayGas = {"Gasoline", "Diesel", "Gas"};
        Random random = new Random();
        int n = random.nextInt(arrayGas.length);
        return (arrayGas[n]);
    }

    private static String generateEngineType() {
        String[] arrayEngineType = {"Inline engine", "V-engine", "Boxer engine", "Hybrid engine"};
        Random random = new Random();
        int n = random.nextInt(arrayEngineType.length);
        return (arrayEngineType[n]);
    }

    private static String generateTransmission() {
        String[] arrayTransmission = {"Manual", "Automatic", "Robotic", "Variable"};
        Random random = new Random();
        int n = random.nextInt(arrayTransmission.length);
        return (arrayTransmission[n]);
    }

    private static int generateYearOfIssue() {
        int[] arrayYearOfIssue = {2018, 2019, 2020, 2021, 2022};
        Random random = new Random();
        int n = random.nextInt(arrayYearOfIssue.length);
        return (arrayYearOfIssue[n]);
    }

    private static double generateEngineVolume() {
        double[] arrayEngineVolume = {1.6, 2.0, 2.4, 2.8, 3.5};
        Random random = new Random();
        int n = random.nextInt(arrayEngineVolume.length);
        return (arrayEngineVolume[n]);
    }

    private static double generateEnginePower() {
        double[] arrayEnginePower = {164, 185, 190, 220, 285};
        Random random = new Random();
        int n = random.nextInt(arrayEnginePower.length);
        return (arrayEnginePower[n]);
    }
}
