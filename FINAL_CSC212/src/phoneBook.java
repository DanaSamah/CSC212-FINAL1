import java.util.LinkedList;
import java.util.Scanner;
public class phoneBook {
public static void main(String[] args) { 
System.out.println("Please choose an option:\r\n"
+ "1. Add a contact\r\n"
+ "2. Search for a contact\r\n"
+ "3. Delete a contact\r\n"
+ "4. Schedule an event\r\n"
+ "5. Print event details\r\n"
+ "6. Print contacts by first name\r\n"
+ "7. Print all events alphabetically\r\n"
+ "8. Exit");
Scanner input = new Scanner(System.in);
boolean y = true;
int x;
do{
x=input.nextInt();
linkedlist<Contact> a1 = new linkedlist<Contact>();
switch(x) {
case 1:
//add cotact
break;
case 2:
//search contact
	System.out.println("1. Name\r\n"
			+ "2. Phone Number\r\n"
			+ "3. Email Address\r\n"
			+ "4. Address\r\n"
			+ "5. Birthday ");
	System.out.println("Enter search criteria: ");
	 
	int i;
	i = input.nextInt();
	switch(i) { //another switch for search
		case 1: //by name
			System.out.println(a1.search_name());
			break;
			
		case 2: //phone
			System.out.println(a1.search_phone());
			break;

		case 3: //email
			linkedlist<Contact> a2 = a1.search_email();
			a2.current=a2.head;
			while (a2.current != null) {
				System.out.println(a2.retrieve().toString());
				a2.current = a2.current.next; }
			//System.out.println(a1.search_email());
			break;
			
		case 4: //address
			linkedlist<Contact> a3 = a1.search_address();
			a3.current=a3.head;
			while (a3.current != null) {
				System.out.println(a3.retrieve().toString());
				a3.current = a3.current.next; }
			//System.out.println(a1.search_address());
			break;
			
		case 5: //birthday
			linkedlist<Contact> a4 = a1.search_address();
			a4.current=a4.head;
			while (a4.current != null) {
				System.out.println(a4.retrieve().toString());
				a4.current = a4.current.next; }
			//System.out.println(a1.search_birthday());
			break;
			
		default:
			System.out.println("Re-enter a correct number from 1-5");
		}
	break;

case 3:
//delete
break;
case 4:
//schedule
break;
case 5:
//print event
break;
case 6:
//print contact by first name
case 7:
break;
//print all by alpha
case 8:
y=false;
break;
default:
System.out.println("Re-enter a correct number from 1-8 ");
break;
}
}while(y);

} } 

