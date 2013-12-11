package educCollect;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Collect {
	
	static File csvSource = null;
	static BufferedReader unsortedFile = null;
	
	public static void main(String[] args) throws IOException {
		
		csvSource = new File("source.txt");
		unsortedFile = new BufferedReader(
										  new FileReader(csvSource));
		
		List<String> list = new ArrayList<String>();
				
		String s ="";
		
		while((s=unsortedFile.readLine()) != null){
			list.add(s);
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
