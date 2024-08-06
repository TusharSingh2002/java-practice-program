public class ExceptionHandling {
    //to control the errors in program
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        } catch ( ArithmeticException e ) {
            System.out.println("Devided by zero");
            System.out.println(e);


        }

             String name = null;
        String nickname = "";
        try {
            System.out.println(name.length());
            System.out.println(name.length());
        } catch (Exception e){
            System.out.println(e);
        }

        String  fullName = "Tushar Singh";
        try {
            int z = Integer.parseInt(fullName);
            System.out.println(z);
        }
         catch (Exception e){
            System.out.println(e);
         }

     // out of bound exception
        int array [] = {1,2,3,4};
        try {

            System.out.println(array[4]);
        }
        catch (Exception e){
            System.out.println(e);
        }

finally {
            System.out.println("this is finally code ");
        }
    }

}
