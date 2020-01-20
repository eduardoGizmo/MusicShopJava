package Items;

public abstract class Item {

    private Double priceBuy;
    private Double priceSell;

    public Item(Double priceBuy, Double priceSell) {
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }

    public Double getPriceBuy() {
        return priceBuy;
    }

    public Double getPriceSell() {
        return priceSell;
    }
}
