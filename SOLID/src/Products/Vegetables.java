package Products;

import java.util.Arrays;
import java.util.List;

public class Vegetables extends Product {
    private String seasonality;   // сезонность
    private boolean washed;       // продается мытым
    private final List<Product> listVegetables = Arrays.asList(
            new Vegetables("Томаты сливовидные", "Фламенко", 279),
            new Vegetables("Черри", "Фламенко", 229),
            new Vegetables("Огурцы", "Ботаника", 169),
            new Vegetables("Шампиньоны", "Агрогриб", 149),
            new Vegetables("Картофель", "Азербайджан", 149),
            new Vegetables("Рукола", "Экокультура", 139),
            new Vegetables("Морковь", "Белая дача", 99)
    );

    public Vegetables(String name, String brand, int price) {
        super(name, brand, price, "Овощи");
    }

    public Vegetables() {
    }

    public String getSeasonality() {
        return seasonality;
    }

    public boolean isWashed() {
        return washed;
    }

    public List<Product> getListVegetables() {
        return listVegetables;
    }
}