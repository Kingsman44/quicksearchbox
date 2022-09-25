package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.az */
/* compiled from: PG */
final class C86932az extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C86938be f234765a;

    public C86932az(C86938be beVar) {
        this.f234765a = beVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f234765a.f234794h.mo28212l("MicroDetectionState#userForegroundBroadcastReceiver", new C86931ay(this, intent, goAsync()));
    }
}
