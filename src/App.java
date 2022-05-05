
import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalCost = 0;


        System.out.println("Enter number of hamburgers: ");
        double hamburgerTotal = sc.nextInt();
        Food Hamburger = new Food("Hamburger", 1.85, 9, 33, 1);
        System.out.println("Each " + Hamburger.getProductItem() + " has " + Hamburger.getFats() + "g of fat, " + Hamburger.getCarbs() + "g of carbs, and " + Hamburger.getFiber() + "g of fiber");
        totalCost += Hamburger.getPrice() * hamburgerTotal;

        

        System.out.println("Enter number of salad: ");
        double saladTotal = sc.nextInt();
        Food Salad = new Food("Salad", 2.00, 1, 11, 5);
        System.out.println("Each " + Salad.getProductItem() + " has " + Salad.getFats() + "g of fat, " + Salad.getCarbs() + "g of carbs, and " + Salad.getFiber() + "g of fiber");
        totalCost += Salad.getPrice() * saladTotal;

        

        System.out.println("Enter number of French fries: ");
        double frenchFriesTotal = sc.nextInt();
        Food FrenchFries= new Food("French Fries", 1.30, 11, 36, 4);
        System.out.println("Each " + FrenchFries.getProductItem() + " has " + FrenchFries.getFats() + "g of fat, " + FrenchFries.getCarbs() + "g of carbs, and " + FrenchFries.getFiber() + "g of fiber");
        totalCost += FrenchFries.getPrice() * frenchFriesTotal;


        System.out.println("Enter number of Soda: ");
        double sodaTotal = sc.nextInt();
        Food Soda= new Food("Soda", 0.95, 0, 38, 0);
        System.out.println("Each " + Soda.getProductItem() + " has " + Soda.getFats() + "g of fat, " + Soda.getCarbs() + "g of carbs, and " + Soda.getFiber() + "g of fiber");
        totalCost += Soda.getPrice() * sodaTotal;

    


        System.out.printf("Your Order comes to: $%.2f", totalCost );


        
    }





}