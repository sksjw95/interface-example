package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        CafeOwner cafeOwner = new CafeOwner();

        CafeCustomerA a = new CafeCustomerA();
        CafeCustomerB b = new CafeCustomerB();

        cafeOwner.giveItem(a);
        cafeOwner.giveItem(b);
    }
}