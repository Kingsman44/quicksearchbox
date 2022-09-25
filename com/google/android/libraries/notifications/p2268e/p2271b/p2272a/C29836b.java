package com.google.android.libraries.notifications.p2268e.p2271b.p2272a;

/* renamed from: com.google.android.libraries.notifications.e.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C29836b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C29837c f80863a;

    public /* synthetic */ C29836b(C29837c cVar) {
        this.f80863a = cVar;
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            com.google.android.libraries.notifications.e.b.a.c r1 = r0.f80863a
            com.google.android.libraries.notifications.e.b.a.a r2 = r1.f80865A
            java.lang.String r3 = r1.f80875i
            com.google.bf.a.b.o r4 = com.google.p4160bf.p4161a.p4163b.C55507o.f146480e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.bf.a.b.m r4 = (com.google.p4160bf.p4161a.p4163b.C55505m) r4
            com.google.bf.a.b.l r5 = com.google.p4160bf.p4161a.p4163b.C55504l.f146467k
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bf.a.b.i r5 = (com.google.p4160bf.p4161a.p4163b.C55501i) r5
            java.util.List r6 = r1.f80880n
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bf.a.b.l r7 = (com.google.p4160bf.p4161a.p4163b.C55504l) r7
            com.google.protobuf.cq r8 = r7.f146470b
            boolean r9 = r8.mo58948c()
            if (r9 != 0) goto L_0x002f
            com.google.protobuf.cq r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r8)
            r7.f146470b = r8
        L_0x002f:
            com.google.protobuf.cq r7 = r7.f146470b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r6, (java.util.List) r7)
            com.google.android.libraries.notifications.platform.c.e r6 = r1.f80869c
            com.google.android.libraries.notifications.platform.c.a r6 = (com.google.android.libraries.notifications.platform.p2309c.C30071a) r6
            java.lang.String r6 = r6.f81355a
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bf.a.b.l r7 = (com.google.p4160bf.p4161a.p4163b.C55504l) r7
            int r8 = r7.f146469a
            r9 = 1
            r8 = r8 | r9
            r7.f146469a = r8
            r7.f146471c = r6
            com.google.android.libraries.notifications.e.g.g r6 = r1.f80870d
            com.google.android.libraries.notifications.data.k r7 = r1.f80876j
            com.google.bf.a.b.bt r6 = r6.mo35183a(r7)
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bf.a.b.l r7 = (com.google.p4160bf.p4161a.p4163b.C55504l) r7
            r6.getClass()
            r7.f146474f = r6
            int r6 = r7.f146469a
            r6 = r6 | 8
            r7.f146469a = r6
            com.google.android.libraries.notifications.e.g.f r6 = r1.f80871e
            com.google.bf.a.b.bz r7 = r1.f80868b
            com.google.bf.a.b.bg r6 = r6.mo35196b(r7)
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bf.a.b.l r7 = (com.google.p4160bf.p4161a.p4163b.C55504l) r7
            r6.getClass()
            r7.f146473e = r6
            int r6 = r7.f146469a
            r8 = 4
            r6 = r6 | r8
            r7.f146469a = r6
            java.lang.Long r6 = r1.f80881o
            long r6 = r6.longValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.bf.a.b.l r10 = (com.google.p4160bf.p4161a.p4163b.C55504l) r10
            int r11 = r10.f146469a
            r11 = r11 | 64
            r10.f146469a = r11
            r10.f146476h = r6
            com.google.bf.a.b.ae r6 = r1.f80878l
            if (r6 == 0) goto L_0x00c9
            com.google.bf.a.b.y r6 = com.google.p4160bf.p4161a.p4163b.C55517y.f146498c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.bf.a.b.x r6 = (com.google.p4160bf.p4161a.p4163b.C55516x) r6
            com.google.bf.a.b.ae r7 = r1.f80878l
            r6.copyOnWrite()
            com.google.protobuf.bv r10 = r6.instance
            com.google.bf.a.b.y r10 = (com.google.p4160bf.p4161a.p4163b.C55517y) r10
            r7.getClass()
            r10.f146501b = r7
            int r7 = r10.f146500a
            r7 = r7 | r9
            r10.f146500a = r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.bf.a.b.y r6 = (com.google.p4160bf.p4161a.p4163b.C55517y) r6
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bf.a.b.l r7 = (com.google.p4160bf.p4161a.p4163b.C55504l) r7
            r6.getClass()
            r7.f146475g = r6
            int r6 = r7.f146469a
            r6 = r6 | 16
            r7.f146469a = r6
        L_0x00c9:
            java.lang.String r6 = r1.f80877k
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 2
            if (r6 != 0) goto L_0x00e5
            java.lang.String r6 = r1.f80877k
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.bf.a.b.l r10 = (com.google.p4160bf.p4161a.p4163b.C55504l) r10
            r6.getClass()
            int r11 = r10.f146469a
            r11 = r11 | r7
            r10.f146469a = r11
            r10.f146472d = r6
        L_0x00e5:
            com.google.android.libraries.notifications.e.b.c r6 = r1.f80883q
            if (r6 == 0) goto L_0x01d5
            java.lang.Long r6 = r6.f80893a
            long r10 = r6.longValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.bf.a.b.l r6 = (com.google.p4160bf.p4161a.p4163b.C55504l) r6
            int r12 = r6.f146469a
            r12 = r12 | 128(0x80, float:1.794E-43)
            r6.f146469a = r12
            r6.f146477i = r10
            com.google.bf.a.b.bz r6 = r1.f80868b
            com.google.bf.a.b.bz r10 = com.google.p4160bf.p4161a.p4163b.C55489bz.SHOWN
            if (r6 == r10) goto L_0x0112
            com.google.bf.a.b.bz r6 = r1.f80868b
            com.google.bf.a.b.bz r10 = com.google.p4160bf.p4161a.p4163b.C55489bz.SHOWN_REPLACED
            if (r6 == r10) goto L_0x0112
            com.google.bf.a.b.bz r10 = com.google.p4160bf.p4161a.p4163b.C55489bz.REMOVED
            if (r6 == r10) goto L_0x0112
            int r6 = r1.f80886t
            if (r6 != r8) goto L_0x01d5
        L_0x0112:
            com.google.bf.a.b.ao r6 = com.google.p4160bf.p4161a.p4163b.C55451ao.f146296i
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.bf.a.b.al r6 = (com.google.p4160bf.p4161a.p4163b.C55448al) r6
            java.lang.Long r10 = r1.f80882p
            long r10 = r10.longValue()
            com.google.android.libraries.notifications.e.b.c r12 = r1.f80883q
            java.lang.Long r12 = r12.f80894b
            long r12 = r12.longValue()
            r6.copyOnWrite()
            com.google.protobuf.bv r14 = r6.instance
            com.google.bf.a.b.ao r14 = (com.google.p4160bf.p4161a.p4163b.C55451ao) r14
            int r15 = r14.f146298a
            r15 = r15 | r9
            r14.f146298a = r15
            long r10 = r10 - r12
            r14.f146299b = r10
            com.google.android.libraries.notifications.e.b.c r10 = r1.f80883q
            java.lang.Long r10 = r10.f80896d
            long r10 = r10.longValue()
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.bf.a.b.ao r12 = (com.google.p4160bf.p4161a.p4163b.C55451ao) r12
            int r13 = r12.f146298a
            r13 = r13 | r7
            r12.f146298a = r13
            r12.f146300c = r10
            com.google.android.libraries.notifications.e.b.c r10 = r1.f80883q
            java.lang.Long r10 = r10.f80897e
            long r10 = r10.longValue()
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.bf.a.b.ao r12 = (com.google.p4160bf.p4161a.p4163b.C55451ao) r12
            int r13 = r12.f146298a
            r13 = r13 | r8
            r12.f146298a = r13
            r12.f146301d = r10
            com.google.android.libraries.notifications.e.b.c r10 = r1.f80883q
            java.lang.Long r10 = r10.f80898f
            long r10 = r10.longValue()
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.bf.a.b.ao r12 = (com.google.p4160bf.p4161a.p4163b.C55451ao) r12
            int r13 = r12.f146298a
            r13 = r13 | 8
            r12.f146298a = r13
            r12.f146302e = r10
            com.google.android.libraries.notifications.e.b.c r10 = r1.f80883q
            java.lang.Long r10 = r10.f80899g
            long r10 = r10.longValue()
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.bf.a.b.ao r12 = (com.google.p4160bf.p4161a.p4163b.C55451ao) r12
            int r13 = r12.f146298a
            r13 = r13 | 16
            r12.f146298a = r13
            r12.f146303f = r10
            com.google.android.libraries.notifications.e.b.c r10 = r1.f80883q
            java.lang.Long r10 = r10.f80900h
            long r10 = r10.longValue()
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.bf.a.b.ao r12 = (com.google.p4160bf.p4161a.p4163b.C55451ao) r12
            int r13 = r12.f146298a
            r13 = r13 | 32
            r12.f146298a = r13
            r12.f146304g = r10
            com.google.android.libraries.notifications.e.b.c r10 = r1.f80883q
            com.google.bf.a.b.an r10 = r10.f80895c
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            com.google.bf.a.b.ao r11 = (com.google.p4160bf.p4161a.p4163b.C55451ao) r11
            int r10 = r10.f146295h
            r11.f146305h = r10
            int r10 = r11.f146298a
            r10 = r10 | 64
            r11.f146298a = r10
            com.google.protobuf.bv r6 = r6.build()
            com.google.bf.a.b.ao r6 = (com.google.p4160bf.p4161a.p4163b.C55451ao) r6
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.bf.a.b.l r10 = (com.google.p4160bf.p4161a.p4163b.C55504l) r10
            r6.getClass()
            r10.f146478j = r6
            int r6 = r10.f146469a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r10.f146469a = r6
        L_0x01d5:
            com.google.protobuf.bv r5 = r5.build()
            com.google.bf.a.b.l r5 = (com.google.p4160bf.p4161a.p4163b.C55504l) r5
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.bf.a.b.o r6 = (com.google.p4160bf.p4161a.p4163b.C55507o) r6
            r5.getClass()
            r6.f146485d = r5
            int r5 = r6.f146482a
            r5 = r5 | r9
            r6.f146482a = r5
            com.google.bf.a.b.bz r5 = r1.f80868b
            r6 = 5
            r11 = 3
            r12 = 0
            if (r5 == 0) goto L_0x0322
            com.google.bf.a.b.cc r5 = com.google.p4160bf.p4161a.p4163b.C55493cc.f146431l
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bf.a.b.bv r5 = (com.google.p4160bf.p4161a.p4163b.C55485bv) r5
            com.google.bf.a.b.bz r13 = r1.f80868b
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.bf.a.b.cc r14 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r14
            int r13 = r13.f146426S
            r14.f146434b = r13
            int r13 = r14.f146433a
            r13 = r13 | r9
            r14.f146433a = r13
            com.google.bf.a.b.bz r13 = r1.f80868b
            java.util.List r14 = com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29837c.f80864a
            boolean r14 = r14.contains(r13)
            if (r14 == 0) goto L_0x0234
            java.util.List r13 = r1.f80873g
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.bf.a.b.cc r14 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r14
            com.google.protobuf.cq r15 = r14.f146437e
            boolean r16 = r15.mo58948c()
            if (r16 != 0) goto L_0x022e
            com.google.protobuf.cq r15 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r15)
            r14.f146437e = r15
        L_0x022e:
            com.google.protobuf.cq r14 = r14.f146437e
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r13, (java.util.List) r14)
            goto L_0x0262
        L_0x0234:
            com.google.bf.a.b.bz r14 = com.google.p4160bf.p4161a.p4163b.C55489bz.ACTION_CLICK
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x0262
            java.lang.String r13 = r1.f80872f
            if (r13 == 0) goto L_0x024e
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.bf.a.b.cc r14 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r14
            int r15 = r14.f146433a
            r15 = r15 | r7
            r14.f146433a = r15
            r14.f146435c = r13
        L_0x024e:
            int r13 = r1.f80888v
            if (r13 == 0) goto L_0x0262
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.bf.a.b.cc r14 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r14
            int r13 = r13 + -1
            r14.f146436d = r13
            int r13 = r14.f146433a
            r13 = r13 | r8
            r14.f146433a = r13
        L_0x0262:
            com.google.android.libraries.notifications.e.j.d r13 = r1.f80879m
            if (r13 == 0) goto L_0x027c
            com.google.bf.a.b.h r13 = r13.mo35256d()
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.bf.a.b.cc r14 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r14
            r13.getClass()
            r14.f146440h = r13
            int r13 = r14.f146433a
            r13 = r13 | 128(0x80, float:1.794E-43)
            r14.f146433a = r13
        L_0x027c:
            int r13 = r1.f80889w
            if (r13 == 0) goto L_0x0291
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.bf.a.b.cc r14 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r14
            int r13 = r13 + -1
            r14.f146439g = r13
            int r13 = r14.f146433a
            r13 = r13 | 64
            r14.f146433a = r13
        L_0x0291:
            int r13 = r1.f80890x
            if (r13 == 0) goto L_0x02a6
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.bf.a.b.cc r14 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r14
            int r13 = r13 + -1
            r14.f146443k = r13
            int r13 = r14.f146433a
            r13 = r13 | 8192(0x2000, float:1.14794E-41)
            r14.f146433a = r13
        L_0x02a6:
            int r13 = r1.f80891y
            if (r13 == 0) goto L_0x02e0
            com.google.bf.a.b.bk r13 = com.google.p4160bf.p4161a.p4163b.C55474bk.f146354c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.bf.a.b.bh r13 = (com.google.p4160bf.p4161a.p4163b.C55471bh) r13
            int r14 = r1.f80891y
            r13.copyOnWrite()
            com.google.protobuf.bv r15 = r13.instance
            com.google.bf.a.b.bk r15 = (com.google.p4160bf.p4161a.p4163b.C55474bk) r15
            int r10 = r14 + -1
            if (r14 == 0) goto L_0x02df
            r15.f146357b = r10
            int r10 = r15.f146356a
            r10 = r10 | r9
            r15.f146356a = r10
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.bf.a.b.cc r10 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r10
            com.google.protobuf.bv r12 = r13.build()
            com.google.bf.a.b.bk r12 = (com.google.p4160bf.p4161a.p4163b.C55474bk) r12
            r12.getClass()
            r10.f146441i = r12
            int r12 = r10.f146433a
            r12 = r12 | 2048(0x800, float:2.87E-42)
            r10.f146433a = r12
            goto L_0x02e0
        L_0x02df:
            throw r12
        L_0x02e0:
            int r10 = r1.f80892z
            if (r10 == 0) goto L_0x02f5
            r5.copyOnWrite()
            com.google.protobuf.bv r12 = r5.instance
            com.google.bf.a.b.cc r12 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r12
            int r10 = r10 + -1
            r12.f146442j = r10
            int r10 = r12.f146433a
            r10 = r10 | 4096(0x1000, float:5.74E-42)
            r12.f146433a = r10
        L_0x02f5:
            java.lang.Long r10 = r1.f80884r
            if (r10 == 0) goto L_0x030c
            long r12 = r10.longValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.bf.a.b.cc r10 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r10
            int r14 = r10.f146433a
            r14 = r14 | 8
            r10.f146433a = r14
            r10.f146438f = r12
        L_0x030c:
            com.google.protobuf.bv r5 = r5.build()
            com.google.bf.a.b.cc r5 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r5
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.bf.a.b.o r10 = (com.google.p4160bf.p4161a.p4163b.C55507o) r10
            r5.getClass()
            r10.f146484c = r5
            r10.f146483b = r7
            goto L_0x0419
        L_0x0322:
            int r5 = r1.f80886t
            if (r5 == 0) goto L_0x03e5
            com.google.bf.a.b.av r5 = com.google.p4160bf.p4161a.p4163b.C55458av.f146310g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bf.a.b.ar r5 = (com.google.p4160bf.p4161a.p4163b.C55454ar) r5
            int r10 = r1.f80886t
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.bf.a.b.av r13 = (com.google.p4160bf.p4161a.p4163b.C55458av) r13
            int r14 = r10 + -1
            if (r10 == 0) goto L_0x03e4
            r13.f146313b = r14
            int r10 = r13.f146312a
            r10 = r10 | r9
            r13.f146312a = r10
            java.lang.String r10 = r1.f80885s
            if (r10 == 0) goto L_0x0355
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.bf.a.b.av r13 = (com.google.p4160bf.p4161a.p4163b.C55458av) r13
            int r14 = r13.f146312a
            r14 = r14 | 32
            r13.f146312a = r14
            r13.f146317f = r10
        L_0x0355:
            int r10 = r1.f80889w
            if (r10 == 0) goto L_0x0369
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.bf.a.b.av r13 = (com.google.p4160bf.p4161a.p4163b.C55458av) r13
            int r10 = r10 + -1
            r13.f146314c = r10
            int r10 = r13.f146312a
            r10 = r10 | r7
            r13.f146312a = r10
        L_0x0369:
            com.google.android.libraries.notifications.h.h r10 = r1.f80874h
            if (r10 == 0) goto L_0x0395
            com.google.android.libraries.notifications.platform.c.d r13 = com.google.android.libraries.notifications.platform.p2309c.C30074d.PRODUCTION
            int r10 = r10.ordinal()
            switch(r10) {
                case 0: goto L_0x0383;
                case 1: goto L_0x0381;
                case 2: goto L_0x037f;
                case 3: goto L_0x037d;
                case 4: goto L_0x037b;
                case 5: goto L_0x0379;
                case 6: goto L_0x0377;
                default: goto L_0x0376;
            }
        L_0x0376:
            goto L_0x0383
        L_0x0377:
            r10 = 6
            goto L_0x0384
        L_0x0379:
            r10 = 5
            goto L_0x0384
        L_0x037b:
            r10 = 4
            goto L_0x0384
        L_0x037d:
            r10 = 7
            goto L_0x0384
        L_0x037f:
            r10 = 3
            goto L_0x0384
        L_0x0381:
            r10 = 2
            goto L_0x0384
        L_0x0383:
            r10 = 1
        L_0x0384:
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.bf.a.b.av r13 = (com.google.p4160bf.p4161a.p4163b.C55458av) r13
            int r10 = r10 + -1
            r13.f146315d = r10
            int r10 = r13.f146312a
            r10 = r10 | 8
            r13.f146312a = r10
        L_0x0395:
            int r10 = r1.f80891y
            if (r10 == 0) goto L_0x03cf
            com.google.bf.a.b.bk r10 = com.google.p4160bf.p4161a.p4163b.C55474bk.f146354c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.bf.a.b.bh r10 = (com.google.p4160bf.p4161a.p4163b.C55471bh) r10
            int r13 = r1.f80891y
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.bf.a.b.bk r14 = (com.google.p4160bf.p4161a.p4163b.C55474bk) r14
            int r15 = r13 + -1
            if (r13 == 0) goto L_0x03ce
            r14.f146357b = r15
            int r12 = r14.f146356a
            r12 = r12 | r9
            r14.f146356a = r12
            r5.copyOnWrite()
            com.google.protobuf.bv r12 = r5.instance
            com.google.bf.a.b.av r12 = (com.google.p4160bf.p4161a.p4163b.C55458av) r12
            com.google.protobuf.bv r10 = r10.build()
            com.google.bf.a.b.bk r10 = (com.google.p4160bf.p4161a.p4163b.C55474bk) r10
            r10.getClass()
            r12.f146316e = r10
            int r10 = r12.f146312a
            r10 = r10 | 16
            r12.f146312a = r10
            goto L_0x03cf
        L_0x03ce:
            throw r12
        L_0x03cf:
            com.google.protobuf.bv r5 = r5.build()
            com.google.bf.a.b.av r5 = (com.google.p4160bf.p4161a.p4163b.C55458av) r5
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.bf.a.b.o r10 = (com.google.p4160bf.p4161a.p4163b.C55507o) r10
            r5.getClass()
            r10.f146484c = r5
            r10.f146483b = r11
            goto L_0x0419
        L_0x03e4:
            throw r12
        L_0x03e5:
            int r5 = r1.f80887u
            if (r5 == 0) goto L_0x0481
            com.google.bf.a.b.bp r5 = com.google.p4160bf.p4161a.p4163b.C55479bp.f146361c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bf.a.b.bn r5 = (com.google.p4160bf.p4161a.p4163b.C55477bn) r5
            int r10 = r1.f80887u
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.bf.a.b.bp r13 = (com.google.p4160bf.p4161a.p4163b.C55479bp) r13
            int r14 = r10 + -1
            if (r10 == 0) goto L_0x0480
            r13.f146364b = r14
            int r10 = r13.f146363a
            r10 = r10 | r9
            r13.f146363a = r10
            com.google.protobuf.bv r5 = r5.build()
            com.google.bf.a.b.bp r5 = (com.google.p4160bf.p4161a.p4163b.C55479bp) r5
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.bf.a.b.o r10 = (com.google.p4160bf.p4161a.p4163b.C55507o) r10
            r5.getClass()
            r10.f146484c = r5
            r10.f146483b = r8
        L_0x0419:
            com.google.bf.a.b.s r5 = com.google.p4160bf.p4161a.p4163b.C55511s.f146487d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bf.a.b.p r5 = (com.google.p4160bf.p4161a.p4163b.C55508p) r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.bf.a.b.o r4 = (com.google.p4160bf.p4161a.p4163b.C55507o) r4
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.bf.a.b.s r10 = (com.google.p4160bf.p4161a.p4163b.C55511s) r10
            r4.getClass()
            r10.f146490b = r4
            int r4 = r10.f146489a
            r4 = r4 | r7
            r10.f146489a = r4
            com.google.android.libraries.notifications.platform.c.e r1 = r1.f80869c
            com.google.android.libraries.notifications.platform.c.a r1 = (com.google.android.libraries.notifications.platform.p2309c.C30071a) r1
            com.google.android.libraries.notifications.platform.c.d r1 = r1.f81357c
            com.google.android.libraries.notifications.h.h r4 = com.google.android.libraries.notifications.p2293h.C30015h.UNKNOWN
            com.google.android.libraries.notifications.platform.c.d r4 = com.google.android.libraries.notifications.platform.p2309c.C30074d.PRODUCTION
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0467
            if (r1 == r9) goto L_0x0465
            if (r1 == r7) goto L_0x0462
            if (r1 == r11) goto L_0x045f
            if (r1 == r8) goto L_0x045c
            if (r1 != r6) goto L_0x0454
            r1 = 2
            goto L_0x0468
        L_0x0454:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Exhaustive switch"
            r1.<init>(r2)
            throw r1
        L_0x045c:
            r1 = 15
            goto L_0x0468
        L_0x045f:
            r1 = 13
            goto L_0x0468
        L_0x0462:
            r1 = 14
            goto L_0x0468
        L_0x0465:
            r1 = 3
            goto L_0x0468
        L_0x0467:
            r1 = 4
        L_0x0468:
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.bf.a.b.s r4 = (com.google.p4160bf.p4161a.p4163b.C55511s) r4
            int r1 = r1 + -1
            r4.f146491c = r1
            int r1 = r4.f146489a
            r1 = r1 | r8
            r4.f146489a = r1
            com.google.protobuf.bv r1 = r5.build()
            r12 = r1
            com.google.bf.a.b.s r12 = (com.google.p4160bf.p4161a.p4163b.C55511s) r12
            goto L_0x048b
        L_0x0480:
            throw r12
        L_0x0481:
            java.lang.String r1 = "Failed to create clearcut event, both interaction and failure is null"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = "ChimeLogEventImpl"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r4, r1, r5)
        L_0x048b:
            if (r12 == 0) goto L_0x05b2
            android.content.Context r1 = r2.f80856a
            com.google.android.gms.clearcut.k r2 = new com.google.android.gms.clearcut.k
            java.lang.String r4 = "CHIME"
            r2.<init>(r1, r4, r3)
            com.google.android.gms.clearcut.j r1 = r2.mo118999d(r12)
            r1.mo118992a()
            com.google.android.libraries.notifications.platform.a.a r1 = com.google.android.libraries.notifications.platform.p2307a.C30058b.f81324a
            boolean r1 = r1.mo35399b(r7)
            if (r1 == 0) goto L_0x05b2
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r12.f146489a
            r3 = r3 & r7
            java.lang.String r4 = "]"
            if (r3 == 0) goto L_0x055c
            com.google.bf.a.b.o r3 = r12.f146490b
            if (r3 != 0) goto L_0x04b9
            com.google.bf.a.b.o r3 = com.google.p4160bf.p4161a.p4163b.C55507o.f146480e
        L_0x04b9:
            int r5 = r3.f146483b
            java.lang.String r6 = "null"
            if (r5 != r7) goto L_0x04ed
            java.lang.String r5 = "Clearcut Logging UserInteraction ["
            r2.append(r5)
            int r5 = r3.f146483b
            if (r5 != r7) goto L_0x04cd
            java.lang.Object r5 = r3.f146484c
            com.google.bf.a.b.cc r5 = (com.google.p4160bf.p4161a.p4163b.C55493cc) r5
            goto L_0x04cf
        L_0x04cd:
            com.google.bf.a.b.cc r5 = com.google.p4160bf.p4161a.p4163b.C55493cc.f146431l
        L_0x04cf:
            int r7 = r5.f146433a
            r7 = r7 & r9
            if (r7 == 0) goto L_0x04e6
            int r5 = r5.f146434b
            com.google.bf.a.b.bz r5 = com.google.p4160bf.p4161a.p4163b.C55489bz.m87698a(r5)
            if (r5 != 0) goto L_0x04de
            com.google.bf.a.b.bz r5 = com.google.p4160bf.p4161a.p4163b.C55489bz.INTERACTION_TYPE_UNSPECIFIED
        L_0x04de:
            java.lang.String r5 = r5.name()
            r2.append(r5)
            goto L_0x04e9
        L_0x04e6:
            r2.append(r6)
        L_0x04e9:
            r2.append(r4)
            goto L_0x051b
        L_0x04ed:
            java.lang.String r5 = "Clearcut Logging NotificationFailure ["
            r2.append(r5)
            int r5 = r3.f146483b
            if (r5 != r11) goto L_0x04fb
            java.lang.Object r5 = r3.f146484c
            com.google.bf.a.b.av r5 = (com.google.p4160bf.p4161a.p4163b.C55458av) r5
            goto L_0x04fd
        L_0x04fb:
            com.google.bf.a.b.av r5 = com.google.p4160bf.p4161a.p4163b.C55458av.f146310g
        L_0x04fd:
            int r7 = r5.f146312a
            r7 = r7 & r9
            if (r7 == 0) goto L_0x0515
            int r5 = r5.f146313b
            int r5 = com.google.p4160bf.p4161a.p4163b.C55457au.m87694a(r5)
            if (r5 != 0) goto L_0x050b
            r5 = 1
        L_0x050b:
            int r5 = r5 + -1
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r2.append(r5)
            goto L_0x0518
        L_0x0515:
            r2.append(r6)
        L_0x0518:
            r2.append(r4)
        L_0x051b:
            int r5 = r3.f146482a
            r5 = r5 & r9
            if (r5 == 0) goto L_0x055c
            com.google.bf.a.b.l r3 = r3.f146485d
            if (r3 != 0) goto L_0x0526
            com.google.bf.a.b.l r3 = com.google.p4160bf.p4161a.p4163b.C55504l.f146467k
        L_0x0526:
            java.lang.String r5 = " for client_id ["
            r2.append(r5)
            java.lang.String r5 = r3.f146471c
            r2.append(r5)
            java.lang.String r5 = "], thread_ids [ "
            r2.append(r5)
            com.google.protobuf.cq r3 = r3.f146470b
            java.util.Iterator r3 = r3.iterator()
        L_0x053b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0557
            java.lang.Object r5 = r3.next()
            com.google.bf.a.b.k r5 = (com.google.p4160bf.p4161a.p4163b.C55503k) r5
            java.lang.String r6 = "<"
            r2.append(r6)
            java.lang.String r5 = r5.f146462b
            r2.append(r5)
            java.lang.String r5 = "> "
            r2.append(r5)
            goto L_0x053b
        L_0x0557:
            java.lang.String r3 = "] "
            r2.append(r3)
        L_0x055c:
            int r3 = r12.f146489a
            r3 = r3 & r8
            if (r3 == 0) goto L_0x05a4
            java.lang.String r3 = "on env ["
            r2.append(r3)
            int r3 = r12.f146491c
            int r3 = com.google.p4160bf.p4161a.p4163b.C55510r.m87700a(r3)
            if (r3 != 0) goto L_0x056f
            goto L_0x059c
        L_0x056f:
            switch(r3) {
                case 1: goto L_0x059c;
                case 2: goto L_0x0599;
                case 3: goto L_0x0596;
                case 4: goto L_0x0593;
                case 5: goto L_0x0590;
                case 6: goto L_0x058d;
                case 7: goto L_0x058a;
                case 8: goto L_0x0587;
                case 9: goto L_0x0584;
                case 10: goto L_0x0581;
                case 11: goto L_0x0572;
                case 12: goto L_0x057e;
                case 13: goto L_0x057b;
                case 14: goto L_0x0578;
                case 15: goto L_0x0575;
                default: goto L_0x0572;
            }
        L_0x0572:
            java.lang.String r3 = "DAILY_6"
            goto L_0x059e
        L_0x0575:
            java.lang.String r3 = "STAGING_QUAL_QA"
            goto L_0x059e
        L_0x0578:
            java.lang.String r3 = "AUTOPUSH_QUAL_PLAYGROUND"
            goto L_0x059e
        L_0x057b:
            java.lang.String r3 = "STAGING"
            goto L_0x059e
        L_0x057e:
            java.lang.String r3 = "AUTOPUSH_PRODDATA"
            goto L_0x059e
        L_0x0581:
            java.lang.String r3 = "DAILY_5"
            goto L_0x059e
        L_0x0584:
            java.lang.String r3 = "DAILY_4"
            goto L_0x059e
        L_0x0587:
            java.lang.String r3 = "DAILY_3"
            goto L_0x059e
        L_0x058a:
            java.lang.String r3 = "DAILY_2"
            goto L_0x059e
        L_0x058d:
            java.lang.String r3 = "DAILY_1"
            goto L_0x059e
        L_0x0590:
            java.lang.String r3 = "DAILY_0"
            goto L_0x059e
        L_0x0593:
            java.lang.String r3 = "PRODUCTION"
            goto L_0x059e
        L_0x0596:
            java.lang.String r3 = "AUTOPUSH"
            goto L_0x059e
        L_0x0599:
            java.lang.String r3 = "DEV"
            goto L_0x059e
        L_0x059c:
            java.lang.String r3 = "UNKNOWN_ENVIRONMENT"
        L_0x059e:
            r2.append(r3)
            r2.append(r4)
        L_0x05a4:
            java.lang.String r2 = r2.toString()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "ChimeClearcutLoggerImpl"
            java.lang.String r3 = "%s"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r2, r3, r1)
        L_0x05b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29836b.run():void");
    }
}
