package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.e */
/* compiled from: PG */
public final class C138226e {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.appsearch.a.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.appsearch.a.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.appsearch.a.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.appsearch.a.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: androidx.appsearch.a.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: androidx.appsearch.a.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: androidx.appsearch.a.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: androidx.appsearch.a.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc A[Catch:{ all -> 0x024b }, LOOP:0: B:33:0x00c6->B:35:0x00cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0111 A[Catch:{ all -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0149 A[Catch:{ all -> 0x024b }, LOOP:1: B:43:0x0143->B:45:0x0149, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015d A[Catch:{ all -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ee A[Catch:{ all -> 0x024b }, LOOP:2: B:55:0x01e8->B:57:0x01ee, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x022f A[SYNTHETIC, Splitter:B:66:0x022f] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114206a(android.content.Context r22, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r r23, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138240s r24, long r25, p5462h.p5466c.C69577g r27) {
        /*
            r21 = this;
            r0 = r23
            r1 = r27
            boolean r2 = r1 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138225d
            if (r2 == 0) goto L_0x0019
            r2 = r1
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.d r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138225d) r2
            int r3 = r2.f376087g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.f376087g = r3
            r3 = r21
            goto L_0x0020
        L_0x0019:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.d r2 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.d
            r3 = r21
            r2.<init>(r3, r1)
        L_0x0020:
            java.lang.Object r1 = r2.f376085e
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r2.f376087g
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x006d
            if (r5 == r9) goto L_0x005c
            if (r5 == r7) goto L_0x0047
            if (r5 != r6) goto L_0x003f
            java.lang.Object r0 = r2.f376081a
            r2 = r0
            androidx.appsearch.a.s r2 = (androidx.appsearch.p047a.C0854s) r2
            p5462h.C69714l.m101134b(r1)     // Catch:{ all -> 0x003c }
            goto L_0x0226
        L_0x003c:
            r0 = move-exception
            goto L_0x024d
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            long r10 = r2.f376084d
            java.lang.Object r5 = r2.f376083c
            java.lang.Object r0 = r2.f376082b
            java.lang.Object r7 = r2.f376081a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r7 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r7
            p5462h.C69714l.m101134b(r1)     // Catch:{ all -> 0x0058 }
            r1 = r5
        L_0x0055:
            r11 = r10
            goto L_0x019b
        L_0x0058:
            r0 = move-exception
            r2 = r5
            goto L_0x024d
        L_0x005c:
            long r10 = r2.f376084d
            java.lang.Object r0 = r2.f376082b
            java.lang.Object r5 = r2.f376081a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r5
            p5462h.C69714l.m101134b(r1)
            r20 = r5
            r5 = r0
            r0 = r20
            goto L_0x0099
        L_0x006d:
            p5462h.C69714l.m101134b(r1)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.e r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138227f.f376088a
            com.google.protobuf.cq r1 = r0.f376331d
            r1.size()
            r22.getClass()
            java.util.concurrent.Executor r1 = androidx.appsearch.p050d.C0876f.f2948a
            androidx.appsearch.d.e r5 = new androidx.appsearch.d.e
            r10 = r22
            r5.<init>(r10, r1)
            com.google.common.util.concurrent.cx r1 = androidx.appsearch.p050d.C0876f.m2759a(r5)
            r2.f376081a = r0
            r5 = r24
            r2.f376082b = r5
            r10 = r25
            r2.f376084d = r10
            r2.f376087g = r9
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r2)
            if (r1 == r4) goto L_0x0253
        L_0x0099:
            androidx.appsearch.a.s r1 = (androidx.appsearch.p047a.C0854s) r1
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.e r12 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138227f.f376088a
            androidx.appsearch.a.ae r12 = new androidx.appsearch.a.ae     // Catch:{ all -> 0x024b }
            r12.<init>()     // Catch:{ all -> 0x024b }
            java.lang.Class[] r13 = new java.lang.Class[r9]     // Catch:{ all -> 0x024b }
            java.lang.Class<com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.OneSearchAppSearchData> r14 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.OneSearchAppSearchData.class
            r13[r8] = r14     // Catch:{ all -> 0x024b }
            r12.mo3383a()     // Catch:{ all -> 0x024b }
            java.util.List r13 = java.util.Arrays.asList(r13)     // Catch:{ all -> 0x024b }
            r13.getClass()
            r12.mo3383a()     // Catch:{ all -> 0x024b }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x024b }
            int r15 = r13.size()     // Catch:{ all -> 0x024b }
            r14.<init>(r15)     // Catch:{ all -> 0x024b }
            androidx.appsearch.a.u r15 = androidx.appsearch.p047a.C0856u.m2718b()     // Catch:{ all -> 0x024b }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x024b }
        L_0x00c6:
            boolean r16 = r13.hasNext()     // Catch:{ all -> 0x024b }
            if (r16 == 0) goto L_0x00e1
            java.lang.Object r16 = r13.next()     // Catch:{ all -> 0x024b }
            r6 = r16
            java.lang.Class r6 = (java.lang.Class) r6     // Catch:{ all -> 0x024b }
            androidx.appsearch.a.t r6 = r15.mo3429a(r6)     // Catch:{ all -> 0x024b }
            androidx.appsearch.a.r r6 = r6.getSchema()     // Catch:{ all -> 0x024b }
            r14.add(r6)     // Catch:{ all -> 0x024b }
            r6 = 3
            goto L_0x00c6
        L_0x00e1:
            r12.mo3383a()     // Catch:{ all -> 0x024b }
            androidx.c.i r6 = r12.f2794a     // Catch:{ all -> 0x024b }
            r6.addAll(r14)     // Catch:{ all -> 0x024b }
            java.lang.Class<com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.OneSearchAppSearchData> r6 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.OneSearchAppSearchData.class
            androidx.appsearch.a.z r13 = new androidx.appsearch.a.z     // Catch:{ all -> 0x024b }
            byte[] r14 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138227f.f376090c     // Catch:{ all -> 0x024b }
            r13.<init>(r14)     // Catch:{ all -> 0x024b }
            r12.mo3383a()     // Catch:{ all -> 0x024b }
            androidx.appsearch.a.u r14 = androidx.appsearch.p047a.C0856u.m2718b()     // Catch:{ all -> 0x024b }
            androidx.appsearch.a.t r6 = r14.mo3429a(r6)     // Catch:{ all -> 0x024b }
            java.lang.String r6 = r6.getSchemaName()     // Catch:{ all -> 0x024b }
            r6.getClass()
            r12.mo3383a()     // Catch:{ all -> 0x024b }
            androidx.c.g r14 = r12.f2796c     // Catch:{ all -> 0x024b }
            java.lang.Object r14 = r14.get(r6)     // Catch:{ all -> 0x024b }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x024b }
            if (r14 != 0) goto L_0x0116
            androidx.c.i r14 = new androidx.c.i     // Catch:{ all -> 0x024b }
            r14.<init>((int) r8)     // Catch:{ all -> 0x024b }
        L_0x0116:
            r14.add(r13)     // Catch:{ all -> 0x024b }
            androidx.c.g r13 = r12.f2796c     // Catch:{ all -> 0x024b }
            r13.put(r6, r14)     // Catch:{ all -> 0x024b }
            r12.mo3383a()     // Catch:{ all -> 0x024b }
            r12.f2799f = r9     // Catch:{ all -> 0x024b }
            androidx.c.i r6 = new androidx.c.i     // Catch:{ all -> 0x024b }
            androidx.c.i r13 = r12.f2795b     // Catch:{ all -> 0x024b }
            r6.<init>((androidx.p060c.C0979i) r13)     // Catch:{ all -> 0x024b }
            androidx.c.g r13 = r12.f2796c     // Catch:{ all -> 0x024b }
            java.util.Set r13 = r13.keySet()     // Catch:{ all -> 0x024b }
            r6.addAll(r13)     // Catch:{ all -> 0x024b }
            androidx.c.g r13 = r12.f2797d     // Catch:{ all -> 0x024b }
            java.util.Set r13 = r13.keySet()     // Catch:{ all -> 0x024b }
            r6.addAll(r13)     // Catch:{ all -> 0x024b }
            androidx.c.i r13 = r12.f2794a     // Catch:{ all -> 0x024b }
            androidx.c.h r14 = new androidx.c.h     // Catch:{ all -> 0x024b }
            r14.<init>(r13)     // Catch:{ all -> 0x024b }
        L_0x0143:
            boolean r13 = r14.hasNext()     // Catch:{ all -> 0x024b }
            if (r13 == 0) goto L_0x0157
            java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x024b }
            androidx.appsearch.a.r r13 = (androidx.appsearch.p047a.C0853r) r13     // Catch:{ all -> 0x024b }
            java.lang.String r13 = r13.mo3417a()     // Catch:{ all -> 0x024b }
            r6.remove(r13)     // Catch:{ all -> 0x024b }
            goto L_0x0143
        L_0x0157:
            boolean r13 = r6.isEmpty()     // Catch:{ all -> 0x024b }
            if (r13 == 0) goto L_0x022f
            androidx.c.i r6 = r12.f2794a     // Catch:{ all -> 0x024b }
            r6.isEmpty()     // Catch:{ all -> 0x024b }
            r12.f2800g = r9     // Catch:{ all -> 0x024b }
            androidx.appsearch.a.af r6 = new androidx.appsearch.a.af     // Catch:{ all -> 0x024b }
            androidx.c.i r14 = r12.f2794a     // Catch:{ all -> 0x024b }
            androidx.c.i r15 = r12.f2795b     // Catch:{ all -> 0x024b }
            androidx.c.g r13 = r12.f2796c     // Catch:{ all -> 0x024b }
            androidx.c.g r8 = r12.f2797d     // Catch:{ all -> 0x024b }
            androidx.c.g r9 = r12.f2798e     // Catch:{ all -> 0x024b }
            boolean r12 = r12.f2799f     // Catch:{ all -> 0x024b }
            r16 = r13
            r13 = r6
            r17 = r8
            r18 = r9
            r19 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x024b }
            com.google.common.util.concurrent.cx r6 = r1.mo3423b(r6)     // Catch:{ all -> 0x024b }
            java.lang.String r8 = "appSearchSession\n       …     .build()\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)     // Catch:{ all -> 0x024b }
            r2.f376081a = r0     // Catch:{ all -> 0x024b }
            r2.f376082b = r5     // Catch:{ all -> 0x024b }
            r2.f376083c = r1     // Catch:{ all -> 0x024b }
            r2.f376084d = r10     // Catch:{ all -> 0x024b }
            r2.f376087g = r7     // Catch:{ all -> 0x024b }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r2)     // Catch:{ all -> 0x024b }
            if (r6 == r4) goto L_0x022e
            r7 = r0
            r0 = r5
            goto L_0x0055
        L_0x019b:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.e r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138227f.f376088a     // Catch:{ all -> 0x024b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.OneSearchAppSearchData r5 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.OneSearchAppSearchData     // Catch:{ all -> 0x024b }
            java.lang.String r9 = "default"
            java.lang.String r10 = "zp"
            j$.time.Duration r6 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138227f.f376089b     // Catch:{ all -> 0x024b }
            long r13 = r6.toMillis()     // Catch:{ all -> 0x024b }
            byte[] r15 = r7.toByteArray()     // Catch:{ all -> 0x024b }
            java.lang.String r6 = "oneSearchResponse.toByteArray()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r6)     // Catch:{ all -> 0x024b }
            com.google.protobuf.c r0 = (com.google.protobuf.C62947c) r0     // Catch:{ all -> 0x024b }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x024b }
            java.lang.String r6 = "oneSearchCacheEntry.toByteArray()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)     // Catch:{ all -> 0x024b }
            r8 = r5
            r16 = r0
            r8.<init>(r9, r10, r11, r13, r15, r16)     // Catch:{ all -> 0x024b }
            androidx.appsearch.a.ac r0 = new androidx.appsearch.a.ac     // Catch:{ all -> 0x024b }
            r0.<init>()     // Catch:{ all -> 0x024b }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x024b }
            r6 = 0
            r7[r6] = r5     // Catch:{ all -> 0x024b }
            r0.mo3382a()     // Catch:{ all -> 0x024b }
            java.util.List r5 = java.util.Arrays.asList(r7)     // Catch:{ all -> 0x024b }
            r5.getClass()
            r0.mo3382a()     // Catch:{ all -> 0x024b }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x024b }
            int r7 = r5.size()     // Catch:{ all -> 0x024b }
            r6.<init>(r7)     // Catch:{ all -> 0x024b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x024b }
        L_0x01e8:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x024b }
            if (r7 == 0) goto L_0x01fa
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x024b }
            androidx.appsearch.a.w r7 = androidx.appsearch.p047a.C0858w.m2731d(r7)     // Catch:{ all -> 0x024b }
            r6.add(r7)     // Catch:{ all -> 0x024b }
            goto L_0x01e8
        L_0x01fa:
            r0.mo3382a()     // Catch:{ all -> 0x024b }
            java.util.ArrayList r5 = r0.f2791a     // Catch:{ all -> 0x024b }
            r5.addAll(r6)     // Catch:{ all -> 0x024b }
            r5 = 1
            r0.f2792b = r5     // Catch:{ all -> 0x024b }
            androidx.appsearch.a.ad r5 = new androidx.appsearch.a.ad     // Catch:{ all -> 0x024b }
            java.util.ArrayList r0 = r0.f2791a     // Catch:{ all -> 0x024b }
            r5.<init>(r0)     // Catch:{ all -> 0x024b }
            com.google.common.util.concurrent.cx r0 = r1.mo3422a(r5)     // Catch:{ all -> 0x024b }
            java.lang.String r5 = "appSearchSession\n       …oPrefixDocument).build())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r5)     // Catch:{ all -> 0x024b }
            r2.f376081a = r1     // Catch:{ all -> 0x024b }
            r5 = 0
            r2.f376082b = r5     // Catch:{ all -> 0x024b }
            r2.f376083c = r5     // Catch:{ all -> 0x024b }
            r5 = 3
            r2.f376087g = r5     // Catch:{ all -> 0x024b }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r2)     // Catch:{ all -> 0x024b }
            if (r0 == r4) goto L_0x022e
            r2 = r1
        L_0x0226:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.e r0 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138227f.f376088a     // Catch:{ all -> 0x003c }
            r2.close()
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x022e:
            return r4
        L_0x022f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x024b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x024b }
            r2.<init>()     // Catch:{ all -> 0x024b }
            java.lang.String r4 = "Schema types "
            r2.append(r4)     // Catch:{ all -> 0x024b }
            r2.append(r6)     // Catch:{ all -> 0x024b }
            java.lang.String r4 = " referenced, but were not added."
            r2.append(r4)     // Catch:{ all -> 0x024b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x024b }
            r0.<init>(r2)     // Catch:{ all -> 0x024b }
            throw r0     // Catch:{ all -> 0x024b }
        L_0x024b:
            r0 = move-exception
            r2 = r1
        L_0x024d:
            r2.close()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.e r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138227f.f376088a
            throw r0
        L_0x0253:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138226e.mo114206a(android.content.Context, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s, long, h.c.g):java.lang.Object");
    }
}
