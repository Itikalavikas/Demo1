package ticket;
import java.util.*;
public class QOperation {

	public static void main(String[] args) {
		Queue<Person> q=new LinkedList<>();
    	Queue<Person> qs=new LinkedList<>();
    	Person p=new Person("abcd",20);
    	Person p1=new Person("Vikash",25);
    	Person p2=new Person("Sachin",22);
    	Person p3=new Person("akbar",68);
    	Person p4=new Person("Ram",23);
    	Person p5=new Person("krishna",85);
    	q.add(p);
    	q.add(p2);
    	qs.add(p3);
    	q.add(p4);
    	qs.add(p1);
    	qs.add(p5);
    	
    	TicketCounter c=new TicketCounter();
    	c.provideTicket(q, qs);

	}

}