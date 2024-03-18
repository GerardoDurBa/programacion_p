package com.mycompany.restauranapp.food;

import com.mycompany.restauranapp.values.DishType;

public class Dish {
   private DishType type;
   private String name;
   private String ingredients; //to do: convertir a una lista
   private int price;
   private int quantity;

    public Dish(DishType type, String name, String ingredients, int price, int quantity) {
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.quantity = quantity;
    }

    public DishType getType() {
        return this.type;
    }

    public String getName() {
        return name;
    }
    
}
