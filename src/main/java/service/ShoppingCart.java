package service;

import model.Food;

public class ShoppingCart {
    private final Food[] foodItems;

    public ShoppingCart(Food[] foodItems) {
        this.foodItems = foodItems;
    }

    /**
     * Общая сумма товаров в корзине без скидки
     */
    public double productsWithoutDiscount() {
        double summ = 0;
        for (Food foodItem : foodItems) {
            summ += foodItem.getSumm();
        }

        return summ;
    }

    /**
     * Общая сумма товаров в корзине со скидкой
     */
    public double discountedProducts() {
        double summ = 0;
        for (Food foodItem : foodItems) {
            double discount = (100 - foodItem.getDiscount()) / 100;
            summ += foodItem.getSumm() * discount;
        }

        return summ;
    }

    /**
     * Сумма всех вегетарианских продуктов без скидки
     */
    public double veganProductsWithoutDiscount() {
        double summ = 0;
        for (Food foodItem : foodItems) {
            if (foodItem.isVegetarian()) {
                summ += foodItem.getSumm();
            }
        }

        return summ;
    }
}