package org.piyush.joshi.designpatterns.decorator;

public abstract class UserCartDecorator extends BaseCart {

    protected BaseCart cart;

    UserCartDecorator(BaseCart cart){
        this.cart = cart;
    }

    @Override
    public double calculateCartPrice() {
        return cart.calculateCartPrice();
    }
}
