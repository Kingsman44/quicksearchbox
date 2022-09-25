package com.google.android.libraries.performance.primes.metrics.p2416j;

import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import java.util.Set;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.g */
/* compiled from: PG */
public final class C31539g {
    /* renamed from: a */
    static C31554v m58804a(C58833ax axVar, C58833ax axVar2, C69464a aVar) {
        return (axVar.mo56113h() || axVar2.mo56113h()) ? (C31554v) aVar.mo17428b() : new C31538f();
    }

    /* renamed from: b */
    public static C58833ax m58805b(C58833ax axVar, C58833ax axVar2, C69464a aVar) {
        if (!axVar.mo56113h() && !axVar2.mo56113h()) {
            return C58836b.f156633a;
        }
        Objects.requireNonNull(aVar);
        return C58833ax.m90834k(new C31537e(aVar));
    }

    /* renamed from: c */
    public static Set m58806c(C58833ax axVar, C58833ax axVar2, C69464a aVar) {
        if (axVar.mo56113h() || axVar2.mo56113h()) {
            return new C58759qy((C31313p) aVar.mo17428b());
        }
        return C58733pz.f156496a;
    }
}
