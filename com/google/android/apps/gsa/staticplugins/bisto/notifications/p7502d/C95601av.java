package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.av */
/* compiled from: PG */
final class C95601av extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C95602aw f267539a;

    public C95601av(C95602aw awVar) {
        this.f267539a = awVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.app.action.NEXT_ALARM_CLOCK_CHANGED".equals(intent.getAction())) {
            this.f267539a.mo89554d();
        }
    }
}
