package utils;

import java.util.Random;

public class EmailGenerator {
    public static String generateUniqueEmail() {
        Random rand = new Random();
        int numero = rand.nextInt(100000);
        return "teste" + numero + "@email.com";
    }
}
