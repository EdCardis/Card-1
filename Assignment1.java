public class Assignment1{

	/*
	 * Sample Output:
	 * 
	 * Robert contract salary is 35000.0 SEK.
     * His/her saving per month is 4200.0 SEK.
     * Robert salary after tax is 24500.0 SEK.
     * Daily rate for Robert is 1225.0 SEK.

     * Sara contract salary is 28000.0 SEK.
     * His/her saving per month is 2800.0 SEK.
     * Sara salary after tax is 19600.0 SEK.
     * Daily rate for Sara is 980.0 SEK.

     * Alex contract salary is 40000.0 SEK.
     * His/her saving per month is 6000.0 SEK.
     * Alex salary after tax is 28000.0 SEK.
     * Daily rate for Alex is 1400.0 SEK.
	 *
	 * 
	 */
	

	public static void main(String[] args) {
		
		// You DON'T need to change this method 
		
		String name; // name 
		double salary; // contract salary before tax in SEK/ month
		double savingPercentage; // saving percentage/ month
	
		
		name = "Robert";
		salary = 35000.0;
		savingPercentage = 0.12;
		
		displayInfo(name, salary);
		savingPerMonth(name, salary, savingPercentage);
		salaryAfterTax(name, salary);
		System.out.println();
	
		name = "Sara";
		salary = 28000.0;
		savingPercentage = 0.10;
		
		displayInfo(name, salary);
		savingPerMonth(name, salary, savingPercentage);
		salaryAfterTax(name, salary);
		System.out.println();
		
		name = "Alex";
		salary = 40000.0;
		savingPercentage = 0.15;
		
		displayInfo(name, salary);
		savingPerMonth(name, salary, savingPercentage);
		salaryAfterTax(name, salary);
		System.out.println();
		

	}//end main
	


	public static void displayInfo(String name, double salary){
		/*
		 * This method prints out a nice string with the name and the salary that the person gets
		 * 
		 * eg. Robert contract salary is 35000 SEK. 
		 * 
		 */
		
		
		
		
	}//end displayInfo
	
	
	private static void savingPerMonth(String name, double salary, double savingPercentage) {
		/* 
		 * This method calculates saving percentage per month before the tax, and print that out 
		 * 
		 * eg. Robert saving per month is 4200 SEK.
		 * 
		 * hint: use double when you define new variables for calculation 
		 */
		
	
		

		
	}// end savingPerYear
	
	
	private static void salaryAfterTax(String name, double salary) {
		/*
		 * This method calculates the net salary after tax, and print that out 
		 * Let's consider that the tax percentage is fixed for all users, taxPercentage = 30%
		 * Also, it calculates the daily rate per person after tax, (note that the number of working days per month is 20 days)
		 * 
		 * eg. Robert salary after tax is 28000 SEK.
	     *     Daily rate for Robert is 1400 SEK. 
	     *     
	     * hint: use double when you define new variables for calculations 
		 * 
		 */
		
		
	
		
		
	}// end salaryAfterTax
	
}
