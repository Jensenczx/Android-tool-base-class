package com.example.chenjensen.android_tool_base_class.baseclass;

import android.app.Application;
import android.content.Context;


/**
 * Created by chenjensen on 15/8/23.
 */

public class BaseApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
