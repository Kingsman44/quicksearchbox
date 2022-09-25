package org.chromium.weblayer;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
public class BroadcastReceiver extends android.content.BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            C72611bt.m107420h(context, new C72564a(context, intent));
        } catch (C72605bn e) {
            throw new RuntimeException(e);
        }
    }
}
