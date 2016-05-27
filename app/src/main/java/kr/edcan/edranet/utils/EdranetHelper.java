package kr.edcan.edranet.utils;

import android.content.Context;

import retrofit2.Retrofit;

/**
 * Created by KOHA_CLOUD on 2016. 5. 27..
 */

public class EdranetHelper {
    Context context;
    final private static String SERVER_URL = "http://malang.moe";
    final private static String SERVER_PORT = "8000";

    public EdranetHelper(Context c) {
        this.context = c;
    }

    public static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder().baseUrl(SERVER_URL + ":" + SERVER_PORT).build();
    }

}
