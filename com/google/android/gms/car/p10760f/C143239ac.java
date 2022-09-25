package com.google.android.gms.car.p10760f;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import com.google.android.gms.car.C143150cf;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.f.ac */
/* compiled from: PG */
public final class C143239ac {

    /* renamed from: a */
    final /* synthetic */ C143268bb f388364a;

    public C143239ac(C143268bb bbVar) {
        this.f388364a = bbVar;
    }

    /* renamed from: a */
    public final void mo118282a(Surface surface) {
        C143150cf cfVar = this.f388364a.f388447O;
        if (cfVar != null) {
            try {
                Parcel gA = cfVar.mo17260gA();
                C8850c.m23497f(gA, surface);
                cfVar.mo17262he(30, gA);
            } catch (RemoteException unused) {
                C143316a.m232514d(5, "CAR.PROJECTION.CAHI", (Throwable) null, "%s Failed to release surface", this.f388364a.f388473v);
            }
        }
    }
}
