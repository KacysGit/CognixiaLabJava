package pac1;

enum PersonGender
{
	M,F
}

public class L8 {
	String firstname;
	String lastname;
	PersonGender gender;
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

	public PersonGender getGender() {
		return gender;
	}

	public void setGender(PersonGender gender) {
		this.gender = gender;
	}

	L8(String fname, String lname, PersonGender g, String pnumber)
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
		
		System.out.println("Gender: "+gender);
		System.out.println("Phone Number: " + phoneNumber);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonGender gen = PersonGender.F;
		L8 obj = new L8("Kacy", "Metcalf", gen, "8002178409");
		
		
		obj.displayDetails();
		
	}

}
