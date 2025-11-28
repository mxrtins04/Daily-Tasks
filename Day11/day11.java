public class Day11{
    public static void main(String[] args){
        System.out.print(getHighestAndLowestNumber("-3 4 -9 64 3 42 9 1"));
    }
    public static String getHighestAndLowestNumber(String numbers){
        String highestNumber = "";
        String lowestNumber = "";
        String[] numArray = numbers.split(" ");
        int highestInt = Integer.parseInt(numArray[0]);
        int lowestInt = Integer.parseInt(numArray[0]);
        for(int index = 0; index < numArray.length; index++){
            if(Integer.parseInt(numArray[index]) > highestInt){
                highestInt = Integer.parseInt(numArray[index]);
               highestNumber = numArray[index];
            }
            
            if(Integer.parseInt(numArray[index]) < lowestInt){
                lowestInt = Integer.parseInt(numArray[index]);
                lowestNumber = numArray[index];
            }
        }
        return lowestNumber + " " + highestNumber;
        }
    }

