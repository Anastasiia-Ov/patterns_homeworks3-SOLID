package Basket;

import Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final int MIN_SUM_ORDER = 450;          // мин.сумма заказа (только товары)  св-во МАГИКС
    private final int DISCOUNT = 500;               // скидка
    private final int MIN_SUM_FOR_DISCOUNT = 3000;  // мин.сумма для применения скидки
    private int priceDelivery;                      // цена доставки
    private int sumCashback;                        // сумма кэшбэка
    private int sumProduct;                         // сумма только за товары
    private int amountToBePaid;                     // сумма к оплате
    private List<Product> products = new ArrayList<>(); // список продуктов, добавленных в корзину

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calcAmountToBePaid(String street) {
        calcCashbackAndProduct();
        calcDelivery(street);
        if (sumProduct >= MIN_SUM_ORDER) {
            if (applyDiscount()) {
                amountToBePaid = sumProduct + priceDelivery - DISCOUNT;
                System.out.printf(
                        "Скидка %d₽ применена!\n" +
                                "Доставка: %d\n" +
                                "Итого к оплате: %d\n" +
                                "Ваш кэшбэк за покупку = %d\n",
                        DISCOUNT, priceDelivery, amountToBePaid, sumCashback);
            } else {
                amountToBePaid = sumProduct + priceDelivery;
                System.out.printf(
                        "Доставка: %d\n" +
                                "Итого к оплате: %d\n" +
                                "Ваш кэшбэк за покупку =  %d\n",
                        priceDelivery, amountToBePaid, sumCashback);
            }
            amountToBePaid = applyDiscount() ?
                    sumProduct + priceDelivery - DISCOUNT :
                    sumProduct + priceDelivery;
        } else {
            System.out.printf("Минимальная сумма заказа %d\n");
        }
    }

    public void calcCashbackAndProduct() {
        for (Product product : products) {
            int price = product.getPrice();
            int cashback = product.getCashback();
            sumProduct += price;
            sumCashback += cashback;
        }
    }

    public void calcDelivery(String street) {
        Delivery delivery = new Delivery();
        priceDelivery = delivery.calcDelivery(street);
    }

    public boolean applyDiscount() {
        return sumProduct >= MIN_SUM_FOR_DISCOUNT;
    }
}