package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22904b;

/* renamed from: com.google.android.libraries.gsa.logoview.j */
/* compiled from: PG */
final class C22917j extends C22897ai {
    public C22917j() {
        super("ROTATION EXIT");
    }

    /* renamed from: d */
    public static final float m42862d(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        if (!C22897ai.m42809o(bVar)) {
            bVar.f63083h.mo28271b(12.0f);
        }
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        if (!C22897ai.m42810p(bVar)) {
            bVar.mo28268f();
            bVar.f63083h.mo28270a();
            C22897ai.m42806l(bVar);
        }
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        if (!C22897ai.m42809o(bVar)) {
            if (!C22897ai.m42810p(bVar)) {
                float f = bVar.f63083h.f63088a.f63013c;
                float d = m42862d(2.7488937f - (bVar.f63077b.f63066b.f63013c + f));
                float d2 = m42862d(2.7488937f - (bVar.f63078c.f63066b.f63013c + f));
                float d3 = m42862d(-0.3926991f - (bVar.f63079d.f63066b.f63013c + f));
                if (d > m42862d(-0.3926991f - (bVar.f63080e.f63066b.f63013c + f)) && d3 > d2 && d < 4.712389f && d3 < 4.712389f) {
                    bVar.mo28268f();
                    bVar.f63083h.mo28270a();
                    C22897ai.m42806l(bVar);
                }
                return true;
            }
            m42802h(bVar, j2);
            if (!C22897ai.m42809o(bVar)) {
                return true;
            }
        }
        return false;
    }
}
