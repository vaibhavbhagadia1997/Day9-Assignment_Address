package addressBookSystem;
import java.util.*;
public class AddContact {

	
	public String firstName;
	public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phoneNumber;
	public String email;
	
		
	public String setFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
	}
	
	public String setLastName(String lastName) {
		this.lastName = lastName;
		return lastName;
	}
	
	public String setAddress(String address) {
		this.address = address;
		return address;
	}
	
	public String setCity(String city) {
		this.city = city;
		return city;
	}
	
	public String setState(String state) {
		this.state = state;
		return state;
	}
	
	public String setZip(String zip) {
		this.zip = zip;
		return zip;
	}
	
	public String setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return phoneNumber;
	}
	
	public String setEmail(String email) {
		this.email = email;
		return email;
	}
	
	public static void main(String[] args)
	{
		AddContact person=new AddContact();
		
		 System.out.println("ADD PERSON DETAIL'S");
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter person first Name: ");
	        person.setFirstName(scanner.next());
	        
	        System.out.println("Enter person Last Name:");
	        person.setLastName(scanner.next());
	        
	        System.out.println("Enter person Address:");
	        person.setAddress(scanner.next());
	        
	        System.out.println("Enter Person City:");
	        person.setCity(scanner.next());
	        
	        System.out.println("Enter Person State:");
	        person.setState(scanner.next());
	        
	        System.out.println("Enter Person Zip:");
	        person.setZip(scanner.next());
	        
	        System.out.println("Enter Person Phone Number:");
	        person.setPhoneNumber(scanner.next());
	        
	        System.out.println("Enter Person Email:");
	        person.setEmail(scanner.next());
	        
	        System.out.println("Entered Person Details is as follows:");
	        System.out.println("Name - " + person.firstName + " " + person.lastName + "\nPhone number - " + person.phoneNumber +
                    "\nEmail id - " + person.email + "\nAddress - " + person.address + "\nCity - " + person.city +
                    "\nState - " + person.state + "\nZip - " + person.zip);     
	}
}
