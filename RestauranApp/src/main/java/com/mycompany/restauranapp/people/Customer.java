package com.mycompany.restauranapp.people;

import com.mycompany.restauranapp.values.CustomerRole;

public class Customer {
    CustomerRole role;
    String id;
    String fullname;
    int price;

    public Customer(CustomerRole role, String id, String fullname, int price) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
        this.price = price;
    }
    
    
    void sayMenu(){
        
    }
    void cancelBuy(){
        
    }
    public void sellFood(){
        if(this.role == CustomerRole.ADMINISTRATIVE){
           System.out.println("Uste´ no tiene permiso para vender");
           return;
        }
        else if (this.role == CustomerRole.STUDENT) {
            System.out.println(this.price + "2400");
        }
        System.out.println("Ya lo atiendo cole!");
    }
}
