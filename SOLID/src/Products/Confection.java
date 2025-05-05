package Products;

import java.util.Arrays;
import java.util.List;

public class Confection extends Product {
    private boolean gluten;    // содержание глютена
    private boolean lactose;   // содержание лактозы
    private final List<Product> listConfection = Arrays.asList(
            new Confection("Печенье орешки", "Бельвита", 79),
            new Confection("Печенье сэндвич", "Бельвита", 167),
            new Confection("Вафельные трубочки", "Герард", 169),
            new Confection("Вафли", "Коровка", 79),
            new Confection("Бисквитное пирожное", "Киндер", 89),
            new Confection("Чоко-Пай", "Орион", 193),
            new Confection("Зефир", "Герард", 159)
    );

    public Confection(String name, String brand, int price) {
        super(name, brand, price, "Сладости");
    }

    public Confection() {
    }

    public boolean isGluten() {
        return gluten;
    }

    public boolean isLactose() {
        return lactose;
    }

    public List<Product> getListConfection() {
        return listConfection;
    }
}