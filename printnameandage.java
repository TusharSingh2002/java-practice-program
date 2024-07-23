import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    
    Scanner input = new Scanner(System.in);

    System.out.print("my name is Tushar Singh and my age is 23 : ");
  
    String name = input.nextLine();
   
    System.out.println("My name is " + name);
 
    input.close();
  }
}
