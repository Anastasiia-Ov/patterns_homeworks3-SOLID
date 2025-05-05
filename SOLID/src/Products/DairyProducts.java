package Products;

import java.util.Arrays;
import java.util.List;

public class DairyProducts extends Product {
    private double percentageFat;  // процент жирности
    private double volume;         // объем
    private List<Product> listDairyProducts = Arrays.asList(
            new DairyProducts("Молоко", "Веселый Молочник", 113),
            new DairyProducts("Молоко", "Простоквашино", 88),
            new DairyProducts("Молоко", "Молочная Сказка", 99),
            new DairyProducts("Йогурт", "Даниссимо", 58),
            new DairyProducts("Йогурт", "Чудо", 79),
            new DairyProducts("Йогурт", "Эпика", 76),
            new DairyProducts("Творог", "Село Зеленое", 157),
            new DairyProducts("Творог", "Савушкин", 213),
            new DairyProducts("Сметана", "Домик в деревне", 69)
    );

    public DairyProducts(String name, String brand, int price) {
        super(name, brand, price, "Молочные продукты");
    }

    public DairyProducts() {
    }

    public double getPercentageFat() {
        return percentageFat;
    }

    public double getVolume() {
        return volume;
    }

    public List<Product> getListDairyProducts() {
        return listDairyProducts;
    }
}