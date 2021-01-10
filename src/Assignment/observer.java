package Assignment;

import java.util.ArrayList;

public class observer 
{
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
	 public void print() 
	 {
		 System.out.println("0) Goaaaal");
		 System.out.println("1) Penalty Miss");
		 System.out.println("2) 3 shots saved by a Goalkeeper");
	 }
}
