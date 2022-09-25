package com.google.android.apps.gsa.search.core.udc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.search.core.udc.q */
/* compiled from: PG */
class C87221q extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f235642a = false;

    /* renamed from: b */
    private final Object f235643b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80849a(Context context) {
        if (!this.f235642a) {
            synchronized (this.f235643b) {
                if (!this.f235642a) {
                    ((C87196a) C68323g.m98667a(context)).mo80831rp((FacsBroadcastReceiver) this);
                    this.f235642a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo80849a(context);
    }
}
