package com.example.instagramcloneparse;
import com.parse.Parse;
import android.app.Application;

public class ParseStarterActivity extends Application{
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3Y5agCF8kRjrFohVZ9dGcfE92sp9nQU5QBTEg2c7")
                .clientKey("l7wTgyTcIWFwbwe90litKA41sC7lYmSReAlCz1Ew")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }


}
