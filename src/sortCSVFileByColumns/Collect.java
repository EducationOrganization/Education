package sortCSVFileByColumns;

import java.io.*;
import java.util.*;

public class Collect {
	
	static File source = null;
	static BufferedReader in = null;
	static PrintWriter out = null;
	
	public static void main(String[] args) throws IOException{	
		//Collection that contains Persone objects.
		List<Persone> persones = new ArrayList<Persone>();
		
		try{
			//Read CSV file.
			in = new BufferedReader(
					 new FileReader("source.txt"));
			
			//File to write sorted CSV object.
			out = new PrintWriter(
					  new BufferedWriter(
						  new FileWriter("D:\\sortedCSV.txt")));
			
			//1.Read by lines, 
			//2.Split to array by comas.
			//3.Fill persones object with array elements. 
			String s;
			Persone persone;
			while((s=in.readLine()) != null){
				String [] personalData = s.split(",");
				persone = new Persone(personalData[0], personalData[1], personalData[2], personalData[3], personalData[4]);
				persones.add(persone);
			}
			Persone.sortByFirstName();
			Collections.sort(persones);
			
			for(Persone p : persones){
				System.out.println(p);
				out.println(p);
			}
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			in.close();
			out.close();
		}
		
	}
}
