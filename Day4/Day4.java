public class Day4(){
	public String determineQuarter(int month){
		if( month >= 1 && <= 3 )
			return "First quarter";
		if( month >= 3 && <= 6 )
			return "Second quarter";
		if( month >= 6 && <= 9 )
			return "First quarter";
		if( month >= 9 && <= 12 )
			return "First quarter";
		else
			return "Oga put in a month of the year";

		
	}
	
}