package Assignment;

import java.util.ArrayList;



public class observer 
{
	/*public static ArrayList <Events> k =new ArrayList ();
	static Events u = new Events();
	//public players2[]= {u.Event1("ss"),u.Event2("ss"),u.Event3("ss")};
	observer() 
	{
		
	}*/
	Events u = new Events();
	private EventAction[] moveActions = new EventAction[] {
	        new EventAction() { public void Action(player l) { u.Event1(l); } },
	        new EventAction() { public void Action(player l) { u.Event2(l); } },
	        new EventAction() { public void Action(player l) { u.Event3(l); } },
	        //new EventAction() { public void Action() { u.Event4(); } },
	    };
	 public void Action(int index,player l) {
	        moveActions[index].Action(l);
	    }
	/* public static void main (String[] args) 
	    {
	    	observer k = new observer ();
	    	k.Action(0);
	    }*/
}
