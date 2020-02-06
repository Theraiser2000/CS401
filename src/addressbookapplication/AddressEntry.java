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
public class AddressEntry {
    
    private String FirstName;
    private String LastName;
    private String Street;
    private String City;
    private String State;
    private int ZIP;
    private String Telephone;
    private String Email;
    
    public AddressEntry()
    {
        
    }
    
    public AddressEntry(String fn, String ln, String str, String c, String sta, int z, String t, String e)
    {
        FirstName = fn;
        LastName = ln;
        Street = str;
        City = c;
        State = sta;
        ZIP = z;
        Telephone = t;
        Email = e;
    }
    
    public String toString()
    {
        String result = "First Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nStreet: "  + getStreet() + "\nCity: "  + getCity() + "\nState: " + getState() + "\nZIP: " + getZip() + "\nTelephone: " + getTelephone() + "\nEmail: " + getEmail() + "\n";
        return result;
    }
    
    public String getFirstName()
    {
        return FirstName;
    }
    
    public String getLastName()
    {
        return LastName;
    }
    
    public String getStreet()
    {
        return Street;
    }
    
    public String getCity()
    {
        return City;
    }
    
    public String getState()
    {
        return State;
    }
    
    public int getZip()
    {
        return ZIP;
    }
    
    public String getTelephone()
    {
        return Telephone;
    }
    
    public String getEmail()
    {
        return Email;
    }
    
    public void setFirstName(String input)
    {
        FirstName = input;
    }
    
    public void setLastName(String input)
    {
        LastName = input;
    }
    
    public void setStreet(String input)
    {
        Street = input;
    }
    
    public void setCity(String input)
    {
        City = input;
    }
    
    public void setState(String input)
    {
        State = input;
    }
    
    public void setZip(int input)
    {
        ZIP = input;
    }
    
    public void setTelephone(String input)
    {
        Telephone = input;
    }
    
    public void setEmail(String input)
    {
        Email = input;
    }
}
