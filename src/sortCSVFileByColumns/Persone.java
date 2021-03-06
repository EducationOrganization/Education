package sortCSVFileByColumns;

public class Persone implements Comparable<Persone>{   //Person without E at the end of word =)))

    private String name, emailAddress, firstName, lastName,password; //bad code style, should be splitted to 4 lines, 1 line per variable
	
	static int label;      //access modifier?
	
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
		label = 1;
	}
	
	public static void sortByFirstName(){
		label = 2;
	}
	
	public static void sortByLastName(){
		label = 3;
	}
	
	public static void sortByPassword(){
		label = 4;
	}
	
	public String toString(){
		return name +","+ emailAddress +","+ firstName + "," + lastName + "," + password;
	}

	@Override
	public int compareTo(Persone o) {
        //если есть сложная логика сравнения, ее лучше вынести в компаратор
        //тогда label будет хранится в нем, если хранить способ сортивки в статической переменной - можно получить охуенные бока при многопоточном исполнении
		if(label == 1){
			return this.emailAddress.compareTo(o.emailAddress);
		}else if(label == 2){
			return this.firstName.compareTo(o.firstName);
		}else if(label == 3){
			return this.lastName.compareTo(o.lastName);
		}else if(label == 4){
			return this.password.compareTo(o.password);
		}else{
			return this.name.compareTo(o.name);
		}
        // you should use switch operator instead of if's ladder =)))
	}
}
