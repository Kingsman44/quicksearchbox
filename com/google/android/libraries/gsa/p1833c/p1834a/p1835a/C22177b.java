package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import android.net.Network;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.gsa.c.a.a.b */
/* compiled from: PG */
final class C22177b extends C22196u {

    /* renamed from: b */
    private final C89062r f61214b;

    /* renamed from: c */
    private final C22199x f61215c;

    /* renamed from: d */
    private final Network f61216d;

    /* renamed from: e */
    private final boolean f61217e;

    /* renamed from: f */
    private final boolean f61218f;

    /* renamed from: g */
    private final boolean f61219g;

    /* renamed from: h */
    private final boolean f61220h;

    /* renamed from: i */
    private final Boolean f61221i;

    /* renamed from: j */
    private final Integer f61222j;

    /* renamed from: k */
    private final Boolean f61223k;

    /* renamed from: l */
    private final C58495hd f61224l;

    /* renamed from: m */
    private final long f61225m;

    public C22177b(C89062r rVar, C22199x xVar, Network network, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, Integer num, Boolean bool2, C58495hd hdVar, long j) {
        this.f61214b = rVar;
        this.f61215c = xVar;
        this.f61216d = network;
        this.f61217e = z;
        this.f61218f = z2;
        this.f61219g = z3;
        this.f61220h = z4;
        this.f61221i = bool;
        this.f61222j = num;
        this.f61223k = bool2;
        this.f61224l = hdVar;
        this.f61225m = j;
    }

    /* renamed from: a */
    public final long mo27405a() {
        return this.f61225m;
    }

    /* renamed from: b */
    public final Network mo27406b() {
        return this.f61216d;
    }

    /* renamed from: c */
    public final C89062r mo27407c() {
        return this.f61214b;
    }

    /* renamed from: e */
    public final C22199x mo27408e() {
        return this.f61215c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        r1 = r7.f61221i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        r1 = r7.f61222j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        r1 = r7.f61223k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r7.f61216d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22196u
            r2 = 0
            if (r1 == 0) goto L_0x00af
            com.google.android.libraries.gsa.c.a.a.u r8 = (com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22196u) r8
            com.google.android.apps.gsa.shared.aa.r r1 = r7.f61214b
            com.google.android.apps.gsa.shared.aa.r r3 = r8.mo27407c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00af
            com.google.android.libraries.gsa.c.a.a.x r1 = r7.f61215c
            com.google.android.libraries.gsa.c.a.a.x r3 = r8.mo27408e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00af
            android.net.Network r1 = r7.f61216d
            if (r1 != 0) goto L_0x002e
            android.net.Network r1 = r8.mo27406b()
            if (r1 != 0) goto L_0x00af
            goto L_0x0038
        L_0x002e:
            android.net.Network r3 = r8.mo27406b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00af
        L_0x0038:
            boolean r1 = r7.f61217e
            boolean r3 = r8.mo27418m()
            if (r1 != r3) goto L_0x00af
            boolean r1 = r7.f61218f
            boolean r3 = r8.mo27416k()
            if (r1 != r3) goto L_0x00af
            boolean r1 = r7.f61219g
            boolean r3 = r8.mo27417l()
            if (r1 != r3) goto L_0x00af
            boolean r1 = r7.f61220h
            boolean r3 = r8.mo27415j()
            if (r1 != r3) goto L_0x00af
            java.lang.Boolean r1 = r7.f61221i
            if (r1 != 0) goto L_0x0063
            java.lang.Boolean r1 = r8.mo27412h()
            if (r1 != 0) goto L_0x00af
            goto L_0x006d
        L_0x0063:
            java.lang.Boolean r3 = r8.mo27412h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00af
        L_0x006d:
            java.lang.Integer r1 = r7.f61222j
            if (r1 != 0) goto L_0x0078
            java.lang.Integer r1 = r8.mo27414i()
            if (r1 != 0) goto L_0x00af
            goto L_0x0082
        L_0x0078:
            java.lang.Integer r3 = r8.mo27414i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00af
        L_0x0082:
            java.lang.Boolean r1 = r7.f61223k
            if (r1 != 0) goto L_0x008d
            java.lang.Boolean r1 = r8.mo27411g()
            if (r1 != 0) goto L_0x00af
            goto L_0x0098
        L_0x008d:
            java.lang.Boolean r3 = r8.mo27411g()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0098
            goto L_0x00af
        L_0x0098:
            com.google.common.b.hd r1 = r7.f61224l
            com.google.common.b.hd r3 = r8.mo27410f()
            boolean r1 = com.google.common.p4522b.C58662ni.m90356o(r1, r3)
            if (r1 == 0) goto L_0x00af
            long r3 = r7.f61225m
            long r5 = r8.mo27405a()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x00af
            return r0
        L_0x00af:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22177b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C58495hd mo27410f() {
        return this.f61224l;
    }

    /* renamed from: g */
    public final Boolean mo27411g() {
        return this.f61223k;
    }

    /* renamed from: h */
    public final Boolean mo27412h() {
        return this.f61221i;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((this.f61214b.hashCode() ^ 1000003) * 1000003) ^ this.f61215c.hashCode()) * 1000003;
        Network network = this.f61216d;
        int i4 = 0;
        if (network == null) {
            i = 0;
        } else {
            i = network.hashCode();
        }
        int i5 = 1237;
        int i6 = (((((((hashCode ^ i) * 1000003) ^ (true != this.f61217e ? 1237 : 1231)) * 1000003) ^ (true != this.f61218f ? 1237 : 1231)) * 1000003) ^ (true != this.f61219g ? 1237 : 1231)) * 1000003;
        if (true == this.f61220h) {
            i5 = 1231;
        }
        int i7 = (i6 ^ i5) * 1000003;
        Boolean bool = this.f61221i;
        if (bool == null) {
            i2 = 0;
        } else {
            i2 = bool.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        Integer num = this.f61222j;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        Boolean bool2 = this.f61223k;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        }
        int a = C58758qx.m90643a(this.f61224l.entrySet());
        long j = this.f61225m;
        return ((((i9 ^ i4) * 1000003) ^ a) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    /* renamed from: i */
    public final Integer mo27414i() {
        return this.f61222j;
    }

    /* renamed from: j */
    public final boolean mo27415j() {
        return this.f61220h;
    }

    /* renamed from: k */
    public final boolean mo27416k() {
        return this.f61218f;
    }

    /* renamed from: l */
    public final boolean mo27417l() {
        return this.f61219g;
    }

    /* renamed from: m */
    public final boolean mo27418m() {
        return this.f61217e;
    }
}
