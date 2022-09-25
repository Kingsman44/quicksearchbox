package com.google.android.apps.gsa.search.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.search.core.ao */
/* compiled from: PG */
class C85630ao extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f231449a = false;

    /* renamed from: b */
    private final Object f231450b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo79110a(Context context) {
        if (!this.f231449a) {
            synchronized (this.f231450b) {
                if (!this.f231449a) {
                    ((C84567ak) C68323g.m98667a(context)).mo78320ru((GservicesBroadcastReceiver) this);
                    this.f231449a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo79110a(context);
    }
}
