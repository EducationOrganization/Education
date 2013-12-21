package getLinksFromSite;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {		
		try{
			//dfgdgfdg
			ReadContent.readFile();
			WriteURLs.write();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
