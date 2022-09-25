package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.p5579e.C71707ao;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.aq */
/* compiled from: PG */
public final /* synthetic */ class C71486aq {
    /* renamed from: b */
    public static final C71587n m104308b(C71587n nVar, C69631q qVar) {
        return new C71479aj(nVar, qVar);
    }

    /* renamed from: c */
    public static final C71587n m104309c(C71587n nVar, long j, C69630p pVar) {
        C69664n.m101061g(nVar, "<this>");
        C71483an anVar = new C71483an(j, pVar, (C69577g) null);
        C69664n.m101061g(nVar, "<this>");
        return new C71485ap(nVar, anVar);
    }

    /* renamed from: d */
    private static final boolean m104310d(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        if (C71600ba.f191037b) {
            th2 = C71707ao.m104842c(th2);
        }
        if (C71600ba.f191037b) {
            th = C71707ao.m104842c(th);
        }
        return C69664n.m101066l(th2, th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104307a(kotlinx.coroutines.p5574b.C71587n r4, kotlinx.coroutines.p5574b.C71588o r5, p5462h.p5466c.C69577g r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.p5574b.C71480ak
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.b.ak r0 = (kotlinx.coroutines.p5574b.C71480ak) r0
            int r1 = r0.f190758c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f190758c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.b.ak r0 = new kotlinx.coroutines.b.ak
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f190757b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190758c
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r4 = r0.f190756a
            p5462h.C69714l.m101134b(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x004b
        L_0x0029:
            r5 = move-exception
            goto L_0x0050
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            h.f.b.ae r6 = new h.f.b.ae
            r6.<init>()
            kotlinx.coroutines.b.am r2 = new kotlinx.coroutines.b.am     // Catch:{ all -> 0x004d }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x004d }
            r0.f190756a = r6     // Catch:{ all -> 0x004d }
            r0.f190758c = r3     // Catch:{ all -> 0x004d }
            java.lang.Object r4 = r4.mo38165mp(r2, r0)     // Catch:{ all -> 0x004d }
            if (r4 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r4 = 0
            return r4
        L_0x004d:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L_0x0050:
            h.f.b.ae r4 = (p5462h.p5473f.p5475b.C69648ae) r4
            java.lang.Object r4 = r4.f186027a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = m104310d(r5, r4)
            if (r6 != 0) goto L_0x008b
            h.c.o r6 = r0.f185974s
            p5462h.p5473f.p5475b.C69664n.m101058d(r6)
            kotlinx.coroutines.co r0 = kotlinx.coroutines.C71643cp.f191083c
            h.c.l r6 = r6.get(r0)
            kotlinx.coroutines.cp r6 = (kotlinx.coroutines.C71643cp) r6
            if (r6 == 0) goto L_0x007c
            boolean r0 = r6.mo62868mk()
            if (r0 != 0) goto L_0x0072
            goto L_0x007c
        L_0x0072:
            java.util.concurrent.CancellationException r6 = r6.mo62870p()
            boolean r6 = m104310d(r5, r6)
            if (r6 != 0) goto L_0x008b
        L_0x007c:
            if (r4 != 0) goto L_0x007f
            return r5
        L_0x007f:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x0087
            p5462h.C69465a.m100953a(r4, r5)
            throw r4
        L_0x0087:
            p5462h.C69465a.m100953a(r5, r4)
            throw r5
        L_0x008b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71486aq.m104307a(kotlinx.coroutines.b.n, kotlinx.coroutines.b.o, h.c.g):java.lang.Object");
    }
}
