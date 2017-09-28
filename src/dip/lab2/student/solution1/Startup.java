
package dip.lab2.student.solution1;

/**
 *
 * @author nrieck
 */
public class Startup {
    public static void main(String[] args) {
        
        //FoodTipCalculator calc = new FoodTipCalculator(0.10, 10.0);
        //System.out.println(calc.calcTip());
        
        BaggageTipCalculator calc = new BaggageTipCalculator(1.0, 4);
        TipService tipService = new TipService(calc);
        
        double tip = tipService.calcTip();
        System.out.println("The tip is " + tip);
    }
}
