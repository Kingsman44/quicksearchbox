package com.google.android.gms.learning.p10823d;

import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.learning.d.o */
/* compiled from: PG */
public final /* synthetic */ class C144602o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C144588ad f391291a;

    /* renamed from: b */
    public final /* synthetic */ C144587ac f391292b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f391293c;

    public /* synthetic */ C144602o(C144588ad adVar, C144587ac acVar, AtomicReference atomicReference) {
        this.f391291a = adVar;
        this.f391292b = acVar;
        this.f391293c = atomicReference;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r15) {
        /*
            r14 = this;
            com.google.android.gms.learning.d.ad r0 = r14.f391291a
            com.google.android.gms.learning.d.ac r1 = r14.f391292b
            java.util.concurrent.atomic.AtomicReference r2 = r14.f391293c
            com.google.android.libraries.micore.learning.a.r r15 = (com.google.android.libraries.micore.learning.p2258a.C29708r) r15
            com.google.android.gms.learning.b r0 = r0.f391250f
            boolean r0 = r0.mo119996ad()
            com.google.protobuf.bn r15 = r15.toBuilder()
            com.google.android.libraries.micore.learning.a.q r15 = (com.google.android.libraries.micore.learning.p2258a.C29707q) r15
            if (r0 == 0) goto L_0x001b
            com.google.android.gms.learning.d.v r3 = com.google.android.gms.learning.p10823d.C144609v.f391304a
            com.google.android.gms.learning.p10823d.C144588ad.m235085n(r15, r3)
        L_0x001b:
            com.google.protobuf.bv r15 = r15.build()
            com.google.android.libraries.micore.learning.a.r r15 = (com.google.android.libraries.micore.learning.p2258a.C29708r) r15
            com.google.common.base.az r15 = r1.mo120064a(r15)
            java.lang.Object r1 = r15.f156632b
            r2.set(r1)
            java.lang.Object r1 = r15.f156631a
            com.google.android.libraries.micore.learning.a.r r1 = (com.google.android.libraries.micore.learning.p2258a.C29708r) r1
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            com.google.protobuf.cq r1 = r1.f80467a
            java.util.Iterator r1 = r1.iterator()
        L_0x0052:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x0294
            java.lang.Object r8 = r1.next()
            com.google.android.libraries.micore.learning.a.p r8 = (com.google.android.libraries.micore.learning.p2258a.C29706p) r8
            java.lang.String r9 = r8.f80452c
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x028c
            java.lang.String r9 = r8.f80453d
            boolean r9 = r2.add(r9)
            if (r9 == 0) goto L_0x0284
            java.lang.String r9 = r8.f80453d
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x027c
            int r9 = r8.f80454e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r7.add(r9)
            if (r9 == 0) goto L_0x0274
            int r9 = r8.f80454e
            if (r9 == 0) goto L_0x026c
            int r9 = r8.f80450a
            r10 = 4
            if (r9 != r10) goto L_0x00a0
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.e r9 = (com.google.android.libraries.micore.learning.p2258a.C29695e) r9
            java.lang.String r9 = r9.f80427a
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0098
            goto L_0x00a0
        L_0x0098:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Empty population name"
            r15.<init>(r0)
            throw r15
        L_0x00a0:
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x00b9
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.e r9 = (com.google.android.libraries.micore.learning.p2258a.C29695e) r9
            java.lang.String r9 = r9.f80427a
            boolean r9 = r3.add(r9)
            if (r9 == 0) goto L_0x00b1
            goto L_0x00b9
        L_0x00b1:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Duplicate population names"
            r15.<init>(r0)
            throw r15
        L_0x00b9:
            int r9 = r8.f80450a
            r10 = 13
            if (r9 != r10) goto L_0x00d4
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            java.lang.String r9 = r9.f80432a
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00cc
            goto L_0x00d4
        L_0x00cc:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing personlization plan URI"
            r15.<init>(r0)
            throw r15
        L_0x00d4:
            if (r0 == 0) goto L_0x0109
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x00ef
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            java.lang.String r9 = r9.f80433b
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00e7
            goto L_0x00ef
        L_0x00e7:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Initial params is set for PersonalizedOptions, but it's no longer supported."
            r15.<init>(r0)
            throw r15
        L_0x00ef:
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x0181
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            java.lang.String r9 = r9.f80436e
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0101
            goto L_0x0181
        L_0x0101:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing input directory"
            r15.<init>(r0)
            throw r15
        L_0x0109:
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x0135
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            java.lang.String r9 = r9.f80436e
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0135
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x0122
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            goto L_0x0124
        L_0x0122:
            com.google.android.libraries.micore.learning.a.g r9 = com.google.android.libraries.micore.learning.p2258a.C29697g.f80430f
        L_0x0124:
            java.lang.String r9 = r9.f80433b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x012d
            goto L_0x0135
        L_0x012d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing initial params and input directory, one of them is required for PersonalizedOptions."
            r15.<init>(r0)
            throw r15
        L_0x0135:
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x0161
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            java.lang.String r9 = r9.f80436e
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0161
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x014e
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            goto L_0x0150
        L_0x014e:
            com.google.android.libraries.micore.learning.a.g r9 = com.google.android.libraries.micore.learning.p2258a.C29697g.f80430f
        L_0x0150:
            java.lang.String r9 = r9.f80433b
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0159
            goto L_0x0161
        L_0x0159:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Both initial params and input directory are set for PersonalizedOptions."
            r15.<init>(r0)
            throw r15
        L_0x0161:
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x0181
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            java.lang.String r11 = r9.f80432a
            java.lang.String r9 = r9.f80434c
            com.google.common.base.az r12 = new com.google.common.base.az
            r12.<init>(r11, r9)
            boolean r9 = r4.add(r12)
            if (r9 == 0) goto L_0x0179
            goto L_0x0181
        L_0x0179:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Duplicate (personalization plan, initial params)"
            r15.<init>(r0)
            throw r15
        L_0x0181:
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x01a1
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            java.lang.String r11 = r9.f80432a
            java.lang.String r9 = r9.f80436e
            com.google.common.base.az r12 = new com.google.common.base.az
            r12.<init>(r11, r9)
            boolean r9 = r5.add(r12)
            if (r9 == 0) goto L_0x0199
            goto L_0x01a1
        L_0x0199:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Duplicate (personalization plan, input directory)"
            r15.<init>(r0)
            throw r15
        L_0x01a1:
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x01ba
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            java.lang.String r9 = r9.f80434c
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01b2
            goto L_0x01ba
        L_0x01b2:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing output directory"
            r15.<init>(r0)
            throw r15
        L_0x01ba:
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x01d3
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            java.lang.String r9 = r9.f80434c
            boolean r9 = r6.add(r9)
            if (r9 == 0) goto L_0x01cb
            goto L_0x01d3
        L_0x01cb:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Duplicate output directory"
            r15.<init>(r0)
            throw r15
        L_0x01d3:
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x01dc
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            goto L_0x01de
        L_0x01dc:
            com.google.android.libraries.micore.learning.a.g r9 = com.google.android.libraries.micore.learning.p2258a.C29697g.f80430f
        L_0x01de:
            com.google.android.libraries.micore.learning.a.m r9 = r9.f80435d
            if (r9 != 0) goto L_0x01e4
            com.google.android.libraries.micore.learning.a.m r9 = com.google.android.libraries.micore.learning.p2258a.C29703m.f80444c
        L_0x01e4:
            int r9 = r9.f80446a
            int r9 = com.google.android.libraries.micore.learning.p2258a.C29702l.m54787a(r9)
            if (r9 != 0) goto L_0x01ed
            goto L_0x020e
        L_0x01ed:
            r11 = 3
            if (r9 != r11) goto L_0x020e
            int r9 = r8.f80450a
            if (r9 != r10) goto L_0x01f9
            java.lang.Object r9 = r8.f80451b
            com.google.android.libraries.micore.learning.a.g r9 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r9
            goto L_0x01fb
        L_0x01f9:
            com.google.android.libraries.micore.learning.a.g r9 = com.google.android.libraries.micore.learning.p2258a.C29697g.f80430f
        L_0x01fb:
            long r9 = com.google.android.gms.learning.p10823d.C144588ad.m235080b(r9)
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0206
            goto L_0x020e
        L_0x0206:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid value for user defined minimum training interval"
            r15.<init>(r0)
            throw r15
        L_0x020e:
            com.google.protobuf.fg r9 = r8.f80455f
            if (r9 == 0) goto L_0x0264
            boolean r9 = com.google.protobuf.p4750c.C62953e.m95490o(r9)
            if (r9 == 0) goto L_0x0264
            com.google.protobuf.fg r9 = r8.f80456g
            if (r9 == 0) goto L_0x025c
            boolean r9 = com.google.protobuf.p4750c.C62953e.m95490o(r9)
            if (r9 == 0) goto L_0x025c
            com.google.protobuf.fg r9 = r8.f80457h
            if (r9 == 0) goto L_0x0235
            boolean r9 = com.google.protobuf.p4750c.C62953e.m95490o(r9)
            if (r9 == 0) goto L_0x022d
            goto L_0x0235
        L_0x022d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid last run start time"
            r15.<init>(r0)
            throw r15
        L_0x0235:
            com.google.protobuf.fg r9 = r8.f80458i
            if (r9 == 0) goto L_0x0248
            boolean r9 = com.google.protobuf.p4750c.C62953e.m95490o(r9)
            if (r9 == 0) goto L_0x0240
            goto L_0x0248
        L_0x0240:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid last run end time"
            r15.<init>(r0)
            throw r15
        L_0x0248:
            com.google.protobuf.fg r8 = r8.f80459j
            if (r8 == 0) goto L_0x0254
            boolean r8 = com.google.protobuf.p4750c.C62953e.m95490o(r8)
            if (r8 == 0) goto L_0x0254
            goto L_0x0052
        L_0x0254:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing/invalid earliest next run time"
            r15.<init>(r0)
            throw r15
        L_0x025c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing/invalid last scheduled time"
            r15.<init>(r0)
            throw r15
        L_0x0264:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing/invalid creation time"
            r15.<init>(r0)
            throw r15
        L_0x026c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Job ID == 0"
            r15.<init>(r0)
            throw r15
        L_0x0274:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Duplicate job IDs"
            r15.<init>(r0)
            throw r15
        L_0x027c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Empty session name"
            r15.<init>(r0)
            throw r15
        L_0x0284:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Duplicate session names"
            r15.<init>(r0)
            throw r15
        L_0x028c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Empty app package name"
            r15.<init>(r0)
            throw r15
        L_0x0294:
            java.lang.Object r15 = r15.f156631a
            com.google.android.libraries.micore.learning.a.r r15 = (com.google.android.libraries.micore.learning.p2258a.C29708r) r15
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60856cj.m92900i(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.p10823d.C144602o.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
