package com.prey.actions.autoconnect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


import com.prey.PreyLogger;

public class AutoConnectAlarmReceiver  extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            String minuteSt = "2";//PreyConfig.getPreyConfig(context).getIntervalAware();
            PreyLogger.d("AutoConnectAlarmReceiver______________________________\n");
            PreyLogger.d("AutoConnectAlarmReceiver______________________________\n");
            PreyLogger.d("AutoConnectAlarmReceiver----------AutoConnectAlarmReceiver onReceive[" + minuteSt + "]\n");
            final Context ctx = context;
            new Thread() {
                public void run() {
                    new AutoConnectService().run(ctx);
                }
            }.start();
        } catch (Exception e) {
            PreyLogger.e("AutoConnectAlarmReceiver error:" + e.getMessage(), e);
        }
    }

}

