package Products;

public class DairyProducts extends Product {
    private double percentageFat;  // процент жирности
    private double volume;         // объем

    public DairyProducts(String name, String brand, int price) {
        super(name, brand, price, "Молочные продукты");
    }

    public double getPercentageFat() {
        return percentageFat;
    }

    public double getVolume() {
        return volume;
    }
}