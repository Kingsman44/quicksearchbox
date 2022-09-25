package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Looper;

/* renamed from: com.google.ads.interactivemedia.v3.internal.va */
/* compiled from: PG */
public class C7353va implements C7073kr {

    /* renamed from: A */
    private C6864cy f23997A;

    /* renamed from: B */
    private C6864cy f23998B;

    /* renamed from: C */
    private C6864cy f23999C;

    /* renamed from: D */
    private int f24000D;

    /* renamed from: E */
    private boolean f24001E;

    /* renamed from: F */
    private boolean f24002F;

    /* renamed from: G */
    private long f24003G;

    /* renamed from: H */
    private boolean f24004H;

    /* renamed from: I */
    private C7037ji f24005I;

    /* renamed from: a */
    private final C7349ux f24006a;

    /* renamed from: b */
    private final C7350uy f24007b = new C7350uy();

    /* renamed from: c */
    private final Looper f24008c;

    /* renamed from: d */
    private final C7036jh f24009d;

    /* renamed from: e */
    private final C7033je f24010e;

    /* renamed from: f */
    private C7351uz f24011f;

    /* renamed from: g */
    private C6864cy f24012g;

    /* renamed from: h */
    private int f24013h = 1000;

    /* renamed from: i */
    private int[] f24014i = new int[1000];

    /* renamed from: j */
    private long[] f24015j = new long[1000];

    /* renamed from: k */
    private int[] f24016k = new int[1000];

    /* renamed from: l */
    private int[] f24017l = new int[1000];

    /* renamed from: m */
    private long[] f24018m = new long[1000];

    /* renamed from: n */
    private C7072kq[] f24019n = new C7072kq[1000];

    /* renamed from: o */
    private C6864cy[] f24020o = new C6864cy[1000];

    /* renamed from: p */
    private int f24021p;

    /* renamed from: q */
    private int f24022q;

    /* renamed from: r */
    private int f24023r;

    /* renamed from: s */
    private int f24024s;

    /* renamed from: t */
    private long f24025t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f24026u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f24027v = Long.MIN_VALUE;

    /* renamed from: w */
    private boolean f24028w;

    /* renamed from: x */
    private boolean f24029x = true;

    /* renamed from: y */
    private boolean f24030y = true;

    /* renamed from: z */
    private boolean f24031z;

    public C7353va(acc acc, Looper looper, C7036jh jhVar, C7033je jeVar) {
        this.f24008c = looper;
        this.f24009d = jhVar;
        this.f24010e = jeVar;
        this.f24006a = new C7349ux(acc);
    }

