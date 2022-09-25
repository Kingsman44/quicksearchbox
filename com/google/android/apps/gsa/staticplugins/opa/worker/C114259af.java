package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53422nh;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.af */
/* compiled from: PG */
public final /* synthetic */ class C114259af implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114261ah f316827a;

    /* renamed from: b */
    public final /* synthetic */ boolean f316828b;

    /* renamed from: c */
    public final /* synthetic */ C53422nh f316829c;

    public /* synthetic */ C114259af(C114261ah ahVar, boolean z, C53422nh nhVar) {
        this.f316827a = ahVar;
        this.f316828b = z;
        this.f316829c = nhVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e4, code lost:
        if (r2.f170154a <= 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0181, code lost:
        if ((r4 & 64) != 0) goto L_0x01f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x032e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            com.google.android.apps.gsa.staticplugins.opa.worker.ah r10 = r0.f316827a
            boolean r1 = r0.f316828b
            com.google.assistant.s.a.nh r11 = r0.f316829c
            r12 = r28
            com.google.apps.tiktok.account.AccountId r12 = (com.google.apps.tiktok.account.AccountId) r12
            com.google.android.apps.gsa.search.core.i.t r2 = r10.f316835c
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247811oG
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x03f4
            if (r1 == 0) goto L_0x03f4
            int r1 = r11.f140184a
            r1 = r1 & 16
            if (r1 == 0) goto L_0x03b9
            com.google.assistant.s.a.lj r1 = r11.f140188e
            if (r1 != 0) goto L_0x0024
            com.google.assistant.s.a.lj r1 = com.google.assistant.p3994s.p3995a.C53370lj.f140047c
        L_0x0024:
            com.google.protobuf.cq r1 = r1.f140050b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x002e
            goto L_0x03b9
        L_0x002e:
            android.content.Context r1 = r10.f316834b
            com.google.android.apps.search.assistant.platform.pcp.b.b r13 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202992a(r1, r12)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            com.google.common.b.gp r15 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gp r9 = com.google.common.p4522b.C58485gu.m89837e()
            android.content.Context r1 = r10.f316834b
            com.google.android.apps.search.assistant.platform.pcp.i.ad r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124048ad.m203471a(r1, r12)
            com.google.assistant.s.a.j r2 = com.google.assistant.p3994s.p3995a.C53306j.ALL_PCP_CLIENTS
            com.google.common.b.ij r8 = r1.mo106252e(r2)
            com.google.assistant.s.a.lj r1 = r11.f140188e
            if (r1 != 0) goto L_0x0053
            com.google.assistant.s.a.lj r1 = com.google.assistant.p3994s.p3995a.C53370lj.f140047c
        L_0x0053:
            com.google.protobuf.cq r1 = r1.f140050b
            java.util.Iterator r16 = r1.iterator()
            r7 = 1
            r1 = 1
        L_0x005b:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x035b
            java.lang.Object r2 = r16.next()
            r6 = r2
            com.google.assistant.s.a.lf r6 = (com.google.assistant.p3994s.p3995a.C53366lf) r6
            int r2 = r6.f140037b
            r3 = 4
            if (r2 != r3) goto L_0x0072
            java.lang.Object r2 = r6.f140038c
            com.google.assistant.s.a.nf r2 = (com.google.assistant.p3994s.p3995a.C53420nf) r2
            goto L_0x0074
        L_0x0072:
            com.google.assistant.s.a.nf r2 = com.google.assistant.p3994s.p3995a.C53420nf.f140165o
        L_0x0074:
            int r2 = r2.f140167a
            r4 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r4
            if (r2 == 0) goto L_0x033f
            int r2 = r6.f140036a
            r4 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r4
            if (r2 == 0) goto L_0x033f
            int r1 = r6.f140042g
            com.google.assistant.s.a.k r5 = com.google.assistant.p3994s.p3995a.C53333k.m86811a(r1)
            int r1 = r5.f139956bk
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r8.contains(r1)
            r4 = 0
            if (r1 != 0) goto L_0x0097
            r1 = 0
            goto L_0x005b
        L_0x0097:
            java.lang.String r1 = r6.f140039d
            int r2 = r5.ordinal()
            if (r2 == r7) goto L_0x00a4
            r2 = 0
            r0 = r1
            r7 = r2
            goto L_0x0296
        L_0x00a4:
            int r1 = r6.f140037b
            if (r1 != r3) goto L_0x00ad
            java.lang.Object r1 = r6.f140038c
            com.google.assistant.s.a.nf r1 = (com.google.assistant.p3994s.p3995a.C53420nf) r1
            goto L_0x00af
        L_0x00ad:
            com.google.assistant.s.a.nf r1 = com.google.assistant.p3994s.p3995a.C53420nf.f140165o
        L_0x00af:
            com.google.assistant.s.a.gy r1 = r1.f140176j
            if (r1 != 0) goto L_0x00b5
            com.google.assistant.s.a.gy r1 = com.google.assistant.p3994s.p3995a.C53250gy.f139586c
        L_0x00b5:
            int r2 = r1.f139588a
            if (r2 != r3) goto L_0x00be
            java.lang.Object r1 = r1.f139589b
            com.google.assistant.s.a.gt r1 = (com.google.assistant.p3994s.p3995a.C53245gt) r1
            goto L_0x00c0
        L_0x00be:
            com.google.assistant.s.a.gt r1 = com.google.assistant.p3994s.p3995a.C53245gt.f139564n
        L_0x00c0:
            com.google.android.apps.gsa.search.core.i.t r2 = r10.f316835c
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247969be
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x011c
            com.google.android.apps.gsa.opa.smartspace.j r2 = r10.f316846p
            boolean r2 = r2.mo77161F()
            if (r2 == 0) goto L_0x011c
            int r2 = r1.f139567a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x00e6
            com.google.protobuf.fg r2 = r1.f139572f
            if (r2 != 0) goto L_0x00de
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c
        L_0x00de:
            long r2 = r2.f170154a
            r17 = 0
            int r19 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r19 > 0) goto L_0x011c
        L_0x00e6:
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.s.a.gc r1 = (com.google.assistant.p3994s.p3995a.C53228gc) r1
            com.google.android.libraries.f.a r2 = r10.f316840j
            long r2 = r2.mo26870b()
            com.google.protobuf.fg r2 = com.google.protobuf.p4750c.C62953e.m95484i(r2)
            com.google.protobuf.fg r3 = com.google.protobuf.C63042fg.f170152c
            com.google.protobuf.bn r2 = r3.createBuilder(r2)
            com.google.protobuf.ff r2 = (com.google.protobuf.C63041ff) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.s.a.gt r3 = (com.google.assistant.p3994s.p3995a.C53245gt) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.protobuf.fg r2 = (com.google.protobuf.C63042fg) r2
            r2.getClass()
            r3.f139572f = r2
            int r2 = r3.f139567a
            r2 = r2 | 8
            r3.f139567a = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.s.a.gt r1 = (com.google.assistant.p3994s.p3995a.C53245gt) r1
        L_0x011c:
            com.google.protobuf.cq r2 = r1.f139569c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01cb
            com.google.protobuf.cq r2 = r1.f139569c
            java.lang.Object r2 = r2.get(r4)
            com.google.assistant.s.a.ge r2 = (com.google.assistant.p3994s.p3995a.C53230ge) r2
            com.google.common.f.a.d r3 = r10.f316845o
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            r4 = 28879(0x70cf, float:4.0468E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            r18 = r3
            com.google.common.f.a.a r18 = (com.google.common.p4526f.p4527a.C58970a) r18
            java.lang.String r3 = r2.f139507c
            boolean r4 = r1.f139574h
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r4)
            com.google.assistant.s.a.gq r4 = r1.f139577k
            if (r4 != 0) goto L_0x014c
            com.google.assistant.s.a.gq r4 = com.google.assistant.p3994s.p3995a.C53242gq.f139546f
        L_0x014c:
            r22 = r4
            com.google.protobuf.fg r4 = r1.f139572f
            if (r4 != 0) goto L_0x0154
            com.google.protobuf.fg r4 = com.google.protobuf.C63042fg.f170152c
        L_0x0154:
            long r19 = com.google.protobuf.p4750c.C62953e.m95478c(r4)
            java.lang.Long r23 = java.lang.Long.valueOf(r19)
            int r4 = r1.f139568b
            com.google.assistant.s.a.gg r4 = com.google.assistant.p3994s.p3995a.C53232gg.m86789a(r4)
            if (r4 != 0) goto L_0x0166
            com.google.assistant.s.a.gg r4 = com.google.assistant.p3994s.p3995a.C53232gg.UNKNOWN
        L_0x0166:
            r24 = r4
            java.lang.String r19 = "writeZeroStateStructuredDataToPCP current weather Temp=%s, isCelsius=%b, location=%s, currentUpdateTimeMillis=%d, source=%s"
            r20 = r3
            r18.mo56361N(r19, r20, r21, r22, r23, r24)
            int r3 = r1.f139567a
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0185
            int r4 = r2.f139505a
            r18 = r4 & 4
            if (r18 == 0) goto L_0x0185
            r18 = r4 & 8
            if (r18 == 0) goto L_0x0185
            r4 = r4 & 64
            if (r4 == 0) goto L_0x0185
            goto L_0x01f7
        L_0x0185:
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r4 = r10.f316842l
            int r7 = r1.f139568b
            com.google.assistant.s.a.gg r7 = com.google.assistant.p3994s.p3995a.C53232gg.m86789a(r7)
            if (r7 != 0) goto L_0x0191
            com.google.assistant.s.a.gg r7 = com.google.assistant.p3994s.p3995a.C53232gg.UNKNOWN
        L_0x0191:
            int r7 = r7.f139522g
            if (r3 == 0) goto L_0x0199
            r3 = 1
            r25 = 1
            goto L_0x019c
        L_0x0199:
            r3 = 1
            r25 = 0
        L_0x019c:
            r21 = r25 ^ 1
            int r2 = r2.f139505a
            r18 = r2 & 4
            if (r18 == 0) goto L_0x01a7
            r25 = 1
            goto L_0x01a9
        L_0x01a7:
            r25 = 0
        L_0x01a9:
            r22 = r25 ^ 1
            r18 = r2 & 8
            if (r18 == 0) goto L_0x01b2
            r25 = 1
            goto L_0x01b4
        L_0x01b2:
            r25 = 0
        L_0x01b4:
            r23 = r25 ^ 1
            r2 = r2 & 64
            if (r2 == 0) goto L_0x01bd
            r25 = 1
            goto L_0x01bf
        L_0x01bd:
            r25 = 0
        L_0x01bf:
            r20 = 0
            r24 = r25 ^ 1
            r18 = r4
            r19 = r7
            r18.mo109934g(r19, r20, r21, r22, r23, r24)
            goto L_0x01f7
        L_0x01cb:
            com.google.common.f.a.d r2 = r10.f316845o
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Weather daily forecast is empty"
            r4 = 28874(0x70ca, float:4.0461E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r2 = r10.f316842l
            int r3 = r1.f139568b
            com.google.assistant.s.a.gg r3 = com.google.assistant.p3994s.p3995a.C53232gg.m86789a(r3)
            if (r3 != 0) goto L_0x01e4
            com.google.assistant.s.a.gg r3 = com.google.assistant.p3994s.p3995a.C53232gg.UNKNOWN
        L_0x01e4:
            int r3 = r3.f139522g
            r20 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r18 = r2
            r19 = r3
            r18.mo109934g(r19, r20, r21, r22, r23, r24)
        L_0x01f7:
            int r2 = r1.f139567a
            r3 = 4
            r2 = r2 & r3
            if (r2 != 0) goto L_0x0210
            com.google.common.f.a.d r2 = r10.f316845o
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Missing current weather from zero state."
            r4 = 28878(0x70ce, float:4.0467E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r2 = r10.f316842l
            r3 = 1
            r2.mo109930c(r3)
        L_0x0210:
            int r2 = r1.f139567a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0262
            com.google.protobuf.fg r2 = r1.f139572f
            if (r2 != 0) goto L_0x021c
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c
        L_0x021c:
            long r2 = com.google.protobuf.p4750c.C62953e.m95478c(r2)
            com.google.android.libraries.f.a r4 = r10.f316840j
            long r18 = r4.mo26870b()
            long r18 = r18 - r2
            long r20 = com.google.android.apps.gsa.staticplugins.opa.worker.C114261ah.f316833a
            int r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x0260
            com.google.common.f.a.d r4 = r10.f316845o
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            r7 = 28876(0x70cc, float:4.0464E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r7)
            r18 = r4
            com.google.common.f.a.a r18 = (com.google.common.p4526f.p4527a.C58970a) r18
            java.lang.String r19 = "Stale current weather data: currentUpdateTime in millis=%d, currentTimeMillis=%d"
            com.google.android.libraries.f.a r4 = r10.f316840j
            long r22 = r4.mo26870b()
            r20 = r2
            r18.mo56350C(r19, r20, r22)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r4 = r10.f316842l
            com.google.android.libraries.f.a r7 = r10.f316840j
            long r18 = r7.mo26870b()
            long r18 = r18 - r2
            j$.time.Duration r2 = p3186j$.time.Duration.ofMillis(r18)
            r3 = 1
            r4.mo109931d(r3, r2)
            goto L_0x0275
        L_0x0260:
            r3 = 1
            goto L_0x0275
        L_0x0262:
            r3 = 1
            com.google.common.f.a.d r2 = r10.f316845o
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r4 = "Missing current weather update time from zero state."
            r7 = 28877(0x70cd, float:4.0465E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r7)).mo56386p(r4)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r2 = r10.f316842l
            r2.mo109932e(r3)
        L_0x0275:
            boolean r2 = r11.f140192i
            com.google.assistant.s.a.j r4 = com.google.assistant.p3994s.p3995a.C53306j.OPA_SMARTSPACE
            com.google.assistant.s.a.gt r7 = com.google.assistant.p3994s.p3995a.C53245gt.f139564n
            com.google.protobuf.eb r7 = r7.getParserForType()
            java.lang.String r0 = "weather_current"
            com.google.common.util.concurrent.cx r4 = r13.mo106076c(r4, r3, r0, r7)
            com.google.android.libraries.gsa.k.g r3 = r10.f316837g
            com.google.android.apps.gsa.staticplugins.opa.worker.ag r7 = new com.google.android.apps.gsa.staticplugins.opa.worker.ag
            r7.<init>(r10, r1, r2)
            java.lang.String r2 = "logStreamzForSmartspaceWeather"
            com.google.common.util.concurrent.cx r2 = r3.mo28210j(r4, r2, r7)
            r14.add(r2)
            r7 = r1
        L_0x0296:
            if (r7 != 0) goto L_0x029e
            r1 = 0
            r0 = r27
        L_0x029b:
            r7 = 1
            goto L_0x005b
        L_0x029e:
            android.content.Context r1 = r10.f316834b
            com.google.android.apps.search.assistant.platform.pcp.i.bm r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124086bm.m203508a(r1, r12)
            int r2 = r5.f139956bk
            com.google.common.b.gu r1 = r1.mo106279b(r2)
            r9.mo55396h(r1)
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f316835c
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247871M
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x02e2
            int r1 = r5.f139956bk
            r4 = 1
            if (r1 != r4) goto L_0x02e3
            android.content.Context r0 = r10.f316834b
            com.google.android.apps.search.assistant.platform.pcp.i.cm r0 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124114cm.m203535a(r0, r12)
            java.lang.String r1 = r6.f140040e
            java.nio.charset.Charset r2 = p3186j$.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r2)
            com.google.common.util.concurrent.cx r0 = r0.mo106291b(r7, r1, r15)
            r14.add(r0)
            r22 = r8
            r26 = r9
            r19 = r10
            r18 = r11
            r28 = r12
            r21 = r15
            r15 = 1
            r17 = 0
            r12 = r5
            goto L_0x0312
        L_0x02e2:
            r4 = 1
        L_0x02e3:
            com.google.android.libraries.storage.b.e r3 = r13.f341550b
            com.google.android.apps.gsa.staticplugins.opa.worker.ab r2 = new com.google.android.apps.gsa.staticplugins.opa.worker.ab
            r1 = r2
            r18 = r11
            r11 = r2
            r2 = r10
            r19 = r10
            r10 = r3
            r3 = r5
            r17 = 0
            r20 = 1
            r4 = r12
            r28 = r12
            r12 = r5
            r5 = r0
            r0 = r6
            r6 = r15
            r20 = r7
            r21 = r15
            r15 = 1
            r7 = r13
            r22 = r8
            r8 = r20
            r26 = r9
            r9 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            com.google.common.util.concurrent.cx r0 = r10.mo45938b(r11)
            r14.add(r0)
        L_0x0312:
            int r0 = r12.f139956bk
            if (r0 != r15) goto L_0x032e
            r0 = r19
            com.google.android.apps.gsa.opa.smartspace.w r1 = r0.f316843m
            com.google.android.apps.gsa.u.b r2 = com.google.android.apps.gsa.p8852u.C118569b.PCP_SMARTSPACE_WEATHER_UPDATE
            r3 = 1
            r1.mo77192a(r2, r3)
            r12 = r28
            r10 = r0
            r11 = r18
            r15 = r21
            r8 = r22
            r9 = r26
            r1 = 0
            goto L_0x0356
        L_0x032e:
            r0 = r27
            r12 = r28
            r11 = r18
            r10 = r19
            r15 = r21
            r8 = r22
            r9 = r26
            r1 = 0
            goto L_0x029b
        L_0x033f:
            r22 = r8
            r26 = r9
            r0 = r10
            r18 = r11
            r28 = r12
            r21 = r15
            r15 = 1
            r12 = r28
            r10 = r0
            r11 = r18
            r15 = r21
            r8 = r22
            r9 = r26
        L_0x0356:
            r7 = 1
            r0 = r27
            goto L_0x005b
        L_0x035b:
            r26 = r9
            r0 = r10
            r18 = r11
            r21 = r15
            if (r1 == 0) goto L_0x039c
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r1 = r0.f316842l
            r2 = r18
            boolean r3 = r2.f140186c
            int r4 = r2.f140193j
            com.google.assistant.s.a.j r4 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r4)
            if (r4 != 0) goto L_0x0374
            com.google.assistant.s.a.j r4 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x0374:
            int r4 = r4.f139793X
            r1.mo109912aj(r3, r4)
            com.google.common.f.a.d r1 = r0.f316845o
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            r3 = 28873(0x70c9, float:4.046E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            boolean r3 = r2.f140186c
            int r2 = r2.f140193j
            com.google.assistant.s.a.j r2 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r2)
            if (r2 != 0) goto L_0x0395
            com.google.assistant.s.a.j r2 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x0395:
            java.lang.String r4 = "Empty zero state response - missing StructuredDataRepresentation: is_partial_data_response=%b, client_type=%d"
            int r2 = r2.f139793X
            r1.mo56356I(r4, r3, r2)
        L_0x039c:
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L_0x03a5
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x03f6
        L_0x03a5:
            com.google.apps.tiktok.tracing.contrib.b.j r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84752c(r14)
            com.google.android.apps.gsa.staticplugins.opa.worker.ac r2 = new com.google.android.apps.gsa.staticplugins.opa.worker.ac
            r3 = r21
            r4 = r26
            r2.<init>(r0, r3, r4)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = r1.mo51521b(r2, r0)
            goto L_0x03f6
        L_0x03b9:
            r0 = r10
            r2 = r11
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r1 = r0.f316842l
            boolean r3 = r2.f140186c
            int r4 = r2.f140193j
            com.google.assistant.s.a.j r4 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r4)
            if (r4 != 0) goto L_0x03c9
            com.google.assistant.s.a.j r4 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x03c9:
            int r4 = r4.f139793X
            r1.mo109912aj(r3, r4)
            com.google.common.f.a.d r0 = r0.f316845o
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r1 = 28868(0x70c4, float:4.0453E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            boolean r1 = r2.f140186c
            int r2 = r2.f140193j
            com.google.assistant.s.a.j r2 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r2)
            if (r2 != 0) goto L_0x03ea
            com.google.assistant.s.a.j r2 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x03ea:
            java.lang.String r3 = "Empty zero state response is_partial_data_response=%b, client_type=%d"
            int r2 = r2.f139793X
            r0.mo56356I(r3, r1, r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x03f6
        L_0x03f4:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x03f6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.C114259af.mo17879a(java.lang.Object):java.lang.Object");
    }
}
