
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lasagna lasagna = new Lasagna(); 
		
		System.out.println("Result of expected minutes in oven: " + lasagna.expectedMinutesInOver());
		System.out.println("Result of remaining minutes in oven: " + lasagna.remainingMinutesInOver(30)); 
		System.out.println("Result of preparation time in minutes: " + lasagna.preparationTimeInMinutes(2));
		System.out.println("Result of total time in minutes: " + lasagna.totalTimeInMinutes(3, 20));
	}

}
