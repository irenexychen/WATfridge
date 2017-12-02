
public class Food {
	String foodName;
	int timeInFridge;//in days
	Date expiryDate;//
	String foodGroup;
	boolean favourite;
	boolean inFridge;
	
	Food(String name, int time, Date exDate, String grp, boolean fav, boolean in) {
		foodName = name;
		timeInFridge = time;
		expiryDate = exDate;
		foodGroup = grp;
		favourite = fav;
		inFridge = in;
	}
	
}
