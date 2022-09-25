package com.android.launcher3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
public class StartupReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        context.sendStickyBroadcast(new Intent("com.android.launcher3.SYSTEM_READY"));
    }
}
