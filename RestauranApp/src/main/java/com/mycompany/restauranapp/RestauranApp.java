package com.mycompany.restauranapp;

import com.mycompany.restauranapp.food.Dish;
import com.mycompany.restauranapp.food.Menu;
import com.mycompany.restauranapp.people.Customer;
import com.mycompany.restauranapp.values.CustomerRole;
import com.mycompany.restauranapp.values.DishType;

public class RestauranApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "asd", "FULANITO DE TAL");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "sss", "SUTANITO DE TAL");
        administrative.sellFood();
        
        Menu menu = new Menu();
        
        Dish breakfast1 = new Dish(DishType.BREAKFAST, "Huevos fritos", "Huveos, sal y pimienta", 2400, 20);
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "Caldo de pollo", "Pollo, Papa, ajo y agua", 2400, 20);
        Dish lunch1 = new Dish(DishType.LUNCH, "Pastas a la bolognesa", "Pastas y salsas", 2400, 20);
        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(breakfast1);
        
    }
}
