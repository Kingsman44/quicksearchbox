package com.google.android.apps.gsa.opaonboarding.p6461c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.opaonboarding.c.b */
/* compiled from: PG */
final class C83911b extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ Runnable f228537a;

    public C83911b(Runnable runnable) {
        this.f228537a = runnable;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "com.google.android.apps.gsa.notificationlistener.NOTIFICATION_LISTENER_SERVICE_CONNECTED".equals(intent.getAction())) {
            this.f228537a.run();
        }
    }
}
