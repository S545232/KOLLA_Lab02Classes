/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;

import java.util.Scanner;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class EmployeeSalaryDriver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hourlyRate = scan.nextDouble();
//        double insuranceRate = scan.nextDouble();
//        double taxRate = scan.nextDouble();
//        double pfRate = scan.nextDouble();
//        double bonus = scan.nextDouble();

        double insuranceRate = 10.0;
        double taxRate = 5.0;
        double pfRate = 15;
        double bonus = 5000.0;
        
        EmployeeSalary empSalObj1 = new EmployeeSalary(hourlyRate, insuranceRate, taxRate, pfRate);
        System.out.println(empSalObj1.toString());
    }
}
