package com.google.android.gms.car.p10760f;

import android.os.RemoteException;
import com.google.android.gms.car.C143145ca;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.common.api.internal.C143783cd;

/* renamed from: com.google.android.gms.car.f.n */
/* compiled from: PG */
abstract class C143299n implements C143783cd {

    /* renamed from: a */
    private final String f388525a;

    public C143299n(String str) {
        this.f388525a = str;
    }

    /* renamed from: a */
    public abstract void mo118274a(C143145ca caVar);

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo118340b(Object obj) {
        try {
            mo118274a((C143145ca) obj);
        } catch (RemoteException e) {
            C143316a.m232514d(5, "CAR.TEL.CLIENT", e, "Remote Exception during %s", this.f388525a);
        }
    }

    /* renamed from: c */
    public final void mo118341c() {
        C143316a.m232514d(5, "CAR.TEL.CLIENT", new Exception(), "Notify failed", new Object[0]);
    }
}
