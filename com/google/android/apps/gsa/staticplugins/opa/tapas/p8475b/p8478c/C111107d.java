package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8478c;

import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.c.d */
/* compiled from: PG */
public final /* synthetic */ class C111107d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f309349a;

    public /* synthetic */ C111107d(long j) {
        this.f309349a = j;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        long j = this.f309349a;
        C65139d dVar = ((C65768az) obj).f178796b;
        if (dVar == null) {
            dVar = C65139d.f176307e;
        }
        return dVar.f176310b > j;
    }
}
