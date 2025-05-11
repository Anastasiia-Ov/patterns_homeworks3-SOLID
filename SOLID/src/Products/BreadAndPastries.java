package Products;

public class BreadAndPastries extends Product {
    private String typeFlour;    // сорт муки
    private double weight;       // вес изделия
    private boolean yeast;       // дрожжи в составе

    public BreadAndPastries(String name, String brand, int price) {
        super(name, brand, price, "Хлеб и выпечка");
    }

    public String getTypeFlour() {
        return typeFlour;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isYeast() {
        return yeast;
    }
}