package com.google.ads.interactivemedia.p367v3.internal;

import android.util.SparseArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oo */
/* compiled from: PG */
final class C7178oo {

    /* renamed from: a */
    private final C7073kr f23308a;

    /* renamed from: b */
    private final boolean f23309b;

    /* renamed from: c */
    private final boolean f23310c;

    /* renamed from: d */
    private final SparseArray f23311d = new SparseArray();

    /* renamed from: e */
    private final SparseArray f23312e = new SparseArray();

    /* renamed from: f */
    private final aef f23313f = new aef(this.f23314g, 0, 0);

    /* renamed from: g */
    private byte[] f23314g = new byte[128];

    /* renamed from: h */
    private int f23315h;

    /* renamed from: i */
    private int f23316i;

    /* renamed from: j */
    private long f23317j;

    /* renamed from: k */
    private boolean f23318k;

    /* renamed from: l */
    private long f23319l;

    /* renamed from: m */
    private C7177on f23320m = new C7177on((byte[]) null);

    /* renamed from: n */
    private C7177on f23321n = new C7177on((byte[]) null);

    /* renamed from: o */
    private boolean f23322o;

    /* renamed from: p */
    private long f23323p;

    /* renamed from: q */
    private long f23324q;

    /* renamed from: r */
    private boolean f23325r;

    public C7178oo(C7073kr krVar, boolean z, boolean z2) {
        this.f23308a = krVar;
        this.f23309b = z;
        this.f23310c = z2;
        mo16242d();
    }

    /* renamed from: a */
    public final boolean mo16239a() {
        return this.f23310c;
    }

    /* renamed from: b */
    public final void mo16240b(aeb aeb) {
        this.f23311d.append(aeb.f20407d, aeb);
    }

    /* renamed from: c */
    public final void mo16241c(aea aea) {
        this.f23312e.append(aea.f20401a, aea);
    }

    /* renamed from: d */
    public final void mo16242d() {
        this.f23318k = false;
        this.f23322o = false;
        this.f23321n.mo16235a();
    }

