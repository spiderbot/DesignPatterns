package org.piyush.joshi.designpatterns.decorator;

public class GSTDecorator extends UserCartDecorator{
    GSTDecorator(BaseCart cart) {
        super(cart);
    }

    @Override
    public double calculateCartPrice() {
        return cart.calculateCartPrice() + cart.calculateCartPrice() * 0.18;
    }
}
