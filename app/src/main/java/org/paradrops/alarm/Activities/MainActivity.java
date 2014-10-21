package org.paradrops.alarm.Activities;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.paradrops.alarm.R;
import org.paradrops.alarm.services.AlarmService;


@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @AfterViews
    void scheduleService(){
        Context context = getApplicationContext();

        Intent intent = new Intent(context, AlarmService.class);
        PendingIntent pendingIntent =
                PendingIntent.getService(
                context,
                -1,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager alarmManager = (AlarmManager)context.getSystemService(ALARM_SERVICE);
        alarmManager.setInexactRepeating(
                AlarmManager.RTC,
                System.currentTimeMillis(),
                5000,
                pendingIntent);
    }
}
