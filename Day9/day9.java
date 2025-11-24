import java.util.ArrayList;

public class DayNine {
public static void main(String[] args) {

System.out.print(removeEnemies(new String[] {"Jane", "Kora", "Jason", "Johnbosko"}).toString());

}
public static ArrayList removeEnemies(String[] names) {
	ArrayList<String> friends = new ArrayList<String>();
	for(String name : names){
		if(name.length() == 4) 
			friends.add(name);
	}
	return friends;
}

}