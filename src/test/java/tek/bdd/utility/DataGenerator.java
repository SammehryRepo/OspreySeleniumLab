package tek.bdd.utility;

import java.util.Random;

public class DataGenerator {

    public static String randomEmail( String email){
        Random random = new Random();
        //samplexxx@gmail.com - > feature file email
        int num = random.nextInt(1000); //0 - 999
        //Find index of @ sign
        int indexOfSign = email.indexOf("@");
        //Find string starting form index 0 to index of @ sign
        String firstHalf = email.substring(0,indexOfSign);
        //Find the string of second starting after firstHalf
        String secondHalf = email.substring(indexOfSign);
        // firstHalf (sample@) + random number + second half (gmail.com)
        return firstHalf + num + secondHalf;
    }
}
