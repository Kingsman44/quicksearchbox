package com.google.android.apps.gsa.broadcastreceiver.external;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.util.p7180q.C91083b;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.apps.gsa.smartspace.C92122r;

/* compiled from: PG */
public class PixelLauncherBroadcastReceiver extends CommonBroadcastReceiver {
    public PixelLauncherBroadcastReceiver() {
        C91083b.m148803a(C91084c.SEARCH);
    }

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(4);
        if (C92122r.m151190j(context)) {
            super.onReceive(context, intent);
        }
    }
}
