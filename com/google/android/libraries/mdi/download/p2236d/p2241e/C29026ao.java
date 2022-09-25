package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.e.ao */
/* compiled from: PG */
public final /* synthetic */ class C29026ao implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29034aw f78791a;

    /* renamed from: b */
    public final /* synthetic */ List f78792b;

    /* renamed from: c */
    public final /* synthetic */ int f78793c;

    public /* synthetic */ C29026ao(C29034aw awVar, List list, int i) {
        this.f78791a = awVar;
        this.f78792b = list;
        this.f78793c = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: com.google.android.libraries.mdi.download.d.e.av} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r30) {
        /*
            r29 = this;
            r0 = r29
            com.google.android.libraries.mdi.download.d.e.aw r7 = r0.f78791a
            java.util.List r1 = r0.f78792b
            int r6 = r0.f78793c
            r2 = r30
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0025
            java.lang.Object r4 = r1.next()
            com.google.android.libraries.mdi.download.d.a.c r4 = (com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c) r4
            r3.add(r4)
            goto L_0x0015
        L_0x0025:
            java.util.Iterator r1 = r2.iterator()
        L_0x0029:
            boolean r2 = r1.hasNext()
            r4 = 1
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r1.next()
            com.google.android.libraries.mdi.download.dr r2 = (com.google.android.libraries.mdi.download.C29334dr) r2
            com.google.android.libraries.mdi.download.ep r5 = com.google.android.libraries.mdi.download.C29392ep.f79679g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.mdi.download.eo r5 = (com.google.android.libraries.mdi.download.C29391eo) r5
            java.lang.String r8 = r2.f79501c
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.android.libraries.mdi.download.ep r9 = (com.google.android.libraries.mdi.download.C29392ep) r9
            r8.getClass()
            int r10 = r9.f79681a
            r4 = r4 | r10
            r9.f79681a = r4
            r9.f79682b = r8
            java.lang.String r4 = r2.f79502d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x006b
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.android.libraries.mdi.download.ep r4 = (com.google.android.libraries.mdi.download.C29392ep) r4
            int r8 = r4.f79681a
            r8 = r8 | 2
            r4.f79681a = r8
            java.lang.String r8 = "com.google.android.gms"
            r4.f79683c = r8
            goto L_0x007f
        L_0x006b:
            java.lang.String r4 = r2.f79502d
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.libraries.mdi.download.ep r8 = (com.google.android.libraries.mdi.download.C29392ep) r8
            r4.getClass()
            int r9 = r8.f79681a
            r9 = r9 | 2
            r8.f79681a = r9
            r8.f79683c = r4
        L_0x007f:
            com.google.protobuf.bv r4 = r5.build()
            com.google.android.libraries.mdi.download.ep r4 = (com.google.android.libraries.mdi.download.C29392ep) r4
            com.google.android.libraries.mdi.download.d.a.a r5 = new com.google.android.libraries.mdi.download.d.a.a
            r5.<init>(r4, r2)
            r3.add(r5)
            goto L_0x0029
        L_0x008e:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashSet r18 = new java.util.HashSet
            r18.<init>()
            java.util.concurrent.atomic.AtomicLong r15 = new java.util.concurrent.atomic.AtomicLong
            r9 = 0
            r15.<init>(r9)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r13 = r3.size()
            r9 = 0
            r12 = 0
        L_0x00b9:
            if (r12 >= r13) goto L_0x01cd
            java.lang.Object r9 = r3.get(r12)
            r19 = r9
            com.google.android.libraries.mdi.download.d.a.c r19 = (com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c) r19
            com.google.android.libraries.mdi.download.ep r9 = r19.mo34484b()
            java.lang.String r9 = com.google.android.libraries.mdi.download.p2236d.p2241e.C29034aw.m53906a(r9)
            java.util.Set r20 = com.google.android.libraries.mdi.download.p2236d.p2241e.C29034aw.m53907b(r1, r9)
            com.google.android.libraries.mdi.download.ep r9 = r19.mo34484b()
            java.lang.String r9 = com.google.android.libraries.mdi.download.p2236d.p2241e.C29034aw.m53906a(r9)
            java.lang.Object r10 = r5.get(r9)
            com.google.android.libraries.mdi.download.d.e.av r10 = (com.google.android.libraries.mdi.download.p2236d.p2241e.C29033av) r10
            if (r10 != 0) goto L_0x00ee
            com.google.android.libraries.mdi.download.d.e.av r10 = new com.google.android.libraries.mdi.download.d.e.av
            r10.<init>()
            r5.put(r9, r10)
            java.lang.Object r9 = r5.get(r9)
            r10 = r9
            com.google.android.libraries.mdi.download.d.e.av r10 = (com.google.android.libraries.mdi.download.p2236d.p2241e.C29033av) r10
        L_0x00ee:
            r11 = r10
            com.google.android.libraries.mdi.download.ep r9 = r19.mo34484b()
            boolean r9 = r9.f79685e
            if (r9 == 0) goto L_0x0113
            com.google.android.libraries.mdi.download.ep r9 = r19.mo34484b()
            java.lang.String r9 = com.google.android.libraries.mdi.download.p2236d.p2241e.C29034aw.m53906a(r9)
            java.util.Set r9 = com.google.android.libraries.mdi.download.p2236d.p2241e.C29034aw.m53907b(r2, r9)
            com.google.android.libraries.mdi.download.ep r10 = r19.mo34484b()
            java.lang.String r10 = com.google.android.libraries.mdi.download.p2236d.p2241e.C29034aw.m53906a(r10)
            com.google.android.libraries.mdi.download.dr r4 = r19.mo34483a()
            r8.put(r10, r4)
            goto L_0x0114
        L_0x0113:
            r9 = 0
        L_0x0114:
            r4 = r9
            com.google.android.libraries.mdi.download.dr r9 = r19.mo34483a()
            com.google.protobuf.cq r9 = r9.f79512n
            int r10 = r9.size()
            com.google.android.libraries.mdi.download.dr r9 = r19.mo34483a()
            com.google.protobuf.cq r9 = r9.f79512n
            java.util.Iterator r21 = r9.iterator()
        L_0x0129:
            boolean r9 = r21.hasNext()
            if (r9 == 0) goto L_0x01b0
            java.lang.Object r9 = r21.next()
            com.google.android.libraries.mdi.download.dl r9 = (com.google.android.libraries.mdi.download.C29328dl) r9
            boolean r16 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54013i(r9)
            com.google.android.libraries.mdi.download.dr r0 = r19.mo34483a()
            int r0 = r0.f79507i
            int r0 = com.google.android.libraries.mdi.download.C29332dp.m54217a(r0)
            if (r0 != 0) goto L_0x0146
            r0 = 1
        L_0x0146:
            com.google.android.libraries.mdi.download.ev r0 = com.google.android.libraries.mdi.download.p2236d.C29292lr.m54176a(r9, r0)
            com.google.android.libraries.mdi.download.d.lp r9 = r7.f78820b
            com.google.common.util.concurrent.cx r9 = r9.mo34641e(r0)
            com.google.android.libraries.mdi.download.l.b r9 = com.google.android.libraries.mdi.download.p2257l.C29670b.m54719g(r9)
            r22 = r1
            com.google.android.libraries.mdi.download.d.e.aq r1 = com.google.android.libraries.mdi.download.p2236d.p2241e.C29028aq.f78796a
            r23 = r2
            java.util.concurrent.Executor r2 = r7.f78826h
            r24 = r3
            java.lang.Class<com.google.android.libraries.mdi.download.d.lq> r3 = com.google.android.libraries.mdi.download.p2236d.C29291lq.class
            com.google.android.libraries.mdi.download.l.b r1 = r9.mo34820f(r3, r1, r2)
            com.google.android.libraries.mdi.download.d.e.ar r2 = new com.google.android.libraries.mdi.download.d.e.ar
            r2.<init>(r7)
            java.util.concurrent.Executor r3 = r7.f78826h
            com.google.android.libraries.mdi.download.l.b r1 = r1.mo34821h(r2, r3)
            com.google.android.libraries.mdi.download.d.e.as r2 = new com.google.android.libraries.mdi.download.d.e.as
            r9 = r2
            r3 = r10
            r10 = r18
            r25 = r11
            r11 = r0
            r0 = r12
            r12 = r15
            r26 = r13
            r13 = r20
            r27 = r6
            r6 = r14
            r14 = r16
            r28 = r15
            r15 = r25
            r16 = r19
            r17 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.concurrent.Executor r9 = r7.f78826h
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r9)
            r6.add(r1)
            r12 = r0
            r10 = r3
            r14 = r6
            r1 = r22
            r2 = r23
            r3 = r24
            r11 = r25
            r13 = r26
            r6 = r27
            r15 = r28
            r0 = r29
            goto L_0x0129
        L_0x01b0:
            r22 = r1
            r23 = r2
            r24 = r3
            r27 = r6
            r3 = r10
            r10 = r11
            r0 = r12
            r26 = r13
            r6 = r14
            r28 = r15
            r10.f78817e = r3
            int r12 = r0 + 1
            r0 = r29
            r3 = r24
            r6 = r27
            r4 = 1
            goto L_0x00b9
        L_0x01cd:
            r27 = r6
            r6 = r14
            r28 = r15
            com.google.android.libraries.mdi.download.l.c r0 = com.google.android.libraries.mdi.download.p2257l.C29672d.m54726a(r6)
            com.google.android.libraries.mdi.download.d.e.at r9 = new com.google.android.libraries.mdi.download.d.e.at
            r1 = r9
            r2 = r7
            r3 = r5
            r4 = r8
            r5 = r28
            r6 = r27
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.Executor r1 = r7.f78826h
            com.google.common.util.concurrent.cx r0 = r0.mo34823a(r9, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.p2236d.p2241e.C29026ao.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
