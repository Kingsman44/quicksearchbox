package com.google.common.p4535g;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.common.g.cj */
/* compiled from: PG */
public final class C59171cj implements Serializable {

    /* renamed from: a */
    public static final C58485gu f157221a;

    /* renamed from: b */
    public final int f157222b = 0;

    /* renamed from: c */
    public final int f157223c = 30;

    /* renamed from: d */
    public final int f157224d = 1;

    /* renamed from: e */
    public final int f157225e;

    static {
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < 6; i++) {
            e.mo55395g(new C59225s(C59226t.m91936q(i)));
        }
        f157221a = e.mo55394f();
    }

    public C59171cj(C59167cf cfVar) {
        this.f157225e = cfVar.f157214a;
    }

    /* renamed from: b */
    public static C59167cf m91769b() {
        return new C59167cf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x009b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4535g.C59227u mo56548a(com.google.common.p4535g.C59165cd r10) {
        /*
            r9 = this;
            com.google.common.g.u r0 = new com.google.common.g.u
            r0.<init>()
            com.google.common.g.ce r1 = new com.google.common.g.ce
            r1.<init>(r9, r10)
            java.util.PriorityQueue r10 = r1.f157212d
            boolean r10 = r10.isEmpty()
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L_0x001e
            java.util.ArrayList r10 = r1.f157211c
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x001e
            r10 = 1
            goto L_0x001f
        L_0x001e:
            r10 = 0
        L_0x001f:
            com.google.common.base.C58838bb.m90883r(r10)
            com.google.common.g.cj r10 = r1.f157213e
            int r10 = r10.f157225e
            r4 = 4
            if (r10 < r4) goto L_0x007d
            com.google.common.g.cd r10 = r1.f157209a
            r5 = 3
            int[] r5 = new int[r5]
            com.google.common.g.cc r6 = com.google.common.p4535g.C59164cc.f157204f
            com.google.common.g.o r6 = r6.f157207g
            com.google.common.g.r r10 = (com.google.common.p4535g.C59224r) r10
            com.google.common.g.m r7 = r10.f157320b
            com.google.common.g.l r7 = r7.mo56617c()
            double r7 = r7.f157299c
            double r7 = r7 + r7
            int r6 = r6.mo56639a(r7)
            r5[r3] = r6
            r6 = 30
            r5[r2] = r6
            r6 = 2
            r7 = 29
            r5[r6] = r7
            int r5 = com.google.common.p4575r.C60757n.m92747h(r5)
            if (r5 <= 0) goto L_0x007d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            com.google.common.g.bb r10 = r10.f157319a
            com.google.common.g.t r10 = com.google.common.p4535g.C59226t.m91939t(r10)
            r10.mo56656B(r5, r6)
            r10 = 0
        L_0x0061:
            int r4 = r6.size()
            if (r10 < r4) goto L_0x0068
            goto L_0x0093
        L_0x0068:
            com.google.common.g.s r4 = new com.google.common.g.s
            java.lang.Object r5 = r6.get(r10)
            com.google.common.g.t r5 = (com.google.common.p4535g.C59226t) r5
            r4.<init>(r5)
            com.google.common.g.cg r4 = r1.mo56545a(r4)
            r1.mo56546b(r4)
            int r10 = r10 + 1
            goto L_0x0061
        L_0x007d:
            r10 = 0
        L_0x007e:
            r4 = 6
            if (r10 >= r4) goto L_0x0093
            com.google.common.b.gu r4 = f157221a
            java.lang.Object r4 = r4.get(r10)
            com.google.common.g.s r4 = (com.google.common.p4535g.C59225s) r4
            com.google.common.g.cg r4 = r1.mo56545a(r4)
            r1.mo56546b(r4)
            int r10 = r10 + 1
            goto L_0x007e
        L_0x0093:
            java.util.PriorityQueue r10 = r1.f157212d
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x00db
            java.util.PriorityQueue r10 = r1.f157212d
            java.lang.Object r10 = r10.poll()
            com.google.common.g.ci r10 = (com.google.common.p4535g.C59170ci) r10
            com.google.common.g.cg r10 = r10.f157220b
            com.google.common.g.s r4 = r10.f157215a
            byte r4 = r4.f157322b
            if (r4 < 0) goto L_0x00cc
            int r4 = r10.f157217c
            if (r4 == r2) goto L_0x00cc
            java.util.ArrayList r4 = r1.f157211c
            int r4 = r4.size()
            java.util.PriorityQueue r5 = r1.f157212d
            int r5 = r5.size()
            int r4 = r4 + r5
            int r5 = r10.f157217c
            int r4 = r4 + r5
            com.google.common.g.cj r5 = r1.f157213e
            int r5 = r5.f157225e
            if (r4 > r5) goto L_0x00c6
            goto L_0x00cc
        L_0x00c6:
            r10.f157216b = r2
            r1.mo56546b(r10)
            goto L_0x0093
        L_0x00cc:
            r4 = 0
        L_0x00cd:
            int r5 = r10.f157217c
            if (r4 >= r5) goto L_0x0093
            com.google.common.g.cg[] r5 = r10.f157218d
            r5 = r5[r4]
            r1.mo56546b(r5)
            int r4 = r4 + 1
            goto L_0x00cd
        L_0x00db:
            java.util.ArrayList r10 = r1.f157211c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            r0.f157335a = r1
            r10.clear()
            java.util.ArrayList r10 = r0.f157335a
            com.google.common.p4535g.C59227u.m91962d(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59171cj.mo56548a(com.google.common.g.cd):com.google.common.g.u");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59171cj) {
            C59171cj cjVar = (C59171cj) obj;
            int i = cjVar.f157222b;
            int i2 = cjVar.f157223c;
            int i3 = cjVar.f157224d;
            if (this.f157225e == cjVar.f157225e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, 30, 1, Integer.valueOf(this.f157225e)});
    }
}
