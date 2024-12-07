package org.piyush.joshi.designpatterns.decorator;

public class DiscountDecorator extends UserCartDecorator{

    DiscountDecorator(BaseCart cart) {
        super(cart);
    }

    @Override
    public double calculateCartPrice() {
        return cart.calculateCartPrice();
    }
}
