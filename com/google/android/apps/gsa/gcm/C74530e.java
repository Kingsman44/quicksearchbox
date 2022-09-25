package com.google.android.apps.gsa.gcm;

import android.content.Context;
import android.content.Intent;
import androidx.p122k.p123a.C2303a;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.gcm.e */
/* compiled from: PG */
class C74530e extends C2303a {

    /* renamed from: c */
    private volatile boolean f208682c = false;

    /* renamed from: d */
    private final Object f208683d = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo70841b(Context context) {
        if (!this.f208682c) {
            synchronized (this.f208683d) {
                if (!this.f208682c) {
                    ((C74529d) C68323g.m98667a(context)).mo70840rq((GcmBroadcastReceiver) this);
                    this.f208682c = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo70841b(context);
    }
}
