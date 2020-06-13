//Formulas Class 
public class StatFormulas {

	//Calculate Mean Class
	public static double mean(double values[])
	{
		double mean = 0;
		
		//Loop through array and find sum of values 
		for(int i = 0; i < values.length; i++)
		{
			mean = mean + values[i];
		}
		
		//Divide sum by length of array 
		mean = mean / values.length;
		
		return mean;
	}
	
	//Calculate Median Class
	public static double median(double values[])
	{
		double median = 0;
		
		//Index variables 
		int p1 = 0;
		int p2 = 0;
		
		//Values[] has odd length 
		if(values.length % 2 == 1)
		{
			//Find Median index
			p1 = (values.length + 1) / 2;
			
			//Get Median value
			median = values[p1 - 1];
		}
		//Values[] has even length  
		else 
		{
			//Find the two Median Indexes
			p1 = (values.length) / 2; 
			p2 = p1 - 1; 
			
			//Get Median value
			median = (values[p2] + values[p1]) / 2;
		}
		
		return median;
	}
	
	public static double std(double values[])
	{
		double difference = 0;
		double std = 0;
		
        //Find the mean by calling mean function
		double mean = mean(values);
		
		//Find Standard Deviation for population 
		for(int i = 0; i < values.length; i++)
		{
			//Find difference 
			difference = (values[i] - mean);
			
			//Calculate sum 
			std = std + Math.pow(difference, 2);
		}
		
		//Divide by length 
		std = std / values.length;
		
		//Square root the value 
		std = Math.sqrt(std);
		
		return std;
	}
	
}