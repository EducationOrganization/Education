package getLinksFromSite;

import java.io.*;

public class WriteURLs {
	
	static File urls = null;
	
	public static void write() throws IOException{
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			urls = new File("savedUrls.txt");
			in = new BufferedReader(
									new FileReader(ReadContent.file));
			out = new PrintWriter(
								  new BufferedWriter(
										new FileWriter(urls)));		
			String c;
			while((c = in.readLine()) != null){
				int firstIndex = c.indexOf("\"http://");
				int secondIndex;
				
				String substring;
				
					if(firstIndex != -1){
						secondIndex = c.indexOf(">", firstIndex++);
						
						if(secondIndex != -1){
							substring = c.substring(firstIndex, (secondIndex-1));
							System.out.println(substring);
							out.println(substring);
						}
					}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			in.close();
			out.close();
		}		
	}
}
