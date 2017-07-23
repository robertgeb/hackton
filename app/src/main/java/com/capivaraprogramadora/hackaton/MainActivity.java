package com.capivaraprogramadora.hackaton;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (null == savedInstanceState) {
            Camera2BasicFragment camera = new Camera2BasicFragment();
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, camera)
                    .commit();

        }
    }

}
