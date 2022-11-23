
public class Lasagna {
	public int expectedMinutesInOver() {
		return 40; 
	}
	
	public int remainingMinutesInOver( int minutesInOven ) {
		return this.expectedMinutesInOver() - minutesInOven; 
	}
	
	public int preparationTimeInMinutes( int numberOfLayers ) {
		//assuming each layers takes 2 minutes to prepare
		return numberOfLayers * 2; 
	}
	
	public int totalTimeInMinutes( int numberOfLayers, int minutesInOven ) {
		//sum of preparation time in minutes and time in minutes the lasagna has spent in the over at the moment 
		return this.preparationTimeInMinutes(numberOfLayers) + minutesInOven; 
	}
}
