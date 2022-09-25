package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8448a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.a.a */
/* compiled from: PG */
final class C110504a extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C110505b f308086a;

    public C110504a(C110505b bVar) {
        this.f308086a = bVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && Objects.equals(intent.getAction(), "android.app.action.NEXT_ALARM_CLOCK_CHANGED")) {
            this.f308086a.mo98747a();
        }
    }
}
