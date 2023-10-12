

import java.util.*;
import java.util.Scanner;


	public class linkedlist<T extends Comparable<T>> {
	Scanner input = new Scanner(System.in);
	public Node<T>head; 
	public Node<T>current; 
	int size;
	public linkedlist() { 
	size=0;
	head=current=null; 
	} 
	public int getsize() {
		return size;
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
	/*public boolean exist(T E) {
	if(head == null)
	return false;
	
	Node<T> temp = head;
	for ( int i=0; i<size ; i++){
	if(temp.getData().compareTo(E) == 0) {
	System.out.print("the contact is already exist " + "\n");
	current = temp;
	return true;
	}
	temp = temp.next;
	} 
	
	return false; 
	} */
	
	public void add(T Con) {
	Node<T> con = new Node(Con); 
	
	if(head==null) {
	head = current = con;
	size++;
	return;
	}
	
	else {
		
		if(Con.compareTo(head.data) < 0) {
		con.next=head;
		head=con;
		size++;
		return;
		}
		
		else {
		Node<T> prev = head;
		Node<T> temp = head.next;
		
		while(temp != null) {
			if(Con.compareTo(temp.data) < 0){
			prev.next = con;
			con.next = temp;
			current = con;
			size++;
			
			return;
			}
			prev = temp;
			temp = temp.next;
			}//end for
		prev.next=con;
		current = con;
		size++;
	
		} 
	} 
	
	}//end add
	
	public void delete() {
		 //1- the contact is in the head
		if(head==current) {
		head=head.getNext();
		current = head;
		size--;
		System.out.println("Contact has deleted!");
		return;
		}
	
		
		else {//3-Contact is in the middle
		Node<T> temp=head;
	    for(int i=0;i<size;i++) {
		if(temp.next==current) {
		temp.next=current.next;
		size--;
		current=current.next;
		System.out.println("Contact has deleted!");
		return;
		}
		else 
		temp=temp.next;
		}
		
		}

		}
  		
			
	
	
	}
	

