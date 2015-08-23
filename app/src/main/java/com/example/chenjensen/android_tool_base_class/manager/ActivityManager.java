package com.example.chenjensen.android_tool_base_class.manager;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjensen on 15/8/23.
 */
public class ActivityManager {

    public static List<Activity>activityList = new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        activityList.add(activity);
    }

    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    public static void finishAllActivity(){
        for(Activity activity : activityList){
            activity.finish();
        }
    }

}
