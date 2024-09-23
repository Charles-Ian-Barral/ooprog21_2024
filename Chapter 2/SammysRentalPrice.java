import java.util.Scanner;

public class SammysRentalPrice {

 public static void main(String[] args) {
 
    String sammyMotto = "S Sammy's makes it fun in the sun. S";
   int rentedMinutes;
   int rentalPerHour = 40;
   int rentalPerMinute = 1;
 
      
   Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of minutes rented: ");
   rentedMinutes = scan.nextInt();
   
      System.out.println("\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println(sammyMotto);
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n");

   
   int hours = rentedMinutes / 60;
   int addMinutes = rentedMinutes % 60;
  
   int totalPrice = ((hours * rentalPerHour) + addMinutes);
  
  
      System.out.println("Rented Hours: " + hours);
      System.out.println("Additional Minutes: " + addMinutes);
      System.out.println("Total Price: " + "$" + totalPrice);
   scan.close();
  
  }
 }
 
 
 
 
 
 