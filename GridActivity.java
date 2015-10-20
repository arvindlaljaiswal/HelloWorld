package com.enl.hw;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

/**
 * Created by arvindlal on 8/18/15.
 */
public class GridActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_grid);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

    }
}
