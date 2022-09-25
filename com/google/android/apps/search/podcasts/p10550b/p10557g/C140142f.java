package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.podcasts.b.g.f */
/* compiled from: PG */
public final /* synthetic */ class C140142f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140133ai f380800a;

    public /* synthetic */ C140142f(C140133ai aiVar) {
        this.f380800a = aiVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: com.google.android.apps.gsa.staticplugins.cl.b.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: com.google.android.apps.gsa.staticplugins.cl.b.s} */
    /* JADX WARNING: type inference failed for: r0v58, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r0v76, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0532 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.apps.search.podcasts.b.g.ai r1 = r0.f380800a
            r2 = r19
            com.google.at.j.a.dp r2 = (com.google.p4017at.p4082j.p4083a.C54417dp) r2
            com.google.android.apps.search.podcasts.b.a.j r3 = r1.f380787c
            com.google.protobuf.dn r4 = r2.f142915a
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            com.google.common.util.concurrent.cx r3 = r3.mo115378c(r4)
            com.google.apps.tiktok.concurrent.aj r1 = r1.f380789e
            com.google.common.util.concurrent.cx r1 = r1.mo50395b()
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r1)
            com.google.android.apps.search.podcasts.b.g.ag r1 = (com.google.android.apps.search.podcasts.p10550b.p10557g.C140131ag) r1
            if (r2 == 0) goto L_0x05ed
        L_0x0022:
            int r4 = r1.f380782e
            if (r4 <= 0) goto L_0x0032
            java.util.ArrayDeque r4 = r1.f380781d
            r4.removeFirst()
            int r4 = r1.f380782e
            int r4 = r4 + -1
            r1.f380782e = r4
            goto L_0x0022
        L_0x0032:
            com.google.protobuf.dn r4 = r2.f142915a
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            int r5 = com.google.android.apps.search.podcasts.p10550b.p10557g.C140130af.f380777a
            int r5 = r4.size()
            com.google.common.b.gz r5 = com.google.common.p4522b.C58495hd.m89896j(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x004f:
            boolean r7 = r4.hasNext()
            java.lang.String r8 = "ShowResultConverterUtil"
            r9 = 1
            if (r7 == 0) goto L_0x0257
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r10 = r7.getValue()
            com.google.at.j.a.da r10 = (com.google.p4017at.p4082j.p4083a.C54402da) r10
            int r11 = r10.f142890a
            int r12 = com.google.p4017at.p4082j.p4083a.C54400cz.m87377b(r11)
            java.lang.String r13 = ", "
            if (r12 != 0) goto L_0x006f
            goto L_0x0072
        L_0x006f:
            r14 = 3
            if (r12 == r14) goto L_0x007d
        L_0x0072:
            int r11 = com.google.p4017at.p4082j.p4083a.C54400cz.m87377b(r11)
            if (r11 != 0) goto L_0x007a
            goto L_0x0127
        L_0x007a:
            r12 = 6
            if (r11 != r12) goto L_0x0127
        L_0x007d:
            com.google.protos.ac.a.l r11 = r10.f142891b
            if (r11 == 0) goto L_0x0127
            com.google.protos.ac.a.h r11 = com.google.protos.p4757ac.p4758a.C63109h.f170342e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.protos.ac.a.g r11 = (com.google.protos.p4757ac.p4758a.C63108g) r11
            com.google.protos.ac.a.l r12 = r10.f142891b
            if (r12 != 0) goto L_0x008f
            com.google.protos.ac.a.l r12 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x008f:
            com.google.protobuf.bn r12 = r12.toBuilder()
            com.google.protos.ac.a.k r12 = (com.google.protos.p4757ac.p4758a.C63112k) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.protos.ac.a.l r14 = (com.google.protos.p4757ac.p4758a.C63113l) r14
            com.google.protobuf.cq r15 = com.google.protobuf.C62942bv.emptyProtobufList()
            r14.f170381o = r15
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.protos.ac.a.h r14 = (com.google.protos.p4757ac.p4758a.C63109h) r14
            com.google.protobuf.bv r12 = r12.build()
            com.google.protos.ac.a.l r12 = (com.google.protos.p4757ac.p4758a.C63113l) r12
            r12.getClass()
            r14.f170345b = r12
            int r12 = r14.f170344a
            r12 = r12 | r9
            r14.f170344a = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            com.google.protos.ac.a.l r14 = r10.f142891b
            if (r14 != 0) goto L_0x00c4
            com.google.protos.ac.a.l r14 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x00c4:
            com.google.protobuf.cq r14 = r14.f170381o
            java.util.Iterator r14 = r14.iterator()
        L_0x00ca:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00f0
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            com.google.protobuf.dn r9 = r10.f142892c
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)
            java.lang.Object r9 = r9.get(r15)
            com.google.protos.ac.a.j r9 = (com.google.protos.p4757ac.p4758a.C63111j) r9
            if (r9 == 0) goto L_0x00e8
            r11.mo59180a(r9)
            goto L_0x00ee
        L_0x00e8:
            r12.append(r15)
            r12.append(r13)
        L_0x00ee:
            r9 = 1
            goto L_0x00ca
        L_0x00f0:
            int r9 = r12.length()
            if (r9 <= 0) goto L_0x011c
            com.google.common.f.e r9 = com.google.android.apps.search.podcasts.p10550b.p10557g.C140137am.f380793a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r14, r8)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r9.mo56375ad()
            r8 = 41574(0xa266, float:5.8258E-41)
            com.google.common.f.x r8 = r9.mo56372aa(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.protos.ac.a.l r9 = r10.f142891b
            if (r9 != 0) goto L_0x0115
            com.google.protos.ac.a.l r9 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x0115:
            java.lang.String r10 = "Failed to find episodes with guids %s in feed %s"
            java.lang.String r9 = r9.f170373g
            r8.mo56354G(r10, r12, r9)
        L_0x011c:
            com.google.protobuf.bv r8 = r11.build()
            com.google.protos.ac.a.h r8 = (com.google.protos.p4757ac.p4758a.C63109h) r8
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            goto L_0x0154
        L_0x0127:
            com.google.common.f.e r9 = com.google.android.apps.search.podcasts.p10550b.p10557g.C140137am.f380793a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r11, r8)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r9.mo56375ad()
            r8 = 41575(0xa267, float:5.8259E-41)
            com.google.common.f.x r8 = r9.mo56372aa(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            int r9 = r10.f142890a
            int r9 = com.google.p4017at.p4082j.p4083a.C54400cz.m87377b(r9)
            if (r9 != 0) goto L_0x0149
            r9 = 1
        L_0x0149:
            java.lang.String r10 = "Failed retrieve player data for showResult with status %d"
            int r9 = com.google.p4017at.p4082j.p4083a.C54400cz.m87376a(r9)
            r8.mo56387q(r10, r9)
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
        L_0x0154:
            boolean r9 = r8.mo56113h()
            if (r9 == 0) goto L_0x0247
            java.lang.Object r7 = r7.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r8.mo56107c()
            com.google.protos.ac.a.h r8 = (com.google.protos.p4757ac.p4758a.C63109h) r8
            com.google.protos.ac.a.l r9 = r8.f170345b
            if (r9 != 0) goto L_0x016c
            com.google.protos.ac.a.l r9 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x016c:
            java.lang.String r9 = r9.f170368b
            com.google.protos.ac.a.l r10 = r8.f170345b
            if (r10 != 0) goto L_0x0174
            com.google.protos.ac.a.l r10 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x0174:
            java.lang.String r10 = r10.f170373g
            com.google.protobuf.bn r11 = r8.toBuilder()
            com.google.protos.ac.a.g r11 = (com.google.protos.p4757ac.p4758a.C63108g) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.protos.ac.a.h r12 = (com.google.protos.p4757ac.p4758a.C63109h) r12
            com.google.protobuf.cq r13 = com.google.protos.p4757ac.p4758a.C63109h.emptyProtobufList()
            r12.f170346c = r13
            com.google.protobuf.bv r12 = r11.instance
            com.google.protos.ac.a.h r12 = (com.google.protos.p4757ac.p4758a.C63109h) r12
            com.google.protos.ac.a.l r12 = r12.f170345b
            if (r12 != 0) goto L_0x0193
            com.google.protos.ac.a.l r12 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x0193:
            com.google.protobuf.bn r12 = r12.toBuilder()
            com.google.protos.ac.a.k r12 = (com.google.protos.p4757ac.p4758a.C63112k) r12
            com.google.android.apps.search.podcasts.p10550b.p10557g.C140136al.m227802a(r12)
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.protos.ac.a.h r13 = (com.google.protos.p4757ac.p4758a.C63109h) r13
            com.google.protobuf.bv r12 = r12.build()
            com.google.protos.ac.a.l r12 = (com.google.protos.p4757ac.p4758a.C63113l) r12
            r12.getClass()
            r13.f170345b = r12
            int r12 = r13.f170344a
            r14 = 1
            r12 = r12 | r14
            r13.f170344a = r12
            com.google.protobuf.cq r8 = r8.f170346c
            java.util.Iterator r8 = r8.iterator()
        L_0x01ba:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x023d
            java.lang.Object r12 = r8.next()
            com.google.protos.ac.a.j r12 = (com.google.protos.p4757ac.p4758a.C63111j) r12
            com.google.protobuf.bn r13 = r12.toBuilder()
            com.google.protos.ac.a.i r13 = (com.google.protos.p4757ac.p4758a.C63110i) r13
            int r14 = r12.f170350a
            r14 = r14 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0230
            com.google.protos.ac.a.l r12 = r12.f170359j
            if (r12 != 0) goto L_0x01d8
            com.google.protos.ac.a.l r12 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x01d8:
            com.google.protobuf.bn r12 = r12.toBuilder()
            com.google.protos.ac.a.k r12 = (com.google.protos.p4757ac.p4758a.C63112k) r12
            com.google.protobuf.bv r14 = r12.instance
            com.google.protos.ac.a.l r14 = (com.google.protos.p4757ac.p4758a.C63113l) r14
            int r14 = r14.f170367a
            r15 = 1
            r14 = r14 & r15
            if (r14 != 0) goto L_0x01f9
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.protos.ac.a.l r14 = (com.google.protos.p4757ac.p4758a.C63113l) r14
            r9.getClass()
            int r0 = r14.f170367a
            r0 = r0 | r15
            r14.f170367a = r0
            r14.f170368b = r9
        L_0x01f9:
            com.google.protobuf.bv r0 = r12.instance
            com.google.protos.ac.a.l r0 = (com.google.protos.p4757ac.p4758a.C63113l) r0
            int r0 = r0.f170367a
            r0 = r0 & 64
            if (r0 != 0) goto L_0x0215
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.protos.ac.a.l r0 = (com.google.protos.p4757ac.p4758a.C63113l) r0
            r10.getClass()
            int r14 = r0.f170367a
            r14 = r14 | 64
            r0.f170367a = r14
            r0.f170373g = r10
        L_0x0215:
            com.google.android.apps.search.podcasts.p10550b.p10557g.C140136al.m227802a(r12)
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.protos.ac.a.j r0 = (com.google.protos.p4757ac.p4758a.C63111j) r0
            com.google.protobuf.bv r12 = r12.build()
            com.google.protos.ac.a.l r12 = (com.google.protos.p4757ac.p4758a.C63113l) r12
            r12.getClass()
            r0.f170359j = r12
            int r12 = r0.f170350a
            r12 = r12 | 256(0x100, float:3.59E-43)
            r0.f170350a = r12
        L_0x0230:
            com.google.protobuf.bv r0 = r13.build()
            com.google.protos.ac.a.j r0 = (com.google.protos.p4757ac.p4758a.C63111j) r0
            r11.mo59180a(r0)
            r0 = r18
            goto L_0x01ba
        L_0x023d:
            com.google.protobuf.bv r0 = r11.build()
            com.google.protos.ac.a.h r0 = (com.google.protos.p4757ac.p4758a.C63109h) r0
            r5.mo55429h(r7, r0)
            goto L_0x0253
        L_0x0247:
            java.lang.Object r0 = r7.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r6.append(r0)
            r6.append(r13)
        L_0x0253:
            r0 = r18
            goto L_0x004f
        L_0x0257:
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x027b
            com.google.common.f.e r0 = com.google.android.apps.search.podcasts.p10550b.p10557g.C140137am.f380793a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r0.mo56375ad()
            r4 = 41576(0xa268, float:5.826E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r4 = "Failed to retrieve data for feed urls: %s"
            r0.mo56389s(r4, r6)
        L_0x027b:
            r0 = 0
            com.google.common.b.hd r4 = r5.mo55427f(r0)
            com.google.protobuf.dn r2 = r2.f142916b
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            java.util.Collection r2 = r2.values()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.google.android.apps.search.podcasts.b.g.x r7 = r1.f380780c
            java.util.Map r7 = r7.f380824a
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x02a0:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x02bf
            java.lang.Object r8 = r7.next()
            com.google.android.apps.gsa.staticplugins.cl.b.s r8 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r8
            java.lang.String r9 = r8.f273456d
            r5.put(r9, r8)
            java.lang.String r9 = r8.f273455c
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x02a0
            java.lang.String r9 = r8.f273455c
            r6.put(r9, r8)
            goto L_0x02a0
        L_0x02bf:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            com.google.android.apps.search.podcasts.b.g.x r8 = r1.f380780c
            java.util.ArrayList r8 = r8.f380825b
            int r9 = r8.size()
            r10 = 0
        L_0x02cd:
            if (r10 >= r9) goto L_0x02e3
            java.lang.Object r11 = r8.get(r10)
            com.google.android.apps.gsa.staticplugins.cl.b.q r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97927q) r11
            com.google.at.j.a.bw r12 = r11.f273449b
            if (r12 != 0) goto L_0x02db
            com.google.at.j.a.bw r12 = com.google.p4017at.p4082j.p4083a.C54370bw.f142816b
        L_0x02db:
            java.lang.String r12 = r12.f142818a
            r7.put(r12, r11)
            int r10 = r10 + 1
            goto L_0x02cd
        L_0x02e3:
            com.google.android.apps.search.podcasts.b.g.x r8 = r1.f380780c
            java.util.Map r8 = r8.f380824a
            r8.clear()
            com.google.android.libraries.f.a r8 = r1.f380778a
            long r8 = r8.mo26870b()
            com.google.common.b.ij r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x02f8:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0548
            java.lang.Object r10 = r4.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r12 = r10.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r10 = r10.getValue()
            com.google.protos.ac.a.h r10 = (com.google.protos.p4757ac.p4758a.C63109h) r10
            com.google.protos.ac.a.l r13 = r10.f170345b
            if (r13 != 0) goto L_0x0316
            com.google.protos.ac.a.l r13 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x0316:
            int r14 = r13.f170367a
            r14 = r14 & 64
            if (r14 == 0) goto L_0x0325
            java.lang.String r14 = r13.f170373g
            java.lang.Object r14 = r5.get(r14)
            com.google.android.apps.gsa.staticplugins.cl.b.s r14 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r14
            goto L_0x0326
        L_0x0325:
            r14 = 0
        L_0x0326:
            if (r14 != 0) goto L_0x032f
            java.lang.Object r12 = r5.get(r12)
            r14 = r12
            com.google.android.apps.gsa.staticplugins.cl.b.s r14 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r14
        L_0x032f:
            if (r14 != 0) goto L_0x0340
            int r12 = r13.f170367a
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0340
            java.lang.String r12 = r13.f170375i
            java.lang.Object r12 = r6.get(r12)
            r14 = r12
            com.google.android.apps.gsa.staticplugins.cl.b.s r14 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r14
        L_0x0340:
            java.lang.String r12 = r13.f170368b
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x034c
            int r12 = r13.f170374h
            if (r12 != 0) goto L_0x0382
        L_0x034c:
            com.google.common.f.e r12 = com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai.f380785a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "FavoritesManager"
            r12.mo56378ag(r15, r0)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            r0 = 41572(0xa264, float:5.8255E-41)
            com.google.common.f.x r0 = r12.mo56372aa(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r12 = r13.f170375i
            java.lang.String r13 = r13.f170373g
            java.lang.String r15 = "Received favorite show with empty data: (cluster_id: %s, feed_url: %s)"
            r0.mo56354G(r15, r12, r13)
            if (r14 == 0) goto L_0x0382
            long r12 = r14.f273462j
            long r12 = r8 - r12
            r16 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0382
            com.google.protobuf.bn r0 = r14.toBuilder()
            r15 = r0
            com.google.android.apps.gsa.staticplugins.cl.b.r r15 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97928r) r15
            goto L_0x0383
        L_0x0382:
            r15 = 0
        L_0x0383:
            if (r15 != 0) goto L_0x04c2
            com.google.protos.ac.a.l r12 = r10.f170345b
            if (r12 != 0) goto L_0x038b
            com.google.protos.ac.a.l r12 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x038b:
            com.google.protobuf.cq r10 = r10.f170346c
            com.google.android.apps.gsa.staticplugins.cl.b.s r13 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s.f273451r
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.apps.gsa.staticplugins.cl.b.r r13 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97928r) r13
            java.lang.String r15 = r12.f170368b
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r0
            r15.getClass()
            int r11 = r0.f273453a
            r17 = 1
            r11 = r11 | 1
            r0.f273453a = r11
            r0.f273454b = r15
            java.lang.String r0 = r12.f170375i
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r11
            r0.getClass()
            int r15 = r11.f273453a
            r16 = 2
            r15 = r15 | 2
            r11.f273453a = r15
            r11.f273455c = r0
            java.lang.String r0 = r12.f170373g
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r11
            r0.getClass()
            int r15 = r11.f273453a
            r15 = r15 | 4
            r11.f273453a = r15
            r11.f273456d = r0
            java.lang.String r0 = r12.f170371e
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r11
            r0.getClass()
            int r15 = r11.f273453a
            r15 = r15 | 8
            r11.f273453a = r15
            r11.f273457e = r0
            java.lang.String r0 = r12.f170369c
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r11
            r0.getClass()
            int r15 = r11.f273453a
            r15 = r15 | 16
            r11.f273453a = r15
            r11.f273458f = r0
            java.lang.String r0 = r12.f170372f
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r11
            r0.getClass()
            int r15 = r11.f273453a
            r15 = r15 | 32
            r11.f273453a = r15
            r11.f273459g = r0
            com.google.protos.ac.a.f r0 = r12.f170378l
            if (r0 != 0) goto L_0x0417
            com.google.protos.ac.a.f r0 = com.google.protos.p4757ac.p4758a.C63107f.f170337d
        L_0x0417:
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r11
            r0.getClass()
            r11.f273464l = r0
            int r0 = r11.f273453a
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r11.f273453a = r0
            java.lang.String r0 = r12.f170370d
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r11
            r0.getClass()
            int r15 = r11.f273453a
            r15 = r15 | 128(0x80, float:1.794E-43)
            r11.f273453a = r15
            r11.f273460h = r0
            int r0 = r12.f170376j
            int r0 = com.google.protos.p4757ac.p4758a.C63103b.m96180a(r0)
            if (r0 != 0) goto L_0x0446
            r0 = 1
        L_0x0446:
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r11
            int r0 = r0 + -1
            r11.f273461i = r0
            int r0 = r11.f273453a
            r0 = r0 | 256(0x100, float:3.59E-43)
            r11.f273453a = r0
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0488
            r0 = 0
            java.lang.Object r10 = r10.get(r0)
            com.google.protos.ac.a.j r10 = (com.google.protos.p4757ac.p4758a.C63111j) r10
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r0
            r10.getClass()
            r0.f273463k = r10
            int r11 = r0.f273453a
            r11 = r11 | 1024(0x400, float:1.435E-42)
            r0.f273453a = r11
            long r10 = r10.f170358i
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r0
            int r12 = r0.f273453a
            r15 = 65536(0x10000, float:9.18355E-41)
            r12 = r12 | r15
            r0.f273453a = r12
            r0.f273469q = r10
        L_0x0488:
            com.google.protobuf.bv r0 = r13.build()
            com.google.android.apps.gsa.staticplugins.cl.b.s r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            r15 = r0
            com.google.android.apps.gsa.staticplugins.cl.b.r r15 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97928r) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r0
            int r10 = r0.f273453a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r0.f273453a = r10
            r0.f273462j = r8
            java.lang.String r0 = r0.f273454b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x04c2
            if (r14 == 0) goto L_0x04c2
            java.lang.String r0 = r14.f273454b
            r15.copyOnWrite()
            com.google.protobuf.bv r10 = r15.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r10 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r10
            r0.getClass()
            int r11 = r10.f273453a
            r12 = 1
            r11 = r11 | r12
            r10.f273453a = r11
            r10.f273454b = r0
        L_0x04c2:
            if (r14 == 0) goto L_0x0532
            boolean r0 = r14.f273465m
            if (r0 == 0) goto L_0x04d8
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r0
            int r10 = r0.f273453a
            r10 = r10 | 4096(0x1000, float:5.74E-42)
            r0.f273453a = r10
            r10 = 1
            r0.f273465m = r10
        L_0x04d8:
            boolean r0 = r14.f273466n
            if (r0 == 0) goto L_0x04ec
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r0
            int r10 = r0.f273453a
            r10 = r10 | 8192(0x2000, float:1.14794E-41)
            r0.f273453a = r10
            r10 = 1
            r0.f273466n = r10
        L_0x04ec:
            int r0 = r14.f273453a
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0503
            long r10 = r14.f273467o
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r0
            int r12 = r0.f273453a
            r12 = r12 | 16384(0x4000, float:2.2959E-41)
            r0.f273453a = r12
            r0.f273467o = r10
        L_0x0503:
            int r0 = r14.f273453a
            r10 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r10
            if (r0 == 0) goto L_0x051b
            long r11 = r14.f273468p
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r0
            int r13 = r0.f273453a
            r10 = r10 | r13
            r0.f273453a = r10
            r0.f273468p = r11
        L_0x051b:
            int r0 = r14.f273453a
            r10 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r10
            if (r0 == 0) goto L_0x0532
            long r11 = r14.f273469q
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r0
            int r13 = r0.f273453a
            r10 = r10 | r13
            r0.f273453a = r10
            r0.f273469q = r11
        L_0x0532:
            com.google.android.apps.search.podcasts.b.g.x r0 = r1.f380780c
            java.util.Map r0 = r0.f380824a
            com.google.protobuf.bv r10 = r15.instance
            com.google.android.apps.gsa.staticplugins.cl.b.s r10 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r10
            java.lang.String r10 = r10.f273456d
            com.google.protobuf.bv r11 = r15.build()
            com.google.android.apps.gsa.staticplugins.cl.b.s r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r11
            r0.put(r10, r11)
            r0 = 0
            goto L_0x02f8
        L_0x0548:
            com.google.android.apps.search.podcasts.b.g.x r0 = r1.f380780c
            java.util.ArrayList r0 = r0.f380825b
            r0.clear()
            com.google.android.apps.search.podcasts.b.g.x r0 = r1.f380780c
            java.util.ArrayList r0 = r0.f380825b
            int r4 = r2.size()
            r0.ensureCapacity(r4)
            java.util.Iterator r0 = r2.iterator()
        L_0x055e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x05ad
            java.lang.Object r2 = r0.next()
            com.google.at.j.a.bw r2 = (com.google.p4017at.p4082j.p4083a.C54370bw) r2
            com.google.android.apps.search.podcasts.b.g.x r4 = r1.f380780c
            java.util.ArrayList r4 = r4.f380825b
            com.google.android.apps.gsa.staticplugins.cl.b.q r5 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97927q.f273446d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.staticplugins.cl.b.p r5 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97926p) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.gsa.staticplugins.cl.b.q r6 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97927q) r6
            r2.getClass()
            r6.f273449b = r2
            int r8 = r6.f273448a
            r9 = 1
            r8 = r8 | r9
            r6.f273448a = r8
            java.lang.String r2 = r2.f142818a
            java.lang.Object r2 = r7.get(r2)
            com.google.android.apps.gsa.staticplugins.cl.b.q r2 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97927q) r2
            if (r2 == 0) goto L_0x05a3
            long r8 = r2.f273450c
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.apps.gsa.staticplugins.cl.b.q r2 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97927q) r2
            int r6 = r2.f273448a
            r10 = 2
            r6 = r6 | r10
            r2.f273448a = r6
            r2.f273450c = r8
        L_0x05a3:
            com.google.protobuf.bv r2 = r5.build()
            com.google.android.apps.gsa.staticplugins.cl.b.q r2 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97927q) r2
            r4.add(r2)
            goto L_0x055e
        L_0x05ad:
            java.util.ArrayDeque r0 = r1.f380781d
            java.util.Iterator r0 = r0.iterator()
        L_0x05b3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x05c3
            java.lang.Object r2 = r0.next()
            com.google.android.apps.gsa.staticplugins.cl.b.aw r2 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97897aw) r2
            r1.mo115469c(r2)
            goto L_0x05b3
        L_0x05c3:
            java.util.ArrayDeque r0 = r1.f380781d
            boolean r0 = r0.isEmpty()
            com.google.android.apps.search.podcasts.b.g.ah r1 = new com.google.android.apps.search.podcasts.b.g.ah
            r2 = r0 ^ 1
            r1.<init>(r0, r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            r1 = 2
            com.google.common.util.concurrent.cx[] r1 = new com.google.common.util.concurrent.C60870cx[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r0
            com.google.apps.tiktok.tracing.contrib.b.j r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r1)
            com.google.android.apps.search.podcasts.b.g.r r2 = new com.google.android.apps.search.podcasts.b.g.r
            r2.<init>(r0)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = r1.mo51521b(r2, r0)
            return r0
        L_0x05ed:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Received null data"
            r0.<init>(r1)
            goto L_0x05f6
        L_0x05f5:
            throw r0
        L_0x05f6:
            goto L_0x05f5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10557g.C140142f.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
