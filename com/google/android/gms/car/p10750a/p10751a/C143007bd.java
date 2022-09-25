package com.google.android.gms.car.p10750a.p10751a;

import com.google.android.gms.car.C143195dl;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.a.a.bd */
/* compiled from: PG */
public final /* synthetic */ class C143007bd implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143011bh f388050a;

    public /* synthetic */ C143007bd(C143011bh bhVar) {
        this.f388050a = bhVar;
    }

    public final void run() {
        C143019bp bpVar = this.f388050a.f388059e.f388065a;
        C143316a.m232514d(5, "CAR.TOKEN", (Throwable) null, "CarClient connection lost.", new Object[0]);
        synchronized (bpVar.f388077g) {
            bpVar.f388073c.mo20042b(C143195dl.SERVICE_DISCONNECTED);
            bpVar.mo117966d();
            bpVar.mo117968f();
        }
    }
}
