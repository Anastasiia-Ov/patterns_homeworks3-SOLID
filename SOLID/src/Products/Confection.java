package Products;

public class Confection extends Product {
    private boolean gluten;    // содержание глютена
    private boolean lactose;   // содержание лактозы

    public Confection(String name, String brand, int price) {
        super(name, brand, price, "Сладости");
    }

    // содержит глютен
    public boolean isGluten() {
        return gluten;
    }

    // содержит лактозу
    public boolean isLactose() {
        return lactose;
    }
}