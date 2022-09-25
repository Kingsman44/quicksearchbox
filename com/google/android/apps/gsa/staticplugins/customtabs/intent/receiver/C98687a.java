package com.google.android.apps.gsa.staticplugins.customtabs.intent.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.receiver.a */
/* compiled from: PG */
class C98687a extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f275674a = false;

    /* renamed from: b */
    private final Object f275675b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91264a(Context context) {
        if (!this.f275674a) {
            synchronized (this.f275675b) {
                if (!this.f275674a) {
                    ((C98689c) C68323g.m98667a(context)).mo91266rC((ShareAppChosenReceiver) this);
                    this.f275674a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo91264a(context);
    }
}
