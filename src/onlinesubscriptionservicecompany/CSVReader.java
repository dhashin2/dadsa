package onlinesubscriptionservicecompany;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Dhashin
 */
public class CSVReader {
                
    /**
     *
     * @return 
     */
    public static ItemLinkedList itemFileReader(){
                
                ItemLinkedList iList = new ItemLinkedList();
		String csvFile = "item.csv"; //Csv file location
		String line = ""; 
		String splitBy = ","; //Splitting the lines with commas
		
		 
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                        //While loop to read each line until there are no more lines in the file
                        br.readLine();
                        
			while ((line = br.readLine()) != null) { //Readline function is used to read a line from the file
			String[] itemDetails = line.split(splitBy); //Split function is used to split the words in the line by commas
                        Item item = new Item(Integer.parseInt(itemDetails[0]),itemDetails[1],Integer.parseInt(itemDetails[2])); //Adding the data into Item
                        iList.addNodeItem(item);
                       
			}
                        
                        return iList;
		} 
                
                catch (IOException e) {
		    System.out.println("Error" + e);
		}
                return iList;
    }
}
