package com.androidAppModule0;
import android.app.Activity;
import android.os.Bundle;
import com.androidAppModule0.R;


public class Activity6 extends Activity {
    public Activity6() {
    }

    /**
     * Called with the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout for this activity.  You can find it
        // in res/layout/hello_activity.xml
        setContentView(R.layout.activity_main6);
    }
}
