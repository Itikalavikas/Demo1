package ticket;
import java.util.*;
public class TicketCounter {
	 public void provideTicket(Queue<Person> q,Queue<Person> q1){
	    	int i=1;
	    	while((q.size()!=0) || (q1.size()!=0))
	    	{
	    	
		    	if((i%3==0 && q1.size()!=0) || q.size()==0){  
		    		i++;
		    		Person p=q1.remove();
		    		System.out.println("Name="+p.name+" age="+p.age+"  ticket received");
		    		
		    		
		    	}
		    	else{
		    		i++;
		    		Person p=q.remove();
		    		System.out.println("Name="+p.name+" age="+p.age+"  ticket received");
		    		
		    	}
	    }   
	    	
	 }	 
	}