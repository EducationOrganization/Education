package sortCSVFileByColumns;

public class Persone implements Comparable<Persone>{
	private String name, emailAddress, firstName, lastName,password;
	
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

	public void setPassword(String password2) {
		this.password = password2;
	}
	
	public String toString(){
		return name +","+ emailAddress +","+ firstName + "," + lastName + "," + password;
	}

	@Override
	public int compareTo(Persone o) {
		return this.name.compareTo(o.name);
	}
	

}
