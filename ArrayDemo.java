package Array;

public class ArrayDemo {
    public static void main(String[] args) {
        String [] friendNames = {"Anshu", "Ivan", "Kunal", "Rahul", "Mudit"};

        System.out.println(friendNames.length);
        for (int i = 0; i < friendNames.length; i++) {
            System.out.println(friendNames[i]);
        }
        friendNames[3] = "rini";
        for (int i = 0; i < friendNames.length; i++) {
            System.out.println(friendNames[i]);
        }
        //print the name of friends using for each loop
        for (String i: friendNames)
        {
            System.out.println(i);
        }

        findEvenOddNumber(3);
    }

    private static void findEvenOddNumber(int i) {

    }
}
