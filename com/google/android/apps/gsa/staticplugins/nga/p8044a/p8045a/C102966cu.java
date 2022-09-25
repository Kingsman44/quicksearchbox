package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.cu */
/* compiled from: PG */
final class C102966cu extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C102967cv f287529a;

    public C102966cu(C102967cv cvVar) {
        this.f287529a = cvVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            this.f287529a.mo71088c();
        }
    }
}
