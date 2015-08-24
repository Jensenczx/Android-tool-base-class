package com.example.chenjensen.android_tool_base_class;

import android.os.Bundle;
import com.example.chenjensen.android_tool_base_class.baseclass.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
