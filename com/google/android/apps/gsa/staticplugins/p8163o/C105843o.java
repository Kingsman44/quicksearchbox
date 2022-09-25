package com.google.android.apps.gsa.staticplugins.p8163o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.o */
/* compiled from: PG */
final class C105843o extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C105846r f295270a;

    public C105843o(C105846r rVar) {
        this.f295270a = rVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f295270a.mo95087f();
        }
    }
}
