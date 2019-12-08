package onlinesubscriptionservicecompany;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dhashin
 */
public class Main {
    
    public static void main(String[] args) {
        ItemLinkedList itemList = new ItemLinkedList();
        CSVReader csv = new CSVReader();
        ItemLinkedList list = CSVReader.itemFileReader();
        
        boolean terminate = false; //Declaring a boolean value for case "0" which exits the program
        Menu.menuHeader(); //Printing menu header outside while loop because we don't want to loop the header every iteration
        
        while(!terminate){
            Menu.runMenu(); //running our menu outline via Menu class
            String option; //Creating a string variable to store options that the user takes
            Scanner scanOption = new Scanner(System.in); //Making scanner to scan user inputs for all cases
            option = scanOption.next(); //Storing value in the string variable via scanner
            
            switch(option){ //Switch case for user options
                case "0": //Case for exiting the program
                    terminate = true; //this exits the program
                    System.out.println("Thanks for using our application, see you next time!"); //Message to user
                    break;
                
                case "1": //Case for showing item list
                    itemList.printItemList();
                    break;
                
                case "2": //Case for showing member list
                    break;
                    
                case "3": //Case for showing list of transactions that have been made
                    break;
                    
            }
        }
    }
              
}
