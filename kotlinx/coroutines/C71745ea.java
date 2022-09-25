package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71707ao;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ea */
/* compiled from: PG */
public final class C71745ea {
    /* renamed from: a */
    public static final Object m104929a(long j, C69630p pVar, C69577g gVar) {
        if (j > 0) {
            Object c = m104931c(new C71689dy(j, gVar), pVar);
            if (c == C69554a.COROUTINE_SUSPENDED) {
                C69664n.m101061g(gVar, "frame");
            }
            return c;
        }
        throw new C71688dx("Timed out immediately", (C71643cp) null);
    }

    /* renamed from: c */
    private static final Object m104931c(C71689dy dyVar, C69630p pVar) {
        Object obj;
        C71615bp g = C71608bi.m104552d(dyVar.f191173e.mo61340lY()).mo62769g(dyVar.f191141b, dyVar, dyVar.f190536a);
        C69664n.m101061g(g, "handle");
        dyVar.mo62873s(new C71617br(g));
        C69664n.m101061g(pVar, "block");
        try {
            C69651ah.m101037b(pVar, 2);
            obj = pVar.mo5192a(dyVar, dyVar);
        } catch (Throwable th) {
            obj = new C71396ac(th, false);
        }
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (obj == aVar) {
            return aVar;
        }
        Object E = dyVar.mo62901E(obj);
        if (E == C71666db.f191120b) {
            return C69554a.COROUTINE_SUSPENDED;
        }
        if (!(E instanceof C71396ac)) {
            return C71666db.m104742b(E);
        }
        Throwable th2 = ((C71396ac) E).f190604b;
        if (!(th2 instanceof C71688dx) || ((C71688dx) th2).f191140a != dyVar) {
            C69577g gVar = dyVar.f191173e;
            if (!C71600ba.f191037b || !(gVar instanceof C69566d)) {
                throw th2;
            }
            throw C71707ao.m104840a(th2, (C69566d) gVar);
        } else if (!(obj instanceof C71396ac)) {
            return obj;
        } else {
            Throwable th3 = ((C71396ac) obj).f190604b;
            C69577g gVar2 = dyVar.f191173e;
            if (!C71600ba.f191037b || !(gVar2 instanceof C69566d)) {
                throw th3;
            }
            throw C71707ao.m104840a(th3, (C69566d) gVar2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104930b(long r7, p5462h.p5473f.p5474a.C69630p r9, p5462h.p5466c.C69577g r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.C71690dz
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.dz r0 = (kotlinx.coroutines.C71690dz) r0
            int r1 = r0.f191146e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f191146e = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.dz r0 = new kotlinx.coroutines.dz
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f191145d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f191146e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            long r7 = r0.f191142a
            java.lang.Object r7 = r0.f191144c
            java.lang.Object r8 = r0.f191143b
            p5462h.C69714l.m101134b(r10)     // Catch:{ dx -> 0x002e }
            goto L_0x0067
        L_0x002e:
            r8 = move-exception
            goto L_0x006b
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            p5462h.C69714l.m101134b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0042
            return r3
        L_0x0042:
            h.f.b.ae r10 = new h.f.b.ae
            r10.<init>()
            r0.f191143b = r9     // Catch:{ dx -> 0x0068 }
            r0.f191144c = r10     // Catch:{ dx -> 0x0068 }
            r0.f191142a = r7     // Catch:{ dx -> 0x0068 }
            r0.f191146e = r4     // Catch:{ dx -> 0x0068 }
            kotlinx.coroutines.dy r2 = new kotlinx.coroutines.dy     // Catch:{ dx -> 0x0068 }
            r2.<init>(r7, r0)     // Catch:{ dx -> 0x0068 }
            r10.f186027a = r2     // Catch:{ dx -> 0x0068 }
            java.lang.Object r7 = m104931c(r2, r9)     // Catch:{ dx -> 0x0068 }
            h.c.a.a r8 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ dx -> 0x0068 }
            if (r7 != r8) goto L_0x0063
            java.lang.String r8 = "frame"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r8)     // Catch:{ dx -> 0x0068 }
        L_0x0063:
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r10 = r7
        L_0x0067:
            return r10
        L_0x0068:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L_0x006b:
            kotlinx.coroutines.cp r9 = r8.f191140a
            h.f.b.ae r7 = (p5462h.p5473f.p5475b.C69648ae) r7
            java.lang.Object r7 = r7.f186027a
            if (r9 != r7) goto L_0x0074
            return r3
        L_0x0074:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71745ea.m104930b(long, h.f.a.p, h.c.g):java.lang.Object");
    }
}
