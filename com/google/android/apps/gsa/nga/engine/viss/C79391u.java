package com.google.android.apps.gsa.nga.engine.viss;

import android.os.IBinder;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.u */
/* compiled from: PG */
public final class C79391u {

    /* renamed from: a */
    private IBinder f218019a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo74008a(IBinder iBinder) {
        this.f218019a = iBinder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo74009b() {
        this.f218019a = null;
    }

    /* renamed from: c */
    public final synchronized boolean mo74010c() {
        IBinder iBinder = this.f218019a;
        if (iBinder == null) {
            return false;
        }
        return iBinder.isBinderAlive();
    }
}
