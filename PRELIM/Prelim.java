 public class Prelim {
 
  public static void main(String[] args) {  

    int firstNumber = 0, secondNumber = 1;
    System.out.println("Fibonacci (0) 14" + " Number:");

    for (int i = 0; i <= 14; ++i) {
      System.out.print(firstNumber + ", ");

      int nextNumber = firstNumber + secondNumber;
      firstNumber = secondNumber;
      secondNumber = nextNumber;
    }
  }
}
