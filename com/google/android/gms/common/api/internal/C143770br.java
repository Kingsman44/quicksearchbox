package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.br */
/* compiled from: PG */
public final class C143770br extends BroadcastReceiver {

    /* renamed from: a */
    public Context f389790a;

    /* renamed from: b */
    private final C143769bq f389791b;

    public C143770br(C143769bq bqVar) {
        this.f389791b = bqVar;
    }

    /* renamed from: a */
    public final synchronized void mo119216a() {
        Context context = this.f389790a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f389790a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f389791b.mo119157a();
            mo119216a();
        }
    }
}
