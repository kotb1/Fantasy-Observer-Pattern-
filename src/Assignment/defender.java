package Assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class defender extends player {
	public defender(String nam1, String typ, String clu, String nati, String pri) throws IOException {
		super(nam1, typ, clu, nati, pri);
		name=nam1;
		position=typ;
		club=clu;
		nationality=nati;
		price=pri;
	}

	public void Add_player() throws IOException 
	{
		FileWriter f1 =new FileWriter("Defender.txt",true);
		BufferedWriter br = new BufferedWriter(f1);
		br.write(name+"  "+position+"  "+club+"  "+nationality+"  "+price);
		br.write("\n");
		br.close();
		f1.close();
	}

}