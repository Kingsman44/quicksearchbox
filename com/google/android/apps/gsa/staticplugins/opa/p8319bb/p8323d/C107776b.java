package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.b */
/* compiled from: PG */
public final /* synthetic */ class C107776b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C107779e f299894a;

    /* renamed from: b */
    public final /* synthetic */ Query f299895b;

    public /* synthetic */ C107776b(C107779e eVar, Query query) {
        this.f299894a = eVar;
        this.f299895b = query;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r0v35, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r0v47, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            com.google.android.apps.gsa.staticplugins.opa.bb.d.e r2 = r1.f299894a
            com.google.android.apps.gsa.shared.search.Query r0 = r1.f299895b
            r3 = r20
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3
            boolean r4 = r3.mo56113h()
            if (r4 == 0) goto L_0x03ab
            java.lang.Object r4 = r3.mo56107c()
            com.google.assistant.e.e.a.j r4 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r4
            int r4 = r4.f133266a
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x03ab
            java.lang.Object r4 = r3.mo56107c()
            com.google.assistant.e.e.a.j r4 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r4
            com.google.assistant.e.j.en r4 = r4.f133275j
            if (r4 != 0) goto L_0x0028
            com.google.assistant.e.j.en r4 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x0028:
            java.lang.Object r3 = r3.mo56107c()
            com.google.assistant.e.e.a.j r3 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r3
            boolean r3 = r3.f133274i
            com.google.android.apps.gsa.search.shared.service.b.cn r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87759cn.f237518c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.cm r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87758cm) r5
            com.google.assistant.e.j.ex r6 = r4.f136685e
            if (r6 != 0) goto L_0x003e
            com.google.assistant.e.j.ex r6 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x003e:
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.cn r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87759cn) r7
            r6.getClass()
            r7.f237521b = r6
            int r6 = r7.f237520a
            r8 = 1
            r6 = r6 | r8
            r7.f237520a = r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.gsa.search.shared.service.b.cn r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87759cn) r5
            com.google.android.apps.gsa.search.shared.service.al r6 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.CONVERSATION_PARAMS_RECEIVED
            r6.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r7)
            com.google.protobuf.bt r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C87757cl.f237517a
            r6.mo81965b(r7, r5)
            com.google.android.apps.gsa.staticplugins.opa.bb.g r5 = r2.f299901b
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r6 = r6.mo81964a()
            r5.mo96337a(r6)
            com.google.android.apps.gsa.search.core.i.t r5 = r2.f299906g
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248264ay
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x00be
            if (r3 != 0) goto L_0x00be
            com.google.android.apps.gsa.staticplugins.opa.bb.g r3 = r2.f299901b
            com.google.android.apps.gsa.search.shared.service.al r5 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.QUERY_OPAQUE_TOKEN
            r5.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r6)
            com.google.protobuf.bt r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88190sm.f238402a
            com.google.android.apps.gsa.search.shared.service.b.so r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88192so.f238403d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.sn r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88191sn) r7
            com.google.protobuf.z r9 = r4.f136683c
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.android.apps.gsa.search.shared.service.b.so r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88192so) r10
            r9.getClass()
            int r11 = r10.f238405a
            r11 = r11 | r8
            r10.f238405a = r11
            r10.f238406b = r9
            long r9 = r0.f252780s
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            com.google.android.apps.gsa.search.shared.service.b.so r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88192so) r0
            int r11 = r0.f238405a
            r11 = r11 | 2
            r0.f238405a = r11
            r0.f238407c = r9
            com.google.protobuf.bv r0 = r7.build()
            com.google.android.apps.gsa.search.shared.service.b.so r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88192so) r0
            r5.mo81965b(r6, r0)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r0 = r5.mo81964a()
            r3.mo96337a(r0)
        L_0x00be:
            com.google.android.apps.gsa.search.core.i.t r0 = r2.f299906g
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248285bs
            long r5 = r0.mo79743a(r3)
            int r0 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107764a.m178921a(r5)
            if (r0 > 0) goto L_0x00d6
            com.google.android.apps.gsa.search.core.i.t r0 = r2.f299906g
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248207U
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x03a6
        L_0x00d6:
            com.google.common.b.ij r0 = r2.f299907h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00e0
        L_0x00de:
            r5 = 0
            goto L_0x0100
        L_0x00e0:
            com.google.protobuf.cq r0 = r4.f136684d
            java.util.Iterator r0 = r0.iterator()
        L_0x00e6:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r5 = r0.next()
            com.google.assistant.e.j.ep r5 = (com.google.assistant.p3897e.p3921j.C52083ep) r5
            com.google.common.b.ij r6 = r2.f299907h
            java.lang.String r5 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107779e.m178950a(r5)
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x00e6
            goto L_0x00de
        L_0x00ff:
            r5 = 1
        L_0x0100:
            com.google.android.apps.gsa.search.core.i.t r0 = r2.f299906g
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248207U
            boolean r0 = r0.mo79746e(r6)
            if (r0 == 0) goto L_0x0155
            int r0 = r4.f136681a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0155
            com.google.assistant.e.j.ex r0 = r4.f136685e
            if (r0 != 0) goto L_0x0116
            com.google.assistant.e.j.ex r0 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x0116:
            r6 = 0
        L_0x0117:
            com.google.protobuf.cq r7 = r0.f136712a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0155
            com.google.protobuf.cq r7 = r0.f136712a
            java.lang.Object r7 = r7.get(r6)
            com.google.assistant.e.j.kc r7 = (com.google.assistant.p3897e.p3921j.C52232kc) r7
            java.lang.String r9 = "asst.drl.visual.treatment.params"
            java.lang.String r10 = r7.f137065b
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0152
            com.google.protobuf.bn r0 = r7.toBuilder()
            com.google.assistant.e.j.kb r0 = (com.google.assistant.p3897e.p3921j.C52231kb) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.assistant.e.j.kc r6 = (com.google.assistant.p3897e.p3921j.C52232kc) r6
            int r7 = r6.f137064a
            r7 = r7 | r8
            r6.f137064a = r7
            java.lang.String r7 = "show_drl_visual_treatment_args"
            r6.f137065b = r7
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0157
        L_0x0152:
            int r6 = r6 + 1
            goto L_0x0117
        L_0x0155:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0157:
            r6 = r0
            if (r5 != 0) goto L_0x0160
            boolean r0 = r6.mo56113h()
            if (r0 == 0) goto L_0x03a6
        L_0x0160:
            com.google.protobuf.bn r0 = r4.toBuilder()
            r7 = r0
            com.google.assistant.e.j.el r7 = (com.google.assistant.p3897e.p3921j.C52079el) r7
            r9 = 0
        L_0x0168:
            com.google.protobuf.cq r0 = r4.f136684d
            int r0 = r0.size()
            if (r9 >= r0) goto L_0x039f
            com.google.protobuf.cq r0 = r4.f136684d
            java.lang.Object r0 = r0.get(r9)
            r10 = r0
            com.google.assistant.e.j.ep r10 = (com.google.assistant.p3897e.p3921j.C52083ep) r10
            int r0 = r10.f136692b
            r11 = 4
            if (r0 != r11) goto L_0x0183
            java.lang.Object r0 = r10.f136693c
            com.google.assistant.e.j.ei r0 = (com.google.assistant.p3897e.p3921j.C52076ei) r0
            goto L_0x0185
        L_0x0183:
            com.google.assistant.e.j.ei r0 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0185:
            int r0 = r0.f136666a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x038f
            int r0 = r10.f136692b
            if (r0 != r11) goto L_0x0194
            java.lang.Object r0 = r10.f136693c
            com.google.assistant.e.j.ei r0 = (com.google.assistant.p3897e.p3921j.C52076ei) r0
            goto L_0x0196
        L_0x0194:
            com.google.assistant.e.j.ei r0 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0196:
            com.google.assistant.e.j.dy r0 = r0.f136668c
            if (r0 != 0) goto L_0x019c
            com.google.assistant.e.j.dy r0 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x019c:
            r12 = r0
            java.lang.String r13 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107779e.m178950a(r10)
            if (r5 == 0) goto L_0x02e4
            java.lang.String r0 = "ui.SHOW_TEXT"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x02e4
            int r0 = r12.f135935a
            r0 = r0 & r11
            if (r0 == 0) goto L_0x02e4
            com.google.assistant.e.j.dw r0 = r12.f135938d
            if (r0 != 0) goto L_0x01b6
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x01b6:
            r14 = r0
            com.google.protobuf.bn r0 = r14.toBuilder()
            r15 = r0
            com.google.assistant.e.j.dv r15 = (com.google.assistant.p3897e.p3921j.C51806dv) r15
            r3 = 0
        L_0x01bf:
            com.google.protobuf.cq r0 = r14.f135932a
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x02b9
            com.google.protobuf.cq r0 = r14.f135932a
            java.lang.Object r0 = r0.get(r3)
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0
            java.lang.String r11 = "show_text_args"
            java.lang.String r8 = r0.f137065b
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L_0x02a8
            com.google.assistant.e.j.ka r8 = r0.f137066c     // Catch:{ ct -> 0x028d }
            if (r8 != 0) goto L_0x01df
            com.google.assistant.e.j.ka r8 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x028d }
        L_0x01df:
            com.google.protobuf.z r8 = r8.f137061c     // Catch:{ ct -> 0x028d }
            com.google.protobuf.ba r11 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x028d }
            com.google.assistant.e.j.e.hb r1 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.f136476i     // Catch:{ ct -> 0x028d }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (com.google.protobuf.C63088z) r8, (com.google.protobuf.C62921ba) r11)     // Catch:{ ct -> 0x028d }
            com.google.assistant.e.j.e.hb r1 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r1     // Catch:{ ct -> 0x028d }
            com.google.assistant.e.j.kc r8 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d     // Catch:{ ct -> 0x028d }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ ct -> 0x028d }
            com.google.assistant.e.j.kb r8 = (com.google.assistant.p3897e.p3921j.C52231kb) r8     // Catch:{ ct -> 0x028d }
            java.lang.String r11 = r0.f137065b     // Catch:{ ct -> 0x028d }
            r8.copyOnWrite()     // Catch:{ ct -> 0x028d }
            r17 = r4
            com.google.protobuf.bv r4 = r8.instance     // Catch:{ ct -> 0x028b }
            com.google.assistant.e.j.kc r4 = (com.google.assistant.p3897e.p3921j.C52232kc) r4     // Catch:{ ct -> 0x028b }
            r11.getClass()     // Catch:{ ct -> 0x028b }
            r18 = r5
            int r5 = r4.f137064a     // Catch:{ ct -> 0x0289 }
            r16 = 1
            r5 = r5 | 1
            r4.f137064a = r5     // Catch:{ ct -> 0x0289 }
            r4.f137065b = r11     // Catch:{ ct -> 0x0289 }
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0289 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ ct -> 0x0289 }
            com.google.assistant.e.j.jz r4 = (com.google.assistant.p3897e.p3921j.C52228jz) r4     // Catch:{ ct -> 0x0289 }
            com.google.assistant.e.j.ka r0 = r0.f137066c     // Catch:{ ct -> 0x0289 }
            if (r0 != 0) goto L_0x021d
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0289 }
        L_0x021d:
            java.lang.String r0 = r0.f137060b     // Catch:{ ct -> 0x0289 }
            r4.copyOnWrite()     // Catch:{ ct -> 0x0289 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ ct -> 0x0289 }
            com.google.assistant.e.j.ka r5 = (com.google.assistant.p3897e.p3921j.C52230ka) r5     // Catch:{ ct -> 0x0289 }
            r0.getClass()     // Catch:{ ct -> 0x0289 }
            int r11 = r5.f137059a     // Catch:{ ct -> 0x0289 }
            r16 = 1
            r11 = r11 | 1
            r5.f137059a = r11     // Catch:{ ct -> 0x0289 }
            r5.f137060b = r0     // Catch:{ ct -> 0x0289 }
            com.google.protobuf.bn r0 = r1.toBuilder()     // Catch:{ ct -> 0x0289 }
            com.google.assistant.e.j.e.gu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51995gu) r0     // Catch:{ ct -> 0x0289 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x0289 }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ ct -> 0x0289 }
            com.google.assistant.e.j.e.hb r1 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r1     // Catch:{ ct -> 0x0289 }
            int r5 = r1.f136478a     // Catch:{ ct -> 0x0289 }
            r5 = r5 | 16
            r1.f136478a = r5     // Catch:{ ct -> 0x0289 }
            r5 = 1
            r1.f136483f = r5     // Catch:{ ct -> 0x0287 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ ct -> 0x0287 }
            com.google.assistant.e.j.e.hb r0 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r0     // Catch:{ ct -> 0x0287 }
            com.google.protobuf.z r0 = r0.toByteString()     // Catch:{ ct -> 0x0287 }
            r4.copyOnWrite()     // Catch:{ ct -> 0x0287 }
            com.google.protobuf.bv r1 = r4.instance     // Catch:{ ct -> 0x0287 }
            com.google.assistant.e.j.ka r1 = (com.google.assistant.p3897e.p3921j.C52230ka) r1     // Catch:{ ct -> 0x0287 }
            r0.getClass()     // Catch:{ ct -> 0x0287 }
            int r11 = r1.f137059a     // Catch:{ ct -> 0x0287 }
            r11 = r11 | 2
            r1.f137059a = r11     // Catch:{ ct -> 0x0287 }
            r1.f137061c = r0     // Catch:{ ct -> 0x0287 }
            com.google.protobuf.bv r0 = r4.build()     // Catch:{ ct -> 0x0287 }
            com.google.assistant.e.j.ka r0 = (com.google.assistant.p3897e.p3921j.C52230ka) r0     // Catch:{ ct -> 0x0287 }
            r8.copyOnWrite()     // Catch:{ ct -> 0x0287 }
            com.google.protobuf.bv r1 = r8.instance     // Catch:{ ct -> 0x0287 }
            com.google.assistant.e.j.kc r1 = (com.google.assistant.p3897e.p3921j.C52232kc) r1     // Catch:{ ct -> 0x0287 }
            r0.getClass()     // Catch:{ ct -> 0x0287 }
            r1.f137066c = r0     // Catch:{ ct -> 0x0287 }
            int r0 = r1.f137064a     // Catch:{ ct -> 0x0287 }
            r0 = r0 | 2
            r1.f137064a = r0     // Catch:{ ct -> 0x0287 }
            com.google.protobuf.bv r0 = r8.build()     // Catch:{ ct -> 0x0287 }
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0     // Catch:{ ct -> 0x0287 }
            r15.mo53734d(r3, r0)     // Catch:{ ct -> 0x0287 }
            goto L_0x02ad
        L_0x0287:
            r0 = move-exception
            goto L_0x0293
        L_0x0289:
            r0 = move-exception
            goto L_0x0292
        L_0x028b:
            r0 = move-exception
            goto L_0x0290
        L_0x028d:
            r0 = move-exception
            r17 = r4
        L_0x0290:
            r18 = r5
        L_0x0292:
            r5 = 1
        L_0x0293:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107779e.f299900a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "CclCtrl"
            r1.mo56378ag(r4, r8)
            java.lang.String r4 = "InvalidProtocolBufferException: Parsing ShowTextArgs proto failed."
            r8 = 26166(0x6636, float:3.6666E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r8)).mo56386p(r4)
            goto L_0x02ad
        L_0x02a8:
            r17 = r4
            r18 = r5
            r5 = 1
        L_0x02ad:
            int r3 = r3 + 1
            r1 = r19
            r4 = r17
            r5 = r18
            r8 = 1
            r11 = 4
            goto L_0x01bf
        L_0x02b9:
            r17 = r4
            r18 = r5
            r5 = 1
            com.google.protobuf.bn r0 = r12.toBuilder()
            com.google.assistant.e.j.dx r0 = (com.google.assistant.p3897e.p3921j.C51808dx) r0
            com.google.protobuf.bv r1 = r15.build()
            com.google.assistant.e.j.dw r1 = (com.google.assistant.p3897e.p3921j.C51807dw) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.dy r3 = (com.google.assistant.p3897e.p3921j.C51809dy) r3
            r1.getClass()
            r3.f135938d = r1
            int r1 = r3.f135935a
            r4 = 4
            r1 = r1 | r4
            r3.f135935a = r1
            com.google.protobuf.bv r0 = r0.build()
            r12 = r0
            com.google.assistant.e.j.dy r12 = (com.google.assistant.p3897e.p3921j.C51809dy) r12
            goto L_0x02e9
        L_0x02e4:
            r17 = r4
            r18 = r5
            r5 = 1
        L_0x02e9:
            boolean r0 = r6.mo56113h()
            if (r0 == 0) goto L_0x0337
            com.google.common.b.ij r0 = r2.f299908i
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L_0x0337
            int r0 = r12.f135935a
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0337
            com.google.protobuf.bn r0 = r12.toBuilder()
            com.google.assistant.e.j.dx r0 = (com.google.assistant.p3897e.p3921j.C51808dx) r0
            com.google.assistant.e.j.dw r1 = r12.f135938d
            if (r1 != 0) goto L_0x0309
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0309:
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.dv r1 = (com.google.assistant.p3897e.p3921j.C51806dv) r1
            java.lang.Object r3 = r6.mo56107c()
            com.google.assistant.e.j.kc r3 = (com.google.assistant.p3897e.p3921j.C52232kc) r3
            r1.mo53733c(r3)
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.dw r1 = (com.google.assistant.p3897e.p3921j.C51807dw) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.dy r3 = (com.google.assistant.p3897e.p3921j.C51809dy) r3
            r1.getClass()
            r3.f135938d = r1
            int r1 = r3.f135935a
            r4 = 4
            r1 = r1 | r4
            r3.f135935a = r1
            com.google.protobuf.bv r0 = r0.build()
            r12 = r0
            com.google.assistant.e.j.dy r12 = (com.google.assistant.p3897e.p3921j.C51809dy) r12
        L_0x0337:
            com.google.protobuf.bn r0 = r10.toBuilder()
            com.google.assistant.e.j.eo r0 = (com.google.assistant.p3897e.p3921j.C52082eo) r0
            int r1 = r10.f136692b
            r3 = 4
            if (r1 != r3) goto L_0x0347
            java.lang.Object r1 = r10.f136693c
            com.google.assistant.e.j.ei r1 = (com.google.assistant.p3897e.p3921j.C52076ei) r1
            goto L_0x0349
        L_0x0347:
            com.google.assistant.e.j.ei r1 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0349:
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.eh r1 = (com.google.assistant.p3897e.p3921j.C52075eh) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.ei r3 = (com.google.assistant.p3897e.p3921j.C52076ei) r3
            r12.getClass()
            r3.f136668c = r12
            int r4 = r3.f136666a
            r4 = r4 | 32
            r3.f136666a = r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.ei r1 = (com.google.assistant.p3897e.p3921j.C52076ei) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.ep r3 = (com.google.assistant.p3897e.p3921j.C52083ep) r3
            r1.getClass()
            r3.f136693c = r1
            r1 = 4
            r3.f136692b = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.ep r0 = (com.google.assistant.p3897e.p3921j.C52083ep) r0
            r7.copyOnWrite()
            com.google.protobuf.bv r1 = r7.instance
            com.google.assistant.e.j.en r1 = (com.google.assistant.p3897e.p3921j.C52081en) r1
            r0.getClass()
            r1.mo53787a()
            com.google.protobuf.cq r1 = r1.f136684d
            r1.set(r9, r0)
            goto L_0x0394
        L_0x038f:
            r17 = r4
            r18 = r5
            r5 = 1
        L_0x0394:
            int r9 = r9 + 1
            r1 = r19
            r4 = r17
            r5 = r18
            r8 = 1
            goto L_0x0168
        L_0x039f:
            com.google.protobuf.bv r0 = r7.build()
            r4 = r0
            com.google.assistant.e.j.en r4 = (com.google.assistant.p3897e.p3921j.C52081en) r4
        L_0x03a6:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r4)
            goto L_0x03ad
        L_0x03ab:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x03ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107776b.apply(java.lang.Object):java.lang.Object");
    }
}
