package com.google.android.apps.gsa.startup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.startup.a */
/* compiled from: PG */
class C92659a extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f258654a = false;

    /* renamed from: b */
    private final Object f258655b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87429a(Context context) {
        if (!this.f258654a) {
            synchronized (this.f258655b) {
                if (!this.f258654a) {
                    ((C92662d) C68323g.m98667a(context)).mo87432rD((StartUpReceiver) this);
                    this.f258654a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo87429a(context);
    }
}
