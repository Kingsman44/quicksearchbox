package com.google.android.apps.gsa.search.core.google.gaia.changed;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.changed.f */
/* compiled from: PG */
class C86042f extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f232615a = false;

    /* renamed from: b */
    private final Object f232616b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo79701a(Context context) {
        if (!this.f232615a) {
            synchronized (this.f232616b) {
                if (!this.f232615a) {
                    ((C86037a) C68323g.m98667a(context)).mo79699rl((AccountsChangedReceiver) this);
                    this.f232615a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo79701a(context);
    }
}
