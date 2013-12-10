package education;

import java.io.*;
import java.net.URL;

public class ReadContent {
	
	public static void readFile(){
			
		try{
			
			URL url = new URL("http://rozetka.com.ua/");
			
			BufferedReader in = new BufferedReader(
									new InputStreamReader(url.openStream()));
			
			PrintWriter out = new PrintWriter(
								  new BufferedWriter(
									  new FileWriter("D:\\education\\text.txt")));
			
			String s;
			while((s=in.readLine()) != null){
				out.println(s);
			}
			in.close();
			out.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}

