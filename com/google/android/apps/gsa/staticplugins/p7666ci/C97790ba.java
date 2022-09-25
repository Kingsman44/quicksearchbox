package com.google.android.apps.gsa.staticplugins.p7666ci;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.ba */
/* compiled from: PG */
public final /* synthetic */ class C97790ba implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C97811bv f273032a;

    /* renamed from: b */
    public final /* synthetic */ C123777f f273033b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f273034c;

    /* renamed from: d */
    public final /* synthetic */ List f273035d;

    /* renamed from: e */
    public final /* synthetic */ List f273036e;

    /* renamed from: f */
    public final /* synthetic */ C58833ax f273037f;

    /* renamed from: g */
    public final /* synthetic */ C71207aq f273038g;

    /* renamed from: h */
    public final /* synthetic */ C60870cx f273039h;

    /* renamed from: i */
    public final /* synthetic */ C58833ax f273040i;

    /* renamed from: j */
    public final /* synthetic */ C2164c f273041j;

    public /* synthetic */ C97790ba(C97811bv bvVar, C123777f fVar, C53306j jVar, List list, List list2, C58833ax axVar, C71207aq aqVar, C60870cx cxVar, C58833ax axVar2, C2164c cVar) {
        this.f273032a = bvVar;
        this.f273033b = fVar;
        this.f273034c = jVar;
        this.f273035d = list;
        this.f273036e = list2;
        this.f273037f = axVar;
        this.f273038g = aqVar;
        this.f273039h = cxVar;
        this.f273040i = axVar2;
        this.f273041j = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17870a(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            com.google.android.apps.gsa.staticplugins.ci.bv r1 = r0.f273032a
            com.google.android.apps.search.assistant.platform.pcp.f.f r2 = r0.f273033b
            com.google.assistant.s.a.j r9 = r0.f273034c
            java.util.List r10 = r0.f273035d
            java.util.List r11 = r0.f273036e
            com.google.common.base.ax r12 = r0.f273037f
            j.a.i.b.a.aq r13 = r0.f273038g
            com.google.common.util.concurrent.cx r14 = r0.f273039h
            com.google.common.base.ax r15 = r0.f273040i
            androidx.d.a.c r8 = r0.f273041j
            r3 = r24
            java.util.LinkedHashSet r3 = (java.util.LinkedHashSet) r3
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.f273109a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "PCP.ImplV0"
            r4.mo56378ag(r5, r7)
            java.lang.String r5 = "#getOnDeviceMediaProactiveData() onDeviceMediaAppsForNewFetch %s"
            r6 = 30289(0x7651, float:4.2444E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56389s(r5, r3)
            com.google.protobuf.bt r4 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at.f341744i
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r2.mo58887l(r4)
            com.google.protobuf.bf r5 = r2.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            r5 = 1
            if (r4 == 0) goto L_0x006c
            com.google.protobuf.bt r4 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at.f341744i
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r2.mo58887l(r4)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r6 = r4.f169971d
            java.lang.Object r2 = r2.mo58854l(r6)
            if (r2 != 0) goto L_0x0058
            java.lang.Object r2 = r4.f169969b
            goto L_0x005c
        L_0x0058:
            java.lang.Object r2 = r4.mo58889c(r2)
        L_0x005c:
            com.google.android.apps.search.assistant.platform.pcp.f.at r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at) r2
            int r2 = r2.f341750e
            int r2 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123725as.m203079a(r2)
            if (r2 != 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            r4 = 2
            if (r2 != r4) goto L_0x006c
            r2 = 1
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            boolean r4 = r3.isEmpty()
            java.lang.String r6 = "ON_DEVICE_MEDIA_RECOMMENDATION"
            if (r4 == 0) goto L_0x00ba
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.f273109a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r7)
            java.lang.String r4 = "using cache for: %s"
            r7 = 30291(0x7653, float:4.2447E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56389s(r4, r6)
            if (r2 == 0) goto L_0x0090
            com.google.android.apps.search.assistant.platform.pcp.i.bz r2 = r1.f273141v
            com.google.android.libraries.search.logging.d.kp r2 = r2.f342762a
            r2.mo41707v(r5)
        L_0x0090:
            com.google.android.apps.gsa.t.h.bs r2 = r1.f273131l
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r10)
            com.google.common.util.concurrent.cx r2 = r2.mo103693d(r9, r3, r11)
            com.google.android.apps.gsa.t.h.k r3 = r1.f273138s
            com.google.android.libraries.performance.primes.au r10 = com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.f273112d
            r4 = r2
            r5 = r12
            r6 = r13
            r7 = r9
            r11 = r8
            r8 = r10
            r3.mo103699b(r4, r5, r6, r7, r8)
            com.google.android.apps.gsa.t.h.k r3 = r1.f273138s
            com.google.android.libraries.performance.primes.au r8 = com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.f273113e
            r4 = r14
            r5 = r15
            r3.mo103699b(r4, r5, r6, r7, r8)
            com.google.android.apps.gsa.t.h.bs r3 = r1.f273131l
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            com.google.android.libraries.gsa.k.g r1 = r1.f273126g
            r3.mo103695g(r2, r11, r4, r1)
            return
        L_0x00ba:
            r14 = r8
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.f273109a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r8, r7)
            java.lang.String r8 = "retrieving from both cache and new fetch for %s"
            r15 = 30290(0x7652, float:4.2445E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r15)).mo56389s(r8, r6)
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.f273109a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r6, r7)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r6 = 30278(0x7646, float:4.2429E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r6 = "newFetch(): Calling media manager by {%s} for apps {%s}."
            java.lang.String r8 = r9.name()
            r4.mo56354G(r6, r8, r3)
            java.util.LinkedHashSet r15 = new java.util.LinkedHashSet
            r15.<init>()
            java.util.Iterator r16 = r3.iterator()
        L_0x00f4:
            boolean r3 = r16.hasNext()
            r4 = 9
            if (r3 == 0) goto L_0x028e
            java.lang.Object r3 = r16.next()
            android.content.ComponentName r3 = (android.content.ComponentName) r3
            com.google.android.apps.gsa.t.h.k r6 = r1.f273138s
            com.google.common.base.ax r6 = r6.mo103698a()
            j$.util.concurrent.ConcurrentHashMap r8 = r1.f273144y
            java.lang.Object r8 = r8.get(r3)
            com.google.common.util.concurrent.cx r8 = (com.google.common.util.concurrent.C60870cx) r8
            j.a.i.b.a.as r17 = p5535j.p5536a.p5562i.p5568b.p5569a.C71209as.f190080g
            com.google.protobuf.bn r17 = r17.createBuilder()
            r5 = r17
            j.a.i.b.a.ar r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar) r5
            r5.mo62657b(r4)
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            j.a.i.b.a.as r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71209as) r4
            int r0 = r4.f190083a
            r17 = r5
            r5 = 1
            r0 = r0 | r5
            r4.f190083a = r0
            r4.f190085c = r5
            java.lang.String r0 = "_"
            java.lang.String r4 = "PcpV0OnDeviceMediaPerApp_"
            if (r8 == 0) goto L_0x016f
            r15.add(r8)
            com.google.android.apps.gsa.t.h.k r5 = r1.f273138s
            com.google.android.apps.gsa.t.h.r r3 = com.google.android.apps.gsa.p8839t.p8847h.C118443s.m196633a(r3)
            com.google.android.libraries.performance.primes.au r3 = com.google.android.libraries.performance.primes.C31164au.m58093c(r4, r3)
            r18 = r7
            r4 = 1
            com.google.android.libraries.performance.primes.au[] r7 = new com.google.android.libraries.performance.primes.C31164au[r4]
            com.google.android.libraries.performance.primes.au r0 = com.google.android.libraries.performance.primes.C31164au.m58092b(r0)
            r19 = 0
            r7[r19] = r0
            com.google.android.libraries.performance.primes.au r0 = com.google.android.libraries.performance.primes.C31164au.m58091a(r3, r7)
            r3 = r5
            r5 = 1
            r4 = r8
            r8 = 1
            r5 = r6
            r7 = 0
            r6 = r17
            r19 = r14
            r14 = r18
            r7 = r9
            r18 = r13
            r13 = 1
            r8 = r0
            r3.mo103700c(r4, r5, r6, r7, r8)
            r0 = r23
            r7 = r14
            r13 = r18
            r14 = r19
        L_0x016d:
            r5 = 1
            goto L_0x00f4
        L_0x016f:
            r18 = r13
            r19 = r14
            r13 = 1
            r14 = r7
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.google.android.apps.gsa.search.core.i.t r7 = r1.f273129j
            com.google.android.apps.gsa.shared.m.h r8 = com.google.android.apps.gsa.shared.p7066m.C90069du.f249707A
            com.google.common.b.gu r7 = r7.mo79745c(r8)
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.f273109a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r13, r14)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            r13 = 30279(0x7647, float:4.243E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r13)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            java.lang.String r13 = "#getPreferredFolderByMediaApp() Clients enable folder filtering {%s} current {%s}"
            r20 = r12
            java.lang.String r12 = r9.name()
            r8.mo56354G(r13, r7, r12)
            java.lang.String r8 = r9.name()
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x01ad
            goto L_0x021c
        L_0x01ad:
            com.google.android.apps.gsa.search.core.i.t r7 = r1.f273129j
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247921aj
            boolean r7 = r7.mo79746e(r8)
            if (r7 == 0) goto L_0x021c
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.f273109a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r14)
            java.lang.String r8 = "Folders mapping enabled"
            r12 = 30280(0x7648, float:4.2431E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r12)).mo56386p(r8)
            com.google.android.apps.gsa.search.core.i.t r7 = r1.f273129j
            com.google.android.apps.gsa.shared.m.h r8 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247939bA
            com.google.common.b.hd r7 = r7.mo79752r(r8)
            java.util.Set r8 = r7.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x01d9:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x021c
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r7.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            r21 = r7
            java.lang.String r7 = "\\|"
            r22 = r8
            r8 = -1
            java.lang.String[] r7 = r13.split(r7, r8)
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.f273109a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r13, r14)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            r13 = 30281(0x7649, float:4.2433E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r13)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            java.lang.String r13 = "Preferred folders %s : %s"
            r8.mo56354G(r13, r12, r7)
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89844l(r7)
            r5.put(r12, r7)
            r7 = r21
            r8 = r22
            goto L_0x01d9
        L_0x021c:
            com.google.android.libraries.assistant.pcp.k.j r7 = r1.f273134o
            java.lang.String r8 = r3.getPackageName()
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89845m()
            java.lang.Object r5 = p3186j$.util.Map.EL.getOrDefault(r5, r8, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.common.util.concurrent.cx r5 = r7.mo24192a(r3, r9, r5)
            j$.util.concurrent.ConcurrentHashMap r7 = r1.f273144y
            java.lang.Object r7 = r7.putIfAbsent(r3, r5)
            com.google.common.util.concurrent.cx r7 = (com.google.common.util.concurrent.C60870cx) r7
            if (r7 == 0) goto L_0x025f
            r15.add(r7)
            com.google.android.apps.gsa.t.h.k r5 = r1.f273138s
            com.google.android.apps.gsa.t.h.r r3 = com.google.android.apps.gsa.p8839t.p8847h.C118443s.m196633a(r3)
            com.google.android.libraries.performance.primes.au r3 = com.google.android.libraries.performance.primes.C31164au.m58093c(r4, r3)
            r4 = 1
            com.google.android.libraries.performance.primes.au[] r8 = new com.google.android.libraries.performance.primes.C31164au[r4]
            com.google.android.libraries.performance.primes.au r0 = com.google.android.libraries.performance.primes.C31164au.m58092b(r0)
            r4 = 0
            r8[r4] = r0
            com.google.android.libraries.performance.primes.au r8 = com.google.android.libraries.performance.primes.C31164au.m58091a(r3, r8)
            r3 = r5
            r4 = r7
            r5 = r6
            r6 = r17
            r7 = r9
            r3.mo103700c(r4, r5, r6, r7, r8)
            goto L_0x0283
        L_0x025f:
            r15.add(r5)
            com.google.android.apps.gsa.t.h.k r7 = r1.f273138s
            com.google.android.apps.gsa.t.h.r r3 = com.google.android.apps.gsa.p8839t.p8847h.C118443s.m196633a(r3)
            com.google.android.libraries.performance.primes.au r3 = com.google.android.libraries.performance.primes.C31164au.m58093c(r4, r3)
            r4 = 1
            com.google.android.libraries.performance.primes.au[] r8 = new com.google.android.libraries.performance.primes.C31164au[r4]
            com.google.android.libraries.performance.primes.au r0 = com.google.android.libraries.performance.primes.C31164au.m58092b(r0)
            r4 = 0
            r8[r4] = r0
            com.google.android.libraries.performance.primes.au r8 = com.google.android.libraries.performance.primes.C31164au.m58091a(r3, r8)
            r3 = r7
            r4 = r5
            r5 = r6
            r6 = r17
            r7 = r9
            r3.mo103700c(r4, r5, r6, r7, r8)
        L_0x0283:
            r0 = r23
            r7 = r14
            r13 = r18
            r14 = r19
            r12 = r20
            goto L_0x016d
        L_0x028e:
            r20 = r12
            r18 = r13
            r19 = r14
            com.google.android.apps.gsa.t.h.bs r0 = r1.f273131l
            j$.util.concurrent.ConcurrentHashMap r3 = r1.f273144y
            java.util.Iterator r5 = r15.iterator()
        L_0x029c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02cc
            java.lang.Object r6 = r5.next()
            com.google.common.util.concurrent.cx r6 = (com.google.common.util.concurrent.C60870cx) r6
            com.google.android.libraries.gsa.k.g r7 = r0.f328694o
            com.google.android.apps.gsa.t.h.ae r8 = new com.google.android.apps.gsa.t.h.ae
            r8.<init>(r0, r9)
            java.lang.String r12 = "convertToMediaRecommendation"
            com.google.common.util.concurrent.cx r6 = r7.mo28210j(r6, r12, r8)
            com.google.android.libraries.gsa.k.g r7 = r0.f328694o
            com.google.android.apps.gsa.t.h.af r8 = new com.google.android.apps.gsa.t.h.af
            r8.<init>(r0, r9, r3)
            com.google.android.apps.gsa.shared.util.c.ag r12 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r13 = "#attachCallbackToUpdateOnDeviceMediaInCache()"
            r12.<init>(r6, r7, r13, r8)
            com.google.android.apps.gsa.t.h.ag r6 = new com.google.android.apps.gsa.t.h.ag
            r6.<init>(r0)
            r12.mo85223a(r6)
            goto L_0x029c
        L_0x02cc:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.C60856cj.m92900i(r0)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x02f4
            com.google.android.apps.gsa.t.h.bs r0 = r1.f273131l
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.mo103696h(r9, r3)
            if (r0 == 0) goto L_0x02f4
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r10)
            if (r2 == 0) goto L_0x0338
            com.google.android.apps.search.assistant.platform.pcp.i.bz r2 = r1.f273141v
            com.google.android.libraries.search.logging.d.kp r2 = r2.f342762a
            r3 = 1
            r2.mo41707v(r3)
            goto L_0x0338
        L_0x02f4:
            com.google.android.apps.gsa.t.h.bs r0 = r1.f273131l
            com.google.common.f.a.d r3 = r0.f328686g
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "#mergeOnDeviceMediaFromCacheAndNewFetch() final media apps %s"
            r5 = 6980(0x1b44, float:9.781E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56389s(r4, r11)
            boolean r3 = r11.isEmpty()
            if (r3 == 0) goto L_0x0312
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x032e
        L_0x0312:
            com.google.android.libraries.gsa.k.g r3 = r0.f328694o
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92906o(r15)
            com.google.android.apps.gsa.t.h.ab r5 = new com.google.android.apps.gsa.t.h.ab
            r5.<init>(r0, r9)
            java.lang.String r6 = "convertNewFetchToMap"
            com.google.common.util.concurrent.cx r4 = r3.mo28210j(r4, r6, r5)
            com.google.android.apps.gsa.t.h.ac r5 = new com.google.android.apps.gsa.t.h.ac
            r5.<init>(r0, r10, r11, r9)
            java.lang.String r0 = "Merge on-device media from cache and new fetch"
            com.google.common.util.concurrent.cx r0 = r3.mo28209i(r4, r0, r5)
        L_0x032e:
            if (r2 == 0) goto L_0x0338
            com.google.android.apps.search.assistant.platform.pcp.i.bz r2 = r1.f273141v
            com.google.android.libraries.search.logging.d.kp r2 = r2.f342762a
            r3 = 0
            r2.mo41707v(r3)
        L_0x0338:
            com.google.android.apps.gsa.t.h.bs r2 = r1.f273131l
            com.google.common.util.concurrent.cx r0 = r2.mo103693d(r9, r0, r11)
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L_0x0351
            com.google.android.libraries.gsa.k.g r2 = r1.f273126g
            com.google.android.apps.gsa.staticplugins.ci.bc r3 = new com.google.android.apps.gsa.staticplugins.ci.bc
            r3.<init>(r1, r11, r9)
            java.lang.String r4 = "Add fallback if needed"
            com.google.common.util.concurrent.cx r0 = r2.mo28210j(r0, r4, r3)
        L_0x0351:
            com.google.android.apps.gsa.t.h.k r3 = r1.f273138s
            com.google.android.libraries.performance.primes.au r8 = com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.f273112d
            r4 = r0
            r5 = r20
            r6 = r18
            r7 = r9
            r3.mo103699b(r4, r5, r6, r7, r8)
            com.google.android.apps.gsa.t.h.bs r2 = r1.f273131l
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            com.google.android.libraries.gsa.k.g r1 = r1.f273126g
            r4 = r19
            r2.mo103695g(r0, r4, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7666ci.C97790ba.mo17870a(java.lang.Object):void");
    }
}
