/*
 Description: Allows user to enter information about food, validates input, and creates Food object
 Current tasks:
 - Make array of Food objects
 - Add index of numbers of foods already in array (int foodCount)
 
 Integration with Android UI:
 - Get input from text fields instead of hard-coded values
 - Continuously check for input from screen until valid input is given
 - Replace all instances of System.out.print with printing to UI
 - Output food object array as separate boxes on UI
 
 Formatting Guideline:
 Name of food is all caps
 */
/*
import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class addFood {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        
 //Get user input and create food object       
        String foodName = "apple".toUpperCase(); //Currently hard-coded, replace with user input
        int timeInFridge = 20; 	//Connect to UI
        int year = 2017, month = 1, day = 1;	//initialize later with UI input          
        boolean isValidYear = false, isValidMonth = false, isValidDay = false;	//Make sure user input is valid        
        Date date = new Date(year, month, day);	//Replace these variables with UI input    	  	
    	FoodGroup group = new FoodGroup("Vegetable");    	
        boolean favourite = false;	//Get user input   	
        boolean inFridge = false; 	//Get user input
        Food foodList[] = new Food[200];	//Array with all foods in fridge
        int foodCount = 0;	//Counts the number of Food objects in foodList
        
        if (month <= 0 || month > 12){
        	System.out.print("Please enter a valid month");
        }
        //Problem: have to continuously get input until a valid day is entered
        int daysinMonth[] = {31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (day < 1 || day > daysinMonth[month-1]){	//If the day 
        	System.out.print("Please enter a valid day");
        }  

//Create new food object
        if (foodCount < 200){
	        foodList[foodCount] = new Food(foodName, timeInFridge, date, group, favourite, inFridge);
	        foodCount++;
	        System.out.printf("Food: %s\nTime in Fridge: %d days\nExpiry Date: %d %d %d\nFood Group: %s\nFavourited: %s\nIn Fridge: %s\n"
	        	, foodList[foodCount].foodName, foodList[foodCount].timeInFridge, foodList[foodCount].expiryDate.year, foodList[foodCount].expiryDate.month, foodList[foodCount].expiryDate.day, foodList[foodCount].group.name, foodList[foodCount].favourite, foodList[foodCount].inFridge);
	//        System.out.printf("%d %d %d\n", apple.expiryDate.year, apple.expiryDate.month, apple.expiryDate.day);
        }
    }
}*/
