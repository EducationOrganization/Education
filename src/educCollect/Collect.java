/*package educCollect;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Collect {

	public static void main(String[] args) throws IOException {
		
		List<String> list = new ArrayList<String>();
		
		BufferedReader unsortedFile = new BufferedReader(
										new FileReader("D:\\education\\fileToSort.txt"));
		
		String s ="";
		
		while((s=unsortedFile.readLine()) != null){
			list.add(s);
		}
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}
*/