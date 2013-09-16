/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author ndaley
 */
public class BaggageServiceTipCalculator implements TipCalculator{
    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    
    private static final String BAGGAGE_COUNT_ENTRY_ERR = 
            "bag count must be greater than or equal to zero";
     private static final String BASE_TIP_ENTRY_ERR = 
             "error: base tip must be greater than or equal to zero";
    
    private static final double BASE_RATE = 1;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;
    
    private static final double BASE_TIP = 0.00;
    
    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public double getTip() {
        double tip = BASE_TIP; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (BASE_RATE + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (BASE_RATE + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (BASE_RATE + POOR_RATE);
                break;
        }

        return tip;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    BAGGAGE_COUNT_ENTRY_ERR);
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    BASE_TIP_ENTRY_ERR);
        }
        this.baseTipPerBag = baseTipPerBag;
    }
}
