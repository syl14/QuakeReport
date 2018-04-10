package com.example.android.quakereport;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by syl on 2018. 04. 10..
 */

public class Earthquake extends AppCompatActivity {

    private double mMagnitude;
    private long mTimeInMilliseconds;
    private String mLocation;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds,String url){
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds=timeInMilliseconds;
        mUrl=url;
    }


    public double getMagnitude(){return mMagnitude;}
    public String getLocation(){return mLocation;}
    public long getTimeInMilliseconds(){return mTimeInMilliseconds;}
    public String getUrl(){return mUrl;}

}