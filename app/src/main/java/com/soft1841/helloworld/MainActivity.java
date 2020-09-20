package com.soft1841.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("MainActivity","Verbose");
        Log.d("MainActivity","Debug");
        Log.i("MainActivity","Info");
        Log.w("MainActivity","Warning");
        Log.e("MainActivity","Error");
        Log.wtf("MainActivity","Assert");
    }
}
