/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinesubscriptionservicecompany;

/**
 *
 * @author Dhashin
 */
public class Item {
    //Fields
    private int itemNumberID;
    private String itemName;
    private int itemStock;

    public Item(int itemNumberID, String itemName, int itemStock) { //Constructor for the above mentioned fields
        
        this.itemNumberID = itemNumberID;
        this.itemName = itemName;
        this.itemStock = itemStock;
    }
    
    //All getter and setters for the three member fields which have been declared in Item class
    public int getItemNumberID() {
        return itemNumberID;
    }

    public void setItemNumberID(int itemNumberID) {
        this.itemNumberID = itemNumberID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemStock() {
        return itemStock;
    }

    public void setItemStock(int itemStock) {
        this.itemStock = itemStock;
    }

   
    
    
    
    
}
