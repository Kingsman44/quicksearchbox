package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.l */
/* compiled from: PG */
public final class C143937l extends C143928c {

    /* renamed from: g */
    public final IBinder f390130g;

    /* renamed from: h */
    final /* synthetic */ C143939n f390131h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143937l(C143939n nVar, int i, IBinder iBinder, Bundle bundle) {
        super(nVar, i, bundle);
        this.f390131h = nVar;
        this.f390130g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119437a(ConnectionResult connectionResult) {
        C143930e eVar = this.f390131h.f390136C;
        if (eVar != null) {
            eVar.mo119391c(connectionResult);
        }
        this.f390131h.mo118926o(connectionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo119439c() {
        try {
            IBinder iBinder = this.f390130g;
            C143919bh.m233958a(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f390131h.mo57746c().equals(interfaceDescriptor)) {
                C143939n nVar = this.f390131h;
                Log.w("GmsClient", "service descriptor mismatch: " + nVar.mo57746c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface b = this.f390131h.mo57745b(this.f390130g);
            if (b == null || (!this.f390131h.mo119460R(2, 4, b) && !this.f390131h.mo119460R(3, 4, b))) {
                return false;
            }
            C143939n nVar2 = this.f390131h;
            nVar2.f390139F = null;
            Bundle l = nVar2.mo118923l();
            C143929d dVar = this.f390131h.f390135B;
            if (dVar == null) {
                return true;
            }
            dVar.mo119389a(l);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
