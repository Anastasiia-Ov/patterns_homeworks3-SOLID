package Products;

import java.util.Arrays;
import java.util.List;

public class BreadAndPastries extends Product {
    private String typeFlour;    // сорт муки
    private double weight;       // вес изделия
    private boolean yeast;       // дрожжи в составе
    private final List<Product> listBreadAndPastries = Arrays.asList(
            new BreadAndPastries("Хлеб ржаной", "Хлебный дом", 67),
            new BreadAndPastries("Батон", "Коломенское", 43),
            new BreadAndPastries("Батон", "Черемушки", 65),
            new BreadAndPastries("Багет", "Харрис", 79),
            new BreadAndPastries("Булочка для гамбургера", "Харрис", 119),
            new BreadAndPastries("Плетёнка", "Мастер пирогов", 95),
            new BreadAndPastries("Слоёный пирожок", "Мастер пирогов", 65)
    );

    public BreadAndPastries(String name, String brand, int price) {
        super(name, brand, price, "Хлеб и выпечка");
    }

    public BreadAndPastries() {
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

    public List<Product> getListBreadAndPastries() {
        return listBreadAndPastries;
    }
}