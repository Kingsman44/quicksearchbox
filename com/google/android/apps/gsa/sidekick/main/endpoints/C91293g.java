package com.google.android.apps.gsa.sidekick.main.endpoints;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.sidekick.main.endpoints.g */
/* compiled from: PG */
class C91293g extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f254789a = false;

    /* renamed from: b */
    private final Object f254790b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85576a(Context context) {
        if (!this.f254789a) {
            synchronized (this.f254790b) {
                if (!this.f254789a) {
                    ((C91288b) C68323g.m98667a(context)).mo85568rm((AccountsUpdateReceiver) this);
                    this.f254789a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo85576a(context);
    }
}
