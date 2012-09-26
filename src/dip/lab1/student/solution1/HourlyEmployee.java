/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author bnowak8
 */
public class HourlyEmployee implements Employee {
    
    private double hourlyRate;
    private double totalHrsForYear;
    private double annualBonus;
    
    public HourlyEmployee(double hourlyRate, double totalHrsForYear, double annualBonus){
        
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
        this.annualBonus = annualBonus;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
 
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }


        public double getAnnualIncome() {
        return hourlyRate * totalHrsForYear;
    }
        
        public double getAnnualBonus(){
            return this.annualBonus;
        }

    
    
}
