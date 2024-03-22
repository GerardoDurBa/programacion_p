package com.mycompany.restauranapp;

import com.mycompany.restauranapp.food.Dish;
import com.mycompany.restauranapp.food.Menu;
import com.mycompany.restauranapp.people.Customer;
import com.mycompany.restauranapp.values.CustomerRole;
import com.mycompany.restauranapp.values.DishType;

public class RestauranApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "192199", "FULANITO DE TAL", 2400);
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "121212", "SUTANITO DE TAL", 7600);
        administrative.sellFood();
        
        Customer teacher = new Customer(CustomerRole.TEACHER, "020202", "SUTANITO DE TAL", 7600);
        teacher.sellFood();
        
        Menu menu = new Menu();
        
        Dish breakfast1 = new Dish(DishType.BREAKFAST, "Huevos fritos", "Huveos, sal y pimienta", 2400, 20);
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "Caldo de pollo", "Pollo, Papa, ajo y agua", 2400, 20);
        Dish lunch1 = new Dish(DishType.LUNCH, "Pastas a la bolognesa", "Pastas y salsas", 2400, 20);
        Dish dinner1 = new Dish(DishType.DINNER, "Arepa con huevo", "huevo y harina", 2400, 15);
        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        menu.addDish(dinner1);
        
        System.out.println(menu.getDishesPerType(DishType.BREAKFAST));
        System.out.println(menu.getDishesPerType(DishType.LUNCH));
        System.out.println(menu.getDishesPerType(DishType.DINNER));
    }
}
