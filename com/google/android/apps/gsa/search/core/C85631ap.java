package com.google.android.apps.gsa.search.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.search.core.ap */
/* compiled from: PG */
class C85631ap extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f231451a = false;

    /* renamed from: b */
    private final Object f231452b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo79111a(Context context) {
        if (!this.f231451a) {
            synchronized (this.f231452b) {
                if (!this.f231451a) {
                    ((C85633ar) C68323g.m98667a(context)).mo79112rw((LocaleChangedReceiver) this);
                    this.f231451a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo79111a(context);
    }
}
