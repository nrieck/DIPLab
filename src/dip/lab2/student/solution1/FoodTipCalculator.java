
package dip.lab2.student.solution1;

/**
 *
 * @author nrieck
 */
public class FoodTipCalculator implements TipCalculator{
    private Double tipPercent;
    private Double billAmt;

    public FoodTipCalculator(Double tipPercent, Double billAmt) {
        this.tipPercent = tipPercent;
        this.billAmt = billAmt;
    }
       
    @Override
    public double calcTip() {
        return tipPercent * billAmt;
    }

    public Double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(Double tipPercent) {
        if (tipPercent == null) {
            throw new IllegalArgumentException("Please insert a tip percentage");
        }
        this.tipPercent = tipPercent;
    }

    public Double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(Double billAmt) {
        if (billAmt == null) {
            throw new IllegalArgumentException("Please insert a bill amount");
        }
        this.billAmt = billAmt;
    }

   
    
    
}
