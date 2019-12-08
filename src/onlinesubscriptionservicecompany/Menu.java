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
public class Menu {
    static void menuHeader(){ //Print header
        
        System.out.println("-----------------------------");
        System.out.println("|    WELCOME TO OUR ONLINE  |");
        System.out.println("|    SUBSCRIPTION SERVICE   |");
        System.out.println("-----------------------------");
    }
    static void runMenu(){ //Print Menu
        
        System.out.println("Choose your option");
        System.out.println("1) View item list");
        System.out.println("2) View Members");
        System.out.println("3) View Transactions");
        System.out.println("0) Exit Program");
    }
    
}
