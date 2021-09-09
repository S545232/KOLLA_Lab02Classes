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
public class CarDriver {

    public static void main(String[] args) {
        // Creation of a Car object reference as object1 with parameterized constructor which was created using all the instance variables.
        Car object1 = new Car("Golf", "Volkswagen", "Red", 28.0, 33.0, 2020, false);

        // Invoking of all getter methods on object1 and printing them
        System.out.println("*****Testing getter method on object1*********");
        System.out.println("Car Model is :" + object1.getCarModel());
        System.out.println("Name of the Car Manufacturer is :" + object1.getCarManufacturer());
        System.out.println("Color of the car is :" + object1.getColor());
        System.out.println("Year of Manufacturing: " + object1.getYearofManufacturer());
        System.out.println("Speed of Car per miles/hour is :" + object1.getSpeed());
        System.out.println("Mileage of Car  is :" + object1.getMileage());
        System.out.println("The car is electric (True/False) is :" + object1.isIsElectric());

        // Invoking and printing of toString() with object1
        System.out.println("*****Testing toString method on object1*********");
        System.out.println(object1.toString());

        // Creation of a Car object reference as object2 with parameterized constructor which was created using three instance variables.
        Car object2 = new Car("Passat", "Volkswagen", "Blue");

        // Invoking of all getter methods on object2 and printing them
        System.out.println("*****Testing constructor with three parameters and Invoking toString method*********");
        System.out.println(object2.toString());

        System.out.println("*****Testing getter method on object2*********");
        System.out.println("Car Model is :" + object2.getCarModel());
        System.out.println("Name of the Car Manufacturer is :" + object2.getCarManufacturer());
        System.out.println("Color of the car is :" + object2.getColor());
        System.out.println("Year of Manufacturing: " + object2.getYearofManufacturer());
        System.out.println("Speed of Car per miles/hour is :" + object2.getSpeed());
        System.out.println("Mileage of Car  is :" + object2.getMileage());
        System.out.println("The car is electric (True/False) is :" + object2.isIsElectric());

        System.out.println("*****Testing toString on object 3*********");
        Car object3 = new Car();
        object3.setCarModel("Swift");
        object3.setColor("Yellow");
        object3.setCarManufacturer("Maruthi");
        object3.setYearofManufacturer(2021);
        object3.setSpeed(25.0);
        object3.setMileage(18.0);
        object3.setIsElectric(true);
        System.out.println(object3.toString());
    }
}
