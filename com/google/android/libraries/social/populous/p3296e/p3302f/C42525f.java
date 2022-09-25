package com.google.android.libraries.social.populous.p3296e.p3302f;

import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.social.populous.e.f.f */
/* compiled from: PG */
public final /* synthetic */ class C42525f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C42526g f111521a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f111522b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f111523c;

    /* renamed from: d */
    public final /* synthetic */ C42549n f111524d;

    public /* synthetic */ C42525f(C42526g gVar, C60870cx cxVar, C60870cx cxVar2, C42549n nVar) {
        this.f111521a = gVar;
        this.f111522b = cxVar;
        this.f111523c = cxVar2;
        this.f111524d = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        r7 = com.google.android.libraries.social.populous.p3296e.p3298b.C42422as.m74735a(r11.f111509d.keySet(), r10.f111509d.keySet());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0127, code lost:
        if (java.util.Collections.disjoint(r11.f111510e, r10.f111510e) == false) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.libraries.social.populous.e.f.g r1 = r0.f111521a
            com.google.common.util.concurrent.cx r2 = r0.f111522b
            com.google.common.util.concurrent.cx r3 = r0.f111523c
            com.google.android.libraries.social.populous.e.n r4 = r0.f111524d
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)
            com.google.android.libraries.social.populous.e.p r2 = (com.google.android.libraries.social.populous.p3296e.C42551p) r2
            java.lang.Object r3 = com.google.common.util.concurrent.C60856cj.m92909r(r3)
            com.google.android.libraries.social.populous.e.p r3 = (com.google.android.libraries.social.populous.p3296e.C42551p) r3
            int r5 = r2.f111632e
            r6 = 13
            r7 = 2
            if (r5 == r7) goto L_0x002d
            int r5 = r3.f111632e
            if (r5 == r7) goto L_0x002d
            com.google.android.libraries.social.populous.e.o r1 = r2.mo45557a()
            r1.f111627f = r6
            com.google.android.libraries.social.populous.e.p r1 = r1.mo45556a()
            goto L_0x01c9
        L_0x002d:
            com.google.android.libraries.social.populous.e.f.a r1 = r1.f111525a
            com.google.common.b.gu r5 = r2.f111629b
            com.google.common.b.gu r3 = r3.f111629b
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L_0x003f
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r5)
            goto L_0x0191
        L_0x003f:
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x004b
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r3)
            goto L_0x0191
        L_0x004b:
            com.google.android.libraries.social.populous.e.f.e r1 = (com.google.android.libraries.social.populous.p3296e.p3302f.C42524e) r1
            com.google.android.libraries.social.populous.logging.z r8 = r1.f111520b
            com.google.common.base.ci r14 = r8.mo45632b()
            int r15 = r5.size()
            com.google.android.libraries.social.populous.e.f.c[] r13 = new com.google.android.libraries.social.populous.p3296e.p3302f.C42522c[r15]
            int r12 = r3.size()
            com.google.android.libraries.social.populous.e.f.c[] r11 = new com.google.android.libraries.social.populous.p3296e.p3302f.C42522c[r12]
            java.util.HashMap r16 = new java.util.HashMap
            r16.<init>()
            com.google.android.libraries.social.populous.core.ClientConfigInternal r8 = r4.f111609f
            r17 = 1
            int r18 = r3.size()
            r9 = r5
            r10 = r13
            r19 = r11
            r11 = r17
            r6 = r12
            r12 = r18
            r18 = r13
            r13 = r16
            com.google.android.libraries.social.populous.p3296e.p3302f.C42524e.m74974d(r8, r9, r10, r11, r12, r13)
            com.google.android.libraries.social.populous.core.ClientConfigInternal r8 = r4.f111609f
            r11 = 0
            int r12 = r5.size()
            r9 = r3
            r10 = r19
            com.google.android.libraries.social.populous.p3296e.p3302f.C42524e.m74974d(r8, r9, r10, r11, r12, r13)
            com.google.android.libraries.social.populous.e.b.w r8 = r4.f111610g
            com.google.android.libraries.social.populous.e.b.f r8 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42427f) r8
            int r8 = r8.f111291a
            r9 = 3
            if (r8 != r9) goto L_0x0155
            r8 = 0
        L_0x0093:
            if (r8 >= r15) goto L_0x0155
            r11 = r18[r8]
            java.util.Map r12 = r11.f111509d
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L_0x00a1:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x014c
            java.lang.Object r13 = r12.next()
            com.google.android.libraries.social.populous.e.f.d r13 = (com.google.android.libraries.social.populous.p3296e.p3302f.C42523d) r13
            java.util.Set r13 = r13.f111516c
            java.util.Iterator r13 = r13.iterator()
        L_0x00b3:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x0148
            java.lang.Object r16 = r13.next()
            java.lang.Integer r16 = (java.lang.Integer) r16
            int r16 = r16.intValue()
            r10 = r19[r16]
            java.lang.Boolean[] r9 = r11.f111511f
            int r7 = r10.f111508c
            r7 = r9[r7]
            if (r7 == 0) goto L_0x00d3
            r7.booleanValue()
        L_0x00d0:
            r7 = 2
            r9 = 3
            goto L_0x00b3
        L_0x00d3:
            java.util.Map r7 = r11.f111509d
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x012a
            java.util.Map r7 = r10.f111509d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x00e4
            goto L_0x012a
        L_0x00e4:
            java.util.Map r7 = r11.f111509d
            java.util.Set r7 = r7.keySet()
            java.util.Map r9 = r10.f111509d
            java.util.Set r9 = r9.keySet()
            com.google.android.libraries.social.populous.e.b.as r7 = com.google.android.libraries.social.populous.p3296e.p3298b.C42422as.m74735a(r7, r9)
            int r9 = r7.ordinal()
            if (r9 == 0) goto L_0x012a
            r0 = 1
            if (r9 == r0) goto L_0x010e
            r0 = 2
            if (r9 == r0) goto L_0x010a
            r0 = 3
            if (r9 != r0) goto L_0x0104
            goto L_0x010f
        L_0x0104:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r7)
            throw r0
        L_0x010a:
            r0 = 3
        L_0x010b:
            r20 = 1
            goto L_0x012d
        L_0x010e:
            r0 = 3
        L_0x010f:
            java.util.Set r7 = r11.f111510e
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x012b
            java.util.Set r7 = r10.f111510e
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x012b
            java.util.Set r7 = r11.f111510e
            java.util.Set r9 = r10.f111510e
            boolean r7 = java.util.Collections.disjoint(r7, r9)
            if (r7 != 0) goto L_0x012b
            goto L_0x010b
        L_0x012a:
            r0 = 3
        L_0x012b:
            r20 = 0
        L_0x012d:
            java.lang.Boolean[] r7 = r11.f111511f
            int r9 = r10.f111508c
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r20)
            r7[r9] = r16
            java.lang.Boolean[] r7 = r10.f111511f
            int r9 = r11.f111508c
            r7[r9] = r16
            if (r20 == 0) goto L_0x0145
            r11.mo45542a(r10)
            r10.mo45542a(r11)
        L_0x0145:
            r0 = r21
            goto L_0x00d0
        L_0x0148:
            r0 = r21
            goto L_0x00a1
        L_0x014c:
            r0 = 3
            int r8 = r8 + 1
            r0 = r21
            r7 = 2
            r9 = 3
            goto L_0x0093
        L_0x0155:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r5 = r5.size()
            int r3 = r3.size()
            int r5 = r5 + r3
            r0.<init>(r5)
            r3 = 0
        L_0x0164:
            if (r3 >= r15) goto L_0x0172
            r5 = r18[r3]
            com.google.android.libraries.social.populous.e.b.ab r5 = com.google.android.libraries.social.populous.p3296e.p3302f.C42524e.m74973c(r5)
            r0.add(r5)
            int r3 = r3 + 1
            goto L_0x0164
        L_0x0172:
            r10 = 0
        L_0x0173:
            if (r10 >= r6) goto L_0x0181
            r3 = r19[r10]
            com.google.android.libraries.social.populous.e.b.ab r3 = com.google.android.libraries.social.populous.p3296e.p3302f.C42524e.m74973c(r3)
            r0.add(r3)
            int r10 = r10 + 1
            goto L_0x0173
        L_0x0181:
            java.util.Comparator r3 = com.google.android.libraries.social.populous.p3296e.p3302f.C42524e.f111519a
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89836F(r3, r0)
            com.google.android.libraries.social.populous.logging.z r1 = r1.f111520b
            r3 = 18
            com.google.android.libraries.social.populous.logging.k r4 = r4.f111612i
            r1.mo45638h(r3, r14, r4)
            r1 = r0
        L_0x0191:
            com.google.android.libraries.social.populous.e.o r0 = new com.google.android.libraries.social.populous.e.o
            r0.<init>()
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r1)
            r0.f111623b = r1
            r1 = 2
            r0.f111626e = r1
            r1 = 13
            r0.f111627f = r1
            com.google.common.base.ax r1 = r2.f111630c
            java.lang.Object r1 = r1.mo56111f()
            java.lang.Long r1 = (java.lang.Long) r1
            r0.f111624c = r1
            com.google.common.base.ax r1 = r2.f111628a
            java.lang.Object r1 = r1.mo56111f()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0.f111622a = r1
            com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata r1 = r2.f111631d
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            java.lang.Object r1 = r1.mo56111f()
            com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata r1 = (com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata) r1
            r0.f111625d = r1
            com.google.android.libraries.social.populous.e.p r1 = r0.mo45556a()
        L_0x01c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.p3302f.C42525f.call():java.lang.Object");
    }
}
