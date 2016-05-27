package kr.edcan.edranet.model;

/**
 * Created by KOHA_CLOUD on 2016. 5. 27..
 */

public class User {
    private String apikey, userName;
    private boolean isLumihanaAndroid, isLumihanaWeb, isGGZ, isArduino, isDebur, isPixel;
    private int userType, phoneNumber, grade;

    public String getApikey() {
        return apikey;
    }

    public String getUserName() {
        return userName;
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

    public int getUserType() {
        return userType;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getGrade() {
        return grade;
    }
}
