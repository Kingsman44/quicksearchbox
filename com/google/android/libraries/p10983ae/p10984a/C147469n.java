package com.google.android.libraries.p10983ae.p10984a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.libraries.ae.a.n */
/* compiled from: PG */
final class C147469n extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C147476u f398075a;

    public C147469n(C147476u uVar) {
        this.f398075a = uVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            this.f398075a.mo124218f();
        }
    }
}
