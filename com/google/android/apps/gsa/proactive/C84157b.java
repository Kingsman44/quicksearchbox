package com.google.android.apps.gsa.proactive;

import android.content.Context;
import android.content.Intent;
import androidx.p122k.p123a.C2303a;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.proactive.b */
/* compiled from: PG */
class C84157b extends C2303a {

    /* renamed from: c */
    private volatile boolean f229101c = false;

    /* renamed from: d */
    private final Object f229102d = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77588b(Context context) {
        if (!this.f229101c) {
            synchronized (this.f229102d) {
                if (!this.f229101c) {
                    ((C84177m) C68323g.m98667a(context)).mo77643rB((RequestScheduleEvaluatorReceiver) this);
                    this.f229101c = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo77588b(context);
    }
}
