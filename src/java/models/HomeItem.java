/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author parve
 */
public class HomeItem {
    
    private String user;
    private String category;
    private String itemName;
    private double price;
    
    public HomeItem(){}
    
    public HomeItem(String user,String category,String itemName,double price ){
        this.user=user;
        this.category=category;
        this.itemName=itemName;
        this.price=price;
       }

    public String getUser() {
        return user;
    }

    public String getCategory() {
        return category;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setItemNmae(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
  
}
    

