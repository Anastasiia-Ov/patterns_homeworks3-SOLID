package Products;

import java.util.Arrays;
import java.util.List;

public class AvailableProducts {
    private final List<Product> listDairyProducts = Arrays.asList(
            new DairyProducts("Молоко", "Веселый Молочник", 113),
            new DairyProducts("Молоко", "Простоквашино", 109),
            new DairyProducts("Молоко", "Молочная Сказка", 105),
            new DairyProducts("Йогурт", "Чудо", 79),
            new DairyProducts("Йогурт", "Эпика", 76),
            new DairyProducts("Творог", "Село Зеленое", 157),
            new DairyProducts("Творог", "Савушкин", 213),
            new DairyProducts("Сметана", "Домик в деревне", 69)
    );

    private final List<Product> listConfection = Arrays.asList(
            new Confection("Печенье орешки", "Бельвита", 347),
            new Confection("Печенье сэндвич", "Бельвита", 167),
            new Confection("Вафельные трубочки", "Герард", 169),
            new Confection("Вафли", "Коровка", 128),
            new Confection("Бисквитное пирожное", "Киндер", 278),
            new Confection("Чоко-Пай", "Орион", 193),
            new Confection("Зефир", "Герард", 159)
    );

    private final List<Product> listBreadAndPastries = Arrays.asList(
            new BreadAndPastries("Хлеб ржаной", "Хлебный дом", 67),
            new BreadAndPastries("Батон", "Коломенское", 43),
            new BreadAndPastries("Батон", "Черемушки", 65),
            new BreadAndPastries("Багет", "Харрис", 79),
            new BreadAndPastries("Булочка для гамбургера", "Харрис", 119),
            new BreadAndPastries("Плетёнка", "Мастер пирогов", 95),
            new BreadAndPastries("Слоёный пирожок", "Мастер пирогов", 65)
    );

    private final List<Product> listVegetables = Arrays.asList(
            new Vegetables("Томаты", "Фламенко", 279),
            new Vegetables("Черри", "Фламенко", 229),
            new Vegetables("Огурцы", "Ботаника", 169),
            new Vegetables("Шампиньоны", "Агрогриб", 149),
            new Vegetables("Картофель", "Азербайджан", 149),
            new Vegetables("Руккола", "Экокультура", 139),
            new Vegetables("Морковь", "Белая дача", 99)
    );

    public List<Product> isCategory(int number) {
        return switch (number) {
            case 1 -> getListDairyProducts();
            case 2 -> getListBreadAndPastries();
            case 3 -> getListVegetables();
            case 4 -> getListConfection();
            default -> null;
        };
    }

    public List<Product> getListDairyProducts() {
        return listDairyProducts;
    }

    public List<Product> getListConfection() {
        return listConfection;
    }

    public List<Product> getListBreadAndPastries() {
        return listBreadAndPastries;
    }

    public List<Product> getListVegetables() {
        return listVegetables;
    }
}