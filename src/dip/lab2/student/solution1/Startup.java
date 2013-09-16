/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author ndaley
 */
public class Startup {

    public static void main(String[] args) {
        TipCalculator tipCalculator1 = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 20);
        TipCalculator tipCalculator2 = new FoodServiceTipCalculator(ServiceQuality.POOR, 86.75);
        
        TipCalculator[] tipCalculators = {tipCalculator1, tipCalculator2};
        
        TipHandler tipHandler = new TipHandler();
        
        for(TipCalculator tipCalculator : tipCalculators){
            System.out.println(tipCalculator.getTip());
        }
    }
}
