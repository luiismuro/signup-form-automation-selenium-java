package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CredentialLoader {

    private static Properties props = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("credentials.properties");
            props.load(file);
        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo credentials.properties");
        }
    }

    public static String getPassword() {
        return props.getProperty("password");
    }
}
