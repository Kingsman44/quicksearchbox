package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3845e.C49528al;
import java.util.concurrent.Callable;

/* renamed from: com.google.assistant.ao.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C49427ad implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C49429af f127670a;

    /* renamed from: b */
    public final /* synthetic */ C49528al f127671b;

    public /* synthetic */ C49427ad(C49429af afVar, C49528al alVar) {
        this.f127670a = afVar;
        this.f127671b = alVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.google.assistant.ao.a.e.df} */
    /* JADX WARNING: type inference failed for: r1v68, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (com.google.common.base.C58837ba.m90859h(r6) != false) goto L_0x0063;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x06ea  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x072a  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x057b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r24 = this;
            r0 = r24
            com.google.assistant.ao.a.af r1 = r0.f127670a
            com.google.assistant.ao.a.e.al r2 = r0.f127671b
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            android.content.Context r7 = r1.f127675b
            if (r7 == 0) goto L_0x073a
            int r6 = r2.f127798f
            int r6 = com.google.assistant.p3838ao.p3839a.p3845e.C49587cq.m85581a(r6)
            if (r6 != 0) goto L_0x0020
            r9 = 2
            goto L_0x0021
        L_0x0020:
            r9 = r6
        L_0x0021:
            com.google.assistant.ao.a.h.q r6 = r1.f127676c
            com.google.assistant.ao.a.h.p r10 = r6.mo53320a()
            if (r10 == 0) goto L_0x0732
            android.content.Context r6 = r1.f127675b
            java.lang.String r8 = "phone"
            java.lang.Object r8 = r6.getSystemService(r8)
            android.telephony.TelephonyManager r8 = (android.telephony.TelephonyManager) r8
            r14 = 0
            if (r8 == 0) goto L_0x0043
            java.lang.String r8 = r8.getNetworkCountryIso()
            boolean r11 = com.google.common.base.C58837ba.m90859h(r8)
            if (r11 != 0) goto L_0x0043
            r20 = r8
            goto L_0x006b
        L_0x0043:
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            android.os.LocaleList r6 = r6.getLocales()
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto L_0x0063
            java.util.Locale r6 = r6.get(r14)
            java.lang.String r6 = r6.getCountry()
            boolean r8 = com.google.common.base.C58837ba.m90859h(r6)
            if (r8 == 0) goto L_0x0069
        L_0x0063:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r6 = r6.getCountry()
        L_0x0069:
            r20 = r6
        L_0x006b:
            if (r20 == 0) goto L_0x072a
            com.google.assistant.ao.a.g.a r13 = r1.f127677d
            if (r13 == 0) goto L_0x0722
            com.google.common.b.ij r16 = r13.mo53293b()
            if (r16 == 0) goto L_0x071a
            com.google.assistant.ao.a.g.a r6 = r1.f127677d
            com.google.common.b.ij r17 = r6.mo53292a()
            if (r17 == 0) goto L_0x0712
            com.google.android.apps.gsa.nga.engine.ap.b.l r12 = r1.f127681h
            if (r12 == 0) goto L_0x070a
            com.google.android.apps.gsa.nga.engine.ap.b.n r11 = r1.f127682i
            if (r11 == 0) goto L_0x0702
            com.google.android.apps.gsa.nga.engine.ap.b.m r8 = r1.f127684k
            if (r8 == 0) goto L_0x06fa
            com.google.common.v.i r6 = r1.f127678e
            if (r6 == 0) goto L_0x06f2
            int r14 = r2.f127798f
            int r14 = com.google.assistant.p3838ao.p3839a.p3845e.C49587cq.m85581a(r14)
            r22 = 0
            if (r14 != 0) goto L_0x009b
            r15 = 2
            goto L_0x00a4
        L_0x009b:
            r15 = 2
            if (r14 == r15) goto L_0x00a4
            r2 = r22
            r19 = 1
            goto L_0x012e
        L_0x00a4:
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r2)
            com.google.assistant.ao.a.e.da r14 = r2.f127796d
            if (r14 != 0) goto L_0x00ae
            com.google.assistant.ao.a.e.da r14 = com.google.assistant.p3838ao.p3839a.p3845e.C49598da.f127991a
        L_0x00ae:
            com.google.protobuf.bt r19 = com.google.assistant.p3838ao.p3839a.p3845e.C49579ci.f127930i
            com.google.protobuf.bt r15 = com.google.protobuf.C62942bv.checkIsLite(r19)
            r14.mo58887l(r15)
            com.google.protobuf.bf r14 = r14.f169962ag
            com.google.protobuf.bs r15 = r15.f169971d
            boolean r14 = r14.mo58857o(r15)
            if (r14 == 0) goto L_0x0101
            com.google.assistant.ao.a.e.da r4 = r2.f127796d
            if (r4 != 0) goto L_0x00c7
            com.google.assistant.ao.a.e.da r4 = com.google.assistant.p3838ao.p3839a.p3845e.C49598da.f127991a
        L_0x00c7:
            com.google.protobuf.bt r14 = com.google.assistant.p3838ao.p3839a.p3845e.C49579ci.f127930i
            com.google.protobuf.bt r14 = com.google.protobuf.C62942bv.checkIsLite(r14)
            r4.mo58887l(r14)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r15 = r14.f169971d
            java.lang.Object r4 = r4.mo58854l(r15)
            if (r4 != 0) goto L_0x00dd
            java.lang.Object r4 = r14.f169969b
            goto L_0x00e1
        L_0x00dd:
            java.lang.Object r4 = r14.mo58889c(r4)
        L_0x00e1:
            com.google.assistant.ao.a.e.ci r4 = (com.google.assistant.p3838ao.p3839a.p3845e.C49579ci) r4
            com.google.assistant.ao.a.i r14 = new com.google.assistant.ao.a.i
            r14.<init>(r4)
            j$.util.Optional r14 = p3186j$.util.Optional.m71637of(r14)
            int r15 = r4.f127932a
            r19 = 1
            r15 = r15 & 1
            if (r15 == 0) goto L_0x00ff
            java.lang.String r4 = r4.f127938g
            android.net.Uri r4 = android.net.Uri.parse(r4)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            r5 = r4
        L_0x00ff:
            r4 = r14
            goto L_0x0103
        L_0x0101:
            r19 = 1
        L_0x0103:
            java.lang.String r14 = r2.f127797e
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x012c
            java.lang.String r2 = r2.f127797e
            java.util.Locale r2 = java.util.Locale.forLanguageTag(r2)
            java.lang.String r14 = r2.toLanguageTag()
            java.lang.String r15 = "und"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x012e
            com.google.common.f.a.d r14 = com.google.assistant.p3838ao.p3839a.C49429af.f127673a
            com.google.common.f.x r14 = r14.mo56226d()
            java.lang.String r15 = "Locale specified in the request has an invalid format. The locale should be formatted according to the BCP47 standard."
            r0 = 54832(0xd630, float:7.6836E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r14).mo56372aa(r0)).mo56386p(r15)
            goto L_0x012e
        L_0x012c:
            r2 = r22
        L_0x012e:
            if (r2 == 0) goto L_0x0132
            r0 = r2
            goto L_0x0138
        L_0x0132:
            com.google.android.apps.gsa.nga.engine.ap.b.k r0 = r1.f127683j
            java.util.Locale r0 = r0.mo71385a()
        L_0x0138:
            if (r0 == 0) goto L_0x06ea
            com.google.assistant.ao.a.b r2 = new com.google.assistant.ao.a.b
            r21 = r6
            r6 = r2
            r23 = r8
            r8 = r3
            r3 = r11
            r11 = r4
            r4 = r12
            r12 = r5
            r5 = r13
            r13 = r16
            r15 = 0
            r14 = r17
            r15 = r4
            r16 = r3
            r17 = r0
            r18 = r23
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.google.assistant.ao.a.p r0 = r1.f127679f
            com.google.assistant.ao.a.h r0 = r0.mo53327a()
            java.util.Locale r1 = r2.f127642h
            com.google.assistant.ao.a.o r0 = (com.google.assistant.p3838ao.p3839a.C49689o) r0
            java.util.Map r3 = r0.f128254e
            java.lang.String r4 = r1.toLanguageTag()
            java.lang.String r4 = com.google.assistant.p3838ao.p3839a.p3849i.C49682m.m85673a(r4)
            java.lang.Object r3 = r3.get(r4)
            com.google.assistant.ao.a.e.df r3 = (com.google.assistant.p3838ao.p3839a.p3845e.C49603df) r3
            if (r3 == 0) goto L_0x0175
            goto L_0x01a2
        L_0x0175:
            java.util.Map r3 = r0.f128254e
            java.lang.String r1 = r1.getLanguage()
            java.lang.String r1 = com.google.assistant.p3838ao.p3839a.p3849i.C49682m.m85673a(r1)
            java.lang.Object r1 = r3.get(r1)
            r3 = r1
            com.google.assistant.ao.a.e.df r3 = (com.google.assistant.p3838ao.p3839a.p3845e.C49603df) r3
            if (r3 != 0) goto L_0x01a2
            com.google.assistant.ao.a.e.df r1 = com.google.assistant.p3838ao.p3839a.p3845e.C49603df.f128003c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.ao.a.e.de r1 = (com.google.assistant.p3838ao.p3839a.p3845e.C49602de) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.ao.a.e.df r3 = (com.google.assistant.p3838ao.p3839a.p3845e.C49603df) r3
            r4 = 0
            r3.f128006b = r4
            com.google.protobuf.bv r1 = r1.build()
            r3 = r1
            com.google.assistant.ao.a.e.df r3 = (com.google.assistant.p3838ao.p3839a.p3845e.C49603df) r3
            goto L_0x01a3
        L_0x01a2:
            r4 = 0
        L_0x01a3:
            boolean r1 = r3.f128006b
            if (r1 != 0) goto L_0x01c6
            com.google.common.f.a.d r0 = com.google.assistant.p3838ao.p3839a.C49689o.f128250a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r1 = 54808(0xd618, float:7.6802E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r1 = "Suggestions are not supported for context locale %s"
            java.util.Locale r3 = r2.f127642h
            r0.mo56389s(r1, r3)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            r10 = 2
            goto L_0x027c
        L_0x01c6:
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89837e()
            int r5 = r2.f127645k
            com.google.common.b.gu r6 = r0.f128252c
            int r7 = r6.size()
            r14 = 0
        L_0x01d3:
            if (r14 >= r7) goto L_0x0277
            java.lang.Object r8 = r6.get(r14)
            com.google.assistant.ao.a.e.dj r8 = (com.google.assistant.p3838ao.p3839a.p3845e.C49607dj) r8
            int r9 = r8.f128015a
            int r15 = com.google.assistant.p3838ao.p3839a.p3845e.C49587cq.m85581a(r9)
            if (r15 != 0) goto L_0x01e4
            r15 = 1
        L_0x01e4:
            if (r15 == r5) goto L_0x01e9
        L_0x01e6:
            r10 = 2
            goto L_0x0272
        L_0x01e9:
            com.google.protobuf.cq r9 = r8.f128016b
            r9.size()
            com.google.protobuf.cq r8 = r8.f128016b
            java.util.Iterator r8 = r8.iterator()
        L_0x01f4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01e6
            java.lang.Object r9 = r8.next()
            com.google.assistant.ao.a.e.di r9 = (com.google.assistant.p3838ao.p3839a.p3845e.C49606di) r9
            r10 = 2
            if (r5 != r10) goto L_0x0213
            com.google.assistant.ao.a.e.h r11 = r2.mo53330q()
            int r12 = r9.f128009a
            com.google.assistant.ao.a.e.h r12 = com.google.assistant.p3838ao.p3839a.p3845e.C49617h.m85585a(r12)
            if (r12 != 0) goto L_0x0211
            com.google.assistant.ao.a.e.h r12 = com.google.assistant.p3838ao.p3839a.p3845e.C49617h.CLIENT_ID_UNDEFINED
        L_0x0211:
            if (r11 != r12) goto L_0x01f4
        L_0x0213:
            com.google.protobuf.cq r11 = r9.f128011c
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x021e:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0244
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            int r15 = r12.size()
            r0.mo53325a(r2, r13, r12)
        L_0x0231:
            int r4 = r12.size()
            if (r15 >= r4) goto L_0x0242
            java.lang.Object r4 = r12.get(r15)
            com.google.assistant.ao.a.d r4 = (com.google.assistant.p3838ao.p3839a.C49503d) r4
            r4.f127725f = r13
            int r15 = r15 + 1
            goto L_0x0231
        L_0x0242:
            r4 = 0
            goto L_0x021e
        L_0x0244:
            int r4 = r9.f128009a
            com.google.assistant.ao.a.e.h r4 = com.google.assistant.p3838ao.p3839a.p3845e.C49617h.m85585a(r4)
            if (r4 != 0) goto L_0x024e
            com.google.assistant.ao.a.e.h r4 = com.google.assistant.p3838ao.p3839a.p3845e.C49617h.CLIENT_ID_UNDEFINED
        L_0x024e:
            java.lang.String r9 = r9.f128010b
            com.google.assistant.ao.a.l r11 = new com.google.assistant.ao.a.l
            r11.<init>(r3)
            p3186j$.util.Collection.EL.removeIf(r12, r11)
            java.util.Iterator r11 = r12.iterator()
        L_0x025c:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x026d
            java.lang.Object r13 = r11.next()
            com.google.assistant.ao.a.d r13 = (com.google.assistant.p3838ao.p3839a.C49503d) r13
            r13.f127721b = r4
            r13.f127722c = r9
            goto L_0x025c
        L_0x026d:
            r1.mo55396h(r12)
            r4 = 0
            goto L_0x01f4
        L_0x0272:
            int r14 = r14 + 1
            r4 = 0
            goto L_0x01d3
        L_0x0277:
            r10 = 2
            com.google.common.b.gu r0 = r1.mo55394f()
        L_0x027c:
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.Class<com.google.assistant.ao.a.e.h> r3 = com.google.assistant.p3838ao.p3839a.p3845e.C49617h.class
            r1.<init>(r3)
            java.util.EnumMap r3 = new java.util.EnumMap
            java.lang.Class<com.google.assistant.ao.a.e.h> r4 = com.google.assistant.p3838ao.p3839a.p3845e.C49617h.class
            r3.<init>(r4)
            java.util.EnumMap r4 = new java.util.EnumMap
            java.lang.Class<com.google.assistant.ao.a.e.h> r5 = com.google.assistant.p3838ao.p3839a.p3845e.C49617h.class
            r4.<init>(r5)
            com.google.assistant.ao.a.ae r5 = com.google.assistant.p3838ao.p3839a.C49428ae.f127672a
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89836F(r5, r0)
            r5 = r0
            com.google.common.b.pq r5 = (com.google.common.p4522b.C58724pq) r5
            int r5 = r5.f156474d
            r14 = 0
        L_0x029d:
            if (r14 >= r5) goto L_0x0585
            java.lang.Object r6 = r0.get(r14)
            com.google.assistant.ao.a.d r6 = (com.google.assistant.p3838ao.p3839a.C49503d) r6
            com.google.assistant.ao.a.e.h r7 = r6.f127721b
            java.lang.String r8 = r6.f127722c
            int r9 = r6.mo53267a()
            if (r9 == 0) goto L_0x0584
            r7.name()
            java.lang.Object r9 = r1.get(r7)
            com.google.assistant.ao.a.e.am r9 = (com.google.assistant.p3838ao.p3839a.p3845e.C49529am) r9
            if (r9 != 0) goto L_0x02d7
            com.google.assistant.ao.a.e.an r9 = com.google.assistant.p3838ao.p3839a.p3845e.C49530an.f127800e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.ao.a.e.am r9 = (com.google.assistant.p3838ao.p3839a.p3845e.C49529am) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.ao.a.e.an r11 = (com.google.assistant.p3838ao.p3839a.p3845e.C49530an) r11
            int r12 = r7.f128057q
            r11.f127803b = r12
            int r12 = r11.f127802a
            r13 = 1
            r12 = r12 | r13
            r11.f127802a = r12
            r1.put(r7, r9)
            goto L_0x02d8
        L_0x02d7:
            r13 = 1
        L_0x02d8:
            boolean r11 = r8.isEmpty()
            if (r11 != 0) goto L_0x0313
            java.lang.Object r11 = r4.get(r7)
            java.util.Map r11 = (java.util.Map) r11
            if (r11 != 0) goto L_0x02ee
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r4.put(r7, r11)
        L_0x02ee:
            java.lang.Object r12 = r11.get(r8)
            com.google.assistant.ao.a.e.ai r12 = (com.google.assistant.p3838ao.p3839a.p3845e.C49525ai) r12
            if (r12 != 0) goto L_0x0315
            com.google.assistant.ao.a.e.aj r12 = com.google.assistant.p3838ao.p3839a.p3845e.C49526aj.f127782h
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.ao.a.e.ai r12 = (com.google.assistant.p3838ao.p3839a.p3845e.C49525ai) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r15 = r12.instance
            com.google.assistant.ao.a.e.aj r15 = (com.google.assistant.p3838ao.p3839a.p3845e.C49526aj) r15
            r8.getClass()
            int r10 = r15.f127784a
            r10 = r10 | r13
            r15.f127784a = r10
            r15.f127785b = r8
            r11.put(r8, r12)
            goto L_0x0315
        L_0x0313:
            r12 = r22
        L_0x0315:
            int r8 = r6.mo53267a()
            int r10 = r8 + -1
            if (r8 == 0) goto L_0x0583
            r8 = 16
            r11 = 8
            if (r10 == 0) goto L_0x038f
            if (r10 == r13) goto L_0x032d
            r16 = r0
            r12 = r1
            r15 = r14
        L_0x0329:
            r17 = 2
            goto L_0x057b
        L_0x032d:
            if (r12 == 0) goto L_0x038a
            com.google.assistant.ao.a.c r6 = (com.google.assistant.p3838ao.p3839a.C49444c) r6
            com.google.protobuf.bv r7 = r12.instance
            com.google.assistant.ao.a.e.aj r7 = (com.google.assistant.p3838ao.p3839a.p3845e.C49526aj) r7
            double r9 = r7.f127788e
            r15 = r14
            double r13 = r6.f127723d
            int r16 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r16 < 0) goto L_0x0341
            java.lang.String r6 = r7.f127785b
            goto L_0x038b
        L_0x0341:
            java.lang.String r7 = r6.f127697a
            r12.copyOnWrite()
            com.google.protobuf.bv r9 = r12.instance
            com.google.assistant.ao.a.e.aj r9 = (com.google.assistant.p3838ao.p3839a.p3845e.C49526aj) r9
            r7.getClass()
            int r10 = r9.f127784a
            r13 = 2
            r10 = r10 | r13
            r9.f127784a = r10
            r9.f127786c = r7
            r12.copyOnWrite()
            com.google.protobuf.bv r7 = r12.instance
            com.google.assistant.ao.a.e.aj r7 = (com.google.assistant.p3838ao.p3839a.p3845e.C49526aj) r7
            int r9 = r7.f127784a
            r9 = r9 | 4
            r7.f127784a = r9
            r10 = 0
            r7.f127787d = r10
            com.google.protos.f.u.h r7 = r6.f127726g
            r12.copyOnWrite()
            com.google.protobuf.bv r9 = r12.instance
            com.google.assistant.ao.a.e.aj r9 = (com.google.assistant.p3838ao.p3839a.p3845e.C49526aj) r9
            int r7 = r7.getNumber()
            r9.f127790g = r7
            int r7 = r9.f127784a
            r7 = r7 | r8
            r9.f127784a = r7
            double r6 = r6.f127723d
            r12.copyOnWrite()
            com.google.protobuf.bv r8 = r12.instance
            com.google.assistant.ao.a.e.aj r8 = (com.google.assistant.p3838ao.p3839a.p3845e.C49526aj) r8
            int r9 = r8.f127784a
            r9 = r9 | r11
            r8.f127784a = r9
            r8.f127788e = r6
            goto L_0x038b
        L_0x038a:
            r15 = r14
        L_0x038b:
            r16 = r0
            r12 = r1
            goto L_0x0329
        L_0x038f:
            r15 = r14
            r10 = 0
            com.google.assistant.ao.a.s r6 = (com.google.assistant.p3838ao.p3839a.C49693s) r6
            j$.util.Optional r13 = r6.f128265a
            com.google.assistant.ao.a.e.ah r13 = com.google.assistant.p3838ao.p3839a.p3845e.C49524ah.f127762s
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.ao.a.e.ag r13 = (com.google.assistant.p3838ao.p3839a.p3845e.C49523ag) r13
            com.google.assistant.ao.a.e.h r14 = r6.f127721b
            r13.copyOnWrite()
            com.google.protobuf.bv r10 = r13.instance
            com.google.assistant.ao.a.e.ah r10 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r10
            int r14 = r14.f128057q
            r10.f127767d = r14
            int r14 = r10.f127764a
            r16 = 1
            r14 = r14 | 1
            r10.f127764a = r14
            java.lang.String r10 = r6.f127722c
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.ao.a.e.ah r14 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r14
            r10.getClass()
            int r8 = r14.f127764a
            r17 = 2
            r8 = r8 | 2
            r14.f127764a = r8
            r14.f127768e = r10
            r8 = r12
            double r11 = r6.f127723d
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.ao.a.e.ah r14 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r14
            int r10 = r14.f127764a
            r10 = r10 | 4
            r14.f127764a = r10
            r14.f127769f = r11
            int r11 = r6.f127724e
            r13.copyOnWrite()
            com.google.protobuf.bv r10 = r13.instance
            r12 = r10
            com.google.assistant.ao.a.e.ah r12 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r12
            int r10 = r12.f127764a
            r14 = 8
            r10 = r10 | r14
            r14 = r10
            r12.f127764a = r14
            r12.f127770g = r11
            j$.util.Optional r11 = r6.f128265a
            p3186j$.util.Objects.requireNonNull(r13)
            com.google.assistant.ao.a.w r12 = new com.google.assistant.ao.a.w
            r12.<init>(r13)
            r11.ifPresent(r12)
            j$.util.Optional r11 = r6.f128266j
            p3186j$.util.Objects.requireNonNull(r13)
            com.google.assistant.ao.a.x r12 = new com.google.assistant.ao.a.x
            r12.<init>(r13)
            r11.ifPresent(r12)
            j$.util.Optional r11 = r6.f128267k
            com.google.assistant.ao.a.y r12 = com.google.assistant.p3838ao.p3839a.C49699y.f128276a
            j$.util.Optional r11 = r11.map(r12)
            p3186j$.util.Objects.requireNonNull(r13)
            com.google.assistant.ao.a.z r12 = new com.google.assistant.ao.a.z
            r12.<init>(r13)
            r11.ifPresent(r12)
            j$.util.Optional r11 = r6.f128268l
            p3186j$.util.Objects.requireNonNull(r13)
            com.google.assistant.ao.a.aa r12 = new com.google.assistant.ao.a.aa
            r12.<init>(r13)
            r11.ifPresent(r12)
            int r11 = r6.f128269m
            if (r11 <= 0) goto L_0x043b
            r13.copyOnWrite()
            com.google.protobuf.bv r12 = r13.instance
            com.google.assistant.ao.a.e.ah r12 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r12
            int r14 = r12.f127764a
            r14 = r14 | 256(0x100, float:3.59E-43)
            r12.f127764a = r14
            r12.f127775l = r11
        L_0x043b:
            com.google.protos.f.u.h r11 = r6.f127726g
            r13.copyOnWrite()
            com.google.protobuf.bv r12 = r13.instance
            com.google.assistant.ao.a.e.ah r12 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r12
            int r11 = r11.getNumber()
            r12.f127776m = r11
            int r11 = r12.f127764a
            r11 = r11 | 512(0x200, float:7.175E-43)
            r12.f127764a = r11
            boolean r11 = r6.f127727h
            r13.copyOnWrite()
            com.google.protobuf.bv r12 = r13.instance
            com.google.assistant.ao.a.e.ah r12 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r12
            int r14 = r12.f127764a
            r14 = r14 | 1024(0x400, float:1.435E-42)
            r12.f127764a = r14
            r12.f127777n = r11
            int r11 = r6.f127728i
            r13.copyOnWrite()
            com.google.protobuf.bv r12 = r13.instance
            com.google.assistant.ao.a.e.ah r12 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r12
            int r11 = com.google.assistant.p3838ao.p3839a.p3845e.C49522af.m85574b(r11)
            r12.f127778o = r11
            int r11 = r12.f127764a
            r11 = r11 | 2048(0x800, float:2.87E-42)
            r12.f127764a = r11
            java.lang.String r11 = r6.f127725f
            int r12 = r11.length()
            r14 = 16
            if (r12 != r14) goto L_0x04aa
            r16 = r0
            r12 = r1
            long r0 = com.google.common.p4575r.C60763t.m92766c(r11, r14)     // Catch:{ NumberFormatException -> 0x0497 }
            r13.copyOnWrite()     // Catch:{ NumberFormatException -> 0x0497 }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ NumberFormatException -> 0x0497 }
            com.google.assistant.ao.a.e.ah r14 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r14     // Catch:{ NumberFormatException -> 0x0497 }
            int r10 = r14.f127764a     // Catch:{ NumberFormatException -> 0x0497 }
            r10 = r10 | 8192(0x2000, float:1.14794E-41)
            r14.f127764a = r10     // Catch:{ NumberFormatException -> 0x0497 }
            r14.f127780q = r0     // Catch:{ NumberFormatException -> 0x0497 }
            goto L_0x04bf
        L_0x0497:
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.assistant.ao.a.e.ah r0 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r0
            r11.getClass()
            int r1 = r0.f127764a
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r0.f127764a = r1
            r0.f127779p = r11
            goto L_0x04bf
        L_0x04aa:
            r16 = r0
            r12 = r1
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.assistant.ao.a.e.ah r0 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r0
            r11.getClass()
            int r1 = r0.f127764a
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r0.f127764a = r1
            r0.f127779p = r11
        L_0x04bf:
            com.google.assistant.ao.a.e.bu r0 = r6.f128270n
            if (r0 == 0) goto L_0x04d0
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.assistant.ao.a.e.ah r1 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r1
            r1.f127766c = r0
            r0 = 8
            r1.f127765b = r0
        L_0x04d0:
            com.google.protobuf.bv r0 = r13.build()
            com.google.assistant.ao.a.e.ah r0 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x04fb
            com.google.common.f.a.d r0 = com.google.assistant.p3838ao.p3839a.C49429af.f127673a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r1 = 54828(0xd62c, float:7.683E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r1 = "Could not convert suggestion candidate to a chip: %s"
            j$.util.Optional r6 = r6.f128265a
            r0.mo56389s(r1, r6)
        L_0x04f8:
            r0 = r22
            goto L_0x053e
        L_0x04fb:
            java.lang.Object r0 = r0.get()
            com.google.assistant.ao.a.e.ah r0 = (com.google.assistant.p3838ao.p3839a.p3845e.C49524ah) r0
            int r1 = r0.f127776m
            com.google.protos.f.u.h r1 = com.google.protos.p4985f.p5042u.C65346h.m96672b(r1)
            if (r1 != 0) goto L_0x050b
            com.google.protos.f.u.h r1 = com.google.protos.p4985f.p5042u.C65346h.SUGGEST_EXPERIMENT_UNKNOWN
        L_0x050b:
            com.google.protos.f.u.h r6 = com.google.protos.p4985f.p5042u.C65346h.SUGGEST_EXPERIMENT_UNKNOWN
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0536
            com.google.assistant.ao.a.e.cx r1 = com.google.assistant.p3838ao.p3839a.C49429af.m85476a(r7, r3)
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.assistant.ao.a.e.cy r1 = (com.google.assistant.p3838ao.p3839a.p3845e.C49595cy) r1
            com.google.assistant.ao.a.e.cy r6 = com.google.assistant.p3838ao.p3839a.p3845e.C49595cy.f127972c
            r0.getClass()
            com.google.protobuf.cq r6 = r1.f127975a
            boolean r10 = r6.mo58948c()
            if (r10 != 0) goto L_0x0531
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r1.f127975a = r6
        L_0x0531:
            com.google.protobuf.cq r1 = r1.f127975a
            r1.add(r0)
        L_0x0536:
            boolean r1 = r0.f127777n
            if (r1 == 0) goto L_0x053e
            r7.name()
            goto L_0x04f8
        L_0x053e:
            if (r0 == 0) goto L_0x057b
            if (r8 == 0) goto L_0x055f
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.assistant.ao.a.e.aj r1 = (com.google.assistant.p3838ao.p3839a.p3845e.C49526aj) r1
            com.google.assistant.ao.a.e.aj r6 = com.google.assistant.p3838ao.p3839a.p3845e.C49526aj.f127782h
            com.google.protobuf.cq r6 = r1.f127789f
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x0559
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r1.f127789f = r6
        L_0x0559:
            com.google.protobuf.cq r1 = r1.f127789f
            r1.add(r0)
            goto L_0x057b
        L_0x055f:
            r9.copyOnWrite()
            com.google.protobuf.bv r1 = r9.instance
            com.google.assistant.ao.a.e.an r1 = (com.google.assistant.p3838ao.p3839a.p3845e.C49530an) r1
            com.google.assistant.ao.a.e.an r6 = com.google.assistant.p3838ao.p3839a.p3845e.C49530an.f127800e
            com.google.protobuf.cq r6 = r1.f127804c
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x0576
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r1.f127804c = r6
        L_0x0576:
            com.google.protobuf.cq r1 = r1.f127804c
            r1.add(r0)
        L_0x057b:
            int r14 = r15 + 1
            r1 = r12
            r0 = r16
            r10 = 2
            goto L_0x029d
        L_0x0583:
            throw r22
        L_0x0584:
            throw r22
        L_0x0585:
            r12 = r1
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x058e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x064e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.Object r4 = r12.get(r4)
            com.google.assistant.ao.a.e.am r4 = (com.google.assistant.p3838ao.p3839a.p3845e.C49529am) r4
            java.lang.Object r5 = r1.getValue()
            java.util.Map r5 = (java.util.Map) r5
            java.util.Collection r5 = r5.values()
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.assistant.ao.a.ab r6 = com.google.assistant.p3838ao.p3839a.C49425ab.f127668a
            j$.util.stream.Stream r5 = r5.map(r6)
            j$.util.stream.Collector r6 = com.google.assistant.p3838ao.p3839a.p3849i.C49679j.m85667a()
            java.lang.Object r5 = r5.collect(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            com.google.assistant.ao.a.ac r6 = com.google.assistant.p3838ao.p3839a.C49426ac.f127669a
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89836F(r6, r5)
            r6 = r5
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6
            int r6 = r6.f156474d
            r14 = 0
        L_0x05ce:
            if (r14 >= r6) goto L_0x058e
            java.lang.Object r7 = r5.get(r14)
            com.google.assistant.ao.a.e.aj r7 = (com.google.assistant.p3838ao.p3839a.p3845e.C49526aj) r7
            if (r4 != 0) goto L_0x05f1
            com.google.common.f.a.d r7 = com.google.assistant.p3838ao.p3839a.C49429af.f127673a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.Object r8 = r1.getKey()
            com.google.assistant.ao.a.e.h r8 = (com.google.assistant.p3838ao.p3839a.p3845e.C49617h) r8
            java.lang.String r8 = r8.name()
            r9 = 54834(0xd632, float:7.6839E-41)
            java.lang.String r10 = "No response builder for client %s."
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r9)).mo56389s(r10, r8)
            goto L_0x064b
        L_0x05f1:
            int r8 = r7.f127790g
            com.google.protos.f.u.h r8 = com.google.protos.p4985f.p5042u.C65346h.m96672b(r8)
            if (r8 != 0) goto L_0x05fb
            com.google.protos.f.u.h r8 = com.google.protos.p4985f.p5042u.C65346h.SUGGEST_EXPERIMENT_UNKNOWN
        L_0x05fb:
            com.google.protos.f.u.h r9 = com.google.protos.p4985f.p5042u.C65346h.SUGGEST_EXPERIMENT_UNKNOWN
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x062c
            java.lang.Object r8 = r1.getKey()
            com.google.assistant.ao.a.e.h r8 = (com.google.assistant.p3838ao.p3839a.p3845e.C49617h) r8
            com.google.assistant.ao.a.e.cx r8 = com.google.assistant.p3838ao.p3839a.C49429af.m85476a(r8, r3)
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.assistant.ao.a.e.cy r8 = (com.google.assistant.p3838ao.p3839a.p3845e.C49595cy) r8
            com.google.assistant.ao.a.e.cy r9 = com.google.assistant.p3838ao.p3839a.p3845e.C49595cy.f127972c
            r7.getClass()
            com.google.protobuf.cq r9 = r8.f127976b
            boolean r10 = r9.mo58948c()
            if (r10 != 0) goto L_0x0627
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r8.f127976b = r9
        L_0x0627:
            com.google.protobuf.cq r8 = r8.f127976b
            r8.add(r7)
        L_0x062c:
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.assistant.ao.a.e.an r8 = (com.google.assistant.p3838ao.p3839a.p3845e.C49530an) r8
            com.google.assistant.ao.a.e.an r9 = com.google.assistant.p3838ao.p3839a.p3845e.C49530an.f127800e
            r7.getClass()
            com.google.protobuf.cq r9 = r8.f127805d
            boolean r10 = r9.mo58948c()
            if (r10 != 0) goto L_0x0646
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r8.f127805d = r9
        L_0x0646:
            com.google.protobuf.cq r8 = r8.f127805d
            r8.add(r7)
        L_0x064b:
            int r14 = r14 + 1
            goto L_0x05ce
        L_0x064e:
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0656:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0684
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r3 = r12.get(r3)
            com.google.assistant.ao.a.e.am r3 = (com.google.assistant.p3838ao.p3839a.p3845e.C49529am) r3
            java.lang.Object r3 = p3186j$.util.Objects.requireNonNull(r3)
            com.google.assistant.ao.a.e.am r3 = (com.google.assistant.p3838ao.p3839a.p3845e.C49529am) r3
            com.google.protobuf.bt r4 = com.google.assistant.p3838ao.p3839a.p3845e.C49595cy.f127973d
            java.lang.Object r1 = r1.getValue()
            com.google.assistant.ao.a.e.cx r1 = (com.google.assistant.p3838ao.p3839a.p3845e.C49594cx) r1
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.ao.a.e.cy r1 = (com.google.assistant.p3838ao.p3839a.p3845e.C49595cy) r1
            r3.mo58885m(r4, r1)
            goto L_0x0656
        L_0x0684:
            j$.util.Optional r0 = r2.f127636b
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x06c3
            com.google.assistant.ao.a.e.h r0 = r2.mo53330q()
            java.lang.Object r1 = r12.get(r0)
            com.google.assistant.ao.a.e.am r1 = (com.google.assistant.p3838ao.p3839a.p3845e.C49529am) r1
            if (r1 != 0) goto L_0x06b8
            com.google.assistant.ao.a.e.an r1 = com.google.assistant.p3838ao.p3839a.p3845e.C49530an.f127800e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.ao.a.e.am r1 = (com.google.assistant.p3838ao.p3839a.p3845e.C49529am) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ao.a.e.an r2 = (com.google.assistant.p3838ao.p3839a.p3845e.C49530an) r2
            int r0 = r0.f128057q
            r2.f127803b = r0
            int r0 = r2.f127802a
            r3 = 1
            r0 = r0 | r3
            r2.f127802a = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.ao.a.e.an r0 = (com.google.assistant.p3838ao.p3839a.p3845e.C49530an) r0
            goto L_0x06be
        L_0x06b8:
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.ao.a.e.an r0 = (com.google.assistant.p3838ao.p3839a.p3845e.C49530an) r0
        L_0x06be:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            goto L_0x06e9
        L_0x06c3:
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Collection r1 = r12.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x06cf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x06e5
            java.lang.Object r2 = r1.next()
            com.google.assistant.ao.a.e.am r2 = (com.google.assistant.p3838ao.p3839a.p3845e.C49529am) r2
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.ao.a.e.an r2 = (com.google.assistant.p3838ao.p3839a.p3845e.C49530an) r2
            r0.mo55395g(r2)
            goto L_0x06cf
        L_0x06e5:
            com.google.common.b.gu r0 = r0.mo55394f()
        L_0x06e9:
            return r0
        L_0x06ea:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null locale"
            r0.<init>(r1)
            throw r0
        L_0x06f2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null timeSource"
            r0.<init>(r1)
            throw r0
        L_0x06fa:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null localization"
            r0.<init>(r1)
            throw r0
        L_0x0702:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null foregroundAppOracle"
            r0.<init>(r1)
            throw r0
        L_0x070a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null installedAppCache"
            r0.<init>(r1)
            throw r0
        L_0x0712:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null controlExperiments"
            r0.<init>(r1)
            throw r0
        L_0x071a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null enabledExperiments"
            r0.<init>(r1)
            throw r0
        L_0x0722:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null suggestPrefs"
            r0.<init>(r1)
            throw r0
        L_0x072a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null deviceCountryCode"
            r0.<init>(r1)
            throw r0
        L_0x0732:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null suggestStateSnapshot"
            r0.<init>(r1)
            throw r0
        L_0x073a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null androidContext"
            r0.<init>(r1)
            goto L_0x0743
        L_0x0742:
            throw r0
        L_0x0743:
            goto L_0x0742
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.assistant.p3838ao.p3839a.C49427ad.call():java.lang.Object");
    }
}
