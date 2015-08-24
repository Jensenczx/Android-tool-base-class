package com.example.chenjensen.android_tool_base_class.baseclass;

import android.app.Activity;
import android.os.Bundle;
import com.example.chenjensen.android_tool_base_class.manager.ActivityManager;
import com.example.chenjensen.android_tool_base_class.util.LogUtil;

/**
 * Created by chenjensen on 15/8/23.
 */
public class BaseActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtil.v("ActivityName",this.getClass().getSimpleName());
        ActivityManager.addActivity(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManager.removeActivity(this);
    }
}
