package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.bq */
/* compiled from: PG */
public final /* synthetic */ class C103251bq implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ int f288024a;

    /* renamed from: b */
    public final /* synthetic */ C103244bj f288025b;

    public /* synthetic */ C103251bq(int i, C103244bj bjVar) {
        this.f288024a = i;
        this.f288025b = bjVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0206  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f288024a
            com.google.android.apps.gsa.staticplugins.nga.h.bj r2 = r0.f288025b
            r3 = r22
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3
            com.google.common.f.a.d r4 = com.google.android.apps.gsa.staticplugins.nga.p8065h.C103262ca.f288039a
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x0023
            com.google.common.f.a.d r1 = com.google.android.apps.gsa.staticplugins.nga.p8065h.C103262ca.f288039a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "No current account detected, writing empty data."
            r3 = 21496(0x53f8, float:3.0122E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.nga.shared.aa.i.m r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m.f220842e
            goto L_0x0250
        L_0x0023:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = (double) r1
            java.lang.Double.isNaN(r6)
            double r4 = r4 / r6
            java.util.Iterator r1 = r2.iterator()
            com.google.android.apps.gsa.nga.shared.aa.i.m r2 = com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m.f220842e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.i.h r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80460h) r2
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
        L_0x003b:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0249
            java.lang.Object r7 = r1.next()
            com.google.android.gms.appdatasearch.al r7 = (com.google.android.gms.appdatasearch.C142796al) r7
            java.lang.String r8 = r7.mo117713i()
            if (r8 == 0) goto L_0x0245
            double r8 = r7.mo117705a()
            java.lang.Integer r10 = com.google.android.apps.gsa.staticplugins.nga.p8065h.C103262ca.f288043e
            int r10 = r10.intValue()
            double r10 = (double) r10
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0245
            java.nio.ByteBuffer r8 = r7.mo117714j()
            if (r8 == 0) goto L_0x0245
            boolean r9 = r8.hasRemaining()
            r10 = 4
            if (r9 != 0) goto L_0x006c
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
            goto L_0x009d
        L_0x006c:
            com.google.protobuf.ba r9 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x009b }
            com.google.cm.a.b.a.f r11 = com.google.p4500cm.p4501a.p4506b.p4507a.C58148f.f155452f     // Catch:{ ct -> 0x009b }
            com.google.protobuf.bv r8 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r11, (java.nio.ByteBuffer) r8, (com.google.protobuf.C62921ba) r9)     // Catch:{ ct -> 0x009b }
            com.google.cm.a.b.a.f r8 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58148f) r8     // Catch:{ ct -> 0x009b }
            int r9 = r8.f155454a     // Catch:{ ct -> 0x009b }
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0098
            com.google.cm.a.b.a.b r9 = r8.f155458e     // Catch:{ ct -> 0x009b }
            if (r9 != 0) goto L_0x0083
            com.google.cm.a.b.a.b r9 = com.google.p4500cm.p4501a.p4506b.p4507a.C58144b.f155438c     // Catch:{ ct -> 0x009b }
        L_0x0083:
            java.lang.String r9 = r9.f155440a     // Catch:{ ct -> 0x009b }
            boolean r9 = r9.isEmpty()     // Catch:{ ct -> 0x009b }
            if (r9 != 0) goto L_0x0098
            com.google.cm.a.b.a.b r8 = r8.f155458e     // Catch:{ ct -> 0x009b }
            if (r8 != 0) goto L_0x0091
            com.google.cm.a.b.a.b r8 = com.google.p4500cm.p4501a.p4506b.p4507a.C58144b.f155438c     // Catch:{ ct -> 0x009b }
        L_0x0091:
            java.lang.String r8 = r8.f155440a     // Catch:{ ct -> 0x009b }
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)     // Catch:{ ct -> 0x009b }
            goto L_0x009d
        L_0x0098:
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
            goto L_0x009d
        L_0x009b:
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
        L_0x009d:
            boolean r9 = r8.mo56113h()
            if (r9 == 0) goto L_0x0245
            java.lang.Object r9 = r3.mo56107c()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.mo56107c()
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0245
            com.google.android.apps.gsa.nga.shared.aa.i.l r8 = com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80464l.f220835f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.i.k r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80463k) r8
            java.lang.String r9 = r7.mo117713i()
            java.lang.String r11 = r7.mo117711g()
            r12 = 1
            if (r9 == 0) goto L_0x00d4
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.i.l r13 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80464l) r13
            int r14 = r13.f220837a
            r14 = r14 | r12
            r13.f220837a = r14
            r13.f220838b = r9
        L_0x00d4:
            com.google.common.b.gp r13 = com.google.common.p4522b.C58485gu.m89837e()
            if (r9 != 0) goto L_0x00e4
            com.google.common.b.gu r10 = r13.mo55394f()
        L_0x00de:
            r19 = r1
            r20 = r3
            goto L_0x01cc
        L_0x00e4:
            android.net.Uri r14 = android.net.Uri.parse(r9)
            java.lang.String r14 = r14.getHost()
            if (r14 != 0) goto L_0x00f3
            com.google.common.b.gu r10 = r13.mo55394f()
            goto L_0x00de
        L_0x00f3:
            java.lang.String r15 = "www."
            boolean r15 = r14.startsWith(r15)
            if (r15 == 0) goto L_0x00ff
            java.lang.String r14 = r14.substring(r10)
        L_0x00ff:
            com.google.common.base.m r10 = new com.google.common.base.m
            r15 = 46
            r10.<init>(r15)
            com.google.common.base.cf r10 = com.google.common.base.C58869cf.m90936b(r10)
            java.util.List r10 = r10.mo56155i(r14)
            r15 = 0
        L_0x010f:
            int r14 = r10.size()
            if (r15 >= r14) goto L_0x012b
            java.lang.Object r14 = r10.get(r15)
            java.lang.String r14 = (java.lang.String) r14
            int r14 = r14.length()
            java.lang.Integer r16 = com.google.android.apps.gsa.staticplugins.nga.p8065h.C103262ca.f288040b
            int r12 = r16.intValue()
            if (r14 >= r12) goto L_0x012b
            int r15 = r15 + 1
            r12 = 1
            goto L_0x010f
        L_0x012b:
            int r12 = r15 + 1
            r14 = r12
        L_0x012e:
            int r0 = r10.size()
            if (r14 > r0) goto L_0x01c4
            java.lang.Object r0 = r10.get(r15)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r16 = r10.subList(r12, r14)
            java.util.Iterator r16 = r16.iterator()
        L_0x0142:
            boolean r18 = r16.hasNext()
            if (r18 == 0) goto L_0x016f
            java.lang.Object r18 = r16.next()
            java.lang.String r18 = (java.lang.String) r18
            r19 = r1
            r20 = r3
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r18
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = ".%s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            r1 = r19
            r3 = r20
            goto L_0x0142
        L_0x016f:
            r19 = r1
            r20 = r3
            int r1 = r0.length()
            java.lang.Integer r3 = com.google.android.apps.gsa.staticplugins.nga.p8065h.C103262ca.f288040b
            int r3 = r3.intValue()
            if (r1 < r3) goto L_0x01b6
            com.google.android.apps.gsa.nga.shared.aa.i.j r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80462j.f220829e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.i.i r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80461i) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.i.j r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80462j) r3
            r16 = r10
            int r10 = r3.f220831a
            r10 = r10 | 2
            r3.f220831a = r10
            r3.f220833c = r4
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.i.j r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80462j) r3
            r0.getClass()
            int r10 = r3.f220831a
            r17 = 1
            r10 = r10 | 1
            r3.f220831a = r10
            r3.f220832b = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.i.j r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80462j) r0
            r13.mo55395g(r0)
            goto L_0x01ba
        L_0x01b6:
            r16 = r10
            r17 = 1
        L_0x01ba:
            int r14 = r14 + 1
            r10 = r16
            r1 = r19
            r3 = r20
            goto L_0x012e
        L_0x01c4:
            r19 = r1
            r20 = r3
            com.google.common.b.gu r10 = r13.mo55394f()
        L_0x01cc:
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.i.l r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80464l) r0
            com.google.protobuf.cq r1 = r0.f220840d
            boolean r3 = r1.mo58948c()
            if (r3 != 0) goto L_0x01e1
            com.google.protobuf.cq r1 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r1)
            r0.f220840d = r1
        L_0x01e1:
            com.google.protobuf.cq r0 = r0.f220840d
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r10, (java.util.List) r0)
            com.google.common.b.ij r0 = com.google.android.apps.gsa.staticplugins.nga.p8065h.C103262ca.m171158a(r9, r6)
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.i.l r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80464l) r1
            com.google.protobuf.cq r3 = r1.f220839c
            boolean r9 = r3.mo58948c()
            if (r9 != 0) goto L_0x01ff
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r1.f220839c = r3
        L_0x01ff:
            com.google.protobuf.cq r1 = r1.f220839c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r1)
            if (r11 == 0) goto L_0x0225
            java.lang.String r0 = r7.mo117713i()
            java.lang.String r0 = com.google.common.base.C58837ba.m90858g(r0)
            com.google.android.gms.search.b.b r0 = com.google.android.gms.search.p10865b.C145864b.m237624b(r11, r0)
            com.google.android.gms.search.b.a r0 = (com.google.android.gms.search.p10865b.C145861a) r0
            int r0 = r0.f394402a
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.i.l r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80464l) r1
            int r3 = r1.f220837a
            r3 = r3 | 2
            r1.f220837a = r3
            r1.f220841e = r0
        L_0x0225:
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.apps.gsa.nga.shared.aa.i.m r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m) r0
            com.google.protobuf.bv r1 = r8.build()
            com.google.android.apps.gsa.nga.shared.aa.i.l r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80464l) r1
            r1.getClass()
            r0.mo74331a()
            com.google.protobuf.cq r0 = r0.f220844a
            r0.add(r1)
            r0 = r21
            r1 = r19
            r3 = r20
            goto L_0x003b
        L_0x0245:
            r0 = r21
            goto L_0x003b
        L_0x0249:
            com.google.protobuf.bv r0 = r2.build()
            r1 = r0
            com.google.android.apps.gsa.nga.shared.aa.i.m r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m) r1
        L_0x0250:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8065h.C103251bq.mo17879a(java.lang.Object):java.lang.Object");
    }
}
