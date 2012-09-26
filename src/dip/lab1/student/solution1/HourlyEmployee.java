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


        public double getAnnualIncome() {
        return hourlyRate * totalHrsForYear;
    }
        
        public double getAnnualBonus(){
            return this.annualBonus;
        }

    
    
}
