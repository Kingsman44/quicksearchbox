package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.g.k */
/* compiled from: PG */
public final /* synthetic */ class C15639k implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15642n f46751a;

    /* renamed from: b */
    public final /* synthetic */ C15666r f46752b;

    public /* synthetic */ C15639k(C15642n nVar, C15666r rVar) {
        this.f46751a = nVar;
        this.f46752b = rVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017c, code lost:
        if (r9.equals("Song") != false) goto L_0x018a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r12 = this;
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.n r0 = r12.f46751a
            com.google.android.libraries.assistant.auto.tng.r.c.b.r r1 = r12.f46752b
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r2 = r1.mo22476b()
            int r2 = r2.mo22462b()
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x02b7
            r2 = 0
            r4 = 1
            if (r3 == 0) goto L_0x01fe
            r5 = 2
            r6 = 3
            if (r3 == r4) goto L_0x00f8
            if (r3 == r5) goto L_0x0022
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x02b6
        L_0x0022:
            com.google.common.f.e r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15642n.f46753a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Handling media init fulfillment through conversation delta"
            r4 = 46242(0xb4a2, float:6.4799E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r1 = r1.mo22476b()
            com.google.assistant.e.j.en r1 = r1.mo22466c()
            com.google.protobuf.cq r1 = r1.f136684d
            java.util.Iterator r1 = r1.iterator()
        L_0x003e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00cc
            java.lang.Object r2 = r1.next()
            com.google.assistant.e.j.ep r2 = (com.google.assistant.p3897e.p3921j.C52083ep) r2
            int r3 = r2.f136692b
            if (r3 != r6) goto L_0x0053
            java.lang.Object r2 = r2.f136693c
            com.google.assistant.e.j.ek r2 = (com.google.assistant.p3897e.p3921j.C52078ek) r2
            goto L_0x0055
        L_0x0053:
            com.google.assistant.e.j.ek r2 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x0055:
            int r3 = r2.f136674b
            if (r3 != r6) goto L_0x005e
            java.lang.Object r2 = r2.f136675c
            com.google.assistant.e.j.ec r2 = (com.google.assistant.p3897e.p3921j.C52070ec) r2
            goto L_0x0060
        L_0x005e:
            com.google.assistant.e.j.ec r2 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
        L_0x0060:
            com.google.assistant.e.j.eb r2 = r2.f136655c
            if (r2 != 0) goto L_0x0066
            com.google.assistant.e.j.eb r2 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
        L_0x0066:
            com.google.protobuf.cq r2 = r2.f136650a
            java.util.Iterator r2 = r2.iterator()
        L_0x006c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r2.next()
            com.google.assistant.e.j.kc r3 = (com.google.assistant.p3897e.p3921j.C52232kc) r3
            java.lang.String r4 = r3.f137065b
            java.lang.String r5 = "play_media_op_result"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x006c
            com.google.assistant.e.j.ka r3 = r3.f137066c     // Catch:{ ct -> 0x00bc }
            if (r3 != 0) goto L_0x0088
            com.google.assistant.e.j.ka r3 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x00bc }
        L_0x0088:
            com.google.protobuf.z r3 = r3.f137061c     // Catch:{ ct -> 0x00bc }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00bc }
            com.google.assistant.e.j.ie r5 = com.google.assistant.p3897e.p3921j.C52180ie.f136954d     // Catch:{ ct -> 0x00bc }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (com.google.protobuf.C63088z) r3, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x00bc }
            com.google.assistant.e.j.ie r3 = (com.google.assistant.p3897e.p3921j.C52180ie) r3     // Catch:{ ct -> 0x00bc }
            com.google.android.libraries.assistant.auto.ondevice.a.c r4 = r0.f46756c     // Catch:{ ct -> 0x00bc }
            r5 = 2132090283(0x7f151dab, float:1.9820902E38)
            com.google.common.util.concurrent.cx r4 = r4.mo20177a(r5)     // Catch:{ ct -> 0x00bc }
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.j r5 = new com.google.android.libraries.assistant.auto.tng.r.c.a.g.j     // Catch:{ ct -> 0x00bc }
            r5.<init>(r3)     // Catch:{ ct -> 0x00bc }
            java.util.concurrent.Executor r3 = r0.f46755b     // Catch:{ ct -> 0x00bc }
            com.google.common.base.ah r5 = com.google.apps.tiktok.tracing.C47810es.m84963c(r5)     // Catch:{ ct -> 0x00bc }
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60922j.m93044g(r4, r5, r3)     // Catch:{ ct -> 0x00bc }
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.i r4 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15637i.f46749a     // Catch:{ ct -> 0x00bc }
            java.util.concurrent.Executor r5 = r0.f46755b     // Catch:{ ct -> 0x00bc }
            com.google.common.base.ah r4 = com.google.apps.tiktok.tracing.C47810es.m84963c(r4)     // Catch:{ ct -> 0x00bc }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r3, r4, r5)     // Catch:{ ct -> 0x00bc }
            goto L_0x02b6
        L_0x00bc:
            r3 = move-exception
            com.google.common.f.e r4 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15642n.f46753a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Invalid parse"
            r7 = 46240(0xb4a0, float:6.4796E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r7)).mo56386p(r5)
            goto L_0x006c
        L_0x00cc:
            com.google.assistant.e.e.a.j r0 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.e.a.e r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51190e) r0
            com.google.assistant.e.j.en r1 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.e.a.j r2 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r2
            r1.getClass()
            r2.f133275j = r1
            int r1 = r2.f133266a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r2.f133266a = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x02b6
        L_0x00f8:
            com.google.common.f.e r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15642n.f46753a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r7 = "Handling media init fulfillment through intent query"
            r8 = 46241(0xb4a1, float:6.4797E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r8)).mo56386p(r7)
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r3 = r1.mo22476b()
            com.google.knowledge.a.a.n r3 = r3.mo22470d()
            java.lang.String r3 = r3.f166811b
            java.lang.String r7 = "PlayMedia"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0132
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r3 = r1.mo22476b()
            com.google.knowledge.a.a.n r3 = r3.mo22470d()
            java.lang.String r3 = r3.f166811b
            java.lang.String r7 = "Play_media"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0132
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x02b6
        L_0x0132:
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r3 = r1.mo22476b()
            com.google.knowledge.a.a.n r3 = r3.mo22470d()
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.a r7 = new com.google.android.libraries.assistant.auto.tng.r.c.a.g.a
            r7.<init>()
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r8 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r8.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r3)
            java.lang.String r9 = "media_object"
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r8 = r8.mo22496a(r9)
            com.google.common.base.ax r9 = r8.f46791a
            boolean r10 = r9.mo56113h()
            if (r10 == 0) goto L_0x01df
            java.lang.Object r9 = r9.mo56107c()
            com.google.knowledge.a.a.n r9 = (com.google.knowledge.p4661a.p4662a.C61752n) r9
            java.lang.String r9 = r9.f166811b
            int r10 = r9.hashCode()
            switch(r10) {
                case -654974148: goto L_0x017f;
                case 2582837: goto L_0x0176;
                case 63344207: goto L_0x016c;
                case 1201467603: goto L_0x0162;
                default: goto L_0x0161;
            }
        L_0x0161:
            goto L_0x0189
        L_0x0162:
            java.lang.String r2 = "MediaUnspecified"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x0189
            r2 = 2
            goto L_0x018a
        L_0x016c:
            java.lang.String r2 = "Album"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x0189
            r2 = 1
            goto L_0x018a
        L_0x0176:
            java.lang.String r10 = "Song"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0189
            goto L_0x018a
        L_0x017f:
            java.lang.String r2 = "Media_unspecified"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x0189
            r2 = 3
            goto L_0x018a
        L_0x0189:
            r2 = -1
        L_0x018a:
            java.lang.String r9 = "artist"
            java.lang.String r10 = "genre"
            java.lang.String r11 = "title"
            if (r2 == 0) goto L_0x01c1
            if (r2 == r4) goto L_0x01ae
            if (r2 == r5) goto L_0x0199
            if (r2 == r6) goto L_0x0199
            goto L_0x01df
        L_0x0199:
            java.lang.String r2 = "related_person"
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r2 = r8.mo22496a(r2)
            java.lang.String r4 = "name"
            com.google.common.base.ax r2 = r2.mo22500e(r4)
            r7.f46730c = r2
            com.google.common.base.ax r2 = r8.mo22500e(r10)
            r7.f46732e = r2
            goto L_0x01df
        L_0x01ae:
            com.google.common.base.ax r2 = r8.mo22500e(r11)
            r7.f46729b = r2
            com.google.common.base.ax r2 = r8.mo22500e(r9)
            r7.f46730c = r2
            com.google.common.base.ax r2 = r8.mo22500e(r10)
            r7.f46732e = r2
            goto L_0x01df
        L_0x01c1:
            com.google.common.base.ax r2 = r8.mo22500e(r11)
            r7.f46728a = r2
            com.google.common.base.ax r2 = r8.mo22500e(r9)
            r7.f46730c = r2
            com.google.common.base.ax r2 = r8.mo22500e(r10)
            r7.f46732e = r2
            java.lang.String r2 = "album"
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r2 = r8.mo22496a(r2)
            com.google.common.base.ax r2 = r2.mo22500e(r11)
            r7.f46729b = r2
        L_0x01df:
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r2 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r2.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r3)
            java.lang.String r3 = "app"
            com.google.common.base.ax r2 = r2.mo22500e(r3)
            r7.f46733f = r2
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.m r2 = r7.mo22457p()
            com.google.android.libraries.assistant.auto.tng.r.c.b.p r1 = r1.mo22477c()
            java.lang.String r1 = r1.mo22487a()
            com.google.common.util.concurrent.cx r0 = r0.mo22458b(r2, r1)
            goto L_0x02b6
        L_0x01fe:
            com.google.common.f.e r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15642n.f46753a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r5 = "Handling media init fulfillment through analyzer response"
            r6 = 46243(0xb4a3, float:6.48E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r5)
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r3 = r1.mo22476b()
            com.google.protos.an.f r3 = r3.mo22461a()
            com.google.protobuf.bt r5 = com.google.protos.p4850an.p4855d.p4858c.C63498af.f171735f
            java.lang.Object r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32464c(r3, r5)
            com.google.protos.an.d.c.af r3 = (com.google.protos.p4850an.p4855d.p4858c.C63498af) r3
            if (r3 == 0) goto L_0x02b0
            boolean r5 = r3.f171738b
            if (r5 == 0) goto L_0x02b0
            com.google.protobuf.cq r5 = r3.f171739c
            int r5 = r5.size()
            if (r5 == r4) goto L_0x022c
            goto L_0x02b0
        L_0x022c:
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.a r5 = new com.google.android.libraries.assistant.auto.tng.r.c.a.g.a
            r5.<init>()
            com.google.protobuf.cq r6 = r3.f171739c
            java.lang.Object r6 = r6.get(r2)
            com.google.protos.an.d.c.n r6 = (com.google.protos.p4850an.p4855d.p4858c.C63541n) r6
            com.google.protos.an.d.c.ax r7 = r6.f171868b
            if (r7 != 0) goto L_0x023f
            com.google.protos.an.d.c.ax r7 = com.google.protos.p4850an.p4855d.p4858c.C63516ax.f171799b
        L_0x023f:
            java.lang.String r7 = r7.f171801a
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
            r5.f46728a = r7
            com.google.protos.an.d.c.al r7 = r6.f171869c
            if (r7 != 0) goto L_0x024d
            com.google.protos.an.d.c.al r7 = com.google.protos.p4850an.p4855d.p4858c.C63504al.f171767b
        L_0x024d:
            java.lang.String r7 = r7.f171769a
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
            r5.f46730c = r7
            com.google.protos.an.d.c.l r7 = r6.f171870d
            if (r7 != 0) goto L_0x025b
            com.google.protos.an.d.c.l r7 = com.google.protos.p4850an.p4855d.p4858c.C63539l.f171859b
        L_0x025b:
            java.lang.String r7 = r7.f171861a
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
            r5.f46729b = r7
            com.google.protos.an.d.c.ap r6 = r6.f171871e
            if (r6 != 0) goto L_0x0269
            com.google.protos.an.d.c.ap r6 = com.google.protos.p4850an.p4855d.p4858c.C63508ap.f171778b
        L_0x0269:
            java.lang.String r6 = r6.f171780a
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            r5.f46731d = r6
            com.google.protobuf.cq r6 = r3.f171740d
            int r6 = r6.size()
            if (r6 != r4) goto L_0x029f
            com.google.protobuf.cq r3 = r3.f171740d
            java.lang.Object r3 = r3.get(r2)
            com.google.protos.an.d.c.ah r3 = (com.google.protos.p4850an.p4855d.p4858c.C63500ah) r3
            java.lang.String r4 = r3.f171756a
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            r5.f46733f = r4
            com.google.protobuf.cq r4 = r3.f171757b
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x029f
            com.google.protobuf.cq r3 = r3.f171757b
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            r5.f46734g = r2
        L_0x029f:
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.m r2 = r5.mo22457p()
            com.google.android.libraries.assistant.auto.tng.r.c.b.p r1 = r1.mo22477c()
            java.lang.String r1 = r1.mo22487a()
            com.google.common.util.concurrent.cx r0 = r0.mo22458b(r2, r1)
            goto L_0x02b6
        L_0x02b0:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x02b6:
            return r0
        L_0x02b7:
            r0 = 0
            goto L_0x02ba
        L_0x02b9:
            throw r0
        L_0x02ba:
            goto L_0x02b9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15639k.mo18058a():com.google.common.util.concurrent.cx");
    }
}
