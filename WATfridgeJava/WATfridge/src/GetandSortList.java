import java.util.*;
import java.io.*;

class SortByFoodGroup implements Comparator<Food> {
	public int compare(Food food1, Food food2) {
		String group1 = food1.foodGroup;
		String group2 = food2.foodGroup;
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

public class GetandSortList {
	public static void printList(ArrayList<Food> foodList) {
		for (int i = 0; i < foodList.size(); i++) {
			System.out.println(foodList.get(i).foodName);
		}
	}
	
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		boolean quit = false;
		Date date1 = new Date(1999, 9, 9);
		Date date2 = new Date(2020, 6, 6);
		Date date3 = new Date(1999, 9, 19);
		Date date4 = new Date(2017, 12, 2);
		
		//common foods
		ArrayList<Food> commonFoods = new ArrayList<Food>();
		Food f1 = new Food("Apple", 7, date1, "Fruit", true, false);
		commonFoods.add(f1);
		Food f2 = new Food("Banana", 7, date2, "Fruit", true, false);
		commonFoods.add(f2);
		Food f3 = new Food("Orange", 7, date1, "Fruit", true, false);
		commonFoods.add(f3);
		Food f4 = new Food("Pear", 7, date4, "Fruit", true, false);
		commonFoods.add(f4);
		Food f5 = new Food("Eggs", 28, date3, "Protein", true, false);
		commonFoods.add(f5);
		Food f6 = new Food("Cheese", 28, date3, "Dairy", true, false);
		commonFoods.add(f6);
		Food f7 = new Food("Butter", 196, date2, "Dairy", true, false);
		commonFoods.add(f7);
		Food f8 = new Food("Milk", 8, date1, "Dairy", true, false);
		commonFoods.add(f8);
		
		//foods in fridge
		ArrayList<Food> foodList = new ArrayList<Food>();
		//entering custom foods
		while(!quit) {
			Food foo = new Food("", 0, date1, "", false, false);
			System.out.println("Food name:");
			foo.foodName = myScanner.nextLine();
			
			System.out.println("Time in fridge:");
			foo.timeInFridge = myScanner.nextInt();
			myScanner.nextLine();
			
			System.out.println("Food group: (Fruits, Vegetable, Dairy, Protein, Grains, Other):");
			foo.foodGroup = myScanner.nextLine();
			
			System.out.println("Favourite? (y or n)");
			if (myScanner.nextLine().charAt(0) == 'y') {
				foo.favourite = true;
			}
			
			System.out.println("In fridge? (y or n)");
			if (myScanner.nextLine().charAt(0) == 'y') {
				foo.inFridge = true;
			}
			
			foodList.add(foo);
			
			System.out.println("Quit? (y or n)");
			if (myScanner.nextLine().charAt(0) == 'y') {
				quit = true;
			}
		}
		
		//lists and sorted lists
		System.out.println("Entered list");
		System.out.println("Original order:");
		printList(foodList);
		
		Collections.sort(foodList, new SortByTime());
		System.out.println("Sorted by time:");//most time in fridge to least time
		printList(foodList);
		
		Collections.sort(foodList, new SortByName());
		System.out.println("\nSorted by name:");//a to z
		printList(foodList);
		
		Collections.sort(foodList, new SortByExpiry());
		System.out.println("\nSorted by expiry:");//smallest date to biggest
		printList(foodList);
		
		Collections.sort(foodList, new SortByFoodGroup());
		System.out.println("\nSorted by food group:");//alphabetical order of groups
		printList(foodList);
		
		System.out.println("\nCommon foods:");
		System.out.println("Original order:");
		printList(commonFoods);
		
		Collections.sort(commonFoods, new SortByTime());
		System.out.println("\nSorted by time:");//most time in fridge to least time
		printList(commonFoods);
		
		Collections.sort(commonFoods, new SortByName());
		System.out.println("\nSorted by name:");//a to z
		printList(commonFoods);
		
		Collections.sort(commonFoods, new SortByExpiry());
		System.out.println("\nSorted by expiry:");//smallest date to biggest
		printList(commonFoods);
		
		Collections.sort(commonFoods, new SortByFoodGroup());
		System.out.println("\nSorted by food group:");//alphabetical order of groups
		printList(commonFoods);
	}
}