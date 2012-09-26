/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author bnowak8
 */
public class HRService {
    Employee employee;
    
    public HRService(){
        
    }
    
    public double getAnnualCompensationForEmployee(Employee e){
        return e.getAnnualIncome();
    }
    
    public double getAnnualBonusForEmployee(Employee e){
        return e.getAnnualBonus();
    }
}
