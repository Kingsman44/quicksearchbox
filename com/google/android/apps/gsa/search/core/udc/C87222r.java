package com.google.android.apps.gsa.search.core.udc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.search.core.udc.r */
/* compiled from: PG */
class C87222r extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f235644a = false;

    /* renamed from: b */
    private final Object f235645b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80850a(Context context) {
        if (!this.f235644a) {
            synchronized (this.f235645b) {
                if (!this.f235644a) {
                    ((C87201ae) C68323g.m98667a(context)).mo80834rF((UdcSettingBroadcastReceiver) this);
                    this.f235644a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo80850a(context);
    }
}
