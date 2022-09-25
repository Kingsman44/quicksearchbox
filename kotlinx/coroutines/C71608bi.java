package kotlinx.coroutines;

import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69579i;
import p5462h.p5466c.C69582l;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5484n.C69779a;
import p5462h.p5484n.C69782d;

/* renamed from: kotlinx.coroutines.bi */
/* compiled from: PG */
public final class C71608bi {
    /* renamed from: a */
    public static final long m104549a(long j) {
        if (C69779a.m101244h(j) <= 0) {
            return 0;
        }
        long b = (!C69779a.m101240d(j) || !C69779a.m101239c(j)) ? C69779a.m101238b(j, C69782d.MILLISECONDS) : j >> 1;
        if (b < 1) {
            return 1;
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104550b(p5462h.p5466c.C69577g r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.C71607bh
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.bh r0 = (kotlinx.coroutines.C71607bh) r0
            int r1 = r0.f191043b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f191043b = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.bh r0 = new kotlinx.coroutines.bh
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.f191042a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f191043b
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x002b:
            p5462h.C69714l.m101134b(r4)
            goto L_0x0047
        L_0x002f:
            p5462h.C69714l.m101134b(r4)
            r0.f191043b = r3
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            h.c.g r0 = p5462h.p5466c.p5467a.C69555b.m100961b(r0)
            r4.<init>(r0, r3)
            r4.mo63041A()
            java.lang.Object r4 = r4.mo63043n()
            if (r4 != r1) goto L_0x0047
            return r1
        L_0x0047:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71608bi.m104550b(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public static final Object m104551c(long j, C69577g gVar) {
        if (j <= 0) {
            return C69788q.f186170a;
        }
        C71808r rVar = new C71808r(C69555b.m100961b(gVar), 1);
        rVar.mo63041A();
        if (j < Long.MAX_VALUE) {
            m104552d(rVar.f191338b).mo62765a(j, rVar);
        }
        Object n = rVar.mo63043n();
        return n == C69554a.COROUTINE_SUSPENDED ? n : C69788q.f186170a;
    }

    /* renamed from: d */
    public static final C71606bg m104552d(C69585o oVar) {
        C69664n.m101061g(oVar, "<this>");
        C69582l lVar = oVar.get(C69579i.f185989a);
        C71606bg bgVar = lVar instanceof C71606bg ? (C71606bg) lVar : null;
        return bgVar == null ? C71603bd.f191041a : bgVar;
    }
}
