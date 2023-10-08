import java.util.Scanner;
public class phoneBook {
public static void main(String[] args) { 
	/*System.out.println("Please choose an option:\r\n"
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
switch(x) {
case 1:
//add cotact
break;
case 2:
//search contact
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
}while(y);*/ 
Contact a = new Contact("asma a","00","ss","sss","2000","as");
Contact b = new Contact("basma","11","ss","sss","2000","as");
Contact c = new Contact("anwar","22","ss","sss","2000","as");
Contact z = new Contact("areej","33","ss","sss","2000","as");
Contact e = new Contact("sara","44","ss","sss","2000","as");
Contact d = new Contact("nora","55","ss","sss","2000","as");
Contact w = new Contact("nada","66","ss","sss","2000","as");
linkedlist<Contact> a1 = new linkedlist<Contact>();
a1.add(b);
a1.add(a);
a1.add(c);
a1.add(e);
a1.add(d);
a1.add(w);
a1.add(z);
a1.findFirst();

for (int i=0 ; i<10; i++) {
System.out.println(a1.retrieve());
a1.findNext();
System.out.println("dana");
}
} } 


