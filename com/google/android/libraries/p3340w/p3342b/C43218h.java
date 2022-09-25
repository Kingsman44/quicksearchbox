package com.google.android.libraries.p3340w.p3342b;

import com.google.android.libraries.performance.primes.metrics.p2411f.C31447f;
import com.google.common.base.C58837ba;
import p5488io.grpc.C70904s;
import p5488io.grpc.C70906u;

/* renamed from: com.google.android.libraries.w.b.h */
/* compiled from: PG */
final class C43218h extends C70904s {

    /* renamed from: a */
    public final Object f112945a = new Object();

    /* renamed from: b */
    public C43216f f112946b;

    /* renamed from: c */
    public boolean f112947c = false;

    /* renamed from: d */
    public final C31447f f112948d;

    public C43218h(C31447f fVar) {
        this.f112948d = fVar;
        if (!C58837ba.m90859h("application/grpc")) {
            fVar.f84675k = "application/grpc";
        }
    }

    /* renamed from: a */
    public final C70906u mo46274a() {
        synchronized (this.f112945a) {
            if (this.f112946b != null) {
                C43217g gVar = new C43217g();
                return gVar;
            }
            C43216f fVar = new C43216f(this.f112948d);
            this.f112946b = fVar;
            return fVar;
        }
    }
}
