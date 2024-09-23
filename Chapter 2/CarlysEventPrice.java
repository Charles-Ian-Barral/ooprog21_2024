import java.util.Scanner;

public class CarlysEventPrice {

 public static void main(String[] args) {
 
 String companyMotto = "* Carly's makes the food that makes it a party *";
 
  int numGuest;
  int priceGuest = 35;
 
  
    Scanner scan = new Scanner(System.in);
    System.out.print("Number of Guest: ");
    numGuest = scan.nextInt();
   
      System.out.println("************************************************");
      System.out.println(companyMotto);
      System.out.println("************************************************");
 

   
   int totalPrice = priceGuest * numGuest;
   
      System.out.println("The number of guests: " + numGuest);
      System.out.println("Price per guest: " + priceGuest);
      System.out.println("Total price: " + "$" + totalPrice);

   boolean largeEvent = numGuest >= 50;
      System.out.println("Is this a large event? TRUE(YES),FALSE(NO)" + "\n" + "Result: " + largeEvent);
      scan.close();
  
  } 
 }