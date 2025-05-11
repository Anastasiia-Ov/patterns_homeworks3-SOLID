package Products;

public class Vegetables extends Product {
    private String seasonality;   // сезонность
    private boolean washed;       // продается мытым

    public Vegetables(String name, String brand, int price) {
        super(name, brand, price, "Овощи");
    }

    public String getSeasonality() {
        return seasonality;
    }

    public boolean isWashed() {
        return washed;
    }
}