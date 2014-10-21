package org.paradrops.alarm.services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import org.androidannotations.annotations.EIntentService;

@EIntentService
public class AlarmService extends IntentService {

    public AlarmService() {
        super("AlarmService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("", "");
    }
}
