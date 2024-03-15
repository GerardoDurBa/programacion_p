package people;

import values.CustomerRole;

public class Customer {
    CustomerRole role;
    String id;
    String fullname;

    public Customer(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
    
    
    void sayMenu(){
        
    }
    void cancelBuy(){
        
    }
    public void sellFood(){
        if(this.role != CustomerRole.ADMINISTRATIVE){
           System.out.println("Uste´ no tiene permijo pa´ vende´");
           return;
        } 
        System.out.println("Ya lo atiendo cole!");
    }
}
