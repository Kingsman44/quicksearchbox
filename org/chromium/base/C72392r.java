package org.chromium.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: org.chromium.base.r */
/* compiled from: PG */
final class C72392r extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        PowerMonitor.m107027b(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"));
    }
}
