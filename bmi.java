import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("input weight in kilogram");
        double weight =sc.nextDouble();
        System.out.println("input height in meters");
        double height =sc.nextDouble();
        double bmi =weight /(height* height);
        System.err.println("The Body Mass Index (BMI) is " + bmi +"kg/m2");

    }
}