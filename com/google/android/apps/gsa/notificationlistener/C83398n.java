package com.google.android.apps.gsa.notificationlistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.notificationlistener.n */
/* compiled from: PG */
class C83398n extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f227292a = false;

    /* renamed from: b */
    private final Object f227293b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76697a(Context context) {
        if (!this.f227292a) {
            synchronized (this.f227293b) {
                if (!this.f227292a) {
                    ((C83406v) C68323g.m98667a(context)).mo76700rx((NotificationListenerBroadcastReceiver) this);
                    this.f227292a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo76697a(context);
    }
}
