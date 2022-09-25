package com.google.android.libraries.gsa.conversation.p1851e;

import com.google.common.p4536h.C59234aa;
import com.google.common.p4536h.C59244ak;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.gsa.conversation.e.d */
/* compiled from: PG */
public class C22565d {

    /* renamed from: a */
    public final C59234aa f62197a;

    /* renamed from: b */
    private final C22564c f62198b;

    /* renamed from: c */
    private final AtomicInteger f62199c;

    private C22565d(C59234aa aaVar, C22564c cVar, AtomicInteger atomicInteger) {
        this.f62197a = aaVar;
        this.f62198b = cVar;
        this.f62199c = atomicInteger;
    }

    public C22565d(Object obj) {
        this(new C59234aa(new C59244ak()), new C22562a("root", obj), new AtomicInteger());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.libraries.gsa.conversation.p1851e.C22565d mo27655a(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f62199c
            int r0 = r0.incrementAndGet()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.google.android.libraries.gsa.conversation.e.a r1 = new com.google.android.libraries.gsa.conversation.e.a
            r1.<init>(r0, r10)
            com.google.common.h.aa r10 = r8.f62197a
            com.google.android.libraries.gsa.conversation.e.c r0 = r8.f62198b
            java.lang.String r2 = "value"
            com.google.common.base.C58838bb.m90866a(r9, r2)
            boolean r2 = r0.equals(r1)
            r3 = 1
            r2 = r2 ^ r3
            java.lang.String r4 = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder."
            com.google.common.base.C58838bb.m90873h(r2, r4, r0)
            com.google.common.h.z r2 = r10.f157344a
            java.lang.Object r2 = r2.mo56737a(r0)
            com.google.common.h.n r2 = (com.google.common.p4536h.C59257n) r2
            if (r2 != 0) goto L_0x0031
            com.google.common.h.n r2 = r10.mo56697g(r0)
        L_0x0031:
            java.util.Map r4 = r2.f157361b
            java.lang.Object r4 = r4.put(r1, r9)
            r5 = 0
            if (r4 != 0) goto L_0x003c
        L_0x003a:
            r4 = r5
            goto L_0x005e
        L_0x003c:
            boolean r6 = r4 instanceof com.google.common.p4536h.C59256m
            if (r6 == 0) goto L_0x004f
            java.util.Map r6 = r2.f157361b
            com.google.common.h.m r7 = new com.google.common.h.m
            r7.<init>(r9)
            r6.put(r1, r7)
            com.google.common.h.m r4 = (com.google.common.p4536h.C59256m) r4
            java.lang.Object r4 = r4.f157359a
            goto L_0x005e
        L_0x004f:
            java.lang.Object r6 = com.google.common.p4536h.C59257n.f157360a
            if (r4 != r6) goto L_0x005e
            java.util.Map r4 = r2.f157361b
            com.google.common.h.m r6 = new com.google.common.h.m
            r6.<init>(r9)
            r4.put(r1, r6)
            goto L_0x003a
        L_0x005e:
            if (r4 != 0) goto L_0x0074
            int r9 = r2.f157364e
            int r9 = r9 + r3
            r2.f157364e = r9
            com.google.common.p4536h.C59266w.m92014a(r9)
            java.util.List r9 = r2.f157362c
            if (r9 == 0) goto L_0x0074
            com.google.common.h.k r2 = new com.google.common.h.k
            r2.<init>(r1)
            r9.add(r2)
        L_0x0074:
            if (r4 != 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r5 = r4
        L_0x0078:
            com.google.common.h.z r9 = r10.f157344a
            java.lang.Object r9 = r9.mo56737a(r1)
            com.google.common.h.n r9 = (com.google.common.p4536h.C59257n) r9
            if (r9 != 0) goto L_0x0086
            com.google.common.h.n r9 = r10.mo56697g(r1)
        L_0x0086:
            java.util.Map r2 = r9.f157361b
            java.lang.Object r4 = com.google.common.p4536h.C59257n.f157360a
            java.lang.Object r2 = r2.put(r0, r4)
            if (r2 != 0) goto L_0x0091
            goto L_0x00a9
        L_0x0091:
            boolean r4 = r2 instanceof com.google.common.p4536h.C59256m
            if (r4 == 0) goto L_0x009b
            java.util.Map r9 = r9.f157361b
            r9.put(r0, r2)
            goto L_0x00bd
        L_0x009b:
            java.lang.Object r4 = com.google.common.p4536h.C59257n.f157360a
            if (r2 == r4) goto L_0x00bd
            java.util.Map r4 = r9.f157361b
            com.google.common.h.m r6 = new com.google.common.h.m
            r6.<init>(r2)
            r4.put(r0, r6)
        L_0x00a9:
            int r2 = r9.f157363d
            int r2 = r2 + r3
            r9.f157363d = r2
            com.google.common.p4536h.C59266w.m92014a(r2)
            java.util.List r9 = r9.f157362c
            if (r9 == 0) goto L_0x00bd
            com.google.common.h.j r2 = new com.google.common.h.j
            r2.<init>(r0)
            r9.add(r2)
        L_0x00bd:
            if (r5 != 0) goto L_0x00d3
            long r4 = r10.f157345b
            r6 = 1
            long r4 = r4 + r6
            r10.f157345b = r4
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r3 = 0
        L_0x00ce:
            java.lang.String r9 = "Not true that %s is positive."
            com.google.common.base.C58838bb.m90872g(r3, r9, r4)
        L_0x00d3:
            com.google.android.libraries.gsa.conversation.e.d r9 = new com.google.android.libraries.gsa.conversation.e.d
            com.google.common.h.aa r10 = r8.f62197a
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f62199c
            r9.<init>(r10, r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.p1851e.C22565d.mo27655a(java.lang.Object, java.lang.Object):com.google.android.libraries.gsa.conversation.e.d");
    }
}
