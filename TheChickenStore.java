/* 
   Name: Noel Almonte Tapia
   Course: COP-2800-98671 Java Programming
   Asignment: P5: Buying Chickens at the Chicken Store
   Date: 4/6/2025
   
   The purpose of this program is to display a chicken store menu with a series of questions that guide buyers in choosing their chicken
   
*/


   import java.util.Scanner;  // Here I started by importing the scanner.

public class TheChickenStore { // Here I define my class.

    public static void main(String[] args) { // This is the main method.
        Scanner input = new Scanner(System.in);
      
        
          // In this section I print an introduction for the program.
        System.out.println("Noel Almonte Tapia");
        System.out.println("Course: COP-2800-98671 Java Programming");
        System.out.println("Assignment: P5: Buying Chickens at the Chicken Store");
        System.out.println("Date: 4/6/2025");
        System.out.println("Time: 11:00 PM\n");
        
        welcomeMessage();
        
        boolean buying = true;
        while (buying) {
            int chickenType = getChickenChoice();
            int healthStatus = getHealthStatus();

            float eggCount = calculateEggs(chickenType, healthStatus);
            String valueMessage = getValueMessage(eggCount);

            System.out.println("Expected number of eggs per year: " + eggCount);
            System.out.println("Value assessment: " + valueMessage);

            System.out.print("Do you want to buy another chicken? (yes/no): ");
            String again = input.next().toLowerCase();
            if (!again.equals("yes")) {
                buying = false;
            }
        }

        System.out.println("Thanks for visiting the Chicken Store!");
        input.close();
    }

    // Method 1: Prints welcome message
    public static void welcomeMessage() {
        System.out.println("Welcome to the Chicken Store!");
    }

    // Method 2: Gets chicken choice
    public static int getChickenChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a chicken type:");
        System.out.println("1: Rhode Island Red");
        System.out.println("2: Americana");
        System.out.println("3: Longhorn");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

    // Method 3: Gets health status
    public static int getHealthStatus() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the chicken's health status?");
        System.out.println("0: Healthy");
        System.out.println("1: Under weight");
        System.out.println("2: Over weight");
        System.out.println("3: Droopy comb");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

    // Method 4: Calculates egg production
    public static float calculateEggs(int chickenType, int healthStatus) {
        int[] chickenCounts = {7, 5, 6}; 
        float[] healthValues = {1.0f, 0.7f, 0.9f, 0.5f};

        int productionCount = chickenCounts[chickenType - 1];
        float healthValue = healthValues[healthStatus];

        return productionCount * healthValue * 52;
    }

    // Method 5: Determines value message
    public static String getValueMessage(float eggCount) {
        if (eggCount > 300) {
            return "great value";
        } else if (eggCount > 200) {
            return "good value";
        } else {
            return "consider fried chicken";
        }
    }
}
