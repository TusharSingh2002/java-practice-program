public class encapsulation {
    public static void main(String[] args) {
        //call the encapsulation class and bind the data using object in methods
        TrainerProfile trainerProfile = new TrainerProfile();
        trainerProfile.setTrainerEmail("tushar9369337718@gmail.com");
        trainerProfile.setTrainerName("Tushar Singh");
        trainerProfile.setTrainerTechnology("Java");

        System.out.println(trainerProfile.getTrainerName()+ "\n"+
                trainerProfile.getTrainerEmail() +"\n"+ trainerProfile.trainerTechnology );
    }
}

//trainer profile add using encapsulation
class TrainerProfile{
    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerEmail() {
        return trainerEmail;
    }

    public void setTrainerEmail(String trainerEmail) {
        this.trainerEmail = trainerEmail;
    }

    public String getTrainerTechnology() {
        return trainerTechnology;
    }

    public void setTrainerTechnology(String trainerTechnology) {
        this.trainerTechnology = trainerTechnology;
    }

    String trainerName;
    String trainerEmail;
    String trainerTechnology;

}

