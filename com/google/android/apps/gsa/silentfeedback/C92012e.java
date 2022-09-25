package com.google.android.apps.gsa.silentfeedback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.silentfeedback.e */
/* compiled from: PG */
class C92012e extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f256535a = false;

    /* renamed from: b */
    private final Object f256536b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo86674a(Context context) {
        if (!this.f256535a) {
            synchronized (this.f256536b) {
                if (!this.f256535a) {
                    ((C92009b) C68323g.m98667a(context)).mo86673ro((CrashloopReceiver) this);
                    this.f256535a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo86674a(context);
    }
}
