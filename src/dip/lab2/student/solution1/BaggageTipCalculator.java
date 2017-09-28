
package dip.lab2.student.solution1;

/**
 *
 * @author nrieck
 */
public class BaggageTipCalculator implements TipCalculator{
    private  Double tipPerBag;
    private  int bagAmt;

    public BaggageTipCalculator(Double tipPerBag, int bagAmt) {
        this.tipPerBag = tipPerBag;
        this.bagAmt = bagAmt;
    }
    
    @Override
    public double calcTip() {
        return tipPerBag * bagAmt;
    }

    public Double getTipPerBag() {
        return tipPerBag;
    }

    public void setTipPerBag(Double tipPerBag) {
        if (tipPerBag == null) {
            throw new IllegalArgumentException("Please insert a tip per bag amount");
        }
        this.tipPerBag = tipPerBag;
    }

    public int getBagAmt() {
        return bagAmt;
    }

    public void setBagAmt(int bagAmt) {
        if (bagAmt <= 0) {
            throw new IllegalArgumentException("Please insert a bag amount higher than 0");
        }
        this.bagAmt = bagAmt;
    }
}
