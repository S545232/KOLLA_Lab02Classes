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

    /**
     * Constructor with parameters
     * @param carModel
     * @param carManufacturer
     * @param color
     * @param mileage
     * @param speed
     * @param yearofManufacturer
     * @param isElectric
     */
    public Car(String carModel, String carManufacturer, String color, double mileage, double speed, int yearofManufacturer, boolean isElectric) {
        this.carModel = carModel;
        this.carManufacturer = carManufacturer;
        this.color = color;
        this.mileage = mileage;
        this.speed = speed;
        this.yearofManufacturer = yearofManufacturer;
        this.isElectric = isElectric;
    }

    /**
     * Constructor without parameters
     */
    public Car() {
    }

    /**
     * Constructor with three parameters
     * @param carModel
     * @param carManufacturer
     * @param color
     */
    public Car(String carModel, String carManufacturer, String color) {
        this.carModel = carModel;
        this.carManufacturer = carManufacturer;
        this.color = color;
    }

    //getters and setters

    /**
     * this function will return the Car Model
     * @return
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * this function will set the Car Model
     * @param carModel
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * this function will return the Car Manufacturer
     * @return
     */
    public String getCarManufacturer() {
        return carManufacturer;
    }

    /**
     * this function will set the Car Manufacturer
     * @param carManufacturer
     */
    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    /**
     * this function will return the Car color
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * this function will set the Car color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * this function will return the Car Mileage
     * @return
     */
    public double getMileage() {
        return mileage;
    }

    /**
     * this function will set the Car Mileage
     * @param mileage
     */
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    /**
     * this function will return the Car Speed
     * @return
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * this function will set the Car Speed
     * @param speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * this function will return the Car Year Of Manufacturer
     * @return
     */
    public int getYearofManufacturer() {
        return yearofManufacturer;
    }

    /**
     * this function will set the Car Year Of Manufacturer
     * @param yearofManufacturer
     */
    public void setYearofManufacturer(int yearofManufacturer) {
        this.yearofManufacturer = yearofManufacturer;
    }

    /**
     * this function will return the Car is Electric or not
     * @return
     */
    public boolean isIsElectric() {
        return isElectric;
    }

    /**
     * this function will set the Car is Electric or not
     * @param isElectric
     */
    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    //toString()
    @Override
    public String toString() {
          return "carModel=" + carModel 
                  + "\ncolor=" + color
                  + "\nCarManufacturer=" + carManufacturer
                  + "\nyearofManfacturer=" + yearofManufacturer
                  + "\nspeed=" + speed
                  + "\nmileage=" + mileage   
                  + "\nisElecric=" + isElectric;
    }
}
