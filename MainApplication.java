public class MainApplication {
    public static void main(String[]args){
        Admin curAdmin = new Admin (1738, "Phoebe", "its@b0utt#m#");
        User curUser = new User(4455, "Phalange");
        curAdmin.performOperation(new Update()); //Admin Updates the data
        curUser.performOperation(new View());  //User can view the data
    }

}
