package com.deltaww.oswlogger;

import android.util.Log;

public class LogDebug {

    private static String TAG = "OSW Logger App";

    public static void d(String message) {
        Log.d(TAG, message);

    }
}
