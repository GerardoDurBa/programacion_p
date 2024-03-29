package com.mycompany.restauranapp.food;

import com.mycompany.restauranapp.values.DishType;
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

public ArrayList<String> getDishesPerType(DishType dishType){
    ArrayList<String> foundDishes = new ArrayList<>();
    
    for(Dish dish : dishlist){
        if (dish.getType() == dishType) {
            foundDishes.add(dish.getName());
            foundDishes.add(dish.getIngredients());
        }
    }
    return foundDishes;
    }
}
