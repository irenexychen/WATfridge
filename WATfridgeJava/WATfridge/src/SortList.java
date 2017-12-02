import java.util.*;

class SortByFoodGroup implements Comparator<Food> {
	public int compare(Food food1, Food food2) {
		String group1 = food1.group.name;
		String group2 = food2.group.name;
		return group1.compareTo(group2);
	}
}

class SortByExpiry implements Comparator<Food> {
	public int compare(Food food1, Food food2) {
		int date1 = food1.expiryDate.day + food1.expiryDate.month * 100 + food1.expiryDate.year * 10000;
		int date2 = food2.expiryDate.day + food2.expiryDate.month * 100 + food2.expiryDate.year * 10000;
		return date1 - date2;
	}
}

class SortByTime implements Comparator<Food> {
	public int compare(Food food1, Food food2) {
		return food2.timeInFridge - food1.timeInFridge;
	}
}

class SortByName implements Comparator<Food> {
	public int compare(Food food1, Food food2) {
		String name1 = food1.foodName.toUpperCase();
		String name2 = food2.foodName.toUpperCase();
		return name1.compareTo(name2);
	}
}

public class SortList {
	public static void printList(ArrayList<Food> foodList) {
		for (int i = 0; i < foodList.size(); i++) {
			System.out.println(foodList.get(i).foodName);
		}
	}
	
	public static void main(String args[]) {
		ArrayList<Food> foodList = new ArrayList<Food>();
		
		//the following is sample input
		FoodGroup fruit = new FoodGroup("Fruit");
		FoodGroup vegetable = new FoodGroup("Vegetable");
		FoodGroup meat = new FoodGroup("Meat");
		FoodGroup grains = new FoodGroup("Grains");
		FoodGroup dairy = new FoodGroup("Dairy");

		Date expApple = new Date(1999, 9, 9);
		Date expBanana = new Date(2020, 6, 6);
		Date expCantaloupe = new Date(1999, 9, 19);
		Date expDragonfruit = new Date(2017, 12, 2);
		
		Food apple = new Food("Apple", 25, expApple, fruit, false, false);
		Food banana = new Food("Banana", 9, expBanana, vegetable, false, false);
		Food cantaloupe = new Food("Cantaloupe", 16, expCantaloupe, meat, false, false);
		Food dragonfruit = new Food("Dragonfruit", 1, expDragonfruit, dairy, false, false);
		
		foodList.add(cantaloupe);
		foodList.add(banana);
		foodList.add(apple);
		foodList.add(dragonfruit);
		
		//lists and sorted lists
		System.out.println("Original order:");
		printList(foodList);
		
		Collections.sort(foodList, new SortByTime());
		System.out.println("Sorted by time:");//most time in fridge to least time
		printList(foodList);
		
		Collections.sort(foodList, new SortByName());
		System.out.println("Sorted by name:");//a to z
		printList(foodList);
		
		Collections.sort(foodList, new SortByExpiry());
		System.out.println("Sorted by expiry:");//smallest date to biggest
		printList(foodList);
		
		Collections.sort(foodList, new SortByFoodGroup());
		System.out.println("Sorted by food group:");//alphabetical order of groups
		printList(foodList);
	}
}