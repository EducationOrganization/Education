package sortCSVFileByColumns;

public class Persone implements Comparable<Persone>{
	private String name, emailAddress, firstName, lastName,password;
	
	static String label;
	
	Persone (String name, String emailAddress, String firstName, String lastName, String password){
		this.setName(name);
		this.setEmailAddress(emailAddress);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPassword(password);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//Static methods to select sort colomn.
	//Default sorting is sorting by names.
	public static void sortByEmailAddress(){
		label = "emailAddress";
	}
	
	public static void sortByFirstName(){
		label = "firstName";
	}
	
	public static void sortByLastName(){
		label = "lastName";
	}
	
	public static void sortByPassword(){
		label = "password";
	}
	
	public String toString(){
		return name +","+ emailAddress +","+ firstName + "," + lastName + "," + password;
	}

	@Override
	public int compareTo(Persone o) {
		if(label == "emailAddress"){
			return this.emailAddress.compareTo(o.emailAddress);
		}else if(label == "firstName"){
			return this.firstName.compareTo(o.firstName);
		}else if(label == "lastName"){
			return this.lastName.compareTo(o.lastName);
		}else if(label == "password"){
			return this.password.compareTo(o.password);
		}else{
			return this.name.compareTo(o.name);
		}
	}
}
