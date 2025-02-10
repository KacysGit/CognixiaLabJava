package pac1;

public class PersonforQ7 {
	String firstname;
	String lastname;
	char gender;
	String phoneNumber;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	PersonforQ7(String fname, String lname, char g, String pnumber)
	{
		this.firstname=fname;
		this.lastname=lname;
		this.gender=g;
		this.phoneNumber=pnumber;
	}
	
	public void displayDetails()
	{
		System.out.println("Person Details");
		System.out.println("__________________");
		System.out.println("First Name: "+firstname);
		System.out.println("Last Name: "+lastname);
		
		System.out.println("Last Name: "+gender);
		System.out.println("Phone Number: " + phoneNumber);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonforQ7 obj = new PersonforQ7("Kacy", "Metcalf", 'F', "8002178409");
		
		
		obj.displayDetails();
		
	}

}
