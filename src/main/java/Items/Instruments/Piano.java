package Items.Instruments;
import Items.Behaviours.IPlay;
import Items.Behaviours.ISell;


public class Piano extends Instrument implements IPlay, ISell {

    private int numOfKeys;

    public Piano(Double priceBuy, Double priceSell, String material, String colour, String type, int numOfKeys) {
        super(priceBuy, priceSell, material, colour, type);
        this.numOfKeys = numOfKeys;
    }

    public String playSound() {
        return "Clong";
    }

    public Double calculateMarkup() {
        return this.getPriceSell() - this.getPriceBuy();
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public void setNumOfKeys(int numOfKeys) {
        this.numOfKeys = numOfKeys;
    }
}
