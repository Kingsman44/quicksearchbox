package com.google.android.apps.gsa.reminders;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.reminders.a */
/* compiled from: PG */
class C84253a extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f229291a = false;

    /* renamed from: b */
    private final Object f229292b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77742a(Context context) {
        if (!this.f229291a) {
            synchronized (this.f229292b) {
                if (!this.f229291a) {
                    ((C84260g) C68323g.m98667a(context)).mo77746rA((RemindersBroadcastReceiver) this);
                    this.f229291a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo77742a(context);
    }
}
