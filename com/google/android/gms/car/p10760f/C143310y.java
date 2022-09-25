package com.google.android.gms.car.p10760f;

import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143111aw;
import com.google.android.gms.car.C143194dk;
import com.google.android.gms.car.C143341z;
import com.google.android.gms.car.p10750a.p10751a.C143059db;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.y */
/* compiled from: PG */
final class C143310y implements C143341z {

    /* renamed from: a */
    final /* synthetic */ C143059db f388540a;

    /* renamed from: b */
    final /* synthetic */ C143268bb f388541b;

    public C143310y(C143268bb bbVar, C143059db dbVar) {
        this.f388541b = bbVar;
        this.f388540a = dbVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo20043a(int i) {
        if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s.onConnected()", this.f388541b.f388473v);
        }
        try {
            C143109au.f388178a = this.f388540a.mo117936r("car_force_logging");
        } catch (C143111aw | IllegalArgumentException | IllegalStateException | SecurityException unused) {
        }
        C143194dk.m232316a(this.f388541b.f388455d);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo20044b() {
        if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s.onDisconnected()", this.f388541b.f388473v);
        }
        this.f388541b.f388455d.drainPermits();
        this.f388541b.mo118030a();
    }
}
