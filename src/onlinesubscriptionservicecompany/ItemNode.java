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
public class ItemNode { //Creating a node which only works with item instances
    
    private Item item; //Field for item
    private ItemNode nextItem; //Field that stores reference for the next node in the list
    
    public ItemNode(Item item){ //Constructor
        this.item = item;
    }

    // Getters and setters for items and next items
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ItemNode getNextItem() {
        return nextItem;
    }

    public void setNextItem(ItemNode next) {
        this.nextItem = next;
    }
    
}
