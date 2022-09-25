package com.google.android.apps.gsa.staticplugins.nga.p8087s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.ae */
/* compiled from: PG */
final class C103784ae extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C103787ah f288981a;

    public C103784ae(C103787ah ahVar) {
        this.f288981a = ahVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C103809q c = C103810r.m171792c();
        c.mo93836b().mo55373c(C103803k.SIGNED_OUT_ASSISTANT_LOCALE);
        this.f288981a.mo93849f(c.mo93835a());
    }
}
