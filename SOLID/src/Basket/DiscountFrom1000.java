package Basket;

public class DiscountFrom1000 implements Discount {
    private final int DISCOUNT = 100;                  // скидка в рублях
    private final int MIN_SUM_FOR_DISCOUNT = 1000;     // мин сумма для применения скидки

    // проверка условий на применение скидки
    public boolean applyDiscount(int sumProduct) {
        return sumProduct >= MIN_SUM_FOR_DISCOUNT;
    }

    public int getDISCOUNT() {
        return DISCOUNT;
    }

    public int getMIN_SUM_FOR_DISCOUNT() {
        return MIN_SUM_FOR_DISCOUNT;
    }
}