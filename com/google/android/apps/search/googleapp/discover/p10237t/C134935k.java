package com.google.android.apps.search.googleapp.discover.p10237t;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57271bz;
import java.util.List;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.t.k */
/* compiled from: PG */
public final class C134935k {

    /* renamed from: a */
    public static final C59071e f367380a = C59071e.m91331h();

    /* renamed from: b */
    private final Set f367381b;

    /* renamed from: c */
    private final C134931g f367382c;

    /* renamed from: d */
    private final C21370a f367383d;

    public C134935k(Set set, C134931g gVar, C21370a aVar, C60950i iVar) {
        C69664n.m101061g(set, "dataOperationTransformers");
        C69664n.m101061g(gVar, "dataOperationsDebuggable");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(iVar, "timeSource");
        this.f367381b = set;
        this.f367382c = gVar;
        this.f367383d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:256:0x07ed A[LOOP:3: B:254:0x07e7->B:256:0x07ed, LOOP_END] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m218819c(java.util.List r22, com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57271bz r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r22.iterator()
        L_0x000d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x082f
            java.lang.Object r4 = r3.next()
            com.google.bv.e.b.c.a.ac r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57221ac) r4
            int r5 = r4.f152754c
            int r5 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57220ab.m88271a(r5)
            r6 = 1
            if (r5 != 0) goto L_0x0023
            r5 = 1
        L_0x0023:
            com.google.bv.e.b.c.a.cd r7 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57276cd.UNKNOWN_CONDITION
            int r5 = r5 + -1
            if (r5 == r6) goto L_0x081b
            r8 = 3
            r9 = 2
            if (r5 == r9) goto L_0x00bd
            if (r5 == r8) goto L_0x0058
            com.google.common.f.e r5 = f367380a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            int r4 = r4.f152754c
            int r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57220ab.m88271a(r4)
            if (r4 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r6 = r4
        L_0x0041:
            com.google.common.f.n r4 = new com.google.common.f.n
            r8 = 40366(0x9dae, float:5.6565E-41)
            r4.<init>(r8)
            r5.mo56379ah(r4)
            java.lang.String r4 = "No valid streamOperation: %s"
            int r6 = r6 + -1
            r5.mo56387q(r4, r6)
        L_0x0053:
            r17 = r3
        L_0x0055:
            r7 = 0
            goto L_0x0826
        L_0x0058:
            com.google.bv.e.b.c.a.cp r5 = r4.f152755d
            if (r5 != 0) goto L_0x005e
            com.google.bv.e.b.c.a.cp r5 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57288cp.f152930c
        L_0x005e:
            int r5 = r5.f152932a
            r5 = r5 & r6
            if (r5 == 0) goto L_0x00a4
            com.google.bv.e.b.c.a.cp r5 = r4.f152755d
            if (r5 != 0) goto L_0x0069
            com.google.bv.e.b.c.a.cp r5 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57288cp.f152930c
        L_0x0069:
            java.lang.String r5 = com.google.android.apps.search.googleapp.discover.p10237t.C134933i.m218817a(r5)
            int r9 = r4.f152752a
            if (r9 != r8) goto L_0x0076
            java.lang.Object r9 = r4.f152753b
            com.google.bv.e.b.c.a.aq r9 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57235aq) r9
            goto L_0x0078
        L_0x0076:
            com.google.bv.e.b.c.a.aq r9 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57235aq.f152787g
        L_0x0078:
            int r9 = r9.f152789a
            if (r9 != r6) goto L_0x0097
            int r7 = r4.f152752a
            if (r7 != r8) goto L_0x0085
            java.lang.Object r4 = r4.f152753b
            com.google.bv.e.b.c.a.aq r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57235aq) r4
            goto L_0x0087
        L_0x0085:
            com.google.bv.e.b.c.a.aq r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57235aq.f152787g
        L_0x0087:
            int r7 = r4.f152789a
            if (r7 != r6) goto L_0x0090
            java.lang.Object r4 = r4.f152790b
            com.google.ai.b.fo r4 = (com.google.p375ai.p378b.C7669fo) r4
            goto L_0x0092
        L_0x0090:
            com.google.ai.b.fo r4 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x0092:
            java.lang.String r7 = com.google.android.apps.search.googleapp.discover.p10237t.C134936l.m218822a(r4)
            goto L_0x0098
        L_0x0097:
            r7 = 0
        L_0x0098:
            com.google.android.apps.search.googleapp.discover.s.bb r4 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.REMOVE
            com.google.android.apps.search.googleapp.discover.s.bj r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.CONTENT
            com.google.android.apps.search.googleapp.discover.s.ac r7 = com.google.android.apps.search.googleapp.discover.p10237t.C134934j.m218818a(r4, r6, r5, r7)
        L_0x00a0:
            r17 = r3
            goto L_0x0826
        L_0x00a4:
            com.google.common.f.e r4 = f367380a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 40358(0x9da6, float:5.6554E-41)
            r5.<init>(r6)
            r4.mo56379ah(r5)
            java.lang.String r5 = "REMOVE defined without a ContentId identifying the item to remove"
            r4.mo56386p(r5)
            goto L_0x0053
        L_0x00bd:
            com.google.bv.e.b.c.a.cp r5 = r4.f152755d
            if (r5 != 0) goto L_0x00c3
            com.google.bv.e.b.c.a.cp r5 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57288cp.f152930c
        L_0x00c3:
            int r5 = r5.f152932a
            r5 = r5 & r6
            if (r5 == 0) goto L_0x07ff
            com.google.bv.e.b.c.a.cp r5 = r4.f152755d
            if (r5 != 0) goto L_0x00ce
            com.google.bv.e.b.c.a.cp r5 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57288cp.f152930c
        L_0x00ce:
            java.lang.String r5 = com.google.android.apps.search.googleapp.discover.p10237t.C134933i.m218817a(r5)
            int r10 = r4.f152752a
            r12 = 9
            r13 = 8
            r14 = 6
            r15 = 5
            if (r10 == 0) goto L_0x00f8
            if (r10 == r8) goto L_0x00f5
            if (r10 == r15) goto L_0x00f2
            if (r10 == r14) goto L_0x00ef
            if (r10 == r13) goto L_0x00ec
            if (r10 == r12) goto L_0x00e9
            r16 = 0
            goto L_0x00fa
        L_0x00e9:
            r16 = 5
            goto L_0x00fa
        L_0x00ec:
            r16 = 4
            goto L_0x00fa
        L_0x00ef:
            r16 = 3
            goto L_0x00fa
        L_0x00f2:
            r16 = 2
            goto L_0x00fa
        L_0x00f5:
            r16 = 1
            goto L_0x00fa
        L_0x00f8:
            r16 = 6
        L_0x00fa:
            int r13 = r16 + -1
            if (r16 == 0) goto L_0x07fd
            java.lang.String r14 = "this.toBuilder()"
            java.lang.String r11 = "_builder.build()"
            java.lang.String r12 = "builder"
            java.lang.String r15 = "value"
            java.lang.String r7 = "newBuilder()"
            if (r13 == 0) goto L_0x04ae
            if (r13 == r6) goto L_0x03e8
            java.lang.String r5 = "values"
            if (r13 == r9) goto L_0x0200
            if (r13 == r8) goto L_0x0053
            r8 = 4
            if (r13 == r8) goto L_0x0120
            r8 = 5
            if (r13 != r8) goto L_0x011a
            goto L_0x0053
        L_0x011a:
            h.g r1 = new h.g
            r1.<init>()
            throw r1
        L_0x0120:
            r8 = 9
            if (r10 != r8) goto L_0x0129
            java.lang.Object r4 = r4.f152753b
            com.google.bv.e.b.c.a.dh r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57307dh) r4
            goto L_0x012b
        L_0x0129:
            com.google.bv.e.b.c.a.dh r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57307dh.f152966c
        L_0x012b:
            java.lang.String r8 = "operation.requestSchedule"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r8)
            com.google.android.apps.search.googleapp.discover.s.ac r8 = com.google.android.apps.search.googleapp.discover.p10214s.C134538ac.f366376d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.ab r8 = (com.google.android.apps.search.googleapp.discover.p10214s.C134537ab) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
            com.google.android.apps.search.googleapp.discover.s.aa r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.apps.search.googleapp.discover.s.ay r10 = com.google.android.apps.search.googleapp.discover.p10214s.C134560ay.f366453g
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.ax r10 = (com.google.android.apps.search.googleapp.discover.p10214s.C134559ax) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r7)
            com.google.android.apps.search.googleapp.discover.s.y r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            com.google.android.apps.search.googleapp.discover.s.e r11 = com.google.android.apps.search.googleapp.discover.p10214s.C134587e.f366522e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.d r11 = (com.google.android.apps.search.googleapp.discover.p10214s.C134586d) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r7)
            com.google.android.apps.search.googleapp.discover.s.c r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            com.google.android.libraries.f.a r11 = r0.f367383d
            long r11 = r11.mo26870b()
            com.google.protobuf.fg r11 = com.google.protobuf.p4750c.C62953e.m95484i(r11)
            java.lang.String r12 = "fromMillis(clock.currentTimeMillis())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r15)
            com.google.android.apps.search.googleapp.discover.s.d r12 = r7.f366521a
            r12.copyOnWrite()
            com.google.protobuf.bv r12 = r12.instance
            com.google.android.apps.search.googleapp.discover.s.e r12 = (com.google.android.apps.search.googleapp.discover.p10214s.C134587e) r12
            r11.getClass()
            r12.f366525b = r11
            int r11 = r12.f366524a
            r11 = r11 | r6
            r12.f366524a = r11
            com.google.protobuf.a.b r11 = new com.google.protobuf.a.b
            com.google.android.apps.search.googleapp.discover.s.d r12 = r7.f366521a
            com.google.protobuf.bv r12 = r12.instance
            com.google.android.apps.search.googleapp.discover.s.e r12 = (com.google.android.apps.search.googleapp.discover.p10214s.C134587e) r12
            com.google.protobuf.cq r12 = r12.f366526c
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            java.lang.String r13 = "_builder.getRefreshDurationList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            r11.<init>(r12)
            int r11 = r4.f152968a
            if (r11 != r6) goto L_0x01a1
            java.lang.Object r4 = r4.f152969b
            com.google.bv.e.b.c.a.dg r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57306dg) r4
            goto L_0x01a3
        L_0x01a1:
            com.google.bv.e.b.c.a.dg r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57306dg.f152963b
        L_0x01a3:
            com.google.protobuf.cq r4 = r4.f152965a
            java.lang.String r6 = "requestSchedule.timeBase…hTimeFromResponseTimeList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)
            com.google.android.apps.search.googleapp.discover.s.d r5 = r7.f366521a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.apps.search.googleapp.discover.s.e r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134587e) r5
            com.google.protobuf.cq r6 = r5.f366526c
            boolean r11 = r6.mo58948c()
            if (r11 != 0) goto L_0x01c4
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r5.f366526c = r6
        L_0x01c4:
            com.google.protobuf.cq r5 = r5.f366526c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r5)
            com.google.android.apps.search.googleapp.discover.s.d r4 = r7.f366521a
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.android.apps.search.googleapp.discover.s.e r4 = (com.google.android.apps.search.googleapp.discover.p10214s.C134587e) r4
            int r5 = r4.f366524a
            r5 = r5 | r9
            r4.f366524a = r5
            r5 = 0
            r4.f366527d = r5
            com.google.android.apps.search.googleapp.discover.s.e r4 = r7.mo111829a()
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r15)
            com.google.android.apps.search.googleapp.discover.s.ax r5 = r10.f366559a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.apps.search.googleapp.discover.s.ay r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r5
            r4.getClass()
            r5.f366457c = r4
            r4 = 18
            r5.f366456b = r4
            com.google.android.apps.search.googleapp.discover.s.ay r4 = r10.mo111840a()
            r8.mo111814d(r4)
            com.google.android.apps.search.googleapp.discover.s.ac r7 = r8.mo111811a()
            goto L_0x00a0
        L_0x0200:
            java.lang.String r8 = "dataOperation"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r8)
            com.google.bv.e.b.c.a.cp r8 = r4.f152755d
            if (r8 != 0) goto L_0x020b
            com.google.bv.e.b.c.a.cp r8 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57288cp.f152930c
        L_0x020b:
            com.google.ai.b.fo r8 = r8.f152933b
            if (r8 != 0) goto L_0x0211
            com.google.ai.b.fo r8 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x0211:
            java.lang.String r10 = "dataOperation.metadata.contentId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r10)
            int r10 = r8.f26635a
            r10 = r10 & r9
            if (r10 == 0) goto L_0x021c
            goto L_0x0252
        L_0x021c:
            long r9 = r8.f26638d
            r17 = 0
            int r19 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x0252
            com.google.protobuf.bn r8 = r8.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r14)
            com.google.ai.b.fl r8 = (com.google.p375ai.p378b.C7666fl) r8
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r12)
            java.util.UUID r9 = java.util.UUID.randomUUID()
            long r9 = r9.getMostSignificantBits()
            r8.copyOnWrite()
            com.google.protobuf.bv r14 = r8.instance
            com.google.ai.b.fo r14 = (com.google.p375ai.p378b.C7669fo) r14
            int r13 = r14.f26635a
            r17 = 4
            r13 = r13 | 4
            r14.f26635a = r13
            r14.f26638d = r9
            com.google.protobuf.bv r8 = r8.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r11)
            com.google.ai.b.fo r8 = (com.google.p375ai.p378b.C7669fo) r8
        L_0x0252:
            java.lang.String r8 = com.google.android.apps.search.googleapp.discover.p10237t.C134936l.m218822a(r8)
            com.google.android.apps.search.googleapp.discover.s.ac r9 = com.google.android.apps.search.googleapp.discover.p10214s.C134538ac.f366376d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.ab r9 = (com.google.android.apps.search.googleapp.discover.p10214s.C134537ab) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)
            com.google.android.apps.search.googleapp.discover.s.aa r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            int r10 = r4.f152752a
            r13 = 6
            if (r10 != r13) goto L_0x026f
            java.lang.Object r4 = r4.f152753b
            com.google.bv.e.b.c.a.ct r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57292ct) r4
            goto L_0x0271
        L_0x026f:
            com.google.bv.e.b.c.a.ct r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57292ct.f152935b
        L_0x0271:
            java.lang.String r10 = "dataOperation.renderData"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r10)
            int r10 = r4.f152937a
            int r10 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57291cs.m88297a(r10)
            if (r10 != 0) goto L_0x027f
            r10 = 1
        L_0x027f:
            int r10 = r10 + -1
            if (r10 == r6) goto L_0x0354
            r6 = 2
            if (r10 == r6) goto L_0x02b3
            com.google.common.f.e r4 = com.google.android.apps.search.googleapp.discover.p10237t.C134937m.f367384a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 40376(0x9db8, float:5.6579E-41)
            r5.<init>(r6)
            r4.mo56379ah(r5)
            java.lang.String r5 = "RenderData has unknown type"
            r4.mo56386p(r5)
            com.google.android.apps.search.googleapp.discover.s.ay r4 = com.google.android.apps.search.googleapp.discover.p10214s.C134560ay.f366453g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.ax r4 = (com.google.android.apps.search.googleapp.discover.p10214s.C134559ax) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r7)
            com.google.android.apps.search.googleapp.discover.s.y r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            com.google.android.apps.search.googleapp.discover.s.ay r4 = r4.mo111840a()
            goto L_0x03c1
        L_0x02b3:
            com.google.protobuf.bt r6 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57165v.f152612c
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r4.mo58887l(r6)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r10 = r6.f169971d
            java.lang.Object r4 = r4.mo58854l(r10)
            if (r4 != 0) goto L_0x02c9
            java.lang.Object r4 = r6.f169969b
            goto L_0x02cd
        L_0x02c9:
            java.lang.Object r4 = r6.mo58889c(r4)
        L_0x02cd:
            java.lang.String r6 = "renderData.getExtension(…fetchResourcesRenderData)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            com.google.bv.e.b.b.b.v r4 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57165v) r4
            com.google.protobuf.cq r6 = r4.f152614a
            r6.size()
            com.google.android.apps.search.googleapp.discover.s.ay r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134560ay.f366453g
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.ax r6 = (com.google.android.apps.search.googleapp.discover.p10214s.C134559ax) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.android.apps.search.googleapp.discover.s.y r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            r6.mo111841b(r8)
            com.google.android.apps.search.googleapp.discover.s.ao r10 = com.google.android.apps.search.googleapp.discover.p10214s.C134550ao.f366417b
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.an r10 = (com.google.android.apps.search.googleapp.discover.p10214s.C134549an) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r12)
            com.google.protobuf.a.b r12 = new com.google.protobuf.a.b
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.apps.search.googleapp.discover.s.ao r13 = (com.google.android.apps.search.googleapp.discover.p10214s.C134550ao) r13
            com.google.protobuf.cq r13 = r13.f366419a
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            java.lang.String r14 = "_builder.getResourcesList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            r12.<init>(r13)
            com.google.protobuf.cq r4 = r4.f152614a
            java.lang.String r12 = "discoverPrefetchResources.resourcesList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.android.apps.search.googleapp.discover.s.ao r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134550ao) r5
            com.google.protobuf.cq r12 = r5.f366419a
            boolean r13 = r12.mo58948c()
            if (r13 != 0) goto L_0x032c
            com.google.protobuf.cq r12 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r12)
            r5.f366419a = r12
        L_0x032c:
            com.google.protobuf.cq r5 = r5.f366419a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r5)
            com.google.protobuf.bv r4 = r10.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r11)
            com.google.android.apps.search.googleapp.discover.s.ao r4 = (com.google.android.apps.search.googleapp.discover.p10214s.C134550ao) r4
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r15)
            com.google.android.apps.search.googleapp.discover.s.ax r5 = r6.f366559a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.apps.search.googleapp.discover.s.ay r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r5
            r4.getClass()
            r5.f366457c = r4
            r4 = 19
            r5.f366456b = r4
            com.google.android.apps.search.googleapp.discover.s.ay r4 = r6.mo111840a()
            goto L_0x03c1
        L_0x0354:
            com.google.protobuf.bt r5 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57118ab.f152470c
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r4.mo58887l(r5)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r6 = r5.f169971d
            java.lang.Object r4 = r4.mo58854l(r6)
            if (r4 != 0) goto L_0x036a
            java.lang.Object r4 = r5.f169969b
            goto L_0x036e
        L_0x036a:
            java.lang.Object r4 = r5.mo58889c(r4)
        L_0x036e:
            java.lang.String r5 = "renderData.getExtension(…mentsRenderDataExtension)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.bv.e.b.b.b.ab r4 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57118ab) r4
            com.google.bv.j.b.a.p r5 = r4.f152472a
            if (r5 != 0) goto L_0x037b
            com.google.bv.j.b.a.p r5 = com.google.p4283bv.p4380j.p4385b.p4386a.C57784p.f154382f
        L_0x037b:
            java.lang.String r6 = "elementsRenderData.renderData"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.protos.youtube.elements.d.a.b r6 = r5.f154386c
            if (r6 != 0) goto L_0x0386
            com.google.protos.youtube.elements.d.a.b r6 = com.google.protos.youtube.elements.p5168d.p5169a.C66184b.f179967b
        L_0x0386:
            com.google.protobuf.cq r6 = r6.f179969a
            r6.size()
            com.google.bv.j.b.a.h r5 = r5.f154387d
            if (r5 != 0) goto L_0x0391
            com.google.bv.j.b.a.h r5 = com.google.p4283bv.p4380j.p4385b.p4386a.C57776h.f154365b
        L_0x0391:
            com.google.protobuf.cq r5 = r5.f154367a
            r5.size()
            com.google.android.apps.search.googleapp.discover.s.ay r5 = com.google.android.apps.search.googleapp.discover.p10214s.C134560ay.f366453g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.ax r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134559ax) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            com.google.android.apps.search.googleapp.discover.s.y r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            r5.mo111841b(r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r15)
            com.google.android.apps.search.googleapp.discover.s.ax r6 = r5.f366559a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.apps.search.googleapp.discover.s.ay r6 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r6
            r4.getClass()
            r6.f366457c = r4
            r4 = 16
            r6.f366456b = r4
            com.google.android.apps.search.googleapp.discover.s.ay r4 = r5.mo111840a()
        L_0x03c1:
            r9.mo111814d(r4)
            com.google.android.apps.search.googleapp.discover.s.bk r4 = com.google.android.apps.search.googleapp.discover.p10214s.C134573bk.f366497h
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.az r4 = (com.google.android.apps.search.googleapp.discover.p10214s.C134561az) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r7)
            com.google.android.apps.search.googleapp.discover.s.bq r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            r4.mo111823b(r8)
            com.google.android.apps.search.googleapp.discover.s.bb r5 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.REQUIRED
            r4.mo111824c(r5)
            com.google.android.apps.search.googleapp.discover.s.bk r4 = r4.mo111822a()
            r9.mo111815e(r4)
            com.google.android.apps.search.googleapp.discover.s.ac r7 = r9.mo111811a()
            goto L_0x00a0
        L_0x03e8:
            r8 = 5
            if (r10 != r8) goto L_0x03f0
            java.lang.Object r4 = r4.f152753b
            com.google.bv.e.b.c.a.dp r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp) r4
            goto L_0x03f2
        L_0x03f0:
            com.google.bv.e.b.c.a.dp r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp.f152986c
        L_0x03f2:
            java.lang.String r8 = "operation.nextPageToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r8)
            int r8 = r4.f152988a
            r8 = r8 & r6
            if (r8 == 0) goto L_0x0494
            com.google.ai.b.fo r8 = r4.f152989b
            if (r8 != 0) goto L_0x0402
            com.google.ai.b.fo r8 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x0402:
            java.lang.String r8 = com.google.android.apps.search.googleapp.discover.p10237t.C134936l.m218822a(r8)
            com.google.android.apps.search.googleapp.discover.s.ak r9 = com.google.android.apps.search.googleapp.discover.p10214s.C134546ak.f366404f
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.aj r9 = (com.google.android.apps.search.googleapp.discover.p10214s.C134545aj) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r12)
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.apps.search.googleapp.discover.s.ak r10 = (com.google.android.apps.search.googleapp.discover.p10214s.C134546ak) r10
            int r12 = r10.f366406a
            r6 = r6 | r12
            r10.f366406a = r6
            r10.f366409d = r5
            r9.copyOnWrite()
            com.google.protobuf.bv r6 = r9.instance
            com.google.android.apps.search.googleapp.discover.s.ak r6 = (com.google.android.apps.search.googleapp.discover.p10214s.C134546ak) r6
            int r10 = r6.f366406a
            r12 = 2
            r10 = r10 | r12
            r6.f366406a = r10
            r6.f366410e = r8
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r15)
            r9.copyOnWrite()
            com.google.protobuf.bv r6 = r9.instance
            com.google.android.apps.search.googleapp.discover.s.ak r6 = (com.google.android.apps.search.googleapp.discover.p10214s.C134546ak) r6
            r4.getClass()
            r6.f366408c = r4
            r4 = 5
            r6.f366407b = r4
            com.google.protobuf.bv r4 = r9.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r11)
            com.google.android.apps.search.googleapp.discover.s.ak r4 = (com.google.android.apps.search.googleapp.discover.p10214s.C134546ak) r4
            com.google.android.apps.search.googleapp.discover.s.bb r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.UPDATE_OR_APPEND
            com.google.android.apps.search.googleapp.discover.s.bj r9 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.TOKEN
            com.google.android.apps.search.googleapp.discover.s.ac r6 = com.google.android.apps.search.googleapp.discover.p10237t.C134934j.m218818a(r6, r9, r5, r8)
            com.google.protobuf.bn r6 = r6.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r14)
            com.google.android.apps.search.googleapp.discover.s.ab r6 = (com.google.android.apps.search.googleapp.discover.p10214s.C134537ab) r6
            com.google.android.apps.search.googleapp.discover.s.aa r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            com.google.android.apps.search.googleapp.discover.s.ay r8 = com.google.android.apps.search.googleapp.discover.p10214s.C134560ay.f366453g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.ax r8 = (com.google.android.apps.search.googleapp.discover.p10214s.C134559ax) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
            com.google.android.apps.search.googleapp.discover.s.y r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            r7.mo111841b(r5)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r15)
            com.google.android.apps.search.googleapp.discover.s.ax r5 = r7.f366559a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.apps.search.googleapp.discover.s.ay r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r5
            r4.getClass()
            r5.f366457c = r4
            r4 = 4
            r5.f366456b = r4
            com.google.android.apps.search.googleapp.discover.s.ay r4 = r7.mo111840a()
            r6.mo111814d(r4)
            com.google.android.apps.search.googleapp.discover.s.ac r7 = r6.mo111811a()
            goto L_0x00a0
        L_0x0494:
            com.google.common.f.e r4 = f367380a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 40359(0x9da7, float:5.6555E-41)
            r5.<init>(r6)
            r4.mo56379ah(r5)
            java.lang.String r5 = "Token has no parent."
            r4.mo56386p(r5)
            goto L_0x0053
        L_0x04ae:
            if (r10 != r8) goto L_0x04b5
            java.lang.Object r8 = r4.f152753b
            com.google.bv.e.b.c.a.aq r8 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57235aq) r8
            goto L_0x04b7
        L_0x04b5:
            com.google.bv.e.b.c.a.aq r8 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57235aq.f152787g
        L_0x04b7:
            java.lang.String r9 = "operation.feature"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            int r9 = r8.f152789a
            if (r9 != r6) goto L_0x04c9
            java.lang.Object r9 = r8.f152790b
            com.google.ai.b.fo r9 = (com.google.p375ai.p378b.C7669fo) r9
            java.lang.String r9 = com.google.android.apps.search.googleapp.discover.p10237t.C134936l.m218822a(r9)
            goto L_0x04ca
        L_0x04c9:
            r9 = 0
        L_0x04ca:
            com.google.android.apps.search.googleapp.discover.s.bb r10 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.UPDATE_OR_APPEND
            int r13 = r8.f152789a
            r6 = 4
            if (r13 != r6) goto L_0x04de
            java.lang.Object r6 = r8.f152790b
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x04de
            com.google.android.apps.search.googleapp.discover.s.bj r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.ROOT
            goto L_0x04ef
        L_0x04de:
            int r6 = r8.f152791c
            int r6 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57234ap.m88272a(r6)
            if (r6 != 0) goto L_0x04e7
            goto L_0x04ed
        L_0x04e7:
            r13 = 2
            if (r6 != r13) goto L_0x04ed
            com.google.android.apps.search.googleapp.discover.s.bj r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.NON_ROOT_STREAM
            goto L_0x04ef
        L_0x04ed:
            com.google.android.apps.search.googleapp.discover.s.bj r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.CONTENT
        L_0x04ef:
            com.google.android.apps.search.googleapp.discover.s.ac r6 = com.google.android.apps.search.googleapp.discover.p10237t.C134934j.m218818a(r10, r6, r5, r9)
            com.google.protobuf.bn r6 = r6.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r14)
            com.google.android.apps.search.googleapp.discover.s.ab r6 = (com.google.android.apps.search.googleapp.discover.p10214s.C134537ab) r6
            com.google.android.apps.search.googleapp.discover.s.aa r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            com.google.android.apps.search.googleapp.discover.s.ay r9 = com.google.android.apps.search.googleapp.discover.p10214s.C134560ay.f366453g
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.ax r9 = (com.google.android.apps.search.googleapp.discover.p10214s.C134559ax) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)
            com.google.android.apps.search.googleapp.discover.s.y r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            r9.mo111841b(r5)
            int r5 = r1.f152892a
            r10 = 2
            r5 = r5 & r10
            if (r5 == 0) goto L_0x053b
            com.google.common.o.l.t r5 = r1.f152893b
            if (r5 != 0) goto L_0x051e
            com.google.common.o.l.t r5 = com.google.common.p4552o.p4566l.C60220t.f162931e
        L_0x051e:
            java.lang.String r10 = "feedResponseMetadata.eventId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r15)
            com.google.android.apps.search.googleapp.discover.s.ax r10 = r9.f366559a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.android.apps.search.googleapp.discover.s.ay r10 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r10
            r5.getClass()
            r10.f366459e = r5
            int r5 = r10.f366455a
            r13 = 2
            r5 = r5 | r13
            r10.f366455a = r5
            goto L_0x0553
        L_0x053b:
            com.google.common.f.e r5 = f367380a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r10 = new com.google.common.f.n
            r13 = 40368(0x9db0, float:5.6568E-41)
            r10.<init>(r13)
            r5.mo56379ah(r10)
            java.lang.String r10 = "No event id"
            r5.mo56386p(r10)
        L_0x0553:
            int r5 = r1.f152892a
            r10 = 4
            r5 = r5 & r10
            if (r5 == 0) goto L_0x057b
            com.google.bv.e.b r5 = r1.f152894c
            if (r5 != 0) goto L_0x055f
            com.google.bv.e.b r5 = com.google.p4283bv.p4354e.C57051b.f152305a
        L_0x055f:
            java.lang.String r10 = "feedResponseMetadata.feedId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r15)
            com.google.android.apps.search.googleapp.discover.s.ax r10 = r9.f366559a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.android.apps.search.googleapp.discover.s.ay r10 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r10
            r5.getClass()
            r10.f366460f = r5
            int r5 = r10.f366455a
            r13 = 4
            r5 = r5 | r13
            r10.f366455a = r5
        L_0x057b:
            com.google.android.apps.search.googleapp.discover.s.ay r5 = r9.mo111840a()
            r6.mo111814d(r5)
            com.google.android.apps.search.googleapp.discover.s.bk r5 = r6.mo111813c()
            com.google.protobuf.bn r5 = r5.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r14)
            com.google.android.apps.search.googleapp.discover.s.az r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134561az) r5
            com.google.android.apps.search.googleapp.discover.s.bq r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.android.apps.search.googleapp.discover.s.aq r9 = com.google.android.apps.search.googleapp.discover.p10214s.C134552aq.f366420e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.ap r9 = (com.google.android.apps.search.googleapp.discover.p10214s.C134551ap) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r12)
            com.google.bv.e.b.c.a.am r10 = r8.f152792d
            if (r10 != 0) goto L_0x05a7
            com.google.bv.e.b.c.a.am r10 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57231am.f152780c
        L_0x05a7:
            boolean r10 = r10.f152782a
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.android.apps.search.googleapp.discover.s.aq r13 = (com.google.android.apps.search.googleapp.discover.p10214s.C134552aq) r13
            int r14 = r13.f366422a
            r18 = 1
            r14 = r14 | 1
            r13.f366422a = r14
            r13.f366423b = r10
            if (r10 == 0) goto L_0x0676
            com.google.bv.e.b.c.a.am r10 = r8.f152792d
            if (r10 != 0) goto L_0x05c2
            com.google.bv.e.b.c.a.am r10 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57231am.f152780c
        L_0x05c2:
            com.google.protobuf.ar r10 = r10.f152783b
            if (r10 != 0) goto L_0x05c8
            com.google.protobuf.ar r10 = com.google.protobuf.C62910ar.f169858c
        L_0x05c8:
            long r13 = com.google.protobuf.p4750c.C62948a.m95453d(r10)
            com.google.android.libraries.f.a r10 = r0.f367383d
            long r19 = r10.mo26870b()
            long r13 = r13 + r19
            com.google.protobuf.fg r10 = com.google.protobuf.p4750c.C62953e.m95484i(r13)
            java.lang.String r13 = "fromMillis(\n            …tTimeMillis()\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r13)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r15)
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            r14 = r13
            com.google.android.apps.search.googleapp.discover.s.aq r14 = (com.google.android.apps.search.googleapp.discover.p10214s.C134552aq) r14
            r10.getClass()
            r14.f366424c = r10
            int r10 = r14.f366422a
            r13 = 2
            r10 = r10 | r13
            r14.f366422a = r10
            com.google.bv.e.b.c.a.am r10 = r8.f152792d
            if (r10 != 0) goto L_0x05f9
            com.google.bv.e.b.c.a.am r10 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57231am.f152780c
        L_0x05f9:
            com.google.protobuf.bt r14 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57169z.f152624d
            com.google.protobuf.bt r14 = com.google.protobuf.C62942bv.checkIsLite(r14)
            r10.mo58887l(r14)
            com.google.protobuf.bf r10 = r10.f169962ag
            com.google.protobuf.bs r13 = r14.f169971d
            java.lang.Object r10 = r10.mo58854l(r13)
            if (r10 != 0) goto L_0x060f
            java.lang.Object r10 = r14.f169969b
            goto L_0x0613
        L_0x060f:
            java.lang.Object r10 = r14.mo58889c(r10)
        L_0x0613:
            com.google.bv.e.b.b.b.z r10 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57169z) r10
            int r10 = r10.f152626a
            r13 = 1
            r10 = r10 & r13
            if (r10 == 0) goto L_0x065e
            com.google.bv.e.b.c.a.am r10 = r8.f152792d
            if (r10 != 0) goto L_0x0621
            com.google.bv.e.b.c.a.am r10 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57231am.f152780c
        L_0x0621:
            com.google.protobuf.bt r13 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57169z.f152624d
            com.google.protobuf.bt r13 = com.google.protobuf.C62942bv.checkIsLite(r13)
            r10.mo58887l(r13)
            com.google.protobuf.bf r10 = r10.f169962ag
            com.google.protobuf.bs r14 = r13.f169971d
            java.lang.Object r10 = r10.mo58854l(r14)
            if (r10 != 0) goto L_0x0637
            java.lang.Object r10 = r13.f169969b
            goto L_0x063b
        L_0x0637:
            java.lang.Object r10 = r13.mo58889c(r10)
        L_0x063b:
            com.google.bv.e.b.b.b.z r10 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57169z) r10
            com.google.bv.j.b.a.b r10 = r10.f152627b
            if (r10 != 0) goto L_0x0643
            com.google.bv.j.b.a.b r10 = com.google.p4283bv.p4380j.p4385b.p4386a.C57696b.f154137l
        L_0x0643:
            java.lang.String r13 = "feature.expirationInfo.g…enClientLoggingProperties"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r13)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r15)
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.android.apps.search.googleapp.discover.s.aq r13 = (com.google.android.apps.search.googleapp.discover.p10214s.C134552aq) r13
            r10.getClass()
            r13.f366425d = r10
            int r10 = r13.f366422a
            r14 = 4
            r10 = r10 | r14
            r13.f366422a = r10
            goto L_0x0676
        L_0x065e:
            com.google.common.f.e r10 = f367380a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.n r13 = new com.google.common.f.n
            r14 = 40369(0x9db1, float:5.6569E-41)
            r13.<init>(r14)
            r10.mo56379ah(r13)
            java.lang.String r13 = "No ClientLoggingProperties associated to feature expiration."
            r10.mo56386p(r13)
        L_0x0676:
            com.google.protobuf.bv r9 = r9.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r11)
            com.google.android.apps.search.googleapp.discover.s.aq r9 = (com.google.android.apps.search.googleapp.discover.p10214s.C134552aq) r9
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r15)
            com.google.android.apps.search.googleapp.discover.s.az r10 = r5.f366518a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.android.apps.search.googleapp.discover.s.bk r10 = (com.google.android.apps.search.googleapp.discover.p10214s.C134573bk) r10
            r9.getClass()
            r10.f366503e = r9
            int r9 = r10.f366499a
            r13 = 8
            r9 = r9 | r13
            r10.f366499a = r9
            com.google.protobuf.cq r9 = r8.f152793e
            java.lang.String r10 = "feature.conditionsToRestrictToList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            boolean r13 = r9 instanceof java.util.Collection
            if (r13 == 0) goto L_0x06ac
            boolean r13 = r9.isEmpty()
            if (r13 == 0) goto L_0x06ac
        L_0x06a8:
            r17 = r3
            goto L_0x07d5
        L_0x06ac:
            java.util.Iterator r9 = r9.iterator()
        L_0x06b0:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x06a8
            java.lang.Object r13 = r9.next()
            com.google.bv.e.b.c.a.cb r13 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57274cb) r13
            int r13 = r13.f152900a
            com.google.bv.e.b.c.a.cd r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57276cd.m88295a(r13)
            if (r13 != 0) goto L_0x06c6
            com.google.bv.e.b.c.a.cd r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57276cd.UNKNOWN_CONDITION
        L_0x06c6:
            com.google.bv.e.b.c.a.cd r14 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57276cd.UNKNOWN_CONDITION
            if (r13 == r14) goto L_0x06b0
            com.google.android.apps.search.googleapp.discover.s.bh r9 = com.google.android.apps.search.googleapp.discover.p10214s.C134570bh.f366480d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.bc r9 = (com.google.android.apps.search.googleapp.discover.p10214s.C134565bc) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r12)
            com.google.protobuf.a.b r12 = new com.google.protobuf.a.b
            com.google.protobuf.bv r13 = r9.instance
            com.google.android.apps.search.googleapp.discover.s.bh r13 = (com.google.android.apps.search.googleapp.discover.p10214s.C134570bh) r13
            com.google.protobuf.cq r13 = r13.f366483b
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            java.lang.String r14 = "_builder.getRestrictionConditionsList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            r12.<init>(r13)
            com.google.protobuf.cq r12 = r8.f152793e
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x06fa:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0779
            java.lang.Object r13 = r12.next()
            com.google.bv.e.b.c.a.cb r13 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57274cb) r13
            int r13 = r13.f152900a
            com.google.bv.e.b.c.a.cd r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57276cd.m88295a(r13)
            if (r13 != 0) goto L_0x0710
            com.google.bv.e.b.c.a.cd r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57276cd.UNKNOWN_CONDITION
        L_0x0710:
            int r13 = r13.ordinal()
            if (r13 == 0) goto L_0x0756
            r14 = 1
            if (r13 == r14) goto L_0x073b
            r14 = 2
            if (r13 != r14) goto L_0x0735
            com.google.android.apps.search.googleapp.discover.s.be r14 = com.google.android.apps.search.googleapp.discover.p10214s.C134567be.f366470c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.bd r14 = (com.google.android.apps.search.googleapp.discover.p10214s.C134566bd) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r7)
            com.google.android.apps.search.googleapp.discover.s.bs r14 = p5462h.p5473f.p5475b.C69664n.m101061g(r14, "builder")
            com.google.android.apps.search.googleapp.discover.s.bg r13 = com.google.android.apps.search.googleapp.discover.p10214s.C134569bg.MINUS_ONE
            r14.mo111826b(r13)
            com.google.android.apps.search.googleapp.discover.s.be r13 = r14.mo111825a()
            goto L_0x0753
        L_0x0735:
            h.g r1 = new h.g
            r1.<init>()
            throw r1
        L_0x073b:
            com.google.android.apps.search.googleapp.discover.s.be r13 = com.google.android.apps.search.googleapp.discover.p10214s.C134567be.f366470c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.apps.search.googleapp.discover.s.bd r13 = (com.google.android.apps.search.googleapp.discover.p10214s.C134566bd) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.android.apps.search.googleapp.discover.s.bs r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            com.google.android.apps.search.googleapp.discover.s.bg r14 = com.google.android.apps.search.googleapp.discover.p10214s.C134569bg.AGA_MAIN_APP
            r13.mo111826b(r14)
            com.google.android.apps.search.googleapp.discover.s.be r13 = r13.mo111825a()
        L_0x0753:
            r17 = r3
            goto L_0x0771
        L_0x0756:
            com.google.common.f.e r13 = f367380a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.n r14 = new com.google.common.f.n
            r17 = r3
            r3 = 40373(0x9db5, float:5.6575E-41)
            r14.<init>(r3)
            r13.mo56379ah(r14)
            java.lang.String r3 = "Unknown restriction condition received."
            r13.mo56386p(r3)
            r13 = 0
        L_0x0771:
            if (r13 == 0) goto L_0x0776
            r10.add(r13)
        L_0x0776:
            r3 = r17
            goto L_0x06fa
        L_0x0779:
            r17 = r3
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.android.apps.search.googleapp.discover.s.bh r3 = (com.google.android.apps.search.googleapp.discover.p10214s.C134570bh) r3
            com.google.protobuf.cq r7 = r3.f366483b
            boolean r12 = r7.mo58948c()
            if (r12 != 0) goto L_0x0790
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r3.f366483b = r7
        L_0x0790:
            com.google.protobuf.cq r3 = r3.f366483b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r10, (java.util.List) r3)
            com.google.bv.j.b.a.b r3 = r8.f152794f
            if (r3 != 0) goto L_0x079b
            com.google.bv.j.b.a.b r3 = com.google.p4283bv.p4380j.p4385b.p4386a.C57696b.f154137l
        L_0x079b:
            java.lang.String r7 = "feature.graftInfoForRestrictionConditions"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r15)
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.android.apps.search.googleapp.discover.s.bh r7 = (com.google.android.apps.search.googleapp.discover.p10214s.C134570bh) r7
            r3.getClass()
            r7.f366484c = r3
            int r3 = r7.f366482a
            r13 = 2
            r3 = r3 | r13
            r7.f366482a = r3
            com.google.protobuf.bv r3 = r9.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r11)
            com.google.android.apps.search.googleapp.discover.s.bh r3 = (com.google.android.apps.search.googleapp.discover.p10214s.C134570bh) r3
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r15)
            com.google.android.apps.search.googleapp.discover.s.az r7 = r5.f366518a
            r7.copyOnWrite()
            com.google.protobuf.bv r7 = r7.instance
            com.google.android.apps.search.googleapp.discover.s.bk r7 = (com.google.android.apps.search.googleapp.discover.p10214s.C134573bk) r7
            r3.getClass()
            r7.f366505g = r3
            int r3 = r7.f366499a
            r3 = r3 | 32
            r7.f366499a = r3
        L_0x07d5:
            com.google.android.apps.search.googleapp.discover.s.bk r3 = r5.mo111822a()
            r6.mo111815e(r3)
            com.google.android.apps.search.googleapp.discover.s.ac r3 = r6.mo111811a()
            java.util.Set r5 = r0.f367381b
            java.util.Iterator r5 = r5.iterator()
            r7 = r3
        L_0x07e7:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0826
            java.lang.Object r3 = r5.next()
            com.google.android.apps.search.googleapp.discover.t.f r3 = (com.google.android.apps.search.googleapp.discover.p10237t.C134930f) r3
            com.google.android.apps.search.googleapp.discover.s.ac r7 = r3.mo112076a(r4, r7, r1)
            java.lang.String r3 = "transformer.transform(op…on, feedResponseMetadata)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r3)
            goto L_0x07e7
        L_0x07fd:
            r3 = 0
            throw r3
        L_0x07ff:
            r17 = r3
            com.google.common.f.e r3 = f367380a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 40367(0x9daf, float:5.6566E-41)
            r4.<init>(r5)
            r3.mo56379ah(r4)
            java.lang.String r4 = "ContentId not defined for DataOperation"
            r3.mo56386p(r4)
            goto L_0x0055
        L_0x081b:
            r17 = r3
            com.google.android.apps.search.googleapp.discover.s.bb r3 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.CLEAR_ALL
            com.google.android.apps.search.googleapp.discover.s.bj r4 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.STRUCTURE_MODIFICATION
            r5 = 0
            com.google.android.apps.search.googleapp.discover.s.ac r7 = com.google.android.apps.search.googleapp.discover.p10237t.C134934j.m218818a(r3, r4, r5, r5)
        L_0x0826:
            if (r7 == 0) goto L_0x082b
            r2.add(r7)
        L_0x082b:
            r3 = r17
            goto L_0x000d
        L_0x082f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10237t.C134935k.m218819c(java.util.List, com.google.bv.e.b.c.a.bz):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x020e A[SYNTHETIC, Splitter:B:100:0x020e] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0232 A[Catch:{ all -> 0x026e, all -> 0x0271 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d3 A[Catch:{ all -> 0x026e, all -> 0x0271 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d9 A[Catch:{ all -> 0x026e, all -> 0x0271 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01dc A[Catch:{ all -> 0x026e, all -> 0x0271 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e2 A[Catch:{ all -> 0x026e, all -> 0x0271 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e5 A[Catch:{ all -> 0x026e, all -> 0x0271 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ea A[Catch:{ all -> 0x026e, all -> 0x0271 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f0 A[Catch:{ all -> 0x026e, all -> 0x0271 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.search.googleapp.discover.p10237t.C134925a mo112080a(com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57309dj r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            java.lang.String r2 = "newBuilder()"
            java.lang.String r3 = "response"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r3)
            java.lang.String r3 = "ProtocolAdapter#createModel"
            com.google.apps.tiktok.tracing.bi r3 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r3)
            com.google.protobuf.bt r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57269bx.f152883e     // Catch:{ all -> 0x026e }
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)     // Catch:{ all -> 0x026e }
            r0.mo58887l(r4)     // Catch:{ all -> 0x026e }
            com.google.protobuf.bf r0 = r0.f169962ag     // Catch:{ all -> 0x026e }
            com.google.protobuf.bs r5 = r4.f169971d     // Catch:{ all -> 0x026e }
            java.lang.Object r0 = r0.mo58854l(r5)     // Catch:{ all -> 0x026e }
            if (r0 != 0) goto L_0x0027
            java.lang.Object r0 = r4.f169969b     // Catch:{ all -> 0x026e }
            goto L_0x002b
        L_0x0027:
            java.lang.Object r0 = r4.mo58889c(r0)     // Catch:{ all -> 0x026e }
        L_0x002b:
            java.lang.String r4 = "response.getExtension(FeedResponse.feedResponse)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)     // Catch:{ all -> 0x026e }
            com.google.bv.e.b.c.a.bx r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57269bx) r0     // Catch:{ all -> 0x026e }
            int r4 = r0.f152887c     // Catch:{ all -> 0x026e }
            com.google.bv.e.b.c.a.dl r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57311dl.m88308a(r4)     // Catch:{ all -> 0x026e }
            if (r4 != 0) goto L_0x003c
            com.google.bv.e.b.c.a.dl r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57311dl.UNKNOWN_STATUS_CODE     // Catch:{ all -> 0x026e }
        L_0x003c:
            com.google.bv.e.b.c.a.dl r5 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57311dl.STATUS_NO_CONTENT_RETURNED     // Catch:{ all -> 0x026e }
            if (r4 != r5) goto L_0x0058
            com.google.common.f.e r4 = f367380a     // Catch:{ all -> 0x026e }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x026e }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x026e }
            java.lang.String r5 = "Received a response from the server with STATUS_NO_CONTENT_RETURNED"
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x026e }
            r7 = 40372(0x9db4, float:5.6573E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x026e }
            r4.mo56379ah(r6)     // Catch:{ all -> 0x026e }
            r4.mo56386p(r5)     // Catch:{ all -> 0x026e }
        L_0x0058:
            com.google.common.f.e r4 = f367380a     // Catch:{ all -> 0x026e }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x026e }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x026e }
            java.lang.String r5 = "createModel, DataOperations %s"
            com.google.protobuf.cq r6 = r0.f152885a     // Catch:{ all -> 0x026e }
            int r6 = r6.size()     // Catch:{ all -> 0x026e }
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x026e }
            r8 = 40370(0x9db2, float:5.657E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x026e }
            r4.mo56379ah(r7)     // Catch:{ all -> 0x026e }
            r4.mo56387q(r5, r6)     // Catch:{ all -> 0x026e }
            com.google.protobuf.cq r4 = r0.f152885a     // Catch:{ all -> 0x026e }
            java.lang.String r5 = "feedResponse.dataOperationList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ all -> 0x026e }
            com.google.bv.e.b.c.a.bz r5 = r0.f152886b     // Catch:{ all -> 0x026e }
            if (r5 != 0) goto L_0x0083
            com.google.bv.e.b.c.a.bz r5 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57271bz.f152890f     // Catch:{ all -> 0x026e }
        L_0x0083:
            java.lang.String r6 = "feedResponse.feedResponseMetadata"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ all -> 0x026e }
            java.util.List r4 = r1.m218819c(r4, r5)     // Catch:{ all -> 0x026e }
            java.util.EnumMap r6 = new java.util.EnumMap     // Catch:{ all -> 0x026e }
            java.lang.Class<com.google.android.apps.search.googleapp.discover.s.bj> r5 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.class
            r6.<init>(r5)     // Catch:{ all -> 0x026e }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x026e }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x009b:
            boolean r12 = r5.hasNext()     // Catch:{ all -> 0x026e }
            r13 = 3
            r14 = 2
            r15 = 1
            if (r12 == 0) goto L_0x00ec
            java.lang.Object r12 = r5.next()     // Catch:{ all -> 0x026e }
            com.google.android.apps.search.googleapp.discover.s.ac r12 = (com.google.android.apps.search.googleapp.discover.p10214s.C134538ac) r12     // Catch:{ all -> 0x026e }
            com.google.android.apps.search.googleapp.discover.s.bk r11 = r12.f366379b     // Catch:{ all -> 0x026e }
            if (r11 != 0) goto L_0x00b0
            com.google.android.apps.search.googleapp.discover.s.bk r11 = com.google.android.apps.search.googleapp.discover.p10214s.C134573bk.f366497h     // Catch:{ all -> 0x026e }
        L_0x00b0:
            int r11 = r11.f366500b     // Catch:{ all -> 0x026e }
            com.google.android.apps.search.googleapp.discover.s.bb r11 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.m218286a(r11)     // Catch:{ all -> 0x026e }
            if (r11 != 0) goto L_0x00ba
            com.google.android.apps.search.googleapp.discover.s.bb r11 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.UNKNOWN     // Catch:{ all -> 0x026e }
        L_0x00ba:
            int r11 = r11.ordinal()     // Catch:{ all -> 0x026e }
            if (r11 == 0) goto L_0x00e9
            if (r11 == r15) goto L_0x00e6
            if (r11 == r14) goto L_0x00d0
            if (r11 == r13) goto L_0x00cd
            r12 = 4
            if (r11 == r12) goto L_0x00ca
            goto L_0x009b
        L_0x00ca:
            int r8 = r8 + 1
            goto L_0x009b
        L_0x00cd:
            int r7 = r7 + 1
            goto L_0x009b
        L_0x00d0:
            com.google.android.apps.search.googleapp.discover.s.bk r11 = r12.f366379b     // Catch:{ all -> 0x026e }
            if (r11 != 0) goto L_0x00d6
            com.google.android.apps.search.googleapp.discover.s.bk r11 = com.google.android.apps.search.googleapp.discover.p10214s.C134573bk.f366497h     // Catch:{ all -> 0x026e }
        L_0x00d6:
            int r11 = r11.f366504f     // Catch:{ all -> 0x026e }
            com.google.android.apps.search.googleapp.discover.s.bj r11 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.m218290a(r11)     // Catch:{ all -> 0x026e }
            if (r11 != 0) goto L_0x00e0
            com.google.android.apps.search.googleapp.discover.s.bj r11 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.UNDEFINED_ROLE     // Catch:{ all -> 0x026e }
        L_0x00e0:
            com.google.android.apps.search.googleapp.discover.t.d r12 = com.google.android.apps.search.googleapp.discover.p10237t.C134928d.f367371a     // Catch:{ all -> 0x026e }
            p3186j$.util.Map.EL.compute(r6, r11, r12)     // Catch:{ all -> 0x026e }
            goto L_0x009b
        L_0x00e6:
            int r9 = r9 + 1
            goto L_0x009b
        L_0x00e9:
            int r10 = r10 + 1
            goto L_0x009b
        L_0x00ec:
            com.google.android.apps.search.googleapp.discover.t.e r11 = new com.google.android.apps.search.googleapp.discover.t.e     // Catch:{ all -> 0x026e }
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x026e }
            java.util.Map r5 = r11.f367372a     // Catch:{ all -> 0x026e }
            java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x026e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x026e }
        L_0x00fc:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x026e }
            if (r6 == 0) goto L_0x0112
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x026e }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x026e }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x026e }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ all -> 0x026e }
            r6.intValue()     // Catch:{ all -> 0x026e }
            goto L_0x00fc
        L_0x0112:
            java.util.Map r5 = r11.f367372a     // Catch:{ all -> 0x026e }
            java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x026e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x026e }
        L_0x011c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x026e }
            if (r6 == 0) goto L_0x013a
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x026e }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x026e }
            java.lang.Object r7 = r6.getKey()     // Catch:{ all -> 0x026e }
            com.google.android.apps.search.googleapp.discover.s.bj r7 = (com.google.android.apps.search.googleapp.discover.p10214s.C134572bj) r7     // Catch:{ all -> 0x026e }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x026e }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ all -> 0x026e }
            r6.intValue()     // Catch:{ all -> 0x026e }
            int r6 = r7.f366496h     // Catch:{ all -> 0x026e }
            goto L_0x011c
        L_0x013a:
            com.google.android.apps.search.googleapp.discover.t.g r5 = r1.f367382c     // Catch:{ all -> 0x026e }
            java.util.Collection r5 = r5.f367377a     // Catch:{ all -> 0x026e }
            r5.add(r11)     // Catch:{ all -> 0x026e }
            com.google.common.o.l.r r5 = com.google.common.p4552o.p4566l.C60218r.f162925d     // Catch:{ all -> 0x026e }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x026e }
            com.google.common.o.l.q r5 = (com.google.common.p4552o.p4566l.C60217q) r5     // Catch:{ all -> 0x026e }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)     // Catch:{ all -> 0x026e }
            com.google.common.o.l.p r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")     // Catch:{ all -> 0x026e }
            com.google.bv.e.b.c.a.bz r6 = r0.f152886b     // Catch:{ all -> 0x026e }
            if (r6 != 0) goto L_0x0157
            com.google.bv.e.b.c.a.bz r7 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57271bz.f152890f     // Catch:{ all -> 0x026e }
            goto L_0x0158
        L_0x0157:
            r7 = r6
        L_0x0158:
            int r7 = r7.f152892a     // Catch:{ all -> 0x026e }
            r7 = r7 & r14
            if (r7 == 0) goto L_0x0170
            if (r6 != 0) goto L_0x0161
            com.google.bv.e.b.c.a.bz r6 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57271bz.f152890f     // Catch:{ all -> 0x026e }
        L_0x0161:
            com.google.common.o.l.t r6 = r6.f152893b     // Catch:{ all -> 0x026e }
            if (r6 != 0) goto L_0x0167
            com.google.common.o.l.t r6 = com.google.common.p4552o.p4566l.C60220t.f162931e     // Catch:{ all -> 0x026e }
        L_0x0167:
            java.lang.String r7 = "feedResponse.feedResponseMetadata.eventId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ all -> 0x026e }
            r5.mo57075b(r6)     // Catch:{ all -> 0x026e }
            goto L_0x0188
        L_0x0170:
            com.google.common.f.e r6 = f367380a     // Catch:{ all -> 0x026e }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x026e }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x026e }
            java.lang.String r7 = "No event id"
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ all -> 0x026e }
            r9 = 40371(0x9db3, float:5.6572E-41)
            r8.<init>(r9)     // Catch:{ all -> 0x026e }
            r6.mo56379ah(r8)     // Catch:{ all -> 0x026e }
            r6.mo56386p(r7)     // Catch:{ all -> 0x026e }
        L_0x0188:
            com.google.common.o.l.r r17 = r5.mo57074a()     // Catch:{ all -> 0x026e }
            com.google.android.apps.search.googleapp.discover.t.a r5 = new com.google.android.apps.search.googleapp.discover.t.a     // Catch:{ all -> 0x026e }
            com.google.bv.e.b.c.a.bz r6 = r0.f152886b     // Catch:{ all -> 0x026e }
            if (r6 != 0) goto L_0x0194
            com.google.bv.e.b.c.a.bz r6 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57271bz.f152890f     // Catch:{ all -> 0x026e }
        L_0x0194:
            com.google.bv.e.b r6 = r6.f152894c     // Catch:{ all -> 0x026e }
            if (r6 != 0) goto L_0x019a
            com.google.bv.e.b r6 = com.google.p4283bv.p4354e.C57051b.f152305a     // Catch:{ all -> 0x026e }
        L_0x019a:
            java.lang.String r7 = "feedResponse.feedResponseMetadata.feedId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ all -> 0x026e }
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89842j(r4)     // Catch:{ all -> 0x026e }
            java.lang.String r7 = "copyOf(operations)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r7)     // Catch:{ all -> 0x026e }
            int r7 = r0.f152887c     // Catch:{ all -> 0x026e }
            com.google.bv.e.b.c.a.dl r7 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57311dl.m88308a(r7)     // Catch:{ all -> 0x026e }
            if (r7 != 0) goto L_0x01b2
            com.google.bv.e.b.c.a.dl r7 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57311dl.UNKNOWN_STATUS_CODE     // Catch:{ all -> 0x026e }
        L_0x01b2:
            java.lang.String r8 = "feedResponse.responseStatusCode"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)     // Catch:{ all -> 0x026e }
            int r7 = r7.ordinal()     // Catch:{ all -> 0x026e }
            if (r7 == r15) goto L_0x01c7
            if (r7 == r14) goto L_0x01c4
            if (r7 == r13) goto L_0x01c7
            com.google.android.apps.search.googleapp.discover.s.i r7 = com.google.android.apps.search.googleapp.discover.p10214s.C134591i.UNKNOWN     // Catch:{ all -> 0x026e }
            goto L_0x01c9
        L_0x01c4:
            com.google.android.apps.search.googleapp.discover.s.i r7 = com.google.android.apps.search.googleapp.discover.p10214s.C134591i.INELIGIBLE     // Catch:{ all -> 0x026e }
            goto L_0x01c9
        L_0x01c7:
            com.google.android.apps.search.googleapp.discover.s.i r7 = com.google.android.apps.search.googleapp.discover.p10214s.C134591i.ELIGIBLE     // Catch:{ all -> 0x026e }
        L_0x01c9:
            r20 = r7
            int r7 = r0.f152887c     // Catch:{ all -> 0x026e }
            com.google.bv.e.b.c.a.dl r7 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57311dl.m88308a(r7)     // Catch:{ all -> 0x026e }
            if (r7 != 0) goto L_0x01d5
            com.google.bv.e.b.c.a.dl r7 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57311dl.UNKNOWN_STATUS_CODE     // Catch:{ all -> 0x026e }
        L_0x01d5:
            com.google.bv.e.b.c.a.dl r8 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57311dl.STATUS_NO_CONTENT_RETURNED     // Catch:{ all -> 0x026e }
            if (r7 == r8) goto L_0x01dc
            r21 = 1
            goto L_0x01de
        L_0x01dc:
            r21 = 0
        L_0x01de:
            com.google.bv.e.b.c.a.bz r0 = r0.f152886b     // Catch:{ all -> 0x026e }
            if (r0 != 0) goto L_0x01e5
            com.google.bv.e.b.c.a.bz r7 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57271bz.f152890f     // Catch:{ all -> 0x026e }
            goto L_0x01e6
        L_0x01e5:
            r7 = r0
        L_0x01e6:
            boolean r7 = r7.f152895d     // Catch:{ all -> 0x026e }
            if (r0 != 0) goto L_0x01ec
            com.google.bv.e.b.c.a.bz r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57271bz.f152890f     // Catch:{ all -> 0x026e }
        L_0x01ec:
            com.google.bv.e.b.c.a.y r0 = r0.f152896e     // Catch:{ all -> 0x026e }
            if (r0 != 0) goto L_0x01f2
            com.google.bv.e.b.c.a.y r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57342y.f153200d     // Catch:{ all -> 0x026e }
        L_0x01f2:
            java.lang.String r8 = "feedResponse.feedResponseMetadata.contentLifetime"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r8)     // Catch:{ all -> 0x026e }
            com.google.android.apps.search.googleapp.discover.s.am r8 = com.google.android.apps.search.googleapp.discover.p10214s.C134548am.f366412d     // Catch:{ all -> 0x026e }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x026e }
            com.google.android.apps.search.googleapp.discover.s.al r8 = (com.google.android.apps.search.googleapp.discover.p10214s.C134547al) r8     // Catch:{ all -> 0x026e }
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)     // Catch:{ all -> 0x026e }
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r2)     // Catch:{ all -> 0x026e }
            int r2 = r0.f153202a     // Catch:{ all -> 0x026e }
            r2 = r2 & r15
            java.lang.String r9 = "value"
            if (r2 == 0) goto L_0x022d
            long r10 = r0.f153203b     // Catch:{ all -> 0x026e }
            com.google.protobuf.ar r2 = com.google.protobuf.p4750c.C62948a.m95459j(r10)     // Catch:{ all -> 0x026e }
            java.lang.String r10 = "fromMillis(staleAgeMs)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r10)     // Catch:{ all -> 0x026e }
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r9)     // Catch:{ all -> 0x026e }
            r8.copyOnWrite()     // Catch:{ all -> 0x026e }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x026e }
            com.google.android.apps.search.googleapp.discover.s.am r10 = (com.google.android.apps.search.googleapp.discover.p10214s.C134548am) r10     // Catch:{ all -> 0x026e }
            r2.getClass()     // Catch:{ all -> 0x026e }
            r10.f366415b = r2     // Catch:{ all -> 0x026e }
            int r2 = r10.f366414a     // Catch:{ all -> 0x026e }
            r2 = r2 | r15
            r10.f366414a = r2     // Catch:{ all -> 0x026e }
        L_0x022d:
            int r2 = r0.f153202a     // Catch:{ all -> 0x026e }
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0251
            long r10 = r0.f153204c     // Catch:{ all -> 0x026e }
            com.google.protobuf.ar r0 = com.google.protobuf.p4750c.C62948a.m95459j(r10)     // Catch:{ all -> 0x026e }
            java.lang.String r2 = "fromMillis(invalidAgeMs)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)     // Catch:{ all -> 0x026e }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r9)     // Catch:{ all -> 0x026e }
            r8.copyOnWrite()     // Catch:{ all -> 0x026e }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x026e }
            com.google.android.apps.search.googleapp.discover.s.am r2 = (com.google.android.apps.search.googleapp.discover.p10214s.C134548am) r2     // Catch:{ all -> 0x026e }
            r0.getClass()     // Catch:{ all -> 0x026e }
            r2.f366416c = r0     // Catch:{ all -> 0x026e }
            int r0 = r2.f366414a     // Catch:{ all -> 0x026e }
            r0 = r0 | r14
            r2.f366414a = r0     // Catch:{ all -> 0x026e }
        L_0x0251:
            com.google.protobuf.bv r0 = r8.build()     // Catch:{ all -> 0x026e }
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)     // Catch:{ all -> 0x026e }
            r23 = r0
            com.google.android.apps.search.googleapp.discover.s.am r23 = (com.google.android.apps.search.googleapp.discover.p10214s.C134548am) r23     // Catch:{ all -> 0x026e }
            r16 = r5
            r18 = r6
            r19 = r4
            r22 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x026e }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r3, r0)
            return r5
        L_0x026e:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0271 }
        L_0x0271:
            r0 = move-exception
            r4 = r0
            p5462h.p5472e.C69598b.m101013a(r3, r2)
            goto L_0x0278
        L_0x0277:
            throw r4
        L_0x0278:
            goto L_0x0277
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10237t.C134935k.mo112080a(com.google.bv.e.b.c.a.dj):com.google.android.apps.search.googleapp.discover.t.a");
    }

    /* renamed from: b */
    public final List mo112081b(List list) {
        C69664n.m101061g(list, "dataOperations");
        C57271bz bzVar = C57271bz.f152890f;
        C69664n.m101060f(bzVar, "getDefaultInstance()");
        return m218819c(list, bzVar);
    }
}
