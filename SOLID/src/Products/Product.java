package Products;

import Basket.Cashback;

public class Product {
    private final String name;             // название товара
    private int price;               // цена
    private final String brand;            // торговая марка
    private final String category;         // категория товара
    private Rating rating = new Rating(); // рейтинг
    private Cashback cashback;             // кэшбэк

    public Product(String name, String brand, int price, String category) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.category = category;
        rating.randomRating();
        cashback = new Cashback(category, price);
    }

    @Override
    public String toString() {
        return String.format("%s[%s] \"%s\" - %d₽",
                name, rating, brand, price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public Rating getRating() {
        return rating;
    }

    public int getCashback() {
        return Integer.parseInt(cashback.toString());
    }

    public String getCategory() {
        return category;
    }
}