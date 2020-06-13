import java.util.Scanner;

public class ChooseYourOwnHomework {

	public static void main(String[] args) {
		
		Account proxyStudent = new ProxyStudentAccount();
		
		//Scan student input 
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the semester you want to register for. (F) for Fall, (S) for Spring, and (R) for Summer: ");
		//The semester of choice of the student
		char studentSemester = sc.next().charAt(0);
		
		System.out.println("Enter the number of credits you currently have: ");
		//The Credits that the student currently has 
		int studentCredits = sc.nextInt();
		
		proxyStudent.getRegistrationDate(studentCredits, studentSemester);
		
		sc.close();
	}

}
