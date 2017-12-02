
public class Food {
	String foodName;
	int timeInFridge;//in days
	Date expiryDate;//
	FoodGroup group;
	boolean favourite;
	boolean inFridge;
	
	Food(String name, int time, Date exDate, FoodGroup g, boolean fav, boolean in) {
		foodName = name;
		timeInFridge = time;
		expiryDate = exDate;
		group = g;
		favourite = fav;
		inFridge = in;
	}
	
}
