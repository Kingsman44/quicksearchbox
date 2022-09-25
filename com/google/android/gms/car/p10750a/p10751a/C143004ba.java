package com.google.android.gms.car.p10750a.p10751a;

import com.google.android.gms.car.C143198do;
import com.google.android.gms.car.C143208e;
import com.google.android.gms.car.p10750a.C143086f;
import com.google.android.gms.car.p10750a.C143087g;
import com.google.android.gms.car.p10750a.C143088h;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.gms.car.a.a.ba */
/* compiled from: PG */
public final /* synthetic */ class C143004ba implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143011bh f388044a;

    /* renamed from: b */
    public final /* synthetic */ C143087g f388045b;

    public /* synthetic */ C143004ba(C143011bh bhVar, C143087g gVar) {
        this.f388044a = bhVar;
        this.f388045b = gVar;
    }

    public final void run() {
        C143011bh bhVar = this.f388044a;
        C143087g gVar = this.f388045b;
        C143019bp bpVar = bhVar.f388058d.f388064a;
        int i = 5;
        C143316a.m232514d(5, "CAR.TOKEN", gVar, "CarClient failed.", new Object[0]);
        synchronized (bpVar.f388077g) {
            if (gVar instanceof C143086f) {
                i = 3;
            } else if (gVar instanceof C143088h) {
                i = 6;
            }
            C143198do doVar = bpVar.f388074d;
            C143208e eVar = new C143208e(i);
            C58838bb.m90884s(true, "legacyConnectionResult must be set iff failureReason is LEGACY_GMSCORE_FAILURE");
            doVar.mo20040a(eVar);
        }
    }
}
