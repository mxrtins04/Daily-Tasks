import java.util.ArrayList;
public class Day12{
    public static void main(String[] args){
            System.out.print(sortNumber("39484"));
    }


    public static String sortNumber(String number){
        char[] digits = number.toCharArray();
        char highestChar = digits[0];
        int highestIndex = 0;
        ArrayList<Integer> sortedDigits = new ArrayList<>();
        String result = "";
        
        for( int index = 0; index < digits.length; index++){
            int highest = 0;
            for( int index2 = 0; index2 < digits.length; index2++){
                int compare = Character.getNumericValue(digits[index2]);
                if( compare >= highest){
                    highest = compare;
                    highestChar = digits[index2];
                    highestIndex = index2;
                }
            }
            
           
           result += highestChar;
           digits[highestIndex] = '0';
        }
        return result;
    }

}


