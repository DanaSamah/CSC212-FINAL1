

import java.util.*;
import java.util.Scanner;

public class  linkedlist<T> implements List<T>{
		
		Scanner input = new Scanner(System.in);

		public Node<T>head;  
<<<<<<< HEAD
		public Node<T>current;  
		private int size;
		
	

		public linkedlist() { 
			size=0;
=======
		public Node<T>current;  
		int size;
		
		public linkedlist() { 
			size=0;
>>>>>>> branch 'main' of https://github.com/DanaSamah/CSC212-FINAL1.git
		head=current=null; 
		} 
		public int size() {
			Node<T> temp=head;
			int count=0;
		
			if(head==null) {
				return 0;
			}
			else { while(temp.next!=null) {
				count++;
				temp=temp.next;}}
			return count;}
		
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

public boolean notexist(T E) {
	if(empty())
		return false;
	findFirst();
	//Contact e =((Contact)E);
	T a = current.data; 
	while (current!= null) {
		//Contact a =((Contact)current.data);
	
	//if(a..equals(e.getName()) || a.getPhoneNumber().equals(e.getPhoneNumber())) {
		if(a.equals(E)) {
		System.out.print("the contact is already exist " + "\n");
		return true;
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
		/*public void add(T Con) {
		Node<T> con = new Node(Con); 
		Contact CastCon = ((Contact)con.data);
		if(!(exist(Con)))
		if(head==null) {
		head = current = con;
		size++;}
		else {
		if(CastCon.compareTo(((Contact)head.data)) < 0) {
		con.next=head;
		head=con;
		size++;
		}
		else {
		Node<T> prev = null;
		Node<T> temp = head;
		for(int i=0;i<size;i++) {
		if(CastCon.compareTo(((Contact)temp.data))< 0){
		prev.next = con;
		con.next = temp;
		current = con;
		size++;
		break;
		}
		prev = temp;
		temp = temp.next;
		}//end while
		}
		} 
		}//end add*/
		

		
				
 public void delete() {
		if(size==0) {//1-linkedlist is empty
			System.out.println("the contacts is empty, nothing to delete");
               return;}
			else {//2- the contact is in the head
				if((head==current)) {
					head=head.getNext();
					findFirst();
					size--;
					System.out.println("Delete succecfully");
				}
		else {//3-Contact is in the middle
			 findFirst();
			 Node<T> temp=head;

				 for(int i=0;i<=size;i++) {
						if(temp==current ) {
		 while(current.next!=null) {
						if(((Contact) current.getData()).getName().equals(name)) {

							temp.setNext(current.getNext());
							System.out.println("Contact has deleted!");

						
								return;
		
								}
						else {
							temp=current;
							current=current.getNext();}}

				}

				if( last()){// 4-Contact is the last one
					 Node<T> L=head;
					   for(int i=0; i<size;i++) {
						  L=L.getNext();
						  }
					 L.setNext(null);
					 size--;
						  }}
			
				 
			 }

			System.out.println("Can't found the name to delete");
		}}
		
		//search 
		/*public Contact search_name() {
			System.out.println("Enter the name: ");
			String name= input.next();
			current=head;
			while(current != null) {
				//Node<T> tmp = current;
			if(((Contact) current.data).getName().equals(name)) {
				return ((Contact)current.data);}
				
			current=current.next;}

			return null;
		}	
//---------------------------------------------------------------------
		public Contact search_phone() {
			
			System.out.println("Enter the phone number: ");
			String number= input.next();
			current=head;
			while(current != null) {
				if(((Contact)current.data).getPhoneNumber().equals(number))
					return ((Contact)current.data);
				
				current=current.next;}

			return null;
		}
//----------------------------------------------------------------------------------
		public linkedlist<T> search_email(){
			linkedlist LL_email= new linkedlist();
				System.out.println("Enter the E-mail: ");
				String email= input.next();
				current=head;
				
				while(current != null) {
					if(((Contact) current.data).getEmailAddress().equals(email)) 
						LL_email.add(current.data);
					
					current=current.next;
				 
					}return LL_email;
		}
			
//-------------------------------------------------------------------------
			public linkedlist<T> search_address(){
				linkedlist LL_address= new linkedlist();
				System.out.println("Enter the Address: ");
				String address= input.next();
				current=head;
				
				while(current != null) {
					if(((Contact) current.data).getAddress().equals(address)) 
						LL_address.add(current.data);
						
					current=current.next;
				
				}return LL_address;
				}
			
//-----------------------------------------------------------------	
			public linkedlist<T> search_birthday(){
				linkedlist LL_birthday= new linkedlist();
				System.out.println("Enter the birthday:   ");
				String birthday= input.next();
				current=head;
				
				while(current!= null) {
					//Node<T> tmp = current;
					//Contact temp1 = ((Contact) tmp.data);
					if (((Contact) current.data).getBirthday().equals(birthday)) 
						LL_birthday.add(current.data);
						
					current=current.next;
						
			}
				return LL_birthday;
			}
		//------------------------------------------------
			
		/*public Contact search_name() {
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
			}*/
//-----------------------------------------------------------------
			/*@Override
			public Contact search() {
				// TODO Auto-generated method stub
				return null;
			}*/
			
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


