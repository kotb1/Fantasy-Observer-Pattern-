package Assignment;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.ArrayList;

public class main 
{
	//public static int i=0;
	//public static int j=0;
	private static BufferedReader br1;
	private static BufferedReader br2;
	private static BufferedReader br3;
	private static BufferedReader br4;
	private static BufferedReader br5;
	private static BufferedReader br6;
	private static BufferedReader br7;
	private static BufferedReader br8;
	public static int i=0;
	public static int j=0;
	public static ArrayList  <user> users =new ArrayList ();
	public static ArrayList  <Squad> squads =new ArrayList ();
	public static ArrayList  <player> Players =new ArrayList ();
	public static Register_Login2 p;
	public static void main (String[] args) throws IOException {
		
		//users=new user[5];
		br1 = new BufferedReader(new FileReader("usernames.txt"));
		 String[] line1=new String[8];
		 while ((line1[i] = br1.readLine()) != null) 
		 {
			 i++;
		 }
		 br2 = new BufferedReader(new FileReader("pass.txt"));
		 String[] line2=new String[8];
		 while ((line2[j] = br2.readLine()) != null) 
		 {
			 users.add(new user(line1[j],line2[j]));
			 j++;
		 }
		br3 = new BufferedReader(new FileReader("Striker.txt"));
		br4 = new BufferedReader(new FileReader("Goal_Keeper.txt"));
		br5 = new BufferedReader(new FileReader("Mid_Fielder.txt"));
		br6 = new BufferedReader(new FileReader("Defender.txt"));
		br7 = new BufferedReader(new FileReader("Squad1.txt"));
		br8 = new BufferedReader(new FileReader("Squad1.txt"));
		 String[] line3=new String[50];
		 while ((line3[i] = br3.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line3[i].split("  ");
			 Players.add(new striker(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		 String[] line4=new String[50];
		 while ((line4[i] = br4.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line4[i].split("  ");
			 Players.add(new goalkeeper(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		 String[] line5=new String[50];
		 while ((line5[i] = br5.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line5[i].split("  ");
			 Players.add(new midfielder(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		 String[] line6=new String[50];
		 while ((line6[i] = br6.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line6[i].split("  ");
			 Players.add(new defender(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		p=new Register_Login2(users);
		Scanner in = new Scanner(System.in);
		boolean x = true;
		String u="";
		String pa="";
		while(x==true) 
		{
			System.out.println("Login/Register");
			String y = in.nextLine();
			if(y.equals("Login"))
			{
				System.out.println("Please enter username");
				u=in.nextLine();
				System.out.println("Please enter Password");
				pa=in.nextLine();
				boolean t=true;
				//p.login(u, pa);
				while(t==true&& p.login(u, pa))
				{
					player p1;
					System.out.println("Do u want to add a NEW Player OR Add a Squad OR Retrive a Player Info by name");
					String choice2= in.nextLine();
					if(choice2.equals("Player")) 
					{ 
						System.out.print("Please Enter the Name: ");
						String p2=in.nextLine();
						System.out.print("Please Enter the Position: ");
						String p3=in.nextLine();
						System.out.print("Please Enter the Club: ");
						String club1=in.nextLine();
						System.out.print("Please Enter the Nationality: ");
						String nationality1=in.nextLine();
						System.out.print("Please Enter the Price: ");
						String price1=in.nextLine();
						boolean u9=false;
						for(int i =0;i<Players.size();i++) 
						{
							if(Players.get(i).name.equals(p2)) 
							{
								u9=true;
							}
						}
						if(u9==false) 
						{
							if(p3.equals("Defender")) 
							{
								p1=new defender(p2,p3,club1,nationality1,price1);
								p1.Add_player();
							}
							else if(p3.equals("Striker")) 
							{
								p1=new striker(p2,p3,club1,nationality1,price1);
								p1.Add_player();
							}
							else if(p3.equals("MidFielder")) 
							{
								p1=new midfielder(p2,p3,club1,nationality1,price1);
								p1.Add_player();
							}
							else if(p3.equals("GoalKeeper")) 
							{
								p1=new goalkeeper(p2,p3,club1,nationality1,price1);
								p1.Add_player();
							}
						}
						else
							System.out.println("Player is already in the list");
					}
					else if(choice2.equals("Squad")) 
					{
						Squad s = new Squad();
						boolean q=true;
						while(q==true)
						{
							while(s.totalprice<100.0 && s.noofplayers<15)
							{
								System.out.println("Please Enter the name of the Player u want to add");
								String player4=in.nextLine();
								s.add(player4);
							}
							if(s.totalprice<100.0 && s.noofplayers==15) 
							{
								q=false;
								System.out.println("Your Squad has been built");
								
							}
							else 
							{
								System.out.println("Build your squad again u have exceeded the limits");
								q=false;
								s.clear();
							}	
						}
						
					}
					else if(choice2.equals("Log-out")) 
					{
						t=false;
					}
					else if(choice2.equals("Retrive")) 
					{
						System.out.println("Please enter the name of the Player");
						String key = in.nextLine();
						for(int i =0;i<Players.size();i++) 
						{
							if(Players.get(i).name.contains(key)) 
							{
								System.out.println(Players.get(i).name+"  "+Players.get(i).position+"  "+Players.get(i).club+"  "+Players.get(i).nationality+"  "+Players.get(i).price);
							}
						}
					}
					else if(choice2.equals("k")) 
					{
						//observer k = new observer ();
				    	//k.Action(0);
						//Squad o = new Squad();
						//ArrayList  <player> sPlayers =new ArrayList ();
						/*String[] line31=new String[150];
						for(int u1=0;u1<31;u1+=15) 
						{
							Squad o = new Squad();
							int b=0;
							while ((line31[b+u1] = br7.readLine())!=null && b<15) 
							 {
								// line31[b+u1] = br7.readLine();
								 String [] k = new String[6];
								 k=line31[b+u1].split("  ");
								 o.players2[b+u1]=(new player(k[0],k[1],k[2],k[3],k[4],k[5])); 
								 b++;
							 }
							squads.add(o);
						}*/
						Squad o = new Squad();
						o.saved_Squad("Squad1.txt");
						System.out.println(o.players2[0].points);
						squads.add(o);
						Squad o1 = new Squad();
						o1.saved_Squad("squad2.txt");
						System.out.println(o1.players2[0].points);
						squads.add(o1);
						for(int i=0;i<squads.size();i++)
						{
							
							if((squads.get(i).search_squad("salah"))!=null)
							{
								observer k= new observer();
								k.Action(0,squads.get(i).search_squad("salah") );
								System.out.println("zeby");
							}
							
							
						}
						System.out.println(o.players2[8].points);
						/*Events k =new Events();
						for(int g=0;g<squads.size();g++) 
						{
							for(int a=0;a<15;a++) 
							{
								if(squads.get(g).players2[a].name.contains(k.Player_name)) 
								{
									observer l = new observer();
									l.u.value=Integer.parseInt(squads.get(g).players2[a].points);
								//	k.value=
									
									l.Action(0);
									System.out.println(l.u.value);
									squads.get(g).players2[a].points=Integer.toString(l.u.value);
								}
							}
						}
						System.out.println(o.players2[2].points);
						System.out.println(o1.players2[2].points);*/
						

						
						
						
						
						
						
						
						
						
						
					
							
							
							
							
							
							
							
							/*while (b<15) 
						 {
							 line31[b] = br7.readLine();
							 String [] k = new String[4];
							 k=line31[b].split("  ");
							 o.players2[b]=(new player(k[0],k[1],k[2],k[3],k[4],k[5])); 
							 b++;
						 }
						squads.add(o);*/
						
					
					}
				}
			}
			else if(y.equals("Register"))
			{
				System.out.println("Please enter username");
				u=in.nextLine();
				System.out.println("Please enter Password");
				pa=in.nextLine();
				p.Register(u, pa);
				
			}
			else if(y.equals("quit")) 
			{
				x=false;
			}
			
		}
	}
}
//Mane  Son salah  Hoss Bruno  Kotb  Kane  Hima  
//Leno  Becker  u  Stones  Bailly  Magdy  Bendarek  
/*s.add("Manse");//0
s.add("Son");//1
s.add("salah");//2
s.add("Hoss");//3
s.add("Bruno");//4
s.add("Kotb");//5
s.add("Kane");//6
s.add("Leno");//7
s.add("Becker");//8
s.add("Virgil");//9
s.add("Stones");
s.add("Bailly");//10
s.add("Magdy");//11
s.add("Bendarek");//12
s.add("Kotb");//13
//s.add("u");//14
s.add("Mane");*/
/*int b=0; 
int c=15;
while((line31[b] = br8.readLine()) != null)
{
	Squad o = new Squad();
	for(int h=b;h<c;h++) 
	{
		line31[h] = br7.readLine();
		 String [] k = new String[6];
		 k=line31[h].split("  ");
		 o.players2[h]=(new player(k[0],k[1],k[2],k[3],k[4],k[5]));
	}
	
	b+=14;
	c+=15;
	squads.add(o);
	}*/