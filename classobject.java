public class classobject {
    //Write a program to print trainer profile - name,email,technology,mobile using class and objects

    public static void main(String[] args) {
        //create class instance of trainerprofile
        TrainerProfile trainerProfile = new TrainerProfile();
        trainerProfile.trainerName = "Tushar Singh";
        trainerProfile.trainerEmail = "tushar9369337718@gmail.com";
        trainerProfile.trainerTechnology = "JAVA";
        System.out.println("My Name is "+trainerProfile.trainerName  +
               " my email "+ trainerProfile.trainerEmail +" and my profile "+ trainerProfile.trainerTechnology );
    }
}

class TrainerProfile{
    String trainerName;
    String trainerEmail;
    String trainerTechnology;

}

 