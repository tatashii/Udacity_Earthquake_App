package com.example.alnajda;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(String magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;

    }


        public String getmMagnitude () {
            return mMagnitude;
        }

        public String getmLocation () {
            return mLocation;
        }

        public long getmTimeInMilliseconds () {
            return mTimeInMilliseconds;
        }

        public String getUrl() {
            return mUrl;
    }


    }
