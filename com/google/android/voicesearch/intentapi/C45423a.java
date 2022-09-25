package com.google.android.voicesearch.intentapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.voicesearch.intentapi.a */
/* compiled from: PG */
class C45423a extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f118809a = false;

    /* renamed from: b */
    private final Object f118810b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49550a(Context context) {
        if (!this.f118809a) {
            synchronized (this.f118810b) {
                if (!this.f118809a) {
                    ((C45424b) C68323g.m98667a(context)).mo49551rv((IntentApiReceiver) this);
                    this.f118809a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo49550a(context);
    }
}
