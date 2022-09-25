package kotlinx.coroutines.p5574b;

import p5462h.p5473f.p5474a.C69631q;

/* renamed from: kotlinx.coroutines.b.ae */
/* compiled from: PG */
public final class C71474ae implements C71587n {

    /* renamed from: a */
    final /* synthetic */ C71587n f190739a;

    /* renamed from: b */
    final /* synthetic */ C69631q f190740b;

    public C71474ae(C71587n nVar, C69631q qVar) {
        this.f190739a = nVar;
        this.f190740b = qVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: kotlinx.coroutines.b.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: mp */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38165mp(kotlinx.coroutines.p5574b.C71588o r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.p5574b.C71473ad
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.b.ad r0 = (kotlinx.coroutines.p5574b.C71473ad) r0
            int r1 = r0.f190735b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f190735b = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.b.ad r0 = new kotlinx.coroutines.b.ad
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f190734a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190735b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r9 = r0.f190737d
            kotlinx.coroutines.b.a.ah r9 = (kotlinx.coroutines.p5574b.p5575a.C71436ah) r9
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x0032 }
            goto L_0x007b
        L_0x0032:
            r10 = move-exception
            goto L_0x0086
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            java.lang.Object r9 = r0.f190737d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            p5462h.C69714l.m101134b(r10)
            goto L_0x00a1
        L_0x0044:
            java.lang.Object r9 = r0.f190738e
            java.lang.Object r2 = r0.f190737d
            kotlinx.coroutines.b.ae r2 = (kotlinx.coroutines.p5574b.C71474ae) r2
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x004e }
            goto L_0x0062
        L_0x004e:
            r9 = move-exception
            goto L_0x008d
        L_0x0050:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.b.n r10 = r8.f190739a     // Catch:{ all -> 0x008b }
            r0.f190737d = r8     // Catch:{ all -> 0x008b }
            r0.f190738e = r9     // Catch:{ all -> 0x008b }
            r0.f190735b = r5     // Catch:{ all -> 0x008b }
            java.lang.Object r10 = r10.mo38165mp(r9, r0)     // Catch:{ all -> 0x008b }
            if (r10 == r1) goto L_0x008a
            r2 = r8
        L_0x0062:
            kotlinx.coroutines.b.a.ah r10 = new kotlinx.coroutines.b.a.ah
            h.c.o r4 = r0.f185974s
            p5462h.p5473f.p5475b.C69664n.m101058d(r4)
            r10.<init>(r9, r4)
            h.f.a.q r9 = r2.f190740b     // Catch:{ all -> 0x0082 }
            r0.f190737d = r10     // Catch:{ all -> 0x0082 }
            r0.f190738e = r6     // Catch:{ all -> 0x0082 }
            r0.f190735b = r3     // Catch:{ all -> 0x0082 }
            java.lang.Object r9 = r9.mo17419a(r10, r6, r0)     // Catch:{ all -> 0x0082 }
            if (r9 == r1) goto L_0x0081
            r9 = r10
        L_0x007b:
            r9.mo61337i()
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x0081:
            return r1
        L_0x0082:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0086:
            r9.mo61337i()
            throw r10
        L_0x008a:
            return r1
        L_0x008b:
            r9 = move-exception
            r2 = r8
        L_0x008d:
            kotlinx.coroutines.b.ea r10 = new kotlinx.coroutines.b.ea
            r10.<init>(r9)
            h.f.a.q r2 = r2.f190740b
            r0.f190737d = r9
            r0.f190738e = r6
            r0.f190735b = r4
            java.lang.Object r10 = kotlinx.coroutines.p5574b.C71477ah.m104294a(r10, r2, r9, r0)
            if (r10 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71474ae.mo38165mp(kotlinx.coroutines.b.o, h.c.g):java.lang.Object");
    }
}
