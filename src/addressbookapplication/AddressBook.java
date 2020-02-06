/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbookapplication;

/**
 *
 * @author The_r
 */
public class AddressBook {
    private AddressEntry[] addressEntryList;
    
    public void list()
    {
         for(int i = 0; i < addressEntryList.length; i++)
         {
             String text = addressEntryList[i].toString();
             System.out.println(text);
         }
    }
    
    public void add(AddressEntry ae)
    {
        if(addressEntryList == null)
        {
            addressEntryList = new AddressEntry[1];
            addressEntryList[0] = ae;
        }
        else
        {
            AddressEntry[] temp = addressEntryList;
            addressEntryList = new AddressEntry[temp.length+1];
            for(int i = 0; i < temp.length; i++)
            {
                addressEntryList[i] = temp[i];
            }
            addressEntryList[temp.length] = ae;
        }
    }
}
