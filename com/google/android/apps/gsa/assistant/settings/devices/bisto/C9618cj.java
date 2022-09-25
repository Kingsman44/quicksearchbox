package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.cj */
/* compiled from: PG */
final class C9618cj extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ Runnable f33235a;

    public C9618cj(Runnable runnable) {
        this.f33235a = runnable;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "com.google.android.apps.gsa.notificationlistener.NOTIFICATION_LISTENER_SERVICE_CONNECTED".equals(intent.getAction())) {
            this.f33235a.run();
        }
    }
}
