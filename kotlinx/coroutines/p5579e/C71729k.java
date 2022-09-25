package kotlinx.coroutines.p5579e;

/* renamed from: kotlinx.coroutines.e.k */
/* compiled from: PG */
public final class C71729k {

    /* renamed from: a */
    public static final C71708ap f191207a = new C71708ap("UNDEFINED");

    /* renamed from: b */
    public static final C71708ap f191208b = new C71708ap("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        if (r8.mo62990T() != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        if (r8.mo62990T() != false) goto L_0x00a0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104890a(p5462h.p5466c.C69577g r6, java.lang.Object r7, p5462h.p5473f.p5474a.C69626l r8) {
        /*
            java.lang.String r0 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            boolean r0 = r6 instanceof kotlinx.coroutines.p5579e.C71728j
            if (r0 == 0) goto L_0x00b1
            kotlinx.coroutines.e.j r6 = (kotlinx.coroutines.p5579e.C71728j) r6
            java.lang.Object r8 = kotlinx.coroutines.C71400ag.m104165b(r7, r8)
            kotlinx.coroutines.ao r0 = r6.f191202a
            h.c.o r1 = r6.mo61340lY()
            boolean r0 = r0.mo62768f(r1)
            r1 = 1
            if (r0 == 0) goto L_0x002a
            r6.f191204c = r8
            r6.f191046f = r1
            kotlinx.coroutines.ao r7 = r6.f191202a
            h.c.o r8 = r6.mo61340lY()
            r7.mo62766d(r8, r6)
            return
        L_0x002a:
            boolean r0 = kotlinx.coroutines.C71600ba.f191036a
            java.lang.ThreadLocal r0 = kotlinx.coroutines.C71687dw.f191139a
            kotlinx.coroutines.bt r0 = kotlinx.coroutines.C71687dw.m104785a()
            boolean r2 = r0.mo62847o()
            if (r2 == 0) goto L_0x0040
            r6.f191204c = r8
            r6.f191046f = r1
            r0.mo62845m(r6)
            return
        L_0x0040:
            r0.mo62846n(r1)
            r2 = 0
            h.c.o r3 = r6.mo61340lY()     // Catch:{ all -> 0x00a4 }
            kotlinx.coroutines.co r4 = kotlinx.coroutines.C71643cp.f191083c     // Catch:{ all -> 0x00a4 }
            h.c.l r3 = r3.get(r4)     // Catch:{ all -> 0x00a4 }
            kotlinx.coroutines.cp r3 = (kotlinx.coroutines.C71643cp) r3     // Catch:{ all -> 0x00a4 }
            if (r3 == 0) goto L_0x0067
            boolean r4 = r3.mo62867mj()     // Catch:{ all -> 0x00a4 }
            if (r4 != 0) goto L_0x0067
            java.util.concurrent.CancellationException r7 = r3.mo62870p()     // Catch:{ all -> 0x00a4 }
            r6.mo62837w(r8, r7)     // Catch:{ all -> 0x00a4 }
            java.lang.Object r7 = p5462h.C69714l.m101133a(r7)     // Catch:{ all -> 0x00a4 }
            r6.mo61338mb(r7)     // Catch:{ all -> 0x00a4 }
            goto L_0x008d
        L_0x0067:
            h.c.g r8 = r6.f191203b     // Catch:{ all -> 0x00a4 }
            java.lang.Object r3 = r6.f191205d     // Catch:{ all -> 0x00a4 }
            h.c.o r4 = r8.mo61340lY()     // Catch:{ all -> 0x00a4 }
            java.lang.Object r3 = kotlinx.coroutines.p5579e.C71715aw.m104856b(r4, r3)     // Catch:{ all -> 0x00a4 }
            kotlinx.coroutines.e.ap r5 = kotlinx.coroutines.p5579e.C71715aw.f191181a     // Catch:{ all -> 0x00a4 }
            if (r3 == r5) goto L_0x007c
            kotlinx.coroutines.ec r8 = kotlinx.coroutines.C71405al.m104172c(r8, r4, r3)     // Catch:{ all -> 0x00a4 }
            goto L_0x007d
        L_0x007c:
            r8 = r2
        L_0x007d:
            h.c.g r5 = r6.f191203b     // Catch:{ all -> 0x0097 }
            r5.mo61338mb(r7)     // Catch:{ all -> 0x0097 }
            if (r8 == 0) goto L_0x008a
            boolean r7 = r8.mo62990T()     // Catch:{ all -> 0x00a4 }
            if (r7 == 0) goto L_0x008d
        L_0x008a:
            kotlinx.coroutines.p5579e.C71715aw.m104857c(r4, r3)     // Catch:{ all -> 0x00a4 }
        L_0x008d:
            boolean r7 = r0.mo62849q()     // Catch:{ all -> 0x00a4 }
            if (r7 != 0) goto L_0x008d
            r0.mo62844l(r1)
            return
        L_0x0097:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a0
            boolean r8 = r8.mo62990T()     // Catch:{ all -> 0x00a4 }
            if (r8 == 0) goto L_0x00a3
        L_0x00a0:
            kotlinx.coroutines.p5579e.C71715aw.m104857c(r4, r3)     // Catch:{ all -> 0x00a4 }
        L_0x00a3:
            throw r7     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r7 = move-exception
            r6.mo62831C(r7, r2)     // Catch:{ all -> 0x00ac }
            r0.mo62844l(r1)
            return
        L_0x00ac:
            r6 = move-exception
            r0.mo62844l(r1)
            throw r6
        L_0x00b1:
            r6.mo61338mb(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5579e.C71729k.m104890a(h.c.g, java.lang.Object, h.f.a.l):void");
    }
}
