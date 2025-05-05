package Basket;

public class Cashback {
    private String category;      // категория товара
    private int cashbackPercent;  // процент кэшбэка
    private int price;            // цена товара
    private int cashback;         // посчитанный кэшбэк за товар

    public Cashback(String category, int price) {
        this.category = category;
        this.price = price;
        calcCashback();
    }

    public void calcCashback() {
        switch (category) {
            case "Молочные продукты":
                cashbackPercent = 5;
                break;
            case "Хлеб и выпечка":
                cashbackPercent = 4;
                break;
            case "Фрукты":
                cashbackPercent = 6;
                break;
            case "Овощи":
                cashbackPercent = 3;
                break;
            case "Сладости":
                cashbackPercent = 7;
                break;
        }
        double rate = (double) cashbackPercent / 100;
        cashback = (int) (price * rate);
    }

    @Override
    public String toString() {
        return String.valueOf(cashback);
    }

    public int getCashback() {
        return cashback;
    }

    public int getCashbackPercent() {
        return cashbackPercent;
    }

    public String getCategory() {
        return category;
    }
}