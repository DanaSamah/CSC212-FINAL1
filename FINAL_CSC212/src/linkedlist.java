

import java.util.*;
import java.util.Scanner;



public class  linkedlist<T> implements List<T>{
		
		Scanner input = new Scanner(System.in);

		public Node<T>head;  
		public Node<T>current;  
		
		public linkedlist() { 
			System.out.println('n');
		head=current=null; 
		} 
		public boolean empty() { 
		return head==null;//1 
		//bigO(1) 
		} 
		public boolean last() { 
		return current.next==null; 
		//bigO(1) 
		} 
		public boolean full( ) { 
		return false; 
		//bigO(1) 
		} 
		public void findFirst() { 
		current=head; 
		//bigO(1) 
		} 
		public void findNext() { 
		current=current.next; 
		//bigO(1) 
		} 
		public T retrieve() { 
		return current.data;
		//bigO(1) 
		} 
		public void update(T val) { 
		current.data=val; 
		}

public boolean exist(T E) {
	if(empty())
		return false;
	findFirst();
	Contact e =((Contact)E);
	while (current!= null) {
		Contact a =((Contact)current.data);
	
		if(a.getName().equals(e.getName()) || a.getPhoneNumber().equals(e.getPhoneNumber())) {
			System.out.print("the contact is already exist " + "\n");
		 }
		findNext();
	}
	//check the last elemnt
	/*Contact a =((Contact)current.data);
		if(a.getName().equals(e.getName()) || a.getPhoneNumber().equals(e.getPhoneNumber())) {
			System.out.print("the contact is already exist " + e.toString() +"\n");
		return true; }*/
		
			return false;	
	}
		public void add(T Con) {
		Node<T> con = new Node(Con); 
		Contact CastCon = ((Contact)con.data);
		if(!(exist(Con)))
		if(head==null)
		head = current = con;
		else {
		if(CastCon.compareTo(((Contact)head.data)) < 0) {
		con.next=head;
		head=con;
		}
		else {
		Node<T> prev = null;
		Node<T> temp = head;
		while(temp!=null) {
		if(CastCon.compareTo(((Contact)temp.data))< 0){
		prev.next = con;
		con.next = temp;
		current = con;
		break;
		}
		prev = temp;
		temp = temp.next;
		}//end while
		}
		} 
		}//end add
		

		
				
		public void delete() {
			if (current == head) {  
	            head = head.next;  
	        }}
		//------------------------------------------------
			
		public Contact search_name() {
			System.out.println("Enter the name: ");
			String name= input.next();
			current=head;
			while(current != null) {
				Node<T> tmp = current;
			if(((Contact) tmp.getData()).getName().equals(name)) {
				current=current.next;
				return ((Contact)tmp.getData());}
			else
				System.out.print("not found!");}
			return null;
		}	
//---------------------------------------------------------------------
		public Contact search_phone() {
			
			System.out.println("Enter the phone number: ");
			String number= input.next();
			current=head;
			while(current.getNext()!= null) {
				if(((Contact)current.getData()).getPhoneNumber().equals(number))
					return ((Contact)current.getData());
				else
					System.out.print("not found!");}
			return null;
		}
//----------------------------------------------------------------------------------
		public linkedlist<T> search_email(){
				linkedlist LL_email= new linkedlist();
				System.out.println("Enter the E-mail: ");
				String email= input.next();
				current=head;
				
				while(current.getNext()!= null) {
					if(((Contact) current.getData()).getEmailAddress().equals(email)) {
						LL_email.add(current);
						return LL_email;}
				 
					}return null;
		}
			
//-------------------------------------------------------------------------
			public linkedlist<T> search_address(){
				linkedlist LL_address= new linkedlist();
				System.out.println("Enter the Address: ");
				String address= input.next();
				current=head;
				
				while(current.getNext()!= null) {
					if(((Contact) current.getData()).getAddress().equals(address)) {
						LL_address.add(current);
						return LL_address;}
				else return null;
			}
				return LL_address;}
			
//-----------------------------------------------------------------	
			public linkedlist<T> search_birthday(){
				linkedlist LL_birthday= new linkedlist();
				System.out.println("Enter the birthday: ");
				String birthday= input.next();
				current=head;
				
				while(current!= null) {
					Node<T> tmp = current;
					Contact temp1 = ((Contact) tmp.data);
					if (temp1.getBirthday().equals(birthday)) {
						current=current.next;
						LL_birthday.add(tmp);}
			}
				return LL_birthday;
			}
//-----------------------------------------------------------------
			@Override
			public Contact search() {
				// TODO Auto-generated method stub
				return null;
			}
			
			/*public Contact searchname(String n){
				if(empty())
						return null;
			findFirst();
			while (!last())
			{
			if (Contact.retrieve().getName().equals(n))
				return Contact.retrieve();
			Contact.findNext() ;
			}
			if (Contact.retrieve().getName().equals(n) )
				return Contact.retrieve();
			
			return null;}*/
			




}