    /* renamed from: e */
    public final void mo16243e(long j, int i, long j2) {
        this.f23316i = i;
        this.f23319l = j2;
        this.f23317j = j;
        if (!this.f23309b || i != 1) {
            if (!this.f23310c) {
                return;
            }
            if (!(i == 5 || i == 1 || i == 2)) {
                return;
            }
        }
        C7177on onVar = this.f23320m;
        this.f23320m = this.f23321n;
        this.f23321n = onVar;
        onVar.mo16235a();
        this.f23315h = 0;
        this.f23318k = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0145  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16244f(byte[] r21, int r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r0.f23318k
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            int r2 = r23 - r1
            byte[] r3 = r0.f23314g
            int r4 = r3.length
            int r5 = r0.f23315h
            int r5 = r5 + r2
            if (r4 >= r5) goto L_0x001a
            int r5 = r5 + r5
            byte[] r3 = java.util.Arrays.copyOf(r3, r5)
            r0.f23314g = r3
        L_0x001a:
            byte[] r3 = r0.f23314g
            int r4 = r0.f23315h
            r5 = r21
            java.lang.System.arraycopy(r5, r1, r3, r4, r2)
            int r1 = r0.f23315h
            int r1 = r1 + r2
            r0.f23315h = r1
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            byte[] r3 = r0.f23314g
            r4 = 0
            r2.mo14573a(r3, r4, r1)
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            r2 = 8
            boolean r1 = r1.mo14576d(r2)
            if (r1 != 0) goto L_0x003b
            return
        L_0x003b:
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            r1.mo14574b()
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            r2 = 2
            int r7 = r1.mo14578f(r2)
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            r3 = 5
            r1.mo14575c(r3)
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            boolean r1 = r1.mo14579g()
            if (r1 != 0) goto L_0x0056
            return
        L_0x0056:
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            r1.mo14580h()
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            boolean r1 = r1.mo14579g()
            if (r1 != 0) goto L_0x0064
            return
        L_0x0064:
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            int r8 = r1.mo14580h()
            boolean r1 = r0.f23310c
            if (r1 != 0) goto L_0x0076
            r0.f23318k = r4
            com.google.ads.interactivemedia.v3.internal.on r1 = r0.f23321n
            r1.mo16236b(r8)
            return
        L_0x0076:
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            boolean r1 = r1.mo14579g()
            if (r1 != 0) goto L_0x007f
            return
        L_0x007f:
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            int r10 = r1.mo14580h()
            android.util.SparseArray r1 = r0.f23312e
            int r1 = r1.indexOfKey(r10)
            if (r1 >= 0) goto L_0x0090
            r0.f23318k = r4
            return
        L_0x0090:
            android.util.SparseArray r1 = r0.f23312e
            java.lang.Object r1 = r1.get(r10)
            com.google.ads.interactivemedia.v3.internal.aea r1 = (com.google.ads.interactivemedia.p367v3.internal.aea) r1
            android.util.SparseArray r5 = r0.f23311d
            int r6 = r1.f20402b
            java.lang.Object r5 = r5.get(r6)
            r6 = r5
            com.google.ads.interactivemedia.v3.internal.aeb r6 = (com.google.ads.interactivemedia.p367v3.internal.aeb) r6
            boolean r5 = r6.f20411h
            if (r5 == 0) goto L_0x00b5
            com.google.ads.interactivemedia.v3.internal.aef r5 = r0.f23313f
            boolean r5 = r5.mo14576d(r2)
            if (r5 != 0) goto L_0x00b0
            return
        L_0x00b0:
            com.google.ads.interactivemedia.v3.internal.aef r5 = r0.f23313f
            r5.mo14575c(r2)
        L_0x00b5:
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            int r5 = r6.f20413j
            boolean r2 = r2.mo14576d(r5)
            if (r2 != 0) goto L_0x00c0
            return
        L_0x00c0:
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            int r5 = r6.f20413j
            int r9 = r2.mo14578f(r5)
            boolean r2 = r6.f20412i
            r5 = 1
            if (r2 != 0) goto L_0x00f3
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            boolean r2 = r2.mo14576d(r5)
            if (r2 != 0) goto L_0x00d6
            return
        L_0x00d6:
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            boolean r2 = r2.mo14577e()
            if (r2 == 0) goto L_0x00f1
            com.google.ads.interactivemedia.v3.internal.aef r11 = r0.f23313f
            boolean r11 = r11.mo14576d(r5)
            if (r11 != 0) goto L_0x00e7
            return
        L_0x00e7:
            com.google.ads.interactivemedia.v3.internal.aef r11 = r0.f23313f
            boolean r11 = r11.mo14577e()
            r13 = r11
            r12 = 1
            r11 = r2
            goto L_0x00f6
        L_0x00f1:
            r11 = r2
            goto L_0x00f4
        L_0x00f3:
            r11 = 0
        L_0x00f4:
            r12 = 0
            r13 = 0
        L_0x00f6:
            int r2 = r0.f23316i
            if (r2 != r3) goto L_0x00fc
            r14 = 1
            goto L_0x00fd
        L_0x00fc:
            r14 = 0
        L_0x00fd:
            if (r14 == 0) goto L_0x0110
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            boolean r2 = r2.mo14579g()
            if (r2 != 0) goto L_0x0108
            return
        L_0x0108:
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            int r2 = r2.mo14580h()
            r15 = r2
            goto L_0x0111
        L_0x0110:
            r15 = 0
        L_0x0111:
            int r2 = r6.f20414k
            if (r2 != 0) goto L_0x0145
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            int r3 = r6.f20415l
            boolean r2 = r2.mo14576d(r3)
            if (r2 != 0) goto L_0x0120
            return
        L_0x0120:
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            int r3 = r6.f20415l
            int r2 = r2.mo14578f(r3)
            boolean r1 = r1.f20403c
            if (r1 == 0) goto L_0x0142
            if (r11 != 0) goto L_0x0142
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            boolean r1 = r1.mo14579g()
            if (r1 != 0) goto L_0x0137
            return
        L_0x0137:
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            int r1 = r1.mo14581i()
            r17 = r1
            r16 = r2
            goto L_0x0183
        L_0x0142:
            r16 = r2
            goto L_0x0181
        L_0x0145:
            if (r2 != r5) goto L_0x017f
            boolean r2 = r6.f20416m
            if (r2 != 0) goto L_0x017f
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            boolean r2 = r2.mo14579g()
            if (r2 != 0) goto L_0x0154
            return
        L_0x0154:
            com.google.ads.interactivemedia.v3.internal.aef r2 = r0.f23313f
            int r2 = r2.mo14581i()
            boolean r1 = r1.f20403c
            if (r1 == 0) goto L_0x0178
            if (r11 != 0) goto L_0x0178
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            boolean r1 = r1.mo14579g()
            if (r1 != 0) goto L_0x0169
            return
        L_0x0169:
            com.google.ads.interactivemedia.v3.internal.aef r1 = r0.f23313f
            int r1 = r1.mo14581i()
            r19 = r1
            r18 = r2
            r16 = 0
            r17 = 0
            goto L_0x0187
        L_0x0178:
            r18 = r2
            r16 = 0
            r17 = 0
            goto L_0x0185
        L_0x017f:
            r16 = 0
        L_0x0181:
            r17 = 0
        L_0x0183:
            r18 = 0
        L_0x0185:
            r19 = 0
        L_0x0187:
            com.google.ads.interactivemedia.v3.internal.on r5 = r0.f23321n
            r5.mo16237c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.f23318k = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7178oo.mo16244f(byte[], int, int):void");
    }

    /* renamed from: g */
    public final boolean mo16245g(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f23316i == 9 || (this.f23310c && C7177on.m21376e(this.f23321n, this.f23320m))) {
            if (z && this.f23322o) {
                long j2 = this.f23317j;
                boolean z4 = this.f23325r;
                long j3 = this.f23323p;
                this.f23308a.mo16103b(this.f23324q, z4 ? 1 : 0, (int) (j2 - j3), i + ((int) (j - j2)), (C7072kq) null);
            }
            this.f23323p = this.f23317j;
            this.f23324q = this.f23319l;
            this.f23325r = false;
            this.f23322o = true;
        }
        boolean d = this.f23309b ? this.f23321n.mo16238d() : z2;
        boolean z5 = this.f23325r;
        int i2 = this.f23316i;
        if (i2 == 5 || (d && i2 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.f23325r = z6;
        return z6;
    }
}
