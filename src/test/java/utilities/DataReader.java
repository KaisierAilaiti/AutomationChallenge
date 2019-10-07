package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReader {
    private static Properties properties;
    static {
        try {
            String filePath = "data.properties";
            FileInputStream file = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(file);
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String getData(String k){
        return properties.getProperty(k);
    }
}
