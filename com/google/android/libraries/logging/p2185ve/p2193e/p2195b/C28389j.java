package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.android.libraries.logging.p2182b.C28279j;
import com.google.android.libraries.logging.p2182b.p2183a.p2184a.C28266e;
import com.google.android.libraries.logging.p2185ve.p2192d.C28351d;
import com.google.android.libraries.logging.p2185ve.p2193e.p2194a.C28354a;
import com.google.common.p4522b.C58759qy;
import java.util.Set;

/* renamed from: com.google.android.libraries.logging.ve.e.b.j */
/* compiled from: PG */
public final class C28389j implements C28279j {

    /* renamed from: a */
    public final C28354a f77138a;

    /* renamed from: b */
    public final C28266e f77139b;

    /* renamed from: c */
    private final C28372ah f77140c;

    public C28389j(C28354a aVar, C28266e eVar, C28372ah ahVar) {
        this.f77138a = aVar;
        this.f77139b = eVar;
        this.f77140c = ahVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x017c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0122 A[Catch:{ all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0124 A[Catch:{ all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0151 A[Catch:{ all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0152 A[Catch:{ all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0175 A[Catch:{ all -> 0x01a2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo33778a(com.google.android.libraries.logging.p2182b.C28282m r23) {
        /*
            r22 = this;
            r12 = r22
            r0 = r23
            java.lang.String r1 = "GIL:NVLGraftHandler"
            com.google.apps.tiktok.tracing.bi r13 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r1)
            com.google.android.libraries.logging.b.k r1 = r0.f76963a     // Catch:{ all -> 0x020f }
            r10 = r1
            com.google.android.libraries.logging.ve.d.d r10 = (com.google.android.libraries.logging.p2185ve.p2192d.C28351d) r10     // Catch:{ all -> 0x020f }
            com.google.android.libraries.logging.ve.e.a.a r1 = r12.f77138a     // Catch:{ all -> 0x020f }
            java.lang.String r5 = r1.mo33873e(r10)     // Catch:{ all -> 0x020f }
            boolean r1 = r5.isEmpty()     // Catch:{ all -> 0x020f }
            if (r1 == 0) goto L_0x0026
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x0021 }
            r13.close()
            return r0
        L_0x0021:
            r0 = move-exception
            r2 = r0
            r1 = r13
            goto L_0x0212
        L_0x0026:
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x020f }
            r4.<init>()     // Catch:{ all -> 0x020f }
            java.util.List r1 = r10.f77071c     // Catch:{ all -> 0x020f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x020f }
        L_0x0031:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x020f }
            if (r2 == 0) goto L_0x0072
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0021 }
            com.google.android.libraries.logging.ve.u r2 = (com.google.android.libraries.logging.p2185ve.C28481u) r2     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bt r3 = com.google.android.libraries.logging.p2185ve.p2200g.C28426c.f77197a     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)     // Catch:{ all -> 0x0021 }
            r2.mo58887l(r3)     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bf r6 = r2.f169962ag     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bs r3 = r3.f169971d     // Catch:{ all -> 0x0021 }
            boolean r3 = r6.mo58857o(r3)     // Catch:{ all -> 0x0021 }
            if (r3 == 0) goto L_0x0031
            com.google.protobuf.bt r3 = com.google.android.libraries.logging.p2185ve.p2200g.C28426c.f77197a     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)     // Catch:{ all -> 0x0021 }
            r2.mo58887l(r3)     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bf r2 = r2.f169962ag     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bs r6 = r3.f169971d     // Catch:{ all -> 0x0021 }
            java.lang.Object r2 = r2.mo58854l(r6)     // Catch:{ all -> 0x0021 }
            if (r2 != 0) goto L_0x0066
            java.lang.Object r2 = r3.f169969b     // Catch:{ all -> 0x0021 }
            goto L_0x006a
        L_0x0066:
            java.lang.Object r2 = r3.mo58889c(r2)     // Catch:{ all -> 0x0021 }
        L_0x006a:
            com.google.android.libraries.logging.ve.g.b r2 = (com.google.android.libraries.logging.p2185ve.p2200g.C28425b) r2     // Catch:{ all -> 0x0021 }
            com.google.protobuf.ch r2 = r2.f77196a     // Catch:{ all -> 0x0021 }
            r4.addAll(r2)     // Catch:{ all -> 0x0021 }
            goto L_0x0031
        L_0x0072:
            com.google.android.libraries.logging.ve.e.a.a r1 = r12.f77138a     // Catch:{ all -> 0x020f }
            com.google.common.util.concurrent.cx r2 = r0.f76964b     // Catch:{ all -> 0x020f }
            com.google.common.util.concurrent.cx r6 = r1.mo33871c(r10, r2)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.logging.ve.e.a.a r1 = r12.f77138a     // Catch:{ all -> 0x020f }
            com.google.common.util.concurrent.cx r2 = r0.f76964b     // Catch:{ all -> 0x020f }
            com.google.common.util.concurrent.cx r9 = r1.mo33875g()     // Catch:{ all -> 0x020f }
            com.google.android.libraries.logging.ve.e.a.a r1 = r12.f77138a     // Catch:{ all -> 0x020f }
            com.google.common.util.concurrent.cx r2 = r0.f76964b     // Catch:{ all -> 0x020f }
            com.google.common.util.concurrent.cx r3 = r1.mo33872d(r10, r2)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.logging.ve.u r1 = com.google.android.libraries.logging.p2185ve.p2192d.C28348a.m53028a(r10)     // Catch:{ all -> 0x020f }
            com.google.protobuf.bt r2 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28384e.f77126a     // Catch:{ all -> 0x020f }
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)     // Catch:{ all -> 0x020f }
            r1.mo58887l(r2)     // Catch:{ all -> 0x020f }
            com.google.protobuf.bf r1 = r1.f169962ag     // Catch:{ all -> 0x020f }
            com.google.protobuf.bs r2 = r2.f169971d     // Catch:{ all -> 0x020f }
            boolean r1 = r1.mo58857o(r2)     // Catch:{ all -> 0x020f }
            if (r1 == 0) goto L_0x00cc
            com.google.android.libraries.logging.ve.u r1 = com.google.android.libraries.logging.p2185ve.p2192d.C28348a.m53028a(r10)     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bt r2 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28384e.f77126a     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)     // Catch:{ all -> 0x0021 }
            r1.mo58887l(r2)     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bf r1 = r1.f169962ag     // Catch:{ all -> 0x0021 }
            com.google.protobuf.bs r7 = r2.f169971d     // Catch:{ all -> 0x0021 }
            java.lang.Object r1 = r1.mo58854l(r7)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x00bb
            java.lang.Object r1 = r2.f169969b     // Catch:{ all -> 0x0021 }
            goto L_0x00bf
        L_0x00bb:
            java.lang.Object r1 = r2.mo58889c(r1)     // Catch:{ all -> 0x0021 }
        L_0x00bf:
            com.google.android.libraries.logging.ve.e.b.d r1 = (com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28383d) r1     // Catch:{ all -> 0x0021 }
            int r1 = r1.f77125b     // Catch:{ all -> 0x0021 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0021 }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x00d8
        L_0x00cc:
            com.google.android.libraries.logging.ve.e.a.a r1 = r12.f77138a     // Catch:{ all -> 0x020f }
            com.google.common.base.ax r1 = r1.mo33869a(r10)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.logging.ve.e.b.h r2 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28387h.f77127a     // Catch:{ all -> 0x020f }
            com.google.common.base.ax r1 = r1.mo56106b(r2)     // Catch:{ all -> 0x020f }
        L_0x00d8:
            r8 = r1
            com.google.android.libraries.logging.ve.e.b.ah r1 = r12.f77140c     // Catch:{ all -> 0x020f }
            java.util.List r2 = r10.f77071c     // Catch:{ all -> 0x020f }
            android.util.SparseIntArray r7 = r10.f77072d     // Catch:{ all -> 0x020f }
            com.google.android.libraries.logging.ve.e.a.j r1 = r1.f77101a     // Catch:{ all -> 0x020f }
            int r11 = r2.size()     // Catch:{ all -> 0x020f }
            com.google.common.o.aqp[] r14 = new com.google.common.p4552o.aqp[r11]     // Catch:{ all -> 0x020f }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x020f }
            r15.<init>()     // Catch:{ all -> 0x020f }
            r16 = 0
            r0 = 0
        L_0x00ef:
            r17 = 2
            if (r0 >= r11) goto L_0x018a
            java.lang.Object r18 = r2.get(r0)     // Catch:{ all -> 0x0021 }
            r12 = r18
            com.google.android.libraries.logging.ve.u r12 = (com.google.android.libraries.logging.p2185ve.C28481u) r12     // Catch:{ all -> 0x0021 }
            r18 = r2
            com.google.common.o.l.n r2 = r12.f77290c     // Catch:{ all -> 0x0021 }
            if (r2 != 0) goto L_0x0103
            com.google.common.o.l.n r2 = com.google.common.p4552o.p4566l.C60214n.f162914g     // Catch:{ all -> 0x0021 }
        L_0x0103:
            r19 = r13
            int r13 = r2.f162916a     // Catch:{ all -> 0x01a2 }
            r13 = r13 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x011a
            com.google.common.o.l.r r13 = r2.f162921f     // Catch:{ all -> 0x01a2 }
            if (r13 != 0) goto L_0x0111
            com.google.common.o.l.r r13 = com.google.common.p4552o.p4566l.C60218r.f162925d     // Catch:{ all -> 0x01a2 }
        L_0x0111:
            int r13 = r13.f162927a     // Catch:{ all -> 0x01a2 }
            r13 = r13 & 2
            if (r13 == 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r13 = 0
            goto L_0x011b
        L_0x011a:
            r13 = 1
        L_0x011b:
            com.google.common.base.C58838bb.m90868c(r13)     // Catch:{ all -> 0x01a2 }
            int r13 = r2.f162917b     // Catch:{ all -> 0x01a2 }
            if (r0 != r13) goto L_0x0124
            r13 = 1
            goto L_0x0125
        L_0x0124:
            r13 = 0
        L_0x0125:
            com.google.common.base.C58838bb.m90868c(r13)     // Catch:{ all -> 0x01a2 }
            com.google.common.o.aqs r13 = com.google.common.p4552o.aqs.f159780k     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ all -> 0x01a2 }
            com.google.common.o.aqp r13 = (com.google.common.p4552o.aqp) r13     // Catch:{ all -> 0x01a2 }
            int r2 = r2.f162918c     // Catch:{ all -> 0x01a2 }
            r13.copyOnWrite()     // Catch:{ all -> 0x01a2 }
            r20 = r8
            com.google.protobuf.bv r8 = r13.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.aqs r8 = (com.google.common.p4552o.aqs) r8     // Catch:{ all -> 0x01a2 }
            r21 = r5
            int r5 = r8.f159782a     // Catch:{ all -> 0x01a2 }
            r17 = 1
            r5 = r5 | 1
            r8.f159782a = r5     // Catch:{ all -> 0x01a2 }
            r8.f159783b = r2     // Catch:{ all -> 0x01a2 }
            r14[r0] = r13     // Catch:{ all -> 0x01a2 }
            int r2 = r12.f77291d     // Catch:{ all -> 0x01a2 }
            int r5 = com.google.common.p4552o.aqr.m92462b(r2)     // Catch:{ all -> 0x01a2 }
            if (r5 != 0) goto L_0x0152
            goto L_0x016d
        L_0x0152:
            r8 = 1
            if (r5 == r8) goto L_0x016d
            int r2 = com.google.common.p4552o.aqr.m92462b(r2)     // Catch:{ all -> 0x01a2 }
            if (r2 != 0) goto L_0x015c
            r2 = 1
        L_0x015c:
            r13.copyOnWrite()     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bv r5 = r13.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.aqs r5 = (com.google.common.p4552o.aqs) r5     // Catch:{ all -> 0x01a2 }
            r8 = -1
            int r2 = r2 + r8
            r5.f159789h = r2     // Catch:{ all -> 0x01a2 }
            int r2 = r5.f159782a     // Catch:{ all -> 0x01a2 }
            r2 = r2 | 32
            r5.f159782a = r2     // Catch:{ all -> 0x01a2 }
        L_0x016d:
            com.google.protobuf.ch r2 = r12.f77289b     // Catch:{ all -> 0x01a2 }
            int r2 = r2.size()     // Catch:{ all -> 0x01a2 }
            if (r2 <= 0) goto L_0x017c
            com.google.protobuf.ch r2 = r12.f77289b     // Catch:{ all -> 0x01a2 }
            r5 = r14[r0]     // Catch:{ all -> 0x01a2 }
            r1.mo33876a(r12, r2, r5, r15)     // Catch:{ all -> 0x01a2 }
        L_0x017c:
            int r0 = r0 + 1
            r12 = r22
            r2 = r18
            r13 = r19
            r8 = r20
            r5 = r21
            goto L_0x00ef
        L_0x018a:
            r21 = r5
            r20 = r8
            r19 = r13
            r0 = 0
        L_0x0191:
            if (r0 >= r11) goto L_0x01a8
            int r1 = r7.valueAt(r0)     // Catch:{ all -> 0x01a2 }
            r2 = -1
            if (r1 == r2) goto L_0x019f
            r1 = r14[r1]     // Catch:{ all -> 0x01a2 }
            r1.mo57037a(r0)     // Catch:{ all -> 0x01a2 }
        L_0x019f:
            int r0 = r0 + 1
            goto L_0x0191
        L_0x01a2:
            r0 = move-exception
            r2 = r0
            r1 = r19
            goto L_0x0212
        L_0x01a8:
            boolean r0 = r15.isEmpty()     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x01b4
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r14)     // Catch:{ all -> 0x01a2 }
        L_0x01b2:
            r1 = 1
            goto L_0x01c4
        L_0x01b4:
            com.google.common.util.concurrent.cf r0 = com.google.common.util.concurrent.C60856cj.m92894c(r15)     // Catch:{ all -> 0x020b }
            com.google.android.libraries.logging.ve.e.b.ag r1 = new com.google.android.libraries.logging.ve.e.b.ag     // Catch:{ all -> 0x020b }
            r1.<init>(r15, r14)     // Catch:{ all -> 0x020b }
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x020b }
            com.google.common.util.concurrent.cx r0 = r0.mo57334a(r1, r2)     // Catch:{ all -> 0x020b }
            goto L_0x01b2
        L_0x01c4:
            com.google.common.util.concurrent.cx[] r2 = new com.google.common.util.concurrent.C60870cx[r1]     // Catch:{ all -> 0x020b }
            r2[r16] = r0     // Catch:{ all -> 0x020b }
            com.google.common.util.concurrent.cf r1 = com.google.common.util.concurrent.C60856cj.m92895d(r2)     // Catch:{ all -> 0x020b }
            com.google.android.libraries.logging.ve.e.b.af r2 = new com.google.android.libraries.logging.ve.e.b.af     // Catch:{ all -> 0x020b }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x020b }
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x020b }
            com.google.common.util.concurrent.cx r7 = r1.mo57334a(r2, r0)     // Catch:{ all -> 0x020b }
            r0 = 4
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r0]     // Catch:{ all -> 0x020b }
            r0[r16] = r6     // Catch:{ all -> 0x020b }
            r1 = 1
            r0[r1] = r9     // Catch:{ all -> 0x020b }
            r0[r17] = r3     // Catch:{ all -> 0x020b }
            r1 = 3
            r0[r1] = r7     // Catch:{ all -> 0x020b }
            com.google.common.util.concurrent.cf r0 = com.google.common.util.concurrent.C60856cj.m92895d(r0)     // Catch:{ all -> 0x020b }
            com.google.android.libraries.logging.ve.e.b.i r12 = new com.google.android.libraries.logging.ve.e.b.i     // Catch:{ all -> 0x020b }
            r1 = r12
            r2 = r22
            r5 = r21
            r8 = r20
            r11 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x020b }
            com.google.common.util.concurrent.r r1 = com.google.apps.tiktok.tracing.C47810es.m84965e(r12)     // Catch:{ all -> 0x020b }
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x020b }
            com.google.common.util.concurrent.cx r0 = r0.mo57335b(r1, r2)     // Catch:{ all -> 0x020b }
            r1 = r19
            r1.mo51417a(r0)     // Catch:{ all -> 0x0209 }
            r1.close()
            return r0
        L_0x0209:
            r0 = move-exception
            goto L_0x0211
        L_0x020b:
            r0 = move-exception
            r1 = r19
            goto L_0x0211
        L_0x020f:
            r0 = move-exception
            r1 = r13
        L_0x0211:
            r2 = r0
        L_0x0212:
            r1.close()     // Catch:{ all -> 0x0216 }
            goto L_0x021b
        L_0x0216:
            r0 = move-exception
            r1 = r0
            com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28386g.m53066a(r2, r1)
        L_0x021b:
            goto L_0x021d
        L_0x021c:
            throw r2
        L_0x021d:
            goto L_0x021c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28389j.mo33778a(com.google.android.libraries.logging.b.m):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final Set mo33779b() {
        return new C58759qy(C28351d.class);
    }
}
