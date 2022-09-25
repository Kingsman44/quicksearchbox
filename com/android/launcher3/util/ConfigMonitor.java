package com.android.launcher3.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Process;
import android.util.Log;
import com.android.launcher3.Utilities;

/* compiled from: PG */
public final class ConfigMonitor extends BroadcastReceiver {
    public final Context mContext;
    private final int mDensity;
    private final float mFontScale;

    public ConfigMonitor(Context context) {
        this.mContext = context;
        Configuration configuration = context.getResources().getConfiguration();
        this.mFontScale = configuration.fontScale;
        this.mDensity = getDensity(configuration);
    }

    private static int getDensity(Configuration configuration) {
        if (Utilities.ATLEAST_JB_MR1) {
            return configuration.densityDpi;
        }
        return 0;
    }

    public final void onReceive(Context context, Intent intent) {
        Configuration configuration = context.getResources().getConfiguration();
        if (this.mFontScale != configuration.fontScale || this.mDensity != getDensity(configuration)) {
            Log.d("ConfigMonitor", "Configuration changed, restarting launcher");
            this.mContext.unregisterReceiver(this);
            Process.killProcess(Process.myPid());
        }
    }
}
