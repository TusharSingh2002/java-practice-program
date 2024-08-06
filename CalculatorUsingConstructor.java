import java.util.Scanner;

public class CalculatorUsingConstructor {


     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter first integer: ");
         int a = sc.nextInt();
         System.out.print("Enter second integer: ");
         int b = sc.nextInt();
         System.out.println("choose the operation \n 1 for addition \n 2 for substraction \n 3 for multiplication \n 4 for devision    : ");
         int c= sc.nextInt();
         Calci myclass = new Calci(a,b,c);

         }


     }

class Calci{
    int a,b,c;
    public Calci(int a, int b ,int choice) {

        this.a= a;
        this.b = b;
        this.c= choice;
        switch (choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;

            default:
                System.out.println("Not a valid choice");
        }




    }
}

