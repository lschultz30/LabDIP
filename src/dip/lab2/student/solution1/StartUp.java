/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Lane Schultz
 */
public class StartUp {
    public static void main(String[] args) {
        TipCalculator calc = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 3);
        TipCalculator calc1= new FoodServiceTipCalculator(ServiceQuality.GOOD, 40) {};
        
        TipHandler handler = new TipHandler(calc);
        TipHandler handler1 = new TipHandler(calc1);
        double amount = handler.getTip();
        double amount1= handler1.getTip();
                 
        
        System.out.println("$"+amount+ " is an appropriate tip.");
        System.out.println("$"+amount1+ " is an appropriate tip.");
    }
}
