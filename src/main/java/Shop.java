import Items.Behaviours.ISell;
import Items.Item;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;


    public Shop() {
        this.stock = new ArrayList<ISell>();
    }


}
