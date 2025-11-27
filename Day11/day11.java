public class Day11{
    public  string getHighestNumber(String numbers){
        String highestNumbers = "";
        String[] numArray = numbers.split
        for(String num : numArray){
            if(Integer.parseInt(num) > highestNumber.length() || 
               (num.length() == highestNumber.length() && num.compareTo(highestNumber) > 0)){
                highestNumber = num;
            }
        }
    }

}