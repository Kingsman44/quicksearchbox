package com.google.android.apps.gsa.search.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.search.core.an */
/* compiled from: PG */
class C85629an extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f231447a = false;

    /* renamed from: b */
    private final Object f231448b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo79109a(Context context) {
        if (!this.f231447a) {
            synchronized (this.f231448b) {
                if (!this.f231447a) {
                    ((C87194u) C68323g.m98667a(context)).mo80828rs((GmsPackageWatcher) this);
                    this.f231447a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo79109a(context);
    }
}