    /* renamed from: M */
    private final synchronized void m22072M() {
        this.f24024s = 0;
        this.f24006a.mo16593c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        return -3;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int m22073N(com.google.ads.interactivemedia.p367v3.internal.C6865cz r7, com.google.ads.interactivemedia.p367v3.internal.C7024iw r8, boolean r9, boolean r10, com.google.ads.interactivemedia.p367v3.internal.C7350uy r11) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r8.f22516c = r0     // Catch:{ all -> 0x008c }
            boolean r0 = r6.m22081V()     // Catch:{ all -> 0x008c }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002e
            if (r10 != 0) goto L_0x0028
            boolean r10 = r6.f24028w     // Catch:{ all -> 0x008c }
            if (r10 == 0) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            com.google.ads.interactivemedia.v3.internal.cy r8 = r6.f23998B     // Catch:{ all -> 0x008c }
            if (r8 == 0) goto L_0x0026
            if (r9 != 0) goto L_0x001e
            com.google.ads.interactivemedia.v3.internal.cy r9 = r6.f24012g     // Catch:{ all -> 0x008c }
            if (r8 == r9) goto L_0x0026
        L_0x001e:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r8)     // Catch:{ all -> 0x008c }
            r6.m22082W(r8, r7)     // Catch:{ all -> 0x008c }
            monitor-exit(r6)
            return r1
        L_0x0026:
            monitor-exit(r6)
            return r2
        L_0x0028:
            r7 = 4
            r8.mo16035f(r7)     // Catch:{ all -> 0x008c }
            monitor-exit(r6)
            return r3
        L_0x002e:
            int r10 = r6.f24024s     // Catch:{ all -> 0x008c }
            int r10 = r6.m22087ab(r10)     // Catch:{ all -> 0x008c }
            if (r9 != 0) goto L_0x0083
            com.google.ads.interactivemedia.v3.internal.cy[] r9 = r6.f24020o     // Catch:{ all -> 0x008c }
            r9 = r9[r10]     // Catch:{ all -> 0x008c }
            com.google.ads.interactivemedia.v3.internal.cy r0 = r6.f24012g     // Catch:{ all -> 0x008c }
            if (r9 == r0) goto L_0x003f
            goto L_0x0083
        L_0x003f:
            boolean r7 = r6.m22083X(r10)     // Catch:{ all -> 0x008c }
            r9 = 1
            if (r7 != 0) goto L_0x004a
            r8.f22516c = r9     // Catch:{ all -> 0x008c }
            monitor-exit(r6)
            return r2
        L_0x004a:
            int[] r7 = r6.f24017l     // Catch:{ all -> 0x008c }
            r7 = r7[r10]     // Catch:{ all -> 0x008c }
            r8.mo16035f(r7)     // Catch:{ all -> 0x008c }
            long[] r7 = r6.f24018m     // Catch:{ all -> 0x008c }
            r0 = r7[r10]     // Catch:{ all -> 0x008c }
            r8.f22517d = r0     // Catch:{ all -> 0x008c }
            long r4 = r6.f24025t     // Catch:{ all -> 0x008c }
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0062
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.mo16036g(r7)     // Catch:{ all -> 0x008c }
        L_0x0062:
            boolean r7 = r8.mo16043j()     // Catch:{ all -> 0x008c }
            if (r7 == 0) goto L_0x006a
            monitor-exit(r6)
            return r3
        L_0x006a:
            int[] r7 = r6.f24016k     // Catch:{ all -> 0x008c }
            r7 = r7[r10]     // Catch:{ all -> 0x008c }
            r11.f23993a = r7     // Catch:{ all -> 0x008c }
            long[] r7 = r6.f24015j     // Catch:{ all -> 0x008c }
            r0 = r7[r10]     // Catch:{ all -> 0x008c }
            r11.f23994b = r0     // Catch:{ all -> 0x008c }
            com.google.ads.interactivemedia.v3.internal.kq[] r7 = r6.f24019n     // Catch:{ all -> 0x008c }
            r7 = r7[r10]     // Catch:{ all -> 0x008c }
            r11.f23995c = r7     // Catch:{ all -> 0x008c }
            int r7 = r6.f24024s     // Catch:{ all -> 0x008c }
            int r7 = r7 + r9
            r6.f24024s = r7     // Catch:{ all -> 0x008c }
            monitor-exit(r6)
            return r3
        L_0x0083:
            com.google.ads.interactivemedia.v3.internal.cy[] r8 = r6.f24020o     // Catch:{ all -> 0x008c }
            r8 = r8[r10]     // Catch:{ all -> 0x008c }
            r6.m22082W(r8, r7)     // Catch:{ all -> 0x008c }
            monitor-exit(r6)
            return r1
        L_0x008c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7353va.m22073N(com.google.ads.interactivemedia.v3.internal.cz, com.google.ads.interactivemedia.v3.internal.iw, boolean, boolean, com.google.ads.interactivemedia.v3.internal.uy):int");
    }

    /* renamed from: O */
    private final synchronized boolean m22074O(C6864cy cyVar) {
        this.f24030y = false;
        if (aeu.m18533c(cyVar, this.f23998B)) {
            return false;
        }
        if (aeu.m18533c(cyVar, this.f23999C)) {
            this.f23998B = this.f23999C;
        } else {
            this.f23998B = cyVar;
        }
        C6864cy cyVar2 = this.f23998B;
        this.f24001E = adz.m18352d(cyVar2.f21812l, cyVar2.f21809i);
        this.f24002F = false;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long m22075P(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r12 = r9.f24021p     // Catch:{ all -> 0x002f }
            r0 = -1
            if (r12 == 0) goto L_0x002d
            long[] r2 = r9.f24018m     // Catch:{ all -> 0x002f }
            int r4 = r9.f24023r     // Catch:{ all -> 0x002f }
            r5 = r2[r4]     // Catch:{ all -> 0x002f }
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r13 == 0) goto L_0x001a
            int r13 = r9.f24024s     // Catch:{ all -> 0x002f }
            if (r13 == r12) goto L_0x001a
            int r12 = r13 + 1
        L_0x001a:
            r5 = r12
            r8 = 0
            r3 = r9
            r6 = r10
            int r10 = r3.m22084Y(r4, r5, r6, r8)     // Catch:{ all -> 0x002f }
            r11 = -1
            if (r10 != r11) goto L_0x0027
            monitor-exit(r9)
            return r0
        L_0x0027:
            long r10 = r9.m22085Z(r10)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)
            return r10
        L_0x002d:
            monitor-exit(r9)
            return r0
        L_0x002f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7353va.m22075P(long, boolean, boolean):long");
    }

    /* renamed from: Q */
    private final synchronized long m22076Q() {
        int i = this.f24021p;
        if (i == 0) {
            return -1;
        }
        return m22085Z(i);
    }

    /* renamed from: R */
    private final void m22077R() {
        if (this.f24005I != null) {
            this.f24005I = null;
            this.f24012g = null;
        }
    }

    /* renamed from: S */
    private final synchronized void m22078S(long j, int i, long j2, int i2, C7072kq kqVar) {
        int i3 = this.f24021p;
        if (i3 > 0) {
            int ab = m22087ab(i3 - 1);
            ary.m19462o(this.f24015j[ab] + ((long) this.f24016k[ab]) <= j2);
        }
        this.f24028w = (536870912 & i) != 0;
        this.f24027v = Math.max(this.f24027v, j);
        int i4 = this.f24021p;
        int ab2 = m22087ab(i4);
        this.f24018m[ab2] = j;
        long[] jArr = this.f24015j;
        jArr[ab2] = j2;
        this.f24016k[ab2] = i2;
        this.f24017l[ab2] = i;
        this.f24019n[ab2] = kqVar;
        C6864cy[] cyVarArr = this.f24020o;
        C6864cy cyVar = this.f23998B;
        cyVarArr[ab2] = cyVar;
        this.f24014i[ab2] = this.f24000D;
        this.f23999C = cyVar;
        int i5 = i4 + 1;
        this.f24021p = i5;
        int i6 = this.f24013h;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr2 = new long[i7];
            long[] jArr3 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            C7072kq[] kqVarArr = new C7072kq[i7];
            C6864cy[] cyVarArr2 = new C6864cy[i7];
            int i8 = this.f24023r;
            int i9 = i6 - i8;
            System.arraycopy(jArr, i8, jArr2, 0, i9);
            System.arraycopy(this.f24018m, this.f24023r, jArr3, 0, i9);
            System.arraycopy(this.f24017l, this.f24023r, iArr2, 0, i9);
            System.arraycopy(this.f24016k, this.f24023r, iArr3, 0, i9);
            System.arraycopy(this.f24019n, this.f24023r, kqVarArr, 0, i9);
            System.arraycopy(this.f24020o, this.f24023r, cyVarArr2, 0, i9);
            System.arraycopy(this.f24014i, this.f24023r, iArr, 0, i9);
            int i10 = this.f24023r;
            System.arraycopy(this.f24015j, 0, jArr2, i9, i10);
            System.arraycopy(this.f24018m, 0, jArr3, i9, i10);
            System.arraycopy(this.f24017l, 0, iArr2, i9, i10);
            System.arraycopy(this.f24016k, 0, iArr3, i9, i10);
            System.arraycopy(this.f24019n, 0, kqVarArr, i9, i10);
            System.arraycopy(this.f24020o, 0, cyVarArr2, i9, i10);
            System.arraycopy(this.f24014i, 0, iArr, i9, i10);
            this.f24015j = jArr2;
            this.f24018m = jArr3;
            this.f24017l = iArr2;
            this.f24016k = iArr3;
            this.f24019n = kqVarArr;
            this.f24020o = cyVarArr2;
            this.f24014i = iArr;
            this.f24023r = 0;
            this.f24013h = i7;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r7 <= r6.f24026u) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m22079T(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f24021p     // Catch:{ all -> 0x0041 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            long r3 = r6.f24026u     // Catch:{ all -> 0x0041 }
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            monitor-exit(r6)
            if (r0 <= 0) goto L_0x000f
            return r1
        L_0x000f:
            return r2
        L_0x0010:
            long r3 = r6.mo16633v()     // Catch:{ all -> 0x0041 }
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            int r0 = r6.f24021p     // Catch:{ all -> 0x0041 }
            int r2 = r0 + -1
            int r2 = r6.m22087ab(r2)     // Catch:{ all -> 0x0041 }
        L_0x0020:
            int r3 = r6.f24024s     // Catch:{ all -> 0x0041 }
            if (r0 <= r3) goto L_0x0037
            long[] r3 = r6.f24018m     // Catch:{ all -> 0x0041 }
            r4 = r3[r2]     // Catch:{ all -> 0x0041 }
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0037
            int r0 = r0 + -1
            int r2 = r2 + -1
            r3 = -1
            if (r2 != r3) goto L_0x0020
            int r2 = r6.f24013h     // Catch:{ all -> 0x0041 }
            int r2 = r2 + r3
            goto L_0x0020
        L_0x0037:
            int r7 = r6.f24022q     // Catch:{ all -> 0x0041 }
            int r7 = r7 + r0
            r6.m22080U(r7)     // Catch:{ all -> 0x0041 }
            monitor-exit(r6)
            return r1
        L_0x003f:
            monitor-exit(r6)
            return r2
        L_0x0041:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0045
        L_0x0044:
            throw r7
        L_0x0045:
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7353va.m22079T(long):boolean");
    }

    /* renamed from: U */
    private final long m22080U(int i) {
        int m = mo16624m() - i;
        boolean z = true;
        ary.m19462o(m >= 0 && m <= this.f24021p - this.f24024s);
        int i2 = this.f24021p - m;
        this.f24021p = i2;
        this.f24027v = Math.max(this.f24026u, m22086aa(i2));
        if (m != 0 || !this.f24028w) {
            z = false;
        }
        this.f24028w = z;
        int i3 = this.f24021p;
        if (i3 == 0) {
            return 0;
        }
        int ab = m22087ab(i3 - 1);
        return this.f24015j[ab] + ((long) this.f24016k[ab]);
    }

    /* renamed from: V */
    private final boolean m22081V() {
        return this.f24024s != this.f24021p;
    }

    /* renamed from: W */
    private final void m22082W(C6864cy cyVar, C6865cz czVar) {
        C7031jc jcVar;
        C6864cy cyVar2 = this.f24012g;
        if (cyVar2 == null) {
            jcVar = null;
        } else {
            jcVar = cyVar2.f21815o;
        }
        this.f24012g = cyVar;
        C7031jc jcVar2 = cyVar.f21815o;
        czVar.f21827a = cyVar.mo15638c(this.f24009d.mo16069a(cyVar));
        czVar.f21828b = this.f24005I;
        if (cyVar2 == null || !aeu.m18533c(jcVar, jcVar2)) {
            C7037ji d = this.f24009d.mo16072d(cyVar);
            this.f24005I = d;
            czVar.f21828b = d;
        }
    }

    /* renamed from: X */
    private final boolean m22083X(int i) {
        if (this.f24005I != null) {
            return (this.f24017l[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    /* renamed from: Y */
    private final int m22084Y(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f24018m[i] <= j; i4++) {
            if (!z || (this.f24017l[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.f24013h) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: Z */
    private final long m22085Z(int i) {
        this.f24026u = Math.max(this.f24026u, m22086aa(i));
        int i2 = this.f24021p - i;
        this.f24021p = i2;
        this.f24022q += i;
        int i3 = this.f24023r + i;
        this.f24023r = i3;
        int i4 = this.f24013h;
        if (i3 >= i4) {
            i3 -= i4;
            this.f24023r = i3;
        }
        int i5 = this.f24024s - i;
        this.f24024s = i5;
        if (i5 < 0) {
            this.f24024s = 0;
        }
        if (i2 != 0) {
            return this.f24015j[i3];
        }
        if (i3 != 0) {
            i4 = i3;
        }
        int i6 = i4 - 1;
        return this.f24015j[i6] + ((long) this.f24016k[i6]);
    }

    /* renamed from: aa */
    private final long m22086aa(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int ab = m22087ab(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f24018m[ab]);
            if ((this.f24017l[ab] & 1) != 0) {
                break;
            }
            ab--;
            if (ab == -1) {
                ab = this.f24013h - 1;
            }
        }
        return j;
    }

    /* renamed from: ab */
    private final int m22087ab(int i) {
        int i2 = this.f24023r + i;
        int i3 = this.f24013h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return false;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo16606A(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.m22072M()     // Catch:{ all -> 0x001b }
            int r0 = r3.f24022q     // Catch:{ all -> 0x001b }
            if (r4 < r0) goto L_0x0018
            int r1 = r3.f24021p     // Catch:{ all -> 0x001b }
            int r1 = r1 + r0
            if (r4 <= r1) goto L_0x000e
            goto L_0x0018
        L_0x000e:
            r1 = -9223372036854775808
            r3.f24025t = r1     // Catch:{ all -> 0x001b }
            int r4 = r4 - r0
            r3.f24024s = r4     // Catch:{ all -> 0x001b }
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x0018:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x001b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7353va.mo16606A(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        return false;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo16607B(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m22072M()     // Catch:{ all -> 0x003d }
            int r0 = r8.f24024s     // Catch:{ all -> 0x003d }
            int r2 = r8.m22087ab(r0)     // Catch:{ all -> 0x003d }
            boolean r1 = r8.m22081V()     // Catch:{ all -> 0x003d }
            r7 = 0
            if (r1 == 0) goto L_0x003b
            long[] r1 = r8.f24018m     // Catch:{ all -> 0x003d }
            r3 = r1[r2]     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x003b
            long r3 = r8.f24027v     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x003b
        L_0x0021:
            int r11 = r8.f24021p     // Catch:{ all -> 0x003d }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m22084Y(r2, r3, r4, r6)     // Catch:{ all -> 0x003d }
            r0 = -1
            if (r11 != r0) goto L_0x0031
            monitor-exit(r8)
            return r7
        L_0x0031:
            r8.f24025t = r9     // Catch:{ all -> 0x003d }
            int r9 = r8.f24024s     // Catch:{ all -> 0x003d }
            int r9 = r9 + r11
            r8.f24024s = r9     // Catch:{ all -> 0x003d }
            monitor-exit(r8)
            r9 = 1
            return r9
        L_0x003b:
            monitor-exit(r8)
            return r7
        L_0x003d:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7353va.mo16607B(long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r9 != -1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        return 0;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo16608C(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f24024s     // Catch:{ all -> 0x0038 }
            int r2 = r8.m22087ab(r0)     // Catch:{ all -> 0x0038 }
            boolean r1 = r8.m22081V()     // Catch:{ all -> 0x0038 }
            r7 = 0
            if (r1 == 0) goto L_0x0036
            long[] r1 = r8.f24018m     // Catch:{ all -> 0x0038 }
            r3 = r1[r2]     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0017
            goto L_0x0036
        L_0x0017:
            long r3 = r8.f24027v     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0025
            if (r11 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            int r9 = r8.f24021p     // Catch:{ all -> 0x0038 }
            int r9 = r9 - r0
            monitor-exit(r8)
            return r9
        L_0x0025:
            int r11 = r8.f24021p     // Catch:{ all -> 0x0038 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m22084Y(r2, r3, r4, r6)     // Catch:{ all -> 0x0038 }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0035
            return r7
        L_0x0035:
            return r9
        L_0x0036:
            monitor-exit(r8)
            return r7
        L_0x0038:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7353va.mo16608C(long, boolean):int");
    }

    /* renamed from: D */
    public final synchronized void mo16609D(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f24024s + i <= this.f24021p) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ary.m19462o(z);
        this.f24024s += i;
    }

    /* renamed from: E */
    public final void mo16610E(long j, boolean z, boolean z2) {
        this.f24006a.mo16595e(m22075P(j, false, z2));
    }

    /* renamed from: F */
    public final void mo16611F() {
        this.f24006a.mo16595e(mo16617L());
    }

    /* renamed from: G */
    public final void mo16612G() {
        this.f24006a.mo16595e(m22076Q());
    }

    /* renamed from: H */
    public final void mo16613H(long j) {
        if (this.f24003G != j) {
            this.f24003G = j;
            mo16615J();
        }
    }

    /* renamed from: I */
    public final void mo16614I(C7351uz uzVar) {
        this.f24011f = uzVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo16615J() {
        this.f24031z = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public C6864cy mo16616K(C6864cy cyVar) {
        if (this.f24003G == 0 || cyVar.f21816p == Long.MAX_VALUE) {
            return cyVar;
        }
        C6863cx a = cyVar.mo15636a();
        a.mo15634ai(cyVar.f21816p + this.f24003G);
        return a.mo15625a();
    }

    /* renamed from: L */
    public final synchronized long mo16617L() {
        int i = this.f24024s;
        if (i == 0) {
            return -1;
        }
        return m22085Z(i);
    }

    /* renamed from: a */
    public final void mo16102a(C6864cy cyVar) {
        C6864cy K = mo16616K(cyVar);
        this.f24031z = false;
        this.f23997A = cyVar;
        boolean O = m22074O(K);
        C7351uz uzVar = this.f24011f;
        if (uzVar != null && O) {
            uzVar.mo16578K();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16103b(long r12, int r14, int r15, int r16, com.google.ads.interactivemedia.p367v3.internal.C7072kq r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f24031z
            if (r0 == 0) goto L_0x000d
            com.google.ads.interactivemedia.v3.internal.cy r0 = r8.f23997A
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r0)
            r11.mo16102a(r0)
        L_0x000d:
            r0 = r14 & 1
            boolean r1 = r8.f24029x
            r2 = 0
            if (r1 == 0) goto L_0x0019
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            r8.f24029x = r2
        L_0x0019:
            long r3 = r8.f24003G
            long r3 = r3 + r12
            boolean r1 = r8.f24001E
            if (r1 == 0) goto L_0x0050
            long r5 = r8.f24025t
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0027
            return
        L_0x0027:
            if (r0 != 0) goto L_0x0050
            boolean r1 = r8.f24002F
            if (r1 != 0) goto L_0x004c
            com.google.ads.interactivemedia.v3.internal.cy r1 = r8.f23998B
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = java.lang.String.valueOf(r1)
            r5.length()
            java.lang.String r5 = "Overriding unexpected non-sync sample for format: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r5.concat(r1)
            java.lang.String r5 = "SampleQueue"
            android.util.Log.w(r5, r1)
            r1 = 1
            r8.f24002F = r1
        L_0x004c:
            r1 = r14 | 1
            r5 = r1
            goto L_0x0051
        L_0x0050:
            r5 = r14
        L_0x0051:
            boolean r1 = r8.f24004H
            if (r1 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0061
            boolean r0 = r11.m22079T(r3)
            if (r0 != 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            r8.f24004H = r2
            goto L_0x0062
        L_0x0061:
            return
        L_0x0062:
            com.google.ads.interactivemedia.v3.internal.ux r0 = r8.f24006a
            long r0 = r0.mo16596f()
            r6 = r15
            long r9 = (long) r6
            long r0 = r0 - r9
            r2 = r16
            long r9 = (long) r2
            long r9 = r0 - r9
            r0 = r11
            r1 = r3
            r3 = r5
            r4 = r9
            r7 = r17
            r0.m22078S(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7353va.mo16103b(long, int, int, int, com.google.ads.interactivemedia.v3.internal.kq):void");
    }

    /* renamed from: c */
    public final int mo16104c(abu abu, int i, boolean z) {
        return atv.m19625q(this, abu, i, z);
    }

    /* renamed from: d */
    public final void mo16105d(aee aee, int i) {
        atv.m19626r(this, aee, i);
    }

    /* renamed from: e */
    public final int mo16106e(abu abu, int i, boolean z) {
        return this.f24006a.mo16597g(abu, i, z);
    }

    /* renamed from: f */
    public final void mo16107f(aee aee, int i) {
        this.f24006a.mo16598h(aee, i);
    }

    /* renamed from: g */
    public final void mo16618g() {
        mo16620i(true);
        m22077R();
    }

    /* renamed from: h */
    public final void mo16619h() {
        mo16620i(false);
    }

    /* renamed from: i */
    public final void mo16620i(boolean z) {
        this.f24006a.mo16591a();
        this.f24021p = 0;
        this.f24022q = 0;
        this.f24023r = 0;
        this.f24024s = 0;
        this.f24029x = true;
        this.f24025t = Long.MIN_VALUE;
        this.f24026u = Long.MIN_VALUE;
        this.f24027v = Long.MIN_VALUE;
        this.f24028w = false;
        this.f23999C = null;
        if (z) {
            this.f23997A = null;
            this.f23998B = null;
            this.f24030y = true;
        }
    }

    /* renamed from: j */
    public final void mo16621j(long j) {
        this.f24025t = j;
    }

    /* renamed from: k */
    public final void mo16622k(int i) {
        this.f24000D = i;
    }

    /* renamed from: l */
    public final void mo16623l() {
        this.f24004H = true;
    }

    /* renamed from: m */
    public final int mo16624m() {
        return this.f24022q + this.f24021p;
    }

    /* renamed from: n */
    public final void mo16625n(int i) {
        this.f24006a.mo16592b(m22080U(i));
    }

    /* renamed from: o */
    public final void mo16626o() {
        mo16612G();
        m22077R();
    }

    /* renamed from: p */
    public final void mo16627p() {
        C7037ji jiVar = this.f24005I;
        if (jiVar != null) {
            C7032jd a = jiVar.mo16073a();
            ary.m19467t(a);
            throw a;
        }
    }

    /* renamed from: q */
    public final int mo16628q() {
        return this.f24022q;
    }

    /* renamed from: r */
    public final int mo16629r() {
        return this.f24022q + this.f24024s;
    }

    /* renamed from: s */
    public final synchronized int mo16630s() {
        return m22081V() ? this.f24014i[m22087ab(this.f24024s)] : this.f24000D;
    }

    /* renamed from: t */
    public final synchronized C6864cy mo16631t() {
        if (this.f24030y) {
            return null;
        }
        return this.f23998B;
    }

    /* renamed from: u */
    public final synchronized long mo16632u() {
        return this.f24027v;
    }

    /* renamed from: v */
    public final synchronized long mo16633v() {
        return Math.max(this.f24026u, m22086aa(this.f24024s));
    }

    /* renamed from: w */
    public final synchronized boolean mo16634w() {
        return this.f24028w;
    }

    /* renamed from: x */
    public final synchronized long mo16635x() {
        if (this.f24021p == 0) {
            return Long.MIN_VALUE;
        }
        return this.f24018m[this.f24023r];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        return r1;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo16636y(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m22081V()     // Catch:{ all -> 0x0033 }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.f24028w     // Catch:{ all -> 0x0033 }
            if (r4 != 0) goto L_0x001b
            com.google.ads.interactivemedia.v3.internal.cy r4 = r3.f23998B     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r4 == 0) goto L_0x001a
            com.google.ads.interactivemedia.v3.internal.cy r2 = r3.f24012g     // Catch:{ all -> 0x0033 }
            if (r4 == r2) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r3)
            return r0
        L_0x001a:
            r1 = 0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            int r4 = r3.f24024s     // Catch:{ all -> 0x0033 }
            int r4 = r3.m22087ab(r4)     // Catch:{ all -> 0x0033 }
            com.google.ads.interactivemedia.v3.internal.cy[] r0 = r3.f24020o     // Catch:{ all -> 0x0033 }
            r0 = r0[r4]     // Catch:{ all -> 0x0033 }
            com.google.ads.interactivemedia.v3.internal.cy r2 = r3.f24012g     // Catch:{ all -> 0x0033 }
            if (r0 == r2) goto L_0x002d
            monitor-exit(r3)
            return r1
        L_0x002d:
            boolean r4 = r3.m22083X(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)
            return r4
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7353va.mo16636y(boolean):boolean");
    }

    /* renamed from: z */
    public final int mo16637z(C6865cz czVar, C7024iw iwVar, boolean z, boolean z2) {
        int N = m22073N(czVar, iwVar, z, z2, this.f24007b);
        if (N != -4) {
            return N;
        }
        if (iwVar.mo16032c() || iwVar.mo16043j()) {
            return -4;
        }
        this.f24006a.mo16594d(iwVar, this.f24007b);
        return -4;
    }
}
