package addressBookSystem;

public class AddresssBook {

	
	    public String firstName;
	    public String lastName;
	    public long phoneNumber;
	    public String emailId;
	    public String address;
	    public String city;
	    public String state;
	    public int zip;

	    public void Printing(){
	        System.out.println();
	    }

	    public AddresssBook(String firstName, String lastName, long phoneNumber,
	                   String emailId, String address, String city, String state, int zip) {
	        super();
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phoneNumber = phoneNumber;
	        this.emailId = emailId;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.zip = zip;
	    }
	    public static void main(String[] args){
	        AddresssBook A = new AddresssBook("VAIBHAV", "BHAGADIA", 997408333, "vaibhav@gmail.com",
	                                           "VALSAD", "VALSAD","GUJARAT", 396001 );
	        System.out.println(A.firstName+ " " +A.lastName+ "\n" +A.phoneNumber+ "\n" +A.emailId+ "\n"
	                           +A.address+ "\n" +A.city+ "\n" +A.state+ "\n"+A.zip);
	    }

	}

