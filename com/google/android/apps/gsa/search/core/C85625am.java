package com.google.android.apps.gsa.search.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.search.core.am */
/* compiled from: PG */
class C85625am extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f231435a = false;

    /* renamed from: b */
    private final Object f231436b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo79103a(Context context) {
        if (!this.f231435a) {
            synchronized (this.f231436b) {
                if (!this.f231435a) {
                    ((C86352r) C68323g.m98667a(context)).mo80106rr((GelTermsAcceptedReceiver) this);
                    this.f231435a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo79103a(context);
    }
}
