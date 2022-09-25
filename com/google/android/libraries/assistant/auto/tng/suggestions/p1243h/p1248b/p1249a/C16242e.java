package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1249a;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C16242e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C16243f f47840a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f47841b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f47842c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f47843d;

    public /* synthetic */ C16242e(C16243f fVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f47840a = fVar;
        this.f47841b = cxVar;
        this.f47842c = cxVar2;
        this.f47843d = cxVar3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r22 = this;
            r0 = r22
            com.google.android.libraries.assistant.auto.tng.suggestions.h.b.a.f r1 = r0.f47840a
            com.google.common.util.concurrent.cx r2 = r0.f47841b
            com.google.common.util.concurrent.cx r3 = r0.f47842c
            com.google.common.util.concurrent.cx r4 = r0.f47843d
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = com.google.common.util.concurrent.C60856cj.m92909r(r3)
            com.google.android.apps.search.assistant.platform.pcp.f.bm r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm) r3
            java.lang.Object r4 = com.google.common.util.concurrent.C60856cj.m92909r(r4)
            com.google.common.base.ax r4 = (com.google.common.base.C58833ax) r4
            java.lang.Object r4 = r4.mo56111f()
            android.accounts.Account r4 = (android.accounts.Account) r4
            j$.util.Optional r4 = p3186j$.util.Optional.ofNullable(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.protobuf.cq r3 = r3.f341820a
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x041b
            java.lang.Object r6 = r3.next()
            com.google.android.apps.search.assistant.platform.pcp.f.bk r6 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk) r6
            int r9 = r6.f341808c
            r10 = 2
            if (r9 != r10) goto L_0x0417
            java.lang.Object r6 = r6.f341809d
            com.google.assistant.s.a.oa r6 = (com.google.assistant.p3994s.p3995a.C53442oa) r6
            java.lang.String r9 = r6.f140269b
            boolean r9 = com.google.common.base.C58890d.m90990e(r2, r9)
            if (r9 != 0) goto L_0x006f
            com.google.common.f.e r3 = com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1249a.C16243f.f47844a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "ProactiveFetcher"
            r3.mo56378ag(r4, r8)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 46654(0xb63e, float:6.5376E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "Account locale: %s is different from the locale of received data from PCP: %s"
            java.lang.String r6 = r6.f140269b
            r3.mo56354G(r4, r2, r6)
            goto L_0x045a
        L_0x006f:
            com.google.protobuf.cq r6 = r6.f140270c
            com.google.android.libraries.assistant.auto.tng.suggestions.h.b.a.a r9 = com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1249a.C16238a.f47834a
            j$.util.Optional r9 = r4.map(r9)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m r11 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16169m.PROACTIVE
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0082:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0410
            java.lang.Object r13 = r6.next()
            com.google.assistant.s.a.nu r13 = (com.google.assistant.p3994s.p3995a.C53435nu) r13
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r14 = r9.isEmpty()
            if (r14 == 0) goto L_0x00a0
            com.google.assistant.s.a.nw r14 = r13.f140247l
            if (r14 != 0) goto L_0x009c
            com.google.assistant.s.a.nw r14 = com.google.assistant.p3994s.p3995a.C53437nw.f140250i
        L_0x009c:
            boolean r14 = r14.f140256e
            if (r14 != 0) goto L_0x0082
        L_0x00a0:
            java.lang.String r14 = r13.f140240e
            boolean r15 = r14.isEmpty()
            if (r15 != 0) goto L_0x040c
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.a r15 = new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.a
            r15.<init>()
            java.lang.String r8 = r13.f140239d
            boolean r8 = r8.isEmpty()
            r7 = 11
            if (r8 != 0) goto L_0x00ba
            java.lang.String r8 = r13.f140239d
            goto L_0x00ff
        L_0x00ba:
            com.google.assistant.s.a.nw r8 = r13.f140247l
            if (r8 != 0) goto L_0x00c0
            com.google.assistant.s.a.nw r8 = com.google.assistant.p3994s.p3995a.C53437nw.f140250i
        L_0x00c0:
            int r8 = r8.f140253b
            if (r8 != r7) goto L_0x00f9
            java.lang.String r8 = r13.f140240e
            java.lang.String r7 = r13.f140242g
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "|"
            r0.append(r8)
            r0.append(r2)
            r0.append(r8)
            r0.append(r10)
            r0.append(r8)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.google.common.i.o r7 = com.google.common.p4537i.C59294s.m92134d()
            com.google.common.i.n r0 = r7.mo56760b(r0)
            java.lang.String r8 = r0.toString()
            goto L_0x00ff
        L_0x00f9:
            java.lang.String r0 = r13.f140240e
            java.lang.String r8 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n.m33198i(r0, r2, r11)
        L_0x00ff:
            r15.mo22677c(r8)
            r15.mo22676b(r14)
            java.lang.String r0 = r13.f140242g
            r15.f47529b = r0
            r15.mo22678d(r2)
            r15.mo22680f(r11)
            com.google.assistant.s.a.nw r0 = r13.f140247l
            if (r0 != 0) goto L_0x0115
            com.google.assistant.s.a.nw r0 = com.google.assistant.p3994s.p3995a.C53437nw.f140250i
        L_0x0115:
            com.google.protobuf.fg r0 = r0.f140257f
            if (r0 != 0) goto L_0x011b
            com.google.protobuf.fg r0 = com.google.protobuf.C63042fg.f170152c
        L_0x011b:
            long r7 = r0.f170154a
            j$.time.Duration r0 = p3186j$.time.Duration.ofSeconds(r7)
            long r7 = r0.toMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r15.f47530c = r0
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r0 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai.f48090k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ah r0 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16334ah) r0
            com.google.assistant.s.a.jb r7 = r13.f140246k
            if (r7 != 0) goto L_0x0139
            com.google.assistant.s.a.jb r7 = com.google.assistant.p3994s.p3995a.C53308jb.f139794f
        L_0x0139:
            com.google.protos.ai.b.j r7 = r7.f139797b
            if (r7 != 0) goto L_0x013f
            com.google.protos.ai.b.j r7 = com.google.protos.p4816ai.p4818b.C63204j.f170749e
        L_0x013f:
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r8 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai) r8
            r7.getClass()
            r8.f48093b = r7
            int r7 = r8.f48092a
            r10 = 1
            r7 = r7 | r10
            r8.f48092a = r7
            com.google.assistant.s.a.jb r7 = r13.f140246k
            if (r7 != 0) goto L_0x0157
            com.google.assistant.s.a.jb r7 = com.google.assistant.p3994s.p3995a.C53308jb.f139794f
        L_0x0157:
            int r7 = r7.f139799d
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r8 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai) r8
            int r14 = r8.f48092a
            r16 = 2
            r14 = r14 | 2
            r8.f48092a = r14
            r8.f48094c = r7
            com.google.assistant.s.a.jb r7 = r13.f140246k
            if (r7 != 0) goto L_0x0170
            com.google.assistant.s.a.jb r7 = com.google.assistant.p3994s.p3995a.C53308jb.f139794f
        L_0x0170:
            boolean r7 = r7.f139798c
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r8 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai) r8
            int r14 = r8.f48092a
            r14 = r14 | 8
            r8.f48092a = r14
            r8.f48096e = r7
            com.google.assistant.e.c.c.dc r7 = r13.f140244i
            if (r7 != 0) goto L_0x0187
            com.google.assistant.e.c.c.dc r7 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0187:
            java.lang.String r7 = r7.f132817c
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r8 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai) r8
            r7.getClass()
            int r14 = r8.f48092a
            r10 = 4
            r14 = r14 | r10
            r8.f48092a = r14
            r8.f48095d = r7
            com.google.assistant.e.c.c.dc r7 = r13.f140245j
            if (r7 != 0) goto L_0x01a1
            com.google.assistant.e.c.c.dc r7 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x01a1:
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r8 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai) r8
            r7.getClass()
            r8.f48098g = r7
            int r7 = r8.f48092a
            r7 = r7 | 16
            r8.f48092a = r7
            com.google.assistant.s.a.ny r7 = r13.f140241f
            if (r7 != 0) goto L_0x01b9
            com.google.assistant.s.a.ny r7 = com.google.assistant.p3994s.p3995a.C53439ny.f140260c
        L_0x01b9:
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r8 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai) r8
            r7.getClass()
            r8.f48099h = r7
            int r7 = r8.f48092a
            r7 = r7 | 32
            r8.f48092a = r7
            com.google.assistant.s.a.ny r7 = r13.f140243h
            if (r7 != 0) goto L_0x01d1
            com.google.assistant.s.a.ny r7 = com.google.assistant.p3994s.p3995a.C53439ny.f140260c
        L_0x01d1:
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r8 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai) r8
            r7.getClass()
            r8.f48100i = r7
            int r7 = r8.f48092a
            r7 = r7 | 64
            r8.f48092a = r7
            com.google.assistant.s.a.jb r7 = r13.f140246k
            if (r7 != 0) goto L_0x01e9
            com.google.assistant.s.a.jb r7 = com.google.assistant.p3994s.p3995a.C53308jb.f139794f
        L_0x01e9:
            com.google.protobuf.ch r7 = r7.f139800e
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r8 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai) r8
            com.google.protobuf.ch r14 = r8.f48097f
            boolean r18 = r14.mo58948c()
            if (r18 != 0) goto L_0x0200
            com.google.protobuf.ch r14 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r14)
            r8.f48097f = r14
        L_0x0200:
            com.google.protobuf.ch r8 = r8.f48097f
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r7, (java.util.List) r8)
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ai r0 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai) r0
            com.google.assistant.s.a.nw r7 = r13.f140247l
            if (r7 != 0) goto L_0x0211
            com.google.assistant.s.a.nw r7 = com.google.assistant.p3994s.p3995a.C53437nw.f140250i
        L_0x0211:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r8 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag.f48074n
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ae r8 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16331ae) r8
            boolean r14 = r7.f140256e
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r10 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r10
            r19 = r3
            int r3 = r10.f48076a
            r17 = 1
            r3 = r3 | 1
            r10.f48076a = r3
            r10.f48077b = r14
            int r3 = r7.f140253b
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r10 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r10
            int r14 = r10.f48076a
            r14 = r14 | 512(0x200, float:7.175E-43)
            r10.f48076a = r14
            r10.f48088m = r3
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r3 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad.f48065f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ab r3 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16328ab) r3
            int r10 = r13.f140237b
            int r14 = com.google.assistant.p3994s.p3995a.C53434nt.m86817a(r10)
            r20 = r4
            int r4 = r14 + -1
            if (r14 == 0) goto L_0x040a
            if (r4 == 0) goto L_0x02cd
            java.lang.String r14 = ""
            r21 = r6
            r6 = 1
            if (r4 == r6) goto L_0x02b5
            r6 = 2
            if (r4 == r6) goto L_0x029b
            r6 = 3
            if (r4 == r6) goto L_0x0283
            r6 = 4
            if (r4 == r6) goto L_0x0268
        L_0x0265:
            r6 = 2
            goto L_0x02ed
        L_0x0268:
            r4 = 11
            if (r10 != r4) goto L_0x0271
            java.lang.Object r4 = r13.f140238c
            com.google.assistant.e.j.wg r4 = (com.google.assistant.p3897e.p3921j.C52560wg) r4
            goto L_0x0273
        L_0x0271:
            com.google.assistant.e.j.wg r4 = com.google.assistant.p3897e.p3921j.C52560wg.f137943j
        L_0x0273:
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r6 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad) r6
            r4.getClass()
            r6.f48069c = r4
            r4 = 7
            r6.f48068b = r4
            goto L_0x0265
        L_0x0283:
            r4 = 7
            if (r10 != r4) goto L_0x028b
            java.lang.Object r4 = r13.f140238c
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
        L_0x028b:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r4 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad) r4
            r14.getClass()
            r6 = 4
            r4.f48068b = r6
            r4.f48069c = r14
            goto L_0x0265
        L_0x029b:
            r4 = 6
            if (r10 != r4) goto L_0x02a3
            java.lang.Object r4 = r13.f140238c
            com.google.assistant.e.j.du r4 = (com.google.assistant.p3897e.p3921j.C51805du) r4
            goto L_0x02a5
        L_0x02a3:
            com.google.assistant.e.j.du r4 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x02a5:
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r6 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad) r6
            r4.getClass()
            r6.f48069c = r4
            r4 = 3
            r6.f48068b = r4
            goto L_0x0265
        L_0x02b5:
            r4 = 5
            if (r10 != r4) goto L_0x02bd
            java.lang.Object r4 = r13.f140238c
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
        L_0x02bd:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r4 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad) r4
            r14.getClass()
            r6 = 2
            r4.f48068b = r6
            r4.f48069c = r14
            goto L_0x02ed
        L_0x02cd:
            r21 = r6
            r4 = 4
            r6 = 2
            if (r10 != r4) goto L_0x02dc
            java.lang.Object r4 = r13.f140238c
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x02dd
        L_0x02dc:
            r4 = 0
        L_0x02dd:
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r10 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad) r10
            r14 = 1
            r10.f48068b = r14
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r10.f48069c = r4
        L_0x02ed:
            int r4 = r13.f140236a
            r4 = r4 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0321
            java.lang.String r4 = r13.f140248m
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0321
            java.lang.String r4 = r13.f140248m
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r10 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad) r10
            r4.getClass()
            int r14 = r10.f48067a
            r14 = r14 | 128(0x80, float:1.794E-43)
            r10.f48067a = r14
            r10.f48070d = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r4 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad) r4
            r2.getClass()
            int r10 = r4.f48067a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r4.f48067a = r10
            r4.f48071e = r2
        L_0x0321:
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ad r3 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad) r3
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r4 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r4
            r3.getClass()
            r4.f48082g = r3
            int r3 = r4.f48076a
            r3 = r3 | 16
            r4.f48076a = r3
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r3 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r3
            r0.getClass()
            r3.f48084i = r0
            int r0 = r3.f48076a
            r0 = r0 | 32
            r3.f48076a = r0
            com.google.assistant.ag.c.az r0 = r7.f140254c
            if (r0 != 0) goto L_0x0351
            com.google.assistant.ag.c.az r0 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0351:
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r3 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r3
            r0.getClass()
            r3.f48085j = r0
            int r0 = r3.f48076a
            r0 = r0 | 64
            r3.f48076a = r0
            int r0 = r7.f140258g
            com.google.android.libraries.assistant.auto.tng.suggestions.k.aa r0 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa.m33331a(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r0)
            com.google.android.libraries.assistant.auto.tng.suggestions.k.aa r3 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa.UNKNOWN_ACTION_TYPE
            java.lang.Object r0 = r0.orElse(r3)
            com.google.android.libraries.assistant.auto.tng.suggestions.k.aa r0 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r3 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r3
            int r0 = r0.f48064H
            r3.f48080e = r0
            int r0 = r3.f48076a
            r0 = r0 | 8
            r3.f48076a = r0
            com.google.assistant.s.a.jb r0 = r13.f140246k
            if (r0 != 0) goto L_0x038c
            com.google.assistant.s.a.jb r0 = com.google.assistant.p3994s.p3995a.C53308jb.f139794f
        L_0x038c:
            int r0 = r0.f139799d
            r3 = 93716(0x16e14, float:1.31324E-40)
            if (r0 != r3) goto L_0x03a4
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r0 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r0
            int r3 = r0.f48076a
            r4 = 4
            r3 = r3 | r4
            r0.f48076a = r3
            r3 = 1
            r0.f48079d = r3
            goto L_0x03a5
        L_0x03a4:
            r4 = 4
        L_0x03a5:
            int r0 = r7.f140252a
            r0 = r0 & r4
            if (r0 == 0) goto L_0x03c2
            com.google.assistant.s.a.oe r0 = r7.f140255d
            if (r0 != 0) goto L_0x03b0
            com.google.assistant.s.a.oe r0 = com.google.assistant.p3994s.p3995a.C53446oe.f140277b
        L_0x03b0:
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r3 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r3
            r0.getClass()
            r3.f48087l = r0
            int r0 = r3.f48076a
            r0 = r0 | 256(0x100, float:3.59E-43)
            r3.f48076a = r0
        L_0x03c2:
            int r0 = r7.f140252a
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x03e0
            com.google.assistant.s.a.og r0 = r7.f140259h
            if (r0 != 0) goto L_0x03ce
            com.google.assistant.s.a.og r0 = com.google.assistant.p3994s.p3995a.C53448og.f140280h
        L_0x03ce:
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r3 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r3
            r0.getClass()
            r3.f48086k = r0
            int r0 = r3.f48076a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r3.f48076a = r0
        L_0x03e0:
            boolean r0 = r7.f140256e
            if (r0 == 0) goto L_0x03ef
            p3186j$.util.Objects.requireNonNull(r8)
            com.google.android.libraries.assistant.auto.tng.suggestions.h.b.b.a r0 = new com.google.android.libraries.assistant.auto.tng.suggestions.h.b.b.a
            r0.<init>(r8)
            r9.ifPresent(r0)
        L_0x03ef:
            com.google.protobuf.bv r0 = r8.build()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r0 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r0
            r15.mo22679e(r0)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.n r0 = r15.mo22675a()
            r12.add(r0)
            r0 = r22
            r3 = r19
            r4 = r20
            r6 = r21
            r10 = 2
            goto L_0x0082
        L_0x040a:
            r0 = 0
            throw r0
        L_0x040c:
            r0 = r22
            goto L_0x0082
        L_0x0410:
            r19 = r3
            r20 = r4
            r5.addAll(r12)
        L_0x0417:
            r0 = r22
            goto L_0x0031
        L_0x041b:
            com.google.common.b.ih r0 = new com.google.common.b.ih
            r0.<init>()
            int r3 = r5.size()
            r8 = 0
        L_0x0425:
            if (r8 >= r3) goto L_0x0449
            java.lang.Object r4 = r5.get(r8)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.n r4 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n) r4
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r4 = r4.mo22747b()
            com.google.assistant.ag.c.az r4 = r4.f48085j
            if (r4 != 0) goto L_0x0437
            com.google.assistant.ag.c.az r4 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0437:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1250b.C16246b.m33290d(r4, r6)
            com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90006F(r6)
            r0.mo55489i(r4)
            int r8 = r8 + 1
            goto L_0x0425
        L_0x0449:
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.f r3 = r1.f47847d
            com.google.common.b.ij r3 = r3.f47380u
            r0.mo55489i(r3)
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.f r3 = r1.f47847d
            com.google.common.b.ij r0 = r0.mo55486f()
            r3.f47380u = r0
        L_0x045a:
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.f r0 = r1.f47847d
            r0.mo22637l()
            java.util.Map r0 = r0.f47366g
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r5)
            r0.put(r2, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1249a.C16242e.call():java.lang.Object");
    }
}
