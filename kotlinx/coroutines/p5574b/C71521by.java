package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.by */
/* compiled from: PG */
public final /* synthetic */ class C71521by {
    /* renamed from: a */
    public static final C71553dc m104363a(C71547cx cxVar) {
        C69664n.m101061g(cxVar, "<this>");
        return new C71549cz(cxVar);
    }

    /* renamed from: b */
    public static final C71553dc m104364b(C71587n nVar, C71422aw awVar, C71562dl dlVar, int i) {
        C69664n.m101061g(nVar, "<this>");
        C69664n.m101061g(awVar, "scope");
        C69664n.m101061g(dlVar, "started");
        C71560dj e = m104367e(nVar, i);
        C71547cx c = C71557dg.m104445c(i, e.f190971b, e.f190972c);
        m104368f(awVar, e.f190973d, e.f190970a, c, dlVar, C71557dg.f190963a);
        return new C71549cz(c);
    }

    /* renamed from: c */
    public static final C71571du m104365c(C71548cy cyVar) {
        C69664n.m101061g(cyVar, "<this>");
        return new C71551da(cyVar);
    }

    /* renamed from: d */
    public static final C71571du m104366d(C71587n nVar, C71422aw awVar, C71562dl dlVar, Object obj) {
        C69664n.m101061g(nVar, "<this>");
        C69664n.m101061g(awVar, "scope");
        C69664n.m101061g(dlVar, "started");
        C71560dj e = m104367e(nVar, 1);
        C71548cy b = C71574dx.m104480b(obj);
        m104368f(awVar, e.f190973d, e.f190970a, b, dlVar, obj);
        return new C71551da(b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r1.f190677b == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r1 = (kotlinx.coroutines.p5574b.p5575a.C71450g) r6;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final kotlinx.coroutines.p5574b.C71560dj m104367e(kotlinx.coroutines.p5574b.C71587n r6, int r7) {
        /*
            boolean r0 = kotlinx.coroutines.C71600ba.f191036a
            int r0 = kotlinx.coroutines.p5573a.C71389v.f190596Zv
            int r0 = kotlinx.coroutines.p5573a.C71388u.f190595a
            if (r7 < r0) goto L_0x0009
            r0 = r7
        L_0x0009:
            int r0 = r0 - r7
            boolean r1 = r6 instanceof kotlinx.coroutines.p5574b.p5575a.C71450g
            if (r1 == 0) goto L_0x003e
            r1 = r6
            kotlinx.coroutines.b.a.g r1 = (kotlinx.coroutines.p5574b.p5575a.C71450g) r1
            kotlinx.coroutines.b.n r2 = r1.mo62797f()
            if (r2 == 0) goto L_0x003e
            kotlinx.coroutines.b.dj r6 = new kotlinx.coroutines.b.dj
            int r3 = r1.f190677b
            r4 = -3
            if (r3 == r4) goto L_0x0025
            r4 = -2
            if (r3 == r4) goto L_0x0025
            if (r3 == 0) goto L_0x0025
            r0 = r3
            goto L_0x0036
        L_0x0025:
            kotlinx.coroutines.a.t r3 = r1.f190678c
            kotlinx.coroutines.a.t r4 = kotlinx.coroutines.p5573a.C71387t.SUSPEND
            r5 = 0
            if (r3 != r4) goto L_0x0031
            int r7 = r1.f190677b
            if (r7 != 0) goto L_0x0036
            goto L_0x0035
        L_0x0031:
            if (r7 != 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            kotlinx.coroutines.a.t r7 = r1.f190678c
            h.c.o r1 = r1.f190676a
            r6.<init>(r2, r0, r7, r1)
            return r6
        L_0x003e:
            kotlinx.coroutines.b.dj r7 = new kotlinx.coroutines.b.dj
            kotlinx.coroutines.a.t r1 = kotlinx.coroutines.p5573a.C71387t.SUSPEND
            h.c.p r2 = p5462h.p5466c.C69586p.f185991a
            r7.<init>(r6, r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71521by.m104367e(kotlinx.coroutines.b.n, int):kotlinx.coroutines.b.dj");
    }

    /* renamed from: f */
    private static final void m104368f(C71422aw awVar, C69585o oVar, C71587n nVar, C71547cx cxVar, C71562dl dlVar, Object obj) {
        int i = C71562dl.f190976a;
        C71803m.m105041b(awVar, oVar, C69664n.m101066l(dlVar, C71561dk.f190974a) ? C71424ay.DEFAULT : C71424ay.UNDISPATCHED, new C71520bx(dlVar, nVar, cxVar, obj, (C69577g) null));
    }
}
