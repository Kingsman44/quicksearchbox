package com.google.android.gms.car.p10750a.p10751a;

import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.p10750a.C143082b;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.a.a.ar */
/* compiled from: PG */
final class C142994ar implements C143082b {

    /* renamed from: a */
    final /* synthetic */ C142995as f388025a;

    public C142994ar(C142995as asVar) {
        this.f388025a = asVar;
    }

    /* renamed from: a */
    public final void mo20043a(int i) {
        if (C143109au.m232164a("CAR.CLIENT", 3)) {
            C143316a.m232511a("CAR.CLIENT", (Throwable) null, "localCarConnectionListener received onCarConnected()");
        }
        this.f388025a.f388030e.set((Object) null, true);
    }

    /* renamed from: b */
    public final void mo20044b() {
        if (C143109au.m232164a("CAR.CLIENT", 3)) {
            C143316a.m232511a("CAR.CLIENT", (Throwable) null, "localCarConnectionListener received onCarDisconnected()");
        }
        this.f388025a.mo117933o();
    }
}
