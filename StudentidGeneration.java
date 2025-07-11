//importing the library that allows 'Random()' function to be used
import java.util.Random;

public class StudentidGeneration {
    public static void main(String[] args){
        Random random = new Random();
        String[] Studentids = new String[5];

        for(int i = 0; i < Studentids.length; i++){

            char prefix = (char)(random.nextInt(5) + 'A');
            int number = random.nextInt(999) + 1;

            String suffix = String.format("%03d", number);

            Studentids[i] = prefix + suffix;
        }
        for (String Studentid: Studentids){
            System.out.println(Studentid);
        }
    }
}
