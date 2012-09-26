/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author bnowak8
 */
public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;
    
    public SalariedEmployee(double annualSalary, double annualBonus){
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }
    
    public double getAnnualIncome(){
        return this.annualSalary;
    }
    public double getAnnualBonus(){
            return this.annualBonus;
        }
    
    
}
