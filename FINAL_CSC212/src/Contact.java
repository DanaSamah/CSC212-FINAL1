import java.util.*;

public class Contact implements comparable<String> {
	// I removed the generic from contact
	private String name;
	private String phoneNumber; //String or int
	private String emailAddress;
	private String address;
	private String birthday;
	private String notes;
	Scanner input = new Scanner(System.in);
	public Contact() {
	}
	public Contact(String name, String phoneNumber, String emailAddress, String address, String birthday, String notes) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.emailAddress = emailAddress;
	this.address = address;
	this.birthday = birthday;
	this.notes = notes;
	}
	public void insertContact() {
	System.out.println("Enter the contact's name:");
	name = input.nextLine();
	System.out.println("Enter the contact's phone number:");
	phoneNumber = input.nextLine();
	System.out.println("Enter the contact's email address:");
	emailAddress = input.nextLine();
	System.out.println("Enter the contact's address:");
	address = input.nextLine();
	System.out.println("Enter the contact's birthday:");
	birthday = input.nextLine();
	System.out.println("Enter any notes for the contact:");
	notes = input.nextLine();
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getPhoneNumber() {
	return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
	return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
	public String getBirthday() {
	return birthday;
	}
	public void setBirthday(String birthday) {
	this.birthday = birthday;
	}
	public String getNotes() {
	return notes;
	}
	public void setNotes(String notes) {
	this.notes = notes;
	}
	public int compareTo(Contact c) {
	// I ignore the case but not sure if it is true
	return name.compareToIgnoreCase(c.name) ;
	//will return a -1 or 1 or 0
	}
	public String toString() {
	return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress
	+ ", address=" + address + ", birthday=" + birthday + ", notes=" + notes + "]";
	}
	}
	

}
