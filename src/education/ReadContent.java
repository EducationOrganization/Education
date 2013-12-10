package education;

import java.io.*;
import java.net.URL;

public class ReadContent {
	
	static File file = null;
	
	public static void readFile() throws IOException{
		BufferedReader in = null;
		PrintWriter out = null;
		
		try{
			file = new File("D:\\siteCode.txt");			
			URL url = new URL("http://rozetka.com.ua/");
			in = new BufferedReader(
									new InputStreamReader(url.openStream()));
			out = new PrintWriter(
								  new BufferedWriter(
									  new FileWriter(file)));
			String s;
			while((s=in.readLine()) != null){
				out.println(s);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			in.close();
			out.close();
		}
	}
	
}

