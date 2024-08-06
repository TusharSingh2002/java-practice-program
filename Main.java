public class Main {
    public static void main(String[] args) {

        // call the constructor object
        Myclass  myclass =   new Myclass(5,8);
        System.out.println("c = + myClass.c");
        System.out.println("d = + myClass.d");
        System.out.println();
        CallConstructor abc = new CallConstructor("Tushar ","Singh");    }
}
class Myclass {

    //parameter constructor
    public Myclass(int a, int b){

        c = a;
        this.d = b;

        System.out.println(a+b);
    }

    int c ,d ;
}


class CallConstructor {
    String a, b;

    public CallConstructor(String c, String d){
        this.a = c;
        this.b = d;
        System.out.println(c + d);

    }
}