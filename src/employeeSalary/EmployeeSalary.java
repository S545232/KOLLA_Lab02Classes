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

    public double calcMonthlySalary(double hourlyPay) {
        return hourlyPay * 40;
    }

    public double calcMonthlyInsurance(double monthlySalary, double insuranceRate) {
        return (monthlySalary * insuranceRate) / 100;
    }

    public double calcMonthlyPfAmount(double monthlySalary, double pfRate) {
        return (monthlySalary * pfRate) / 100;
    }

    public double calcAnnualGrossSalary(double annualSalary, double bonus) {
        return annualSalary + bonus;
    }

    public double calcAnnualNetPay(double annualGrossSalary, double taxRate, double annualInsurance, double annualPfAmount) {
        return annualGrossSalary - (annualGrossSalary * taxRate) - annualInsurance - annualPfAmount;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" + "hourlyRate=" + hourlyRate + ", insuranceRate=" + insuranceRate + ", taxRate=" + taxRate + ", pfRate=" + pfRate + ", hours=" + hours + '}';
    }

}
