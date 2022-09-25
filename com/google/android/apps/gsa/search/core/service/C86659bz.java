package com.google.android.apps.gsa.search.core.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.search.core.service.bz */
/* compiled from: PG */
final class C86659bz extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C86663ca f234111a;

    public C86659bz(C86663ca caVar) {
        this.f234111a = caVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f234111a.f234121c.mo28212l("Process device update broadcast", new C86658by(this, intent));
    }
}
