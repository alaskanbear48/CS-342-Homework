
public class StudentAccount implements Account{

	//Day and Month of registration 
	public int day;
	public int month;
	
	//Default constructor 
	StudentAccount()
	{
		day = 0;
		month = 0;
	}
	
	//Set Month of registration date 
	public int setMonth(char semester)
	{
		int semMonth = 0;
		
		if(semester == 'F' || semester == 'R')
		{
			semMonth = 4;
		}
		else if(semester == 'S')
		{
			semMonth = 11;
		}
		else
		{
			semMonth = -1;
		}
		
		return semMonth;
	}
	
	//Set Day of registration in November 
	public int setDayNov(int numCredits)
	{
		int semDay = 0;
		
		if(numCredits >= 1 && numCredits <= 9)
		{
			semDay = 20;
		}
		else if(numCredits >= 10 && numCredits <= 18)
		{
			semDay = 19;
		}
		else if(numCredits >= 19 && numCredits <= 29)
		{
			semDay = 18;
		}
		else if(numCredits >= 30 && numCredits <= 39)
		{
			semDay = 15;
		}
		else if(numCredits >= 40 && numCredits <= 49)
		{
			semDay = 14;
		}
		else if(numCredits >= 50 && numCredits <= 59)
		{
			semDay = 13;
		}
		else if(numCredits >= 60 && numCredits <= 74)
		{
			semDay = 12;
		}
		else if(numCredits >= 75 && numCredits < 89)
		{
			semDay = 11;
		}
		else if(numCredits >= 90 && numCredits <= 99)
		{
			semDay = 8;
		}
		else if(numCredits >= 100 && numCredits <= 109)
		{
			semDay = 7;
		}
		else if(numCredits >= 110)
		{
			semDay = 6;
		}
		else
		{
			semDay = -1;
		}
		
		return semDay;
	}
	
	//Set Day of registration in April 
	public int setDayApr(int numCredits)
	{	
		int semDay = 0;
		
		if(numCredits >= 1 && numCredits <= 9)
		{
			semDay = 15;
		}
		else if(numCredits >= 10 && numCredits <= 18)
		{
			semDay = 14;
		}
		else if(numCredits >= 19 && numCredits <= 29)
		{
			semDay = 13;
		}
		else if(numCredits >= 30 && numCredits <= 39)
		{
			semDay = 10;
		}
		else if(numCredits >= 40 && numCredits <= 49)
		{
			semDay = 9;
		}
		else if(numCredits >= 50 && numCredits <= 59)
		{
			semDay = 8;
		}
		else if(numCredits >= 60 && numCredits <= 74)
		{
			semDay = 7;
		}
		else if(numCredits >= 75 && numCredits < 89)
		{
			semDay = 6;
		}
		else if(numCredits >= 90 && numCredits <= 99)
		{
			semDay = 3;
		}
		else if(numCredits >= 100 && numCredits <= 109)
		{
			semDay = 2;
		}
		else if(numCredits >= 110)
		{
			semDay = 1;
		}
		else
		{
			semDay = -1;
		}
		
		return semDay;
	}
	
	@Override
	public void getRegistrationDate(int numCredits, char semester) {
	
		//Get Month of registration 
		month = setMonth(semester);
		
		//Get Day of registration 
		if(month == 11)
		{
			day = setDayNov(numCredits);
		}
		else if(month == 4 && semester != 'R')
		{
			day = setDayApr(numCredits);
		}
		else if(semester == 'R' && numCredits > 0)
		{
			day = 15;
		}
		else if(month == -1)
		{
			System.out.println("You Did not enter a valid Semester. Try Again");
		}
	
		if(day == -1 || numCredits < 1)
		{
			System.out.println("You Did not enter a valid number of credits. Try Again");
		}
		
		if(day > 0 && month > 0)
		{
		//Inform the student their official registration date 
		System.out.println("Your official registration start date for your chosen semester " + semester +" is: " + month + "/" + day);
		}
	}

}
