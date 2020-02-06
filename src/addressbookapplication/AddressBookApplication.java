/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


NEXT, you are to create a method in your AddressBookApplication called void initAddressBookExercise(ab)
that creates 2 instances of AddressEntry and places them in ab (an AddressBook) collection called AddressEntryList. 
NEXT, the initAddressBookExercise method it calls the AddressBook's ab.list() method.
NOTE: The AddressBook's list() method cycles through the collection of AddresEntry objects using an iterator the contained in AddressBook and print outs the information to the console window calling toString() methods on each of its AddressEntry objects.
Note: AddressEntry class must have a String toString() method that takes all of its data elements and composes a nicely formated string from its values and returns this string. Again refer to Project 1.
 */
package addressbookapplication;

/**
 *
 * @author The_r
 */
public class AddressBookApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AddressBook ab = new AddressBook();
        initAddressBookExercise(ab);
    }
    
    public static void initAddressBookExercise(AddressBook ab)
    {
        AddressEntry ae1 = new AddressEntry("A", "B", "C", "D", "E", 0, "F", "G");
        AddressEntry ae2 = new AddressEntry("H", "I", "J", "K", "L", 1, "O", "P");
        
        ab.add(ae1);
        ab.add(ae2);
        
        ab.list();
    }
   
}
