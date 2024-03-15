package com.mycompany.restauranapp;

import people.Customer;
import values.CustomerRole;

public class RestauranApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "asd", "FULANITO DE TAL");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "sss", "SUTANITO DE TAL");
        administrative.sellFood();
    }
}
