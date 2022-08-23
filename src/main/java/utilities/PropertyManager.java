package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String url;
    private static String username;
    private static String password;
    private static String bad_username;
    private static String bad_password;

    public static PropertyManager getInstance(){
        Properties properties = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fi);
        }catch (Exception e){
            e.printStackTrace();
        }
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        bad_username = properties.getProperty("bad_username");
        bad_password = properties.getProperty("bad_password");

        return instance;
    }
    public String getUrl(){
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBad_username() {
        return bad_username;
    }

    public String getBad_password() {
        return bad_password;
    }
}
