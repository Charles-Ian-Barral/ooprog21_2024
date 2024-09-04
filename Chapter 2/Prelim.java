 public class Prelim {
 
  public static void main(String[] args) {  

    int n = 13, firstNumber = 0, secondNumber = 1;
    System.out.println("Fibonacci (0) " + n + " Number:");

    for (int i = 0; i <= n; ++i) {
      System.out.print(firstNumber + ", ");

      int nextNumber = firstNumber + secondNumber;
      firstNumber = secondNumber;
      secondNumber = nextNumber;
    }
  }
}
