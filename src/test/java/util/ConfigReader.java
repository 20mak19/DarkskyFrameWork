package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private  String url;
    private String  chromeDrivePath;

    public ConfigReader(){
        Properties prop= new Properties();
        InputStream input= null;

        try {

            input = new FileInputStream("config.properties");
            prop.load(input);

            //get the property value and print it out
            this.url = prop.getProperty("url");
            this.chromeDrivePath = prop.getProperty("chrome_driver_path");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (input != null){
                try {
                    input.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

        }
    }
    public  String getUrl(){
        return  url;
    }
    public  String getChromeDriverPath(){
        return  chromeDrivePath;
    }
}