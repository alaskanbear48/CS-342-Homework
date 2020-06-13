
//This class is used as a Proxy so the Student does have access to setting their registration date
public class ProxyStudentAccount implements Account{

	//Creates a Student object with a reference to the Account interface class 
	Account student = new StudentAccount();
	
	//Calls the Abstract method "getRegistrationDate" of the student object 
	@Override
	public void getRegistrationDate(int numCredits, char semester) {
		
		student.getRegistrationDate(numCredits, semester);
	}

}
