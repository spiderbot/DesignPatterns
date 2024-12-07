package org.piyush.joshi.designpatterns.decorator;

public class DeliveryFeeDecorator extends UserCartDecorator{

    @Override
    public double calculateCartPrice() {
        return cart.calculateCartPrice() +7;
    }

    DeliveryFeeDecorator(BaseCart cart) {
        super(cart);
    }
}
