package com.example.gpstrackingapp;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    private static MyApplication singleton;
    public List<Location> myLocations;

    public List<Location>getMyLocations(){
        return myLocations;
    }
    public void setMyLocations(List<Location>myLocations){
        this.myLocations=myLocations;
    }

    public void onCreate(){
        super.onCreate();
        singleton=this;
        myLocations=new ArrayList<>();
    }

    public MyApplication getInstance(){
        return singleton;
    }
}
