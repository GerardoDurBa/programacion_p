package com.mycompany.restauranapp.food;

import java.util.ArrayList;

public class Menu {

private ArrayList<Dish> dishlist;

public Menu(){
    this.dishlist = new ArrayList<>();
}

public Menu (ArrayList<Dish> dishlist){
    this.dishlist = dishlist;
    }

public void addDish(Dish dish){
    this.dishlist.add(dish);
}
}
