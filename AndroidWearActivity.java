package com.enl.hw;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by arvindlal on 8/14/15.
 */
public class AndroidWearActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_wear);

        Button wearButton = (Button)findViewById(R.id.wearButton);
        wearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int notificationId = 001;

                Log.e("AndroidWearActivity" ,notificationId+"");
                NotificationCompat.Builder notificationBuilder =
                        new NotificationCompat.Builder(AndroidWearActivity.this)
                                .setSmallIcon(R.drawable.ic_launcher)
                                .setContentTitle("Title")
                                .setContentText("My second Android Wear Application");

                NotificationManagerCompat notificationManager =
                        NotificationManagerCompat.from(AndroidWearActivity  .this);

                notificationManager.notify(notificationId, notificationBuilder.build());
            }
        });

    }
}
