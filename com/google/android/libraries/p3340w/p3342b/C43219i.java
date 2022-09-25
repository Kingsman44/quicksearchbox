package com.google.android.libraries.p3340w.p3342b;

import android.os.SystemClock;
import com.google.android.libraries.p3340w.C43206a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.metrics.p2411f.C31447f;
import com.google.common.base.C58881cr;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70898m;
import p5488io.grpc.C70899n;

/* renamed from: com.google.android.libraries.w.b.i */
/* compiled from: PG */
public final class C43219i implements C70899n {

    /* renamed from: a */
    private static C43219i f112949a;

    /* renamed from: b */
    private final C58881cr f112950b;

    public C43219i(C58881cr crVar) {
        this.f112950b = crVar;
    }

    /* renamed from: b */
    public static synchronized C43219i m76206b() {
        C43219i iVar;
        synchronized (C43219i.class) {
            if (f112949a == null) {
                f112949a = new C43219i(C43213c.f112937a);
            }
            iVar = f112949a;
        }
        return iVar;
    }

    /* renamed from: a */
    public final C70898m mo27479a(C70338di diVar, C70851i iVar, C70888j jVar) {
        C43218h hVar;
        if (!((Boolean) this.f112950b.mo6453a()).booleanValue()) {
            return jVar.mo39510a(diVar, iVar);
        }
        C31164au auVar = (C31164au) iVar.mo62571g(C43206a.f112930a);
        if (auVar == null) {
            String b = jVar.mo39511b();
            String str = diVar.f187497b;
            hVar = new C43218h(new C31447f((String) null, "https://" + b + "/" + str, false, SystemClock.elapsedRealtime()));
        } else {
            hVar = new C43218h(C31447f.m58634a(jVar.mo39511b(), auVar));
        }
        return new C43215e(jVar.mo39510a(diVar, iVar.mo62570f(hVar)), hVar);
    }
}
