package com.google.android.gms.car.p10750a.p10751a;

import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.p10750a.C143082b;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.common.util.concurrent.C60845bz;
import com.google.frameworks.client.p4624a.p4625a.C61301b;

/* renamed from: com.google.android.gms.car.a.a.bo */
/* compiled from: PG */
final class C143018bo implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ int f388070a;

    /* renamed from: b */
    final /* synthetic */ C143019bp f388071b;

    public C143018bo(C143019bp bpVar, int i) {
        this.f388071b = bpVar;
        this.f388070a = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (C143316a.m232515e("CAR.TOKEN", 4)) {
            C143316a.m232514d(4, "CAR.TOKEN", (Throwable) null, "Failed to disconnect %s, was not connected.", C61301b.m93812a(this));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C143000ax axVar = (C143000ax) obj;
        if (axVar != null) {
            C143082b bVar = this.f388071b.f388075e;
            if (C143109au.m232164a("CAR.CLIENT", 3)) {
                C143316a.m232514d(3, "CAR.CLIENT", (Throwable) null, "Unregistering CarConnectionListener %s with multiplex listener %s", C61301b.m93812a(bVar), C61301b.m93812a(axVar.f388026a));
            }
            axVar.f388026a.mo117980f(bVar);
            axVar.f388039g.mo117938a();
            if (C143316a.m232515e("CAR.TOKEN", 4)) {
                C143316a.m232514d(4, "CAR.TOKEN", (Throwable) null, "Disconnected %s using %s (cx attempt %s)", C61301b.m93812a(this), C61301b.m93812a(axVar), C61301b.m93812a(Integer.valueOf(this.f388070a)));
            }
        }
    }
}
