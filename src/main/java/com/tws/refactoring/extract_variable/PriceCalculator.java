package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    public static final int MAX_QUANTITY = 500;
    public static final double DISCOUNT_RATE = 0.05;
    public static final double COST_RATE = 0.1;
    public static final double COST_SHIPING = 100.0;

    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        int basePrice = quantity * itemPrice;
        double discount = Math.max(0, quantity - MAX_QUANTITY) * itemPrice * DISCOUNT_RATE;
        double shippingCost = Math.min(quantity * itemPrice * COST_RATE, COST_SHIPING);
        return basePrice - discount + shippingCost;
    }
}
