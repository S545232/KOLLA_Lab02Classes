/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class EmployeeSalary {

    private double hourlyRate;
    private double insuranceRate;
    private double taxRate;
    private double pfRate;
    private int hours;

    public EmployeeSalary(double hourlyRate, double insuranceRate, double taxRate, double pfRate) {
        this.hourlyRate = hourlyRate;
        this.insuranceRate = insuranceRate;
        this.taxRate = taxRate;
        this.pfRate = pfRate;
    }

    public EmployeeSalary() {
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getPfRate() {
        return pfRate;
    }

    public void setPfRate(double pfRate) {
        this.pfRate = pfRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double calcMonthlySalary() {
        return this.hourlyRate * 40 * 4;
    }

    public double calcMonthlyInsurance() {
        return (this.calcMonthlySalary() * this.insuranceRate) / 100;
    }

    public double calcMonthlyPfAmount() {
        return (this.calcMonthlySalary() * this.pfRate) / 100;
    }

    public double calcAnnualGrossSalary(double bonus) {
        return (this.calcMonthlySalary() * 12) + bonus;
    }

    public double calcAnnualNetPay(double bonus) {
        return this.calcAnnualGrossSalary(bonus) - (this.calcAnnualGrossSalary(bonus) * this.taxRate) - (this.calcMonthlyInsurance() * 12) - (this.calcMonthlyPfAmount() * 12);
    }

    @Override
    public String toString() {
        return "hourlyRate: " + hourlyRate + ", insuranceRate: " + insuranceRate + ", taxRate: " + taxRate + ", pfRate: " + pfRate + ", hours: " + hours;
    }
    
}
