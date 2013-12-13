package sortCSVFileByColumns;

import java.io.*;
import java.util.*;

public class FileProcessing {
	
	static File source = null;
	static BufferedReader in = null;
	static PrintWriter out = null;
	
	public static void readAndSort() throws IOException{	
		//1.This collection contains 'Persone' class objects to be sorted.
		List<Persone> persones = new ArrayList<Persone>();
		
		try{
			//2.Get access to general csv file
			in = new BufferedReader(
					 new FileReader("unsortedFile.txt"));
			
			//3.Create file to save sorted csv results.
			out = new PrintWriter(
					  new BufferedWriter(
						  new FileWriter("sortedCSV.txt")));
			
			//4.Create 'Persone' objects by csv file lines and add them to collection 'persones'. 
			String s;
			while((s=in.readLine()) != null){
				String [] personalData = s.split(",");
				Persone persone = new Persone(personalData[0], personalData[1], personalData[2], personalData[3], personalData[4]);
				persones.add(persone);
			}
			
			//5.Sort collection of persones.
			Collections.sort(persones);
			
			//6.Delete a row with column names and place it on the first line.
			Iterator<Persone> itr = persones.iterator();
			while(itr.hasNext()){
				if(itr.next().getName().equals("Name")){
					itr.remove();
				}
			}
			persones.add(0, new Persone("Name", "EmailAddress", "FirstName", "LastName", "Password"));
			
			//7.Display sorting results on the console and write it to file.
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
