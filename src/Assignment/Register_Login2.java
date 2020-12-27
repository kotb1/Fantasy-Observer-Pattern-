package Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class Register_Login2
{
	ArrayList <user> users;
	int k;
	boolean l;
	public Register_Login2(ArrayList <user> u) throws IOException
	{
		 users=u;
	}
	public void login(String user_name,String password) throws IOException 
	{
		
		for(int i=0;i<users.size();i++) 
		{
			if(user_name.equals(users.get(i).username))
			{
				k=i;
				l = true;
				break;
			}
			else
				l=false;
		}
		if(password.equals(users.get(k).password)&& l==true) 
		{
			System.out.println("Login Successfully");
		}
		else
			System.out.println("Password and Username doesnot match");
	}
	public void Register(String user_name, String user_password) throws IOException
	{
		users.add(new  user(user_name,user_password));
		String path1 = "usernames.txt";
		String path2 = "pass.txt";
		OutputStream os1 = new FileOutputStream(new File(path1), true);
		OutputStream os2 = new FileOutputStream(new File(path2), true);
		os1.write("\n".getBytes(), 0, "\n".length());
		os1.write(user_name.getBytes(), 0,user_name.length());
		os2.write("\n".getBytes(), 0, "\n".length());
		os2.write(user_password.getBytes(), 0,user_password.length());
		os1.close();
		os2.close();
	}
}