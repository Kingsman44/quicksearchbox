package com.google.android.libraries.web.base.p3348b.p3351c;

import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.web.base.b.c.b */
/* compiled from: PG */
public final class C43246b {

    /* renamed from: a */
    private final ConcurrentHashMap f113014a = new ConcurrentHashMap();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.android.libraries.web.base.b.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.google.android.libraries.web.base.b.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.google.android.libraries.web.base.b.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: com.google.android.libraries.web.base.b.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: com.google.android.libraries.web.base.b.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: com.google.android.libraries.web.base.b.c.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r5 = kotlinx.coroutines.p5574b.C71574dx.m104480b(new java.lang.Integer(0));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46329a(java.lang.Iterable r8, p5462h.p5473f.p5474a.C69626l r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.android.libraries.web.base.p3348b.p3351c.C43245a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.web.base.b.c.a r0 = (com.google.android.libraries.web.base.p3348b.p3351c.C43245a) r0
            int r1 = r0.f113013e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f113013e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.base.b.c.a r0 = new com.google.android.libraries.web.base.b.c.a
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f113011c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f113013e
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r8 = r0.f113010b
            java.lang.Object r9 = r0.f113009a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x002b }
            goto L_0x008a
        L_0x002b:
            r10 = move-exception
            goto L_0x00c8
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            p5462h.C69714l.m101134b(r10)
            java.util.Iterator r10 = r8.iterator()
        L_0x003d:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x007d
            java.lang.Object r2 = r10.next()
            com.google.android.libraries.web.base.v r2 = (com.google.android.libraries.web.base.C43271v) r2
            j$.util.concurrent.ConcurrentHashMap r4 = r7.f113014a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != 0) goto L_0x0063
            java.lang.Integer r5 = new java.lang.Integer
            r6 = 0
            r5.<init>(r6)
            kotlinx.coroutines.b.cy r5 = kotlinx.coroutines.p5574b.C71574dx.m104480b(r5)
            java.lang.Object r2 = r4.putIfAbsent(r2, r5)
            if (r2 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r5 = r2
        L_0x0063:
            kotlinx.coroutines.b.cy r5 = (kotlinx.coroutines.p5574b.C71548cy) r5
        L_0x0065:
            java.lang.Object r2 = r5.mo62784e()
            r4 = r2
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Integer r6 = new java.lang.Integer
            int r4 = r4 + r3
            r6.<init>(r4)
            boolean r2 = r5.mo62808g(r2, r6)
            if (r2 == 0) goto L_0x0065
            goto L_0x003d
        L_0x007d:
            r0.f113009a = r7     // Catch:{ all -> 0x00c5 }
            r0.f113010b = r8     // Catch:{ all -> 0x00c5 }
            r0.f113013e = r3     // Catch:{ all -> 0x00c5 }
            java.lang.Object r9 = r9.mo5761a(r0)     // Catch:{ all -> 0x00c5 }
            if (r9 == r1) goto L_0x00c4
            r9 = r7
        L_0x008a:
            java.util.Iterator r8 = r8.iterator()
        L_0x008e:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00c1
            java.lang.Object r10 = r8.next()
            com.google.android.libraries.web.base.v r10 = (com.google.android.libraries.web.base.C43271v) r10
            r0 = r9
            com.google.android.libraries.web.base.b.c.b r0 = (com.google.android.libraries.web.base.p3348b.p3351c.C43246b) r0
            j$.util.concurrent.ConcurrentHashMap r0 = r0.f113014a
            java.lang.Object r10 = r0.get(r10)
            p5462h.p5473f.p5475b.C69664n.m101058d(r10)
            kotlinx.coroutines.b.cy r10 = (kotlinx.coroutines.p5574b.C71548cy) r10
        L_0x00a8:
            java.lang.Object r0 = r10.mo62784e()
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r2 = new java.lang.Integer
            int r1 = r1 + -1
            r2.<init>(r1)
            boolean r0 = r10.mo62808g(r0, r2)
            if (r0 == 0) goto L_0x00a8
            goto L_0x008e
        L_0x00c1:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x00c4:
            return r1
        L_0x00c5:
            r9 = move-exception
            r10 = r9
            r9 = r7
        L_0x00c8:
            java.util.Iterator r8 = r8.iterator()
        L_0x00cc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r8.next()
            com.google.android.libraries.web.base.v r0 = (com.google.android.libraries.web.base.C43271v) r0
            r1 = r9
            com.google.android.libraries.web.base.b.c.b r1 = (com.google.android.libraries.web.base.p3348b.p3351c.C43246b) r1
            j$.util.concurrent.ConcurrentHashMap r1 = r1.f113014a
            java.lang.Object r0 = r1.get(r0)
            p5462h.p5473f.p5475b.C69664n.m101058d(r0)
            kotlinx.coroutines.b.cy r0 = (kotlinx.coroutines.p5574b.C71548cy) r0
        L_0x00e6:
            java.lang.Object r1 = r0.mo62784e()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Integer r3 = new java.lang.Integer
            int r2 = r2 + -1
            r3.<init>(r2)
            boolean r1 = r0.mo62808g(r1, r3)
            if (r1 == 0) goto L_0x00e6
            goto L_0x00cc
        L_0x00ff:
            goto L_0x0101
        L_0x0100:
            throw r10
        L_0x0101:
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.base.p3348b.p3351c.C43246b.mo46329a(java.lang.Iterable, h.f.a.l, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = kotlinx.coroutines.p5574b.C71574dx.m104480b(0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.p5574b.C71571du mo46330b(com.google.android.libraries.web.base.C43271v r3) {
        /*
            r2 = this;
            java.lang.String r0 = "webImplementation"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = r2.f113014a
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L_0x001e
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlinx.coroutines.b.cy r1 = kotlinx.coroutines.p5574b.C71574dx.m104480b(r1)
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            if (r3 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r3
        L_0x001e:
            kotlinx.coroutines.b.du r1 = (kotlinx.coroutines.p5574b.C71571du) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.base.p3348b.p3351c.C43246b.mo46330b(com.google.android.libraries.web.base.v):kotlinx.coroutines.b.du");
    }
}
