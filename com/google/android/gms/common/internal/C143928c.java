package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.c */
/* compiled from: PG */
abstract class C143928c extends C143932g {

    /* renamed from: a */
    public final int f390118a;

    /* renamed from: b */
    public final Bundle f390119b;

    /* renamed from: c */
    final /* synthetic */ C143939n f390120c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C143928c(C143939n nVar, int i, Bundle bundle) {
        super(nVar, true);
        this.f390120c = nVar;
        this.f390118a = i;
        this.f390119b = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo119437a(ConnectionResult connectionResult);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo119438b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo119439c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo119440d() {
        if (this.f390118a != 0) {
            this.f390120c.mo119457O(1, (IInterface) null);
            Bundle bundle = this.f390119b;
            mo119437a(new ConnectionResult(1, this.f390118a, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, (String) null));
        } else if (!mo119439c()) {
            this.f390120c.mo119457O(1, (IInterface) null);
            mo119437a(new ConnectionResult(1, 8, (PendingIntent) null, (String) null));
        }
    }
}
