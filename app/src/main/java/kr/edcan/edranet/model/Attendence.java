package kr.edcan.edranet.model;

import java.util.ArrayList;

/**
 * Created by KOHA_CLOUD on 2016. 5. 27..
 */

public class Attendence {
    private String date;
    private boolean isLumihanaAndroid, isLumihanaWeb, isGGZ, isArduino, isDebur, isPixel;
    private ArrayList<String> notFound, notFoundWithIllegal;

    public String getDate() {
        return date;
    }

    public boolean isLumihanaAndroid() {
        return isLumihanaAndroid;
    }

    public boolean isLumihanaWeb() {
        return isLumihanaWeb;
    }

    public boolean isGGZ() {
        return isGGZ;
    }

    public boolean isArduino() {
        return isArduino;
    }

    public boolean isDebur() {
        return isDebur;
    }

    public boolean isPixel() {
        return isPixel;
    }

    public ArrayList<String> getNotFound() {
        return notFound;
    }

    public ArrayList<String> getNotFoundWithIllegal() {
        return notFoundWithIllegal;
    }
}
