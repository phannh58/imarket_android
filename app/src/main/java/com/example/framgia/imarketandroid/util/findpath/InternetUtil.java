package com.example.framgia.imarketandroid.util.findpath;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by phongtran on 23/09/2016.
 */
public class InternetUtil {
    public static boolean isInternetConnected(Context context) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        boolean result = false;
        if (connectivityManager != null) {
            NetworkInfo networkInfo =
                    connectivityManager.getActiveNetworkInfo();
            if (networkInfo != null
                    && (networkInfo.getType() == ConnectivityManager.TYPE_MOBILE
                    || networkInfo.getType() == ConnectivityManager.TYPE_WIFI)) {
                result = true;
            }
        }
        return result;
    }
}
