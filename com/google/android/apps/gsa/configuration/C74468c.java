package com.google.android.apps.gsa.configuration;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.configuration.c */
/* compiled from: PG */
class C74468c extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f208550a = false;

    /* renamed from: b */
    private final Object f208551b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70783a(Context context) {
        if (!this.f208550a) {
            synchronized (this.f208551b) {
                if (!this.f208550a) {
                    ((C74469d) C68323g.m98667a(context)).mo70784rz((PhenotypeBroadcastReceiver) this);
                    this.f208550a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo70783a(context);
    }
}
