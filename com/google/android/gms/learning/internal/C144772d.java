package com.google.android.gms.learning.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.C144581d;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58838bb;
import com.google.common.base.C58889cz;

/* renamed from: com.google.android.gms.learning.internal.d */
/* compiled from: PG */
public final class C144772d {

    /* renamed from: a */
    private final C144781m f391624a;

    /* renamed from: b */
    private final C58889cz f391625b;

    /* renamed from: c */
    private final long f391626c;

    public C144772d(C144781m mVar) {
        this.f391624a = mVar;
        C58889cz czVar = C58274c.f155808a;
        this.f391625b = czVar;
        this.f391626c = czVar.mo26884a();
    }

    /* renamed from: a */
    public final void mo120204a(C144581d dVar) {
        C58838bb.m90866a(dVar, "iterator must not be null");
        long a = this.f391625b.mo26884a() - this.f391626c;
        C144764b bVar = new C144764b(dVar, this.f391625b);
        try {
            this.f391624a.mo120095b(bVar, a);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQuerySuccess AIDL call failed, closing iterator", e);
            bVar.mo120197a();
        }
    }

    /* renamed from: b */
    public final void mo120205b(String str) {
        try {
            this.f391624a.mo120094a(new Status(1, 8, str, (PendingIntent) null, (ConnectionResult) null), this.f391625b.mo26884a() - this.f391626c);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQueryFailure AIDL call failed, ignoring", e);
        }
    }
}
