public class Calculator {
  public Calculator() {

}

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    if (b == 0) {
      System.out.println("Error! Dividing by zero is not allowed.");
    return 0;
    }
  else { 
    return a / b;
  }
  }
    
    public int modulo(int a, int b) {
      if (b == 0) {
        System.out.println("Error! Dividing by zero is not allowed.");
      } 
      else {
        return a % b;
      }
    }
      public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
        System.out.println(myCalculator.multiply(8,17));
        System.out.println(myCalculator.divide(56,7));
        System.out.println(myCalculator.modulo(15,7));
      }
}