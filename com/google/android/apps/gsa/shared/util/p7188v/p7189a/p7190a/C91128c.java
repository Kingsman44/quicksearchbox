package com.google.android.apps.gsa.shared.util.p7188v.p7189a.p7190a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.shared.util.v.a.a.c */
/* compiled from: PG */
class C91128c extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f254446a = false;

    /* renamed from: b */
    private final Object f254447b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85396a(Context context) {
        if (!this.f254446a) {
            synchronized (this.f254447b) {
                if (!this.f254446a) {
                    ((C91127b) C68323g.m98667a(context)).mo85395rk((C91126a) this);
                    this.f254446a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo85396a(context);
    }
}
