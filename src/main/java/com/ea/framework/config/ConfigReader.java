package com.ea.framework.config;

import com.ea.framework.base.BrowserType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {


    public static  void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }

    private void ReadProperty() throws IOException {
        //Create Property Object
        Properties p = new Properties();
        //Load the Property file available in same package
        InputStream inputStream = new FileInputStream("src/main/java/com/ea/framework/config/GlobalConfig.properties");
        p.load(inputStream);

        //Get LogPath
        Settings.LogPath = p.getProperty("LogPath");
        //Get AUT
        Settings.AUT = p.getProperty("AUT");
        //Browser Type
        Settings.BrowserType = BrowserType.valueOf(p.getProperty("BrowserType"));
        //User Name
        Settings.UserName = p.getProperty("UserName");
        //Password
        Settings.Password = p.getProperty("Password");

    }

}
