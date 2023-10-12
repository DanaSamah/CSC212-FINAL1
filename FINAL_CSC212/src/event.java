
public class event implements Comparable<event>{
	
		private String title;
		private String date_time;
		private String location;
		 linkedlist <String> name;   
		
		public event() {
			   this.title = "";  
		        this.date_time = "";  
		        this.location = "";  
		   name = new linkedlist<String>();     
		}

		public event(String title, String date_time, String location,String contact) {
			this.title = title;
			this.date_time = date_time;
			this.location = location;
			  name = new linkedlist<String>();  
			  name.add(contact);     
		}

		@Override
		public int compareTo(event o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		


}
