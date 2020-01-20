package Items.Instruments;

import Items.Behaviours.IPlay;
import Items.Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numOfStrings;

    public Guitar(Double priceBuy, Double priceSell, String material, String colour, String type, int numOfStrings) {
        super(priceBuy, priceSell, material, colour, type);
        this.numOfStrings = numOfStrings;
    }

    public String playSound() {
        return "Cling";
    }

    public Double calculateMarkup() {
        return this.getPriceSell() - this.getPriceBuy();

    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }


}
