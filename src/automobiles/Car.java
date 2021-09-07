/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automobiles;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class Car {

    private String carModel;
    private String carManufacturer;
    private String color;
    private double mileage;
    private double speed;
    private int yearofManufacturer;
    private boolean isElectric;

    public Car(String carModel, String carManufacturer, String color, double mileage, double speed, int yearofManufacturer, boolean isElectric) {
        this.carModel = carModel;
        this.carManufacturer = carManufacturer;
        this.color = color;
        this.mileage = mileage;
        this.speed = speed;
        this.yearofManufacturer = yearofManufacturer;
        this.isElectric = isElectric;
    }

    public Car() {
    }

    public Car(String carModel, String carManufacturer, String color) {
        this.carModel = carModel;
        this.carManufacturer = carManufacturer;
        this.color = color;
    }

    //getters and setters
    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getYearofManufacturer() {
        return yearofManufacturer;
    }

    public void setYearofManufacturer(int yearofManufacturer) {
        this.yearofManufacturer = yearofManufacturer;
    }

    public boolean isIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    //toString()
    @Override
    public String toString() {
//        return "Car{" + "carModel=" + carModel + ", carManufacturer=" + carManufacturer + ", color=" + color + ", mileage=" + mileage + ", speed=" + speed + ", yearofManufacturer=" + yearofManufacturer + ", isElectric=" + isElectric + '}';
          return "carModel=" + carModel 
                  + "\ncolor=" + color
                  + "\ncarManufacturer=" + carManufacturer
                  + "\nyearofManufacturer=" + yearofManufacturer
                  + "\nspeed=" + speed
                  + "\nmileage=" + mileage   
                  + "\nisElectric=" + isElectric;
    }
}
