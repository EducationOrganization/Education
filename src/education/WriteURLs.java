package education;

import java.io.*;

public class WriteURLs {
	
	public static void write(){
		
		try {
			BufferedReader in = new BufferedReader(
									new FileReader("D:\\education\\text.txt"));
			
			PrintWriter out = new PrintWriter(
								  new BufferedWriter(
										new FileWriter("D:\\education\\urls.txt")));
			
			String c;
			while((c = in.readLine()) != null){
				int ferstIndex = c.indexOf("\"http://");
				int secondIndex;
				
				String substring = null;
				
					if(ferstIndex != -1){
						secondIndex = c.indexOf(">", ferstIndex++);
						
						if(secondIndex != -1){
							substring = c.substring(ferstIndex, (secondIndex-1));
							System.out.println(substring);
							out.println(substring);
						}
					}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
