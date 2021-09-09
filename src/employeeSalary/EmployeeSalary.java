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

    /**
     * Constructor with parameters
     * @param hourlyRate
     * @param insuranceRate
     * @param taxRate
     * @param pfRate 
     */
    public EmployeeSalary(double hourlyRate, double insuranceRate, double taxRate, double pfRate) {
        this.hourlyRate = hourlyRate;
        this.insuranceRate = insuranceRate;
        this.taxRate = taxRate;
        this.pfRate = pfRate;
    }

    /**
     * Constructor without parameters
     */
    public EmployeeSalary() {
    }

    /**
     * this function will return the hourly rate
     * @return 
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * this function will set the hourly rate 
     * @param hourlyRate
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * this function will return the insurance rate
     * @return 
     */
    public double getInsuranceRate() {
        return insuranceRate;
    }

    /**
     * this function will set the insurance rate 
     * @param insuranceRate
     */
    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    /**
     * this function will return the tax rate
     * @return 
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * this function will set the tax rate 
     * @param taxRate
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * this function will return the PF rate
     * @return 
     */
    public double getPfRate() {
        return pfRate;
    }

    /**
     * this function will set the PF rate 
     * @param pfRate
     */
    public void setPfRate(double pfRate) {
        this.pfRate = pfRate;
    }

    /**
     * this function will return the hours
     * @return 
     */
    public int getHours() {
        return hours;
    }

    /**
     * this function will set the hours 
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * this function will return the monthly salary of employee
     * @return 
     */
    public double calcMonthlySalary() {
        return this.hourlyRate * 40 * 4;
    }

    /**
     * this function will return the monthly insurance of employee
     * @return 
     */
    public double calcMonthlyInsurance() {
        return (this.calcMonthlySalary() * this.insuranceRate) / 100;
    }

    /**
     * this function will return the monthly PF amount of employee
     * @return 
     */
    public double calcMonthlyPfAmount() {
        return (this.calcMonthlySalary() * this.pfRate) / 100;
    }
    
    /**
     * this function will return the annual gross salary of employee
     * @param bonus
     * @return 
     */
    public double calcAnnualGrossSalary(double bonus) {
        return (this.calcMonthlySalary() * 12) + bonus;
    }
    
    /**
     * this function will return the annual net pay of employee
     * @param bonus
     * @return 
     */
    public double calcAnnualNetPay(double bonus) {
        return this.calcAnnualGrossSalary(bonus) - (this.calcAnnualGrossSalary(bonus) * this.taxRate/100) - (this.calcMonthlyInsurance() * 12) - (this.calcMonthlyPfAmount() * 12);
    }

    /**
     * this function will return all the parameters in string format
     * @return 
     */
    @Override
    public String toString() {
        return "hourlyRate: " + hourlyRate + ", insuranceRate: " + insuranceRate + ", taxRate: " + taxRate + ", pfRate: " + pfRate + ", HOURS: " + hours;
    }
    
}
