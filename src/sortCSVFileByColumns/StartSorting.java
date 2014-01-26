package sortCSVFileByColumns;

import java.io.IOException;

public class StartSorting {
	public static void main(String[] args) {
		//Default sorting will procesed by column 'Name'.
		//To change sorting type remove comment sign '//'.
		//The following methods specify the column that will be made sorting:
			//Persone.sortByFirstName();
			Persone.sortByLastName();
			//Persone.sortByEmailAddress();
			//Persone.sortByPassword();
		try {
			FileProcessing.readAndSort();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
