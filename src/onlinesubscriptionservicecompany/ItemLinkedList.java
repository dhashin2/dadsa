package onlinesubscriptionservicecompany;

/**
 *
 * @author Dhashin
 */
public class ItemLinkedList {
    
    private ItemNode head; //The front of the linked list
    private int iSize; //To count how many items are in the linked list

    public ItemLinkedList(ItemNode head, int iSize) { //Constructor
        this.head = head;
        this.iSize = iSize;
    }

    public ItemLinkedList() { //Constructor
        
    }
    
    public void addNodeItem(Item item){
        ItemNode iNode = new ItemNode(item); //Creating new item instance
        iNode.setNextItem(head); //Setting next item to insert to the front of the list
        head = iNode;
        iSize++;
        
    }

    public int getiSize() { //Getter for getting size of list
        return this.iSize;
    }
    
    public void printItemList(){ //Method to print item list
        
        ItemNode current = head; //Declaring a variable "current" to store head data temporarily
        if(current != null){
                while (current != null){ //Printing all items in the list one by one
                current.printItem(); //Only .print in order to print in different lines
                current = current.getNextItem();
            }
        } else {
            System.out.println("Nothing to see here"); //While current == null means list is empty
        }
    }
    
}
