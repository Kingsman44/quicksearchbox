package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10000f;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.f.a */
/* compiled from: PG */
public final class C131660a {

    /* renamed from: a */
    public static final C59071e f359736a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.smartspace.f.a");

    /* renamed from: b */
    private static final Duration f359737b = Duration.ofMinutes(30);

    /* renamed from: c */
    private static final Duration f359738c = Duration.ofMinutes(60);

    /* renamed from: d */
    private final Context f359739d;

    /* renamed from: e */
    private final C21370a f359740e;

    /* renamed from: f */
    private final boolean f359741f;

    public C131660a(Context context, C21370a aVar, boolean z) {
        this.f359739d = context;
        this.f359740e = aVar;
        this.f359741f = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0459  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.assistant.p3886c.C50818do mo110247a(com.google.android.apps.search.assistant.platform.pcp.p9329f.C123708ab r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            com.google.android.libraries.f.a r2 = r0.f359740e
            long r9 = r2.mo26870b()
            long r4 = com.google.android.apps.search.assistant.platform.pcp.featuredata.p9332b.C123825d.m203136b(r34)
            long r11 = com.google.android.apps.search.assistant.platform.pcp.featuredata.p9332b.C123825d.m203135a(r34)
            long r13 = r1.f341694h
            long r6 = r1.f341695i
            java.lang.String r2 = r1.f341688b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r1.f341689c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = r2.concat(r3)
            int r2 = r2.hashCode()
            com.google.common.f.e r15 = f359736a
            com.google.common.f.x r3 = r15.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r16 = r15
            java.lang.String r15 = "SmartspaceGroceryIH"
            r3.mo56378ag(r8, r15)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r8 = 39155(0x98f3, float:5.4868E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r8)
            r17 = r3
            com.google.common.f.c r17 = (com.google.common.p4526f.C59052c) r17
            java.lang.String r3 = r1.f341688b
            java.lang.String r8 = r1.f341689c
            r29 = r15
            int r15 = r1.f341691e
            int r15 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123796y.m203115b(r15)
            r30 = r2
            if (r15 != 0) goto L_0x0057
            r15 = 1
        L_0x0057:
            java.lang.String r21 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123796y.m203114a(r15)
            java.lang.Long r22 = java.lang.Long.valueOf(r4)
            java.lang.Long r23 = java.lang.Long.valueOf(r11)
            int r15 = r1.f341687a
            r18 = r15 & 16
            r19 = -1
            if (r18 == 0) goto L_0x0070
            r24 = r3
            long r2 = r1.f341692f
            goto L_0x0074
        L_0x0070:
            r24 = r3
            r2 = r19
        L_0x0074:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = r15 & 32
            if (r3 == 0) goto L_0x0081
            r31 = r11
            long r11 = r1.f341693g
            goto L_0x0085
        L_0x0081:
            r31 = r11
            r11 = r19
        L_0x0085:
            java.lang.Long r25 = java.lang.Long.valueOf(r11)
            r3 = r15 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0091
            long r11 = r1.f341697k
            r19 = r11
        L_0x0091:
            java.lang.String r18 = "Building Smartspace grocery card with merchant: %s, order number: %s, shipping type: %s, scheduled start time: %d, scheduled end time: %d, available_for_pickup: %d, delivered: %d, cancelled: %d, event start time: %d, event end time: %d,"
            java.lang.Long r26 = java.lang.Long.valueOf(r19)
            java.lang.Long r27 = java.lang.Long.valueOf(r13)
            java.lang.Long r28 = java.lang.Long.valueOf(r6)
            r19 = r24
            r20 = r8
            r24 = r2
            r17.mo56366S(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            int r2 = r1.f341691e
            int r2 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123796y.m203115b(r2)
            if (r2 != 0) goto L_0x00b1
            r2 = 1
        L_0x00b1:
            int r2 = r2 + -1
            r11 = 0
            r12 = 2
            r3 = 1
            if (r2 == r3) goto L_0x00db
            if (r2 == r12) goto L_0x00bb
            return r11
        L_0x00bb:
            com.google.assistant.c.cr r2 = com.google.assistant.p3886c.C50794cr.GROCERY_PICKUP
            int r3 = r1.f341687a
            r8 = r3 & 32
            if (r8 == 0) goto L_0x00c7
            r3 = 2132083814(0x7f150466, float:1.980778E38)
            goto L_0x00f6
        L_0x00c7:
            r8 = r3 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x00cf
            r3 = 2132083813(0x7f150465, float:1.9807779E38)
            goto L_0x00f6
        L_0x00cf:
            r3 = r3 & 16
            if (r3 == 0) goto L_0x00d7
            r3 = 2132083815(0x7f150467, float:1.9807783E38)
            goto L_0x00f6
        L_0x00d7:
            r3 = 2132083816(0x7f150468, float:1.9807785E38)
            goto L_0x00f6
        L_0x00db:
            com.google.assistant.c.cr r2 = com.google.assistant.p3886c.C50794cr.GROCERY_DELIVERY
            int r3 = r1.f341687a
            r8 = r3 & 32
            if (r8 == 0) goto L_0x00e7
            r3 = 2132083811(0x7f150463, float:1.9807775E38)
            goto L_0x00f6
        L_0x00e7:
            r8 = r3 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x00ef
            r3 = 2132083810(0x7f150462, float:1.9807773E38)
            goto L_0x00f6
        L_0x00ef:
            r3 = r3 & 16
            if (r3 != 0) goto L_0x046e
            r3 = 2132083812(0x7f150464, float:1.9807777E38)
        L_0x00f6:
            com.google.assistant.c.b.h r8 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.c.b.a r8 = (com.google.assistant.p3886c.p3888b.C50716a) r8
            android.content.Context r15 = r0.f359739d
            android.content.res.Resources r15 = r15.getResources()
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r11 = r1.f341688b
            r19 = r2
            r2 = 0
            r12[r2] = r11
            java.lang.String r3 = r15.getString(r3, r12)
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.c.b.h r11 = (com.google.assistant.p3886c.p3888b.C50723h) r11
            r3.getClass()
            int r12 = r11.f132001a
            r15 = 1
            r12 = r12 | r15
            r11.f132001a = r12
            r11.f132002b = r3
            com.google.assistant.c.b.g r3 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.c.b.h r11 = (com.google.assistant.p3886c.p3888b.C50723h) r11
            int r3 = r3.f131998e
            r11.f132003c = r3
            int r3 = r11.f132001a
            r12 = 2
            r3 = r3 | r12
            r11.f132001a = r3
            com.google.protobuf.bv r3 = r8.build()
            r11 = r3
            com.google.assistant.c.b.h r11 = (com.google.assistant.p3886c.p3888b.C50723h) r11
            com.google.assistant.c.b.h r3 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r3 = r3.createBuilder()
            r12 = r3
            com.google.assistant.c.b.a r12 = (com.google.assistant.p3886c.p3888b.C50716a) r12
            int r3 = r1.f341687a
            r8 = r3 & 32
            if (r8 == 0) goto L_0x0153
            long r2 = r1.f341693g
        L_0x014f:
            r20 = r2
            r2 = 0
            goto L_0x0166
        L_0x0153:
            r2 = r3 & 16
            if (r2 == 0) goto L_0x015a
            long r2 = r1.f341692f
            goto L_0x014f
        L_0x015a:
            r2 = r3 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0161
            long r2 = r1.f341697k
            goto L_0x014f
        L_0x0161:
            r2 = 0
            r20 = r2
            r2 = 1
        L_0x0166:
            if (r2 != 0) goto L_0x017a
            android.content.Context r3 = r0.f359739d
            boolean r8 = r0.f359741f
            r4 = r20
            r1 = r6
            r6 = r9
            java.lang.CharSequence r3 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131253v.m213756c(r3, r4, r6, r8)
            java.lang.String r3 = r3.toString()
            r5 = 1
            goto L_0x01a0
        L_0x017a:
            r1 = r6
            android.content.Context r3 = r0.f359739d
            boolean r8 = r0.f359741f
            r6 = r9
            java.lang.CharSequence r20 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131253v.m213756c(r3, r4, r6, r8)
            android.content.Context r3 = r0.f359739d
            boolean r8 = r0.f359741f
            r4 = r31
            java.lang.CharSequence r3 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131253v.m213756c(r3, r4, r6, r8)
            android.content.Context r4 = r0.f359739d
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r20
            r5 = 1
            r6[r5] = r3
            r3 = 2132083817(0x7f150469, float:1.9807787E38)
            java.lang.String r3 = r4.getString(r3, r6)
        L_0x01a0:
            r12.copyOnWrite()
            com.google.protobuf.bv r4 = r12.instance
            com.google.assistant.c.b.h r4 = (com.google.assistant.p3886c.p3888b.C50723h) r4
            r3.getClass()
            int r6 = r4.f132001a
            r6 = r6 | r5
            r4.f132001a = r6
            r4.f132002b = r3
            com.google.assistant.c.b.g r3 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r12.copyOnWrite()
            com.google.protobuf.bv r4 = r12.instance
            com.google.assistant.c.b.h r4 = (com.google.assistant.p3886c.p3888b.C50723h) r4
            int r3 = r3.f131998e
            r4.f132003c = r3
            int r3 = r4.f132001a
            r5 = 2
            r3 = r3 | r5
            r4.f132001a = r3
            com.google.protobuf.bv r3 = r12.build()
            com.google.assistant.c.b.h r3 = (com.google.assistant.p3886c.p3888b.C50723h) r3
            com.google.assistant.c.do r4 = com.google.assistant.p3886c.C50818do.f132293H
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.c.cn r4 = (com.google.assistant.p3886c.C50790cn) r4
            com.google.assistant.c.cz r5 = com.google.assistant.p3886c.C50802cz.f132236g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.c.cy r5 = (com.google.assistant.p3886c.C50801cy) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.c.cz r6 = (com.google.assistant.p3886c.C50802cz) r6
            r11.getClass()
            r6.f132239b = r11
            int r7 = r6.f132238a
            r8 = 1
            r7 = r7 | r8
            r6.f132238a = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.c.cz r6 = (com.google.assistant.p3886c.C50802cz) r6
            r3.getClass()
            r6.f132241d = r3
            int r3 = r6.f132238a
            r3 = r3 | 4
            r6.f132238a = r3
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.c.cz r5 = (com.google.assistant.p3886c.C50802cz) r5
            r5.getClass()
            r3.f132309f = r5
            int r5 = r3.f132304a
            r5 = r5 | 16
            r3.f132304a = r5
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x0459
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r5 = r3.f132304a
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            r3.f132304a = r5
            long r6 = r1 - r13
            r3.f132319p = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r5 = r3.f132304a
            r5 = r5 | 4
            r3.f132304a = r5
            r5 = r30
            r3.f132307d = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r5 = r3.f132304a
            r6 = 1
            r5 = r5 | r6
            r3.f132304a = r5
            r5 = 0
            r3.f132305b = r5
            com.google.assistant.c.cp r3 = com.google.assistant.p3886c.C50792cp.PRIMARY
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.c.do r5 = (com.google.assistant.p3886c.C50818do) r5
            int r3 = r3.f132174e
            r5.f132306c = r3
            int r3 = r5.f132304a
            r6 = 2
            r3 = r3 | r6
            r5.f132304a = r3
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r5 = r3.f132304a
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            r3.f132304a = r5
            r3.f132317n = r9
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r5 = r3.f132304a
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r3.f132304a = r5
            r3.f132318o = r13
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            r5 = r19
            int r6 = r5.f132222T
            r3.f132315l = r6
            int r6 = r3.f132304a
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r3.f132304a = r6
            com.google.assistant.c.b.n r3 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.b.m r3 = (com.google.assistant.p3886c.p3888b.C50728m) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.c.b.n r6 = (com.google.assistant.p3886c.p3888b.C50729n) r6
            int r7 = r6.f132009a
            r8 = 1
            r7 = r7 | r8
            r6.f132009a = r7
            java.lang.String r7 = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON"
            r6.f132010b = r7
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.assistant.c.do r6 = (com.google.assistant.p3886c.C50818do) r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.c.b.n r3 = (com.google.assistant.p3886c.p3888b.C50729n) r3
            r3.getClass()
            r6.f132314k = r3
            int r3 = r6.f132304a
            r3 = r3 | 512(0x200, float:7.175E-43)
            r6.f132304a = r3
            com.google.assistant.c.ct r3 = com.google.assistant.p3886c.C50796ct.f132223c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.cs r3 = (com.google.assistant.p3886c.C50795cs) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.c.ct r6 = (com.google.assistant.p3886c.C50796ct) r6
            int r7 = r6.f132225a
            r8 = 1
            r7 = r7 | r8
            r6.f132225a = r7
            r6.f132226b = r1
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.assistant.c.do r6 = (com.google.assistant.p3886c.C50818do) r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.c.ct r3 = (com.google.assistant.p3886c.C50796ct) r3
            r3.getClass()
            r6.f132320q = r3
            int r3 = r6.f132304a
            r7 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r7
            r6.f132304a = r3
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r6 = r3.f132304a
            r7 = 65536(0x10000, float:9.18355E-41)
            r6 = r6 | r7
            r3.f132304a = r6
            r6 = 1
            r3.f132321r = r6
            j$.time.Instant r3 = p3186j$.time.Instant.ofEpochMilli(r13)
            j$.time.Duration r6 = f359737b
            j$.time.Instant r3 = r3.minus(r6)
            long r6 = r3.toEpochMilli()
            j$.time.Instant r3 = p3186j$.time.Instant.ofEpochMilli(r13)
            j$.time.Duration r8 = f359738c
            j$.time.Instant r3 = r3.plus(r8)
            long r8 = r3.toEpochMilli()
            long r1 = java.lang.Math.max(r1, r8)
            com.google.assistant.c.dn r3 = com.google.assistant.p3886c.C50817dn.f132287e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.dk r3 = (com.google.assistant.p3886c.C50814dk) r3
            com.google.assistant.c.dm r8 = com.google.assistant.p3886c.C50816dm.f132281e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.c.dl r8 = (com.google.assistant.p3886c.C50815dl) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.c.dm r9 = (com.google.assistant.p3886c.C50816dm) r9
            int r10 = r9.f132283a
            r11 = 1
            r10 = r10 | r11
            r9.f132283a = r10
            r9.f132284b = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.assistant.c.dm r6 = (com.google.assistant.p3886c.C50816dm) r6
            int r7 = r6.f132283a
            r9 = 2
            r7 = r7 | r9
            r6.f132283a = r7
            r6.f132285c = r1
            r8.mo53468a(r13)
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.assistant.c.dn r1 = (com.google.assistant.p3886c.C50817dn) r1
            com.google.protobuf.bv r2 = r8.build()
            com.google.assistant.c.dm r2 = (com.google.assistant.p3886c.C50816dm) r2
            r2.getClass()
            r1.f132292d = r2
            int r2 = r1.f132289a
            r2 = r2 | 8
            r1.f132289a = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            com.google.protobuf.bv r2 = r3.build()
            com.google.assistant.c.dn r2 = (com.google.assistant.p3886c.C50817dn) r2
            r2.getClass()
            r1.f132295A = r2
            int r2 = r1.f132304a
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 | r3
            r1.f132304a = r2
            r1 = r34
            int r2 = r1.f341687a
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x040c
            java.lang.String r2 = r1.f341696j     // Catch:{ URISyntaxException -> 0x03eb }
            r3 = 1
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)     // Catch:{ URISyntaxException -> 0x03eb }
            r3 = 268435457(0x10000001, float:2.5243552E-29)
            r2.addFlags(r3)     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.assistant.c.b.p r3 = com.google.assistant.p3886c.p3888b.C50731p.START_ACTIVITY     // Catch:{ URISyntaxException -> 0x03eb }
            r6 = 0
            android.content.Intent r2 = com.google.android.apps.gsa.h.c.a.a(r2, r6, r5, r3)     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.assistant.c.b.r r3 = com.google.assistant.p3886c.p3888b.C50733r.f132021d     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.assistant.c.b.q r3 = (com.google.assistant.p3886c.p3888b.C50732q) r3     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.assistant.c.b.p r5 = com.google.assistant.p3886c.p3888b.C50731p.START_ACTIVITY     // Catch:{ URISyntaxException -> 0x03eb }
            r3.copyOnWrite()     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.protobuf.bv r6 = r3.instance     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.assistant.c.b.r r6 = (com.google.assistant.p3886c.p3888b.C50733r) r6     // Catch:{ URISyntaxException -> 0x03eb }
            int r5 = r5.f132020d     // Catch:{ URISyntaxException -> 0x03eb }
            r6.f132024b = r5     // Catch:{ URISyntaxException -> 0x03eb }
            int r5 = r6.f132023a     // Catch:{ URISyntaxException -> 0x03eb }
            r7 = 1
            r5 = r5 | r7
            r6.f132023a = r5     // Catch:{ URISyntaxException -> 0x03eb }
            java.lang.String r2 = r2.toUri(r7)     // Catch:{ URISyntaxException -> 0x03eb }
            r3.copyOnWrite()     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.assistant.c.b.r r5 = (com.google.assistant.p3886c.p3888b.C50733r) r5     // Catch:{ URISyntaxException -> 0x03eb }
            r2.getClass()     // Catch:{ URISyntaxException -> 0x03eb }
            int r6 = r5.f132023a     // Catch:{ URISyntaxException -> 0x03eb }
            r7 = 2
            r6 = r6 | r7
            r5.f132023a = r6     // Catch:{ URISyntaxException -> 0x03eb }
            r5.f132025c = r2     // Catch:{ URISyntaxException -> 0x03eb }
            r4.copyOnWrite()     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.protobuf.bv r2 = r4.instance     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.assistant.c.do r2 = (com.google.assistant.p3886c.C50818do) r2     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ URISyntaxException -> 0x03eb }
            com.google.assistant.c.b.r r3 = (com.google.assistant.p3886c.p3888b.C50733r) r3     // Catch:{ URISyntaxException -> 0x03eb }
            r3.getClass()     // Catch:{ URISyntaxException -> 0x03eb }
            r2.f132316m = r3     // Catch:{ URISyntaxException -> 0x03eb }
            int r3 = r2.f132304a     // Catch:{ URISyntaxException -> 0x03eb }
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r2.f132304a = r3     // Catch:{ URISyntaxException -> 0x03eb }
            goto L_0x040c
        L_0x03eb:
            com.google.common.f.e r2 = f359736a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4 = r29
            r2.mo56378ag(r3, r4)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 39157(0x98f5, float:5.487E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = "Unable to parse action_url: %s"
            java.lang.String r1 = r1.f341696j
            r2.mo56389s(r3, r1)
            r1 = 0
            return r1
        L_0x040c:
            com.google.assistant.c.dj r2 = com.google.assistant.p3886c.C50813dj.f132278a
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.c.di r2 = (com.google.assistant.p3886c.C50812di) r2
            com.google.protobuf.bt r3 = com.google.assistant.p3886c.C50757bv.f132084d
            com.google.assistant.c.bv r5 = com.google.assistant.p3886c.C50757bv.f132083c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.c.bu r5 = (com.google.assistant.p3886c.C50756bu) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.c.bv r6 = (com.google.assistant.p3886c.C50757bv) r6
            r34.getClass()
            r6.f132087b = r1
            int r1 = r6.f132086a
            r7 = 1
            r1 = r1 | r7
            r6.f132086a = r1
            com.google.protobuf.bv r1 = r5.build()
            com.google.assistant.c.bv r1 = (com.google.assistant.p3886c.C50757bv) r1
            r2.mo58885m(r3, r1)
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.c.dj r1 = (com.google.assistant.p3886c.C50813dj) r1
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.assistant.c.do r2 = (com.google.assistant.p3886c.C50818do) r2
            r1.getClass()
            r2.f132329z = r1
            int r1 = r2.f132304a
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r3
            r2.f132304a = r1
            com.google.protobuf.bv r1 = r4.build()
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            return r1
        L_0x0459:
            r4 = r29
            com.google.common.f.x r1 = r16.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            java.lang.String r2 = "No grocery card because event end time <= event start time."
            r3 = 39156(0x98f4, float:5.4869E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            r1 = 0
            return r1
        L_0x046e:
            r1 = r11
            r4 = r29
            com.google.common.f.x r2 = r16.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "'available_for_pickup_email_msec' set for grocery delivery order."
            r4 = 39158(0x98f6, float:5.4872E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10000f.C131660a.mo110247a(com.google.android.apps.search.assistant.platform.pcp.f.ab):com.google.assistant.c.do");
    }
}
