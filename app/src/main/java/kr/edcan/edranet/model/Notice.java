package kr.edcan.edranet.model;

import java.util.ArrayList;

/**
 * Created by KOHA_CLOUD on 2016. 5. 27..
 */

public class Notice  {
    private String articleKey, title, wroteDate, content;
    private boolean isLumihanaAndroid, isLumihanaWeb, isGGZ, isArduino, isDebur, isPixel;
    private ArrayList<String> grade;

    public String getArticleKey() {
        return articleKey;
    }

    public String getTitle() {
        return title;
    }

    public String getWroteDate() {
        return wroteDate;
    }

    public String getContent() {
        return content;
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

    public ArrayList<String> getGrade() {
        return grade;
    }
}
