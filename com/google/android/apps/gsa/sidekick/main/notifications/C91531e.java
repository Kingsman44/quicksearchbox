package com.google.android.apps.gsa.sidekick.main.notifications;

import android.content.Context;
import android.content.Intent;
import androidx.p122k.p123a.C2303a;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.e */
/* compiled from: PG */
class C91531e extends C2303a {

    /* renamed from: c */
    private volatile boolean f255288c = false;

    /* renamed from: d */
    private final Object f255289d = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo85901b(Context context) {
        if (!this.f255288c) {
            synchronized (this.f255289d) {
                if (!this.f255288c) {
                    ((C91552z) C68323g.m98667a(context)).mo85933ry((NotificationRefreshReceiver) this);
                    this.f255288c = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo85901b(context);
    }
}
