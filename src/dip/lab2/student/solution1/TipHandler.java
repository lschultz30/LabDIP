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
public class TipHandler {
     private TipCalculator tipCalculator;

    public TipHandler(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    public double getTip() {
       return tipCalculator.getCalculatedTip();
    }

    public TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public void setTipCalculator(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
}
