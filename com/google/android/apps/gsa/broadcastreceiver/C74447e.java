package com.google.android.apps.gsa.broadcastreceiver;

import android.content.Context;
import android.content.Intent;
import androidx.p122k.p123a.C2303a;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.broadcastreceiver.e */
/* compiled from: PG */
class C74447e extends C2303a {

    /* renamed from: c */
    private volatile boolean f208523c = false;

    /* renamed from: d */
    private final Object f208524d = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo70768d(Context context) {
        if (!this.f208523c) {
            synchronized (this.f208524d) {
                if (!this.f208523c) {
                    ((C74446d) C68323g.m98667a(context)).mo70767rn((CommonBroadcastReceiver) this);
                    this.f208523c = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo70768d(context);
    }
}
