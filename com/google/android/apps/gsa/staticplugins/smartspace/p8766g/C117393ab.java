package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.smartspace.C92035ae;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneId;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.ab */
/* compiled from: PG */
public final class C117393ab implements C117405i {

    /* renamed from: a */
    private final Context f325881a;

    /* renamed from: b */
    private final C86124t f325882b;

    /* renamed from: c */
    private final C21370a f325883c;

    /* renamed from: d */
    private final C60888db f325884d;

    public C117393ab(Context context, C86124t tVar, C21370a aVar, C90851k kVar) {
        this.f325881a = context;
        this.f325882b = tVar;
        this.f325883c = aVar;
        this.f325884d = kVar.mo85208a("backgroundExecutor to delay weather alert update");
    }

    /* renamed from: a */
    private static LocalDate m195069a(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalDate();
        C58976aa aaVar = C58975e.f156826a;
        return localDate;
    }

    /* renamed from: b */
    public final C50794cr mo103282b() {
        return C50794cr.WEATHER_ALERT;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x01a4  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo103283c(java.lang.Object r14) {
        /*
            r13 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.smartspace.ae r14 = (com.google.android.apps.gsa.smartspace.C92035ae) r14
            com.google.android.apps.gsa.smartspace.ad r14 = r14.f256577f
            if (r14 == 0) goto L_0x0261
            com.google.android.libraries.f.a r0 = r13.f325883c
            long r0 = r0.mo26870b()
            com.google.android.apps.gsa.smartspace.a r14 = (com.google.android.apps.gsa.smartspace.C92018a) r14
            java.lang.String r2 = r14.f256544a
            j$.time.LocalDate r3 = m195069a(r0)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = r2.concat(r3)
            int r2 = r2.hashCode()
            com.google.assistant.c.do r3 = com.google.assistant.p3886c.C50818do.f132293H
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.cn r3 = (com.google.assistant.p3886c.C50790cn) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.c.do r4 = (com.google.assistant.p3886c.C50818do) r4
            int r5 = r4.f132304a
            r5 = r5 | 4
            r4.f132304a = r5
            r4.f132307d = r2
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.c.do r4 = (com.google.assistant.p3886c.C50818do) r4
            int r5 = r4.f132304a
            r6 = 1
            r5 = r5 | r6
            r4.f132304a = r5
            r5 = 0
            r4.f132305b = r5
            com.google.assistant.c.cp r4 = com.google.assistant.p3886c.C50792cp.PRIMARY
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.c.do r7 = (com.google.assistant.p3886c.C50818do) r7
            int r4 = r4.f132174e
            r7.f132306c = r4
            int r4 = r7.f132304a
            r4 = r4 | 2
            r7.f132304a = r4
            com.google.assistant.c.cz r4 = com.google.assistant.p3886c.C50802cz.f132236g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.c.cy r4 = (com.google.assistant.p3886c.C50801cy) r4
            com.google.assistant.c.b.h r7 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.c.b.a r7 = (com.google.assistant.p3886c.p3888b.C50716a) r7
            java.lang.String r8 = r14.f256544a
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.c.b.h r9 = (com.google.assistant.p3886c.p3888b.C50723h) r9
            int r10 = r9.f132001a
            r10 = r10 | r6
            r9.f132001a = r10
            r9.f132002b = r8
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.assistant.c.cz r8 = (com.google.assistant.p3886c.C50802cz) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.c.b.h r7 = (com.google.assistant.p3886c.p3888b.C50723h) r7
            r7.getClass()
            r8.f132239b = r7
            int r7 = r8.f132238a
            r7 = r7 | r6
            r8.f132238a = r7
            com.google.assistant.c.b.h r7 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.c.b.a r7 = (com.google.assistant.p3886c.p3888b.C50716a) r7
            java.lang.String r8 = r14.f256545b
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.c.b.h r9 = (com.google.assistant.p3886c.p3888b.C50723h) r9
            int r10 = r9.f132001a
            r10 = r10 | r6
            r9.f132001a = r10
            r9.f132002b = r8
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.assistant.c.cz r8 = (com.google.assistant.p3886c.C50802cz) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.c.b.h r7 = (com.google.assistant.p3886c.p3888b.C50723h) r7
            r7.getClass()
            r8.f132241d = r7
            int r7 = r8.f132238a
            r7 = r7 | 4
            r8.f132238a = r7
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.c.do r7 = (com.google.assistant.p3886c.C50818do) r7
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.c.cz r4 = (com.google.assistant.p3886c.C50802cz) r4
            r4.getClass()
            r7.f132309f = r4
            int r4 = r7.f132304a
            r4 = r4 | 16
            r7.f132304a = r4
            com.google.assistant.c.b.n r4 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.c.b.m r4 = (com.google.assistant.p3886c.p3888b.C50728m) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.assistant.c.b.n r7 = (com.google.assistant.p3886c.p3888b.C50729n) r7
            int r8 = r7.f132009a
            r8 = r8 | r6
            r7.f132009a = r8
            java.lang.String r8 = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON"
            r7.f132010b = r8
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.c.do r7 = (com.google.assistant.p3886c.C50818do) r7
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.c.b.n r4 = (com.google.assistant.p3886c.p3888b.C50729n) r4
            r4.getClass()
            r7.f132314k = r4
            int r4 = r7.f132304a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r7.f132304a = r4
            com.google.assistant.c.cr r4 = com.google.assistant.p3886c.C50794cr.WEATHER_ALERT
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.c.do r7 = (com.google.assistant.p3886c.C50818do) r7
            int r4 = r4.f132222T
            r7.f132315l = r4
            int r4 = r7.f132304a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r7.f132304a = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.c.do r4 = (com.google.assistant.p3886c.C50818do) r4
            int r7 = r4.f132304a
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r8
            r4.f132304a = r7
            r4.f132324u = r6
            com.google.android.apps.gsa.search.core.i.t r4 = r13.f325882b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246715aw
            boolean r4 = r4.mo79746e(r7)
            if (r4 == 0) goto L_0x013f
            com.google.assistant.c.b.p r4 = com.google.assistant.p3886c.p3888b.C50731p.START_ACTIVITY
            goto L_0x0141
        L_0x013f:
            com.google.assistant.c.b.p r4 = com.google.assistant.p3886c.p3888b.C50731p.BROADCAST
        L_0x0141:
            java.lang.String r14 = r14.f256546c
            boolean r7 = com.google.common.base.C58837ba.m90859h(r14)
            r8 = 0
            if (r7 == 0) goto L_0x014c
        L_0x014a:
            r7 = r8
            goto L_0x0160
        L_0x014c:
            android.content.Intent r14 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142325x(r14)
            android.content.Context r7 = r13.f325881a
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r9 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r14, r9)
            if (r7 != 0) goto L_0x015f
            goto L_0x014a
        L_0x015f:
            r7 = r14
        L_0x0160:
            r8 = 0
            java.lang.String r9 = java.lang.Integer.toString(r2)
            com.google.assistant.c.cr r10 = com.google.assistant.p3886c.C50794cr.WEATHER_ALERT
            r12 = 1
            r11 = r4
            android.content.Intent r14 = com.google.android.apps.gsa.smartspace.C92122r.m151186d(r7, r8, r9, r10, r11, r12)
            com.google.android.apps.gsa.search.core.i.t r2 = r13.f325882b
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246717ay
            long r7 = r2.mo79743a(r7)
            j$.time.Duration r2 = p3186j$.time.Duration.ofMinutes(r7)
            long r7 = r2.toMillis()
            com.google.android.apps.gsa.search.core.i.t r2 = r13.f325882b
            com.google.android.apps.gsa.shared.m.f r9 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246716ax
            long r9 = r2.mo79743a(r9)
            j$.time.LocalDate r2 = m195069a(r0)
            int r10 = (int) r9
            j$.time.LocalDateTime r2 = r2.atTime(r10, r5)
            j$.time.ZoneId r5 = p3186j$.time.ZoneId.systemDefault()
            j$.time.ZonedDateTime r2 = r2.atZone(r5)
            j$.time.Instant r2 = r2.toInstant()
            long r9 = r2.toEpochMilli()
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x01a4
            long r9 = r9 + r7
            goto L_0x01a6
        L_0x01a4:
            long r9 = r0 + r7
        L_0x01a6:
            com.google.assistant.c.b.r r2 = com.google.assistant.p3886c.p3888b.C50733r.f132021d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.c.b.q r2 = (com.google.assistant.p3886c.p3888b.C50732q) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.c.b.r r5 = (com.google.assistant.p3886c.p3888b.C50733r) r5
            int r4 = r4.f132020d
            r5.f132024b = r4
            int r4 = r5.f132023a
            r4 = r4 | r6
            r5.f132023a = r4
            java.lang.String r14 = r14.toUri(r6)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.c.b.r r4 = (com.google.assistant.p3886c.p3888b.C50733r) r4
            r14.getClass()
            int r5 = r4.f132023a
            r5 = r5 | 2
            r4.f132023a = r5
            r4.f132025c = r14
            r3.copyOnWrite()
            com.google.protobuf.bv r14 = r3.instance
            com.google.assistant.c.do r14 = (com.google.assistant.p3886c.C50818do) r14
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.c.b.r r2 = (com.google.assistant.p3886c.p3888b.C50733r) r2
            r2.getClass()
            r14.f132316m = r2
            int r2 = r14.f132304a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r14.f132304a = r2
            r3.copyOnWrite()
            com.google.protobuf.bv r14 = r3.instance
            com.google.assistant.c.do r14 = (com.google.assistant.p3886c.C50818do) r14
            int r2 = r14.f132304a
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r14.f132304a = r2
            r14.f132317n = r0
            r3.copyOnWrite()
            com.google.protobuf.bv r14 = r3.instance
            com.google.assistant.c.do r14 = (com.google.assistant.p3886c.C50818do) r14
            int r2 = r14.f132304a
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r14.f132304a = r2
            r14.f132318o = r0
            r3.copyOnWrite()
            com.google.protobuf.bv r14 = r3.instance
            com.google.assistant.c.do r14 = (com.google.assistant.p3886c.C50818do) r14
            int r2 = r14.f132304a
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            r14.f132304a = r2
            long r0 = r9 - r0
            r14.f132319p = r0
            com.google.assistant.c.ct r14 = com.google.assistant.p3886c.C50796ct.f132223c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.c.cs r14 = (com.google.assistant.p3886c.C50795cs) r14
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.assistant.c.ct r0 = (com.google.assistant.p3886c.C50796ct) r0
            int r1 = r0.f132225a
            r1 = r1 | r6
            r0.f132225a = r1
            r0.f132226b = r9
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            com.google.protobuf.bv r14 = r14.build()
            com.google.assistant.c.ct r14 = (com.google.assistant.p3886c.C50796ct) r14
            r14.getClass()
            r0.f132320q = r14
            int r14 = r0.f132304a
            r1 = 32768(0x8000, float:4.5918E-41)
            r14 = r14 | r1
            r0.f132304a = r14
            com.google.protobuf.bv r14 = r3.build()
            com.google.assistant.c.do r14 = (com.google.assistant.p3886c.C50818do) r14
            com.google.android.apps.gsa.staticplugins.smartspace.g.aa r0 = new com.google.android.apps.gsa.staticplugins.smartspace.g.aa
            r0.<init>(r14)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            com.google.common.util.concurrent.db r1 = r13.f325884d
            r2 = 5
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92902k(r0, r2, r14, r1)
            return r14
        L_0x0261:
            com.google.android.apps.gsa.staticplugins.smartspace.e.a r14 = new com.google.android.apps.gsa.staticplugins.smartspace.e.a
            r14.<init>()
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.smartspace.p8766g.C117393ab.mo103283c(java.lang.Object):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final boolean mo103285e(Object obj) {
        return obj instanceof C92035ae;
    }
}
