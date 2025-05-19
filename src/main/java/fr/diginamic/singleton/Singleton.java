package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Singleton {

    private final ResourceBundle config;
    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {
        config = ResourceBundle.getBundle("configuration");
    }

    public static Singleton getInstance() {
        return SINGLETON;
    }

    public  String getProperty(String key){
        return config.getString(key);
    }
}
