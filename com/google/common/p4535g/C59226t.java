package com.google.common.p4535g;

import com.google.common.base.C58890d;
import com.google.common.base.C58903m;
import com.google.common.base.C58912v;
import java.io.Serializable;
import java.util.Collection;

/* renamed from: com.google.common.g.t */
/* compiled from: PG */
public final class C59226t implements Comparable, Serializable {

    /* renamed from: a */
    public static final C59226t[] f157329a = new C59226t[6];

    /* renamed from: c */
    private static final int[] f157330c = new int[1024];

    /* renamed from: d */
    private static final int[] f157331d = new int[1024];

    /* renamed from: e */
    private static final C59226t f157332e = new C59226t(0);

    /* renamed from: f */
    private static final C58912v f157333f = new C58903m('0');

    /* renamed from: b */
    public final long f157334b;

    static {
        m91925P(0, 0, 0, 0, 0, 0);
        m91925P(0, 0, 0, 1, 0, 1);
        m91925P(0, 0, 0, 2, 0, 2);
        m91925P(0, 0, 0, 3, 0, 3);
        for (int i = 0; i < 6; i++) {
            f157329a[i] = m91936q(i);
        }
    }

    public C59226t() {
        this.f157334b = 0;
    }

    public C59226t(long j) {
        this.f157334b = j;
    }

    /* renamed from: I */
    public static boolean m91918I(long j, long j2) {
        return j + Long.MIN_VALUE >= j2 + Long.MIN_VALUE;
    }

    /* renamed from: J */
    public static boolean m91919J(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    /* renamed from: K */
    public static boolean m91920K(long j, long j2) {
        return j + Long.MIN_VALUE <= j2 + Long.MIN_VALUE;
    }

    /* renamed from: L */
    public static boolean m91921L(long j, long j2) {
        return j + Long.MIN_VALUE < j2 + Long.MIN_VALUE;
    }

    /* renamed from: N */
    private static final int m91923N(int i, int i2, int i3, int i4) {
        int i5 = i3 * 4;
        return f157330c[i4 + (((i >> i5) & 15) << 6) + (((i2 >> i5) & 15) << 2)];
    }

    /* renamed from: O */
    private static final long m91924O(long j, int i, int i2) {
        int i3 = i & 3;
        return j | ((((long) i2) >> 2) << ((i3 + i3) * 4));
    }

    /* renamed from: P */
    private static void m91925P(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == 4) {
            int i7 = ((i2 << 4) + i3) << 2;
            int i8 = i5 << 2;
            f157330c[i7 + i4] = i8 + i6;
            f157331d[i8 + i4] = i7 + i6;
            return;
        }
        int i9 = i + 1;
        int i10 = i2 + i2;
        int i11 = i3 + i3;
        int i12 = i5 << 2;
        for (int i13 = 0; i13 < 4; i13++) {
            int i14 = C59222p.f157313e[i6][i13];
            int i15 = i9;
            int i16 = i4;
            m91925P(i15, (i14 >>> 1) + i10, i11 + (i14 & 1), i16, i12 + i13, i6 ^ C59222p.m91899e(i13));
        }
    }

    /* renamed from: Q */
    private static void m91926Q(int i, int i2, C59214h hVar) {
        double a = C59164cc.f157204f.mo56541a(i, i2);
        double a2 = C59164cc.f157204f.mo56541a(i + i2, i2);
        hVar.f157289a = a;
        hVar.f157290b = a2;
    }

    /* renamed from: d */
    static int m91927d(long j) {
        return (int) (j >>> 33);
    }

    /* renamed from: e */
    static int m91928e(long j) {
        return (int) ((j >>> 2) & 2147483647L);
    }

    /* renamed from: f */
    static int m91929f(long j) {
        return (int) (j & 3);
    }

    /* renamed from: g */
    public static int m91930g(int i) {
        return 1 << (30 - i);
    }

    /* renamed from: i */
    public static long m91931i(int i) {
        return (((long) i) << 61) + m91932k(0);
    }

    /* renamed from: k */
    public static long m91932k(int i) {
        int i2 = 30 - i;
        return 1 << (i2 + i2);
    }

    /* renamed from: l */
    public static long m91933l(long j) {
        return j + (Long.lowestOneBit(j) - 1);
    }

    /* renamed from: m */
    public static long m91934m(long j) {
        return j - (Long.lowestOneBit(j) - 1);
    }

    /* renamed from: o */
    static C59215i m91935o(int i, int i2, int i3) {
        C59215i iVar = new C59215i();
        int g = m91930g(i3);
        m91926Q(i, g, iVar.f157291a);
        m91926Q(i2, g, iVar.f157292b);
        return iVar;
    }

    /* renamed from: q */
    public static C59226t m91936q(int i) {
        return new C59226t(m91931i(i));
    }

    /* renamed from: r */
    public static C59226t m91937r(int i, int i2, int i3) {
        long j = ((long) i) << 28;
        int i4 = i & 1;
        for (int i5 = 7; i5 >= 4; i5--) {
            int N = m91923N(i2, i3, i5, i4);
            j = m91924O(j, i5, N);
            i4 = N & 3;
        }
        long j2 = 0;
        for (int i6 = 3; i6 >= 0; i6--) {
            int N2 = m91923N(i2, i3, i6, i4);
            j2 = m91924O(j2, i6, N2);
            i4 = N2 & 3;
        }
        long j3 = (j << 32) + j2;
        return new C59226t(j3 + j3 + 1);
    }

    /* renamed from: s */
    public static C59226t m91938s(int i, int i2, int i3, boolean z) {
        if (z) {
            return m91937r(i, i2, i3);
        }
        int max = Math.max(-1, Math.min(1073741824, i2));
        int max2 = Math.max(-1, Math.min(1073741824, i3));
        double d = C59222p.f157311c + 1.0d;
        double d2 = -d;
        double d3 = (double) ((max + max) - 1073741823);
        Double.isNaN(d3);
        double max3 = Math.max(d2, Math.min(d, d3 * 9.313225746154785E-10d));
        double d4 = (double) ((max2 + max2) - 1073741823);
        Double.isNaN(d4);
        double max4 = Math.max(d2, Math.min(d, d4 * 9.313225746154785E-10d));
        C59163cb o = C59164cc.m91760o(i);
        double a = o.mo56536a(max3, max4);
        double b = o.mo56537b(max3, max4);
        double c = o.mo56538c(max3, max4);
        int g = C59164cc.m91753g(a, b, c);
        C59162ca caVar = C59164cc.f157203e[g];
        double d5 = a;
        double d6 = b;
        double d7 = c;
        return m91937r(g, C59164cc.m91751e((caVar.mo56539a(d5, d6, d7) + 1.0d) * 0.5d), C59164cc.m91751e((caVar.mo56540b(d5, d6, d7) + 1.0d) * 0.5d));
    }

    /* renamed from: t */
    public static C59226t m91939t(C59136bb bbVar) {
        int f = C59164cc.m91752f(bbVar);
        C59162ca caVar = C59164cc.f157203e[f];
        return m91937r(f, C59164cc.m91751e(C59164cc.f157204f.mo56543d(caVar.mo56539a(bbVar.f157162e, bbVar.f157163f, bbVar.f157164g))), C59164cc.m91751e(C59164cc.f157204f.mo56543d(caVar.mo56540b(bbVar.f157162e, bbVar.f157163f, bbVar.f157164g))));
    }

    /* renamed from: A */
    public final String mo56655A() {
        long j = this.f157334b;
        if (j == 0) {
            return "X";
        }
        String c = C58890d.m90988c(Long.toHexString(j));
        c.getClass();
        if (c.length() < 16) {
            StringBuilder sb = new StringBuilder(16);
            for (int length = c.length(); length < 16; length++) {
                sb.append('0');
            }
            sb.append(c);
            c = sb.toString();
        }
        return f157333f.mo56196q(c);
    }

    /* renamed from: B */
    public final void mo56656B(int i, Collection collection) {
        boolean z;
        int i2;
        boolean z2;
        long n = mo56671n();
        int i3 = (int) (n >>> 33);
        int e = m91928e(n);
        int g = m91930g(i + 1);
        int i4 = g + g;
        boolean z3 = false;
        if ((i3 & g) != 0) {
            z = i3 + i4 < 1073741824;
            i2 = i4;
        } else {
            i2 = -i4;
            z = i3 - i4 >= 0;
        }
        if ((g & e) != 0) {
            z2 = e + i4 < 1073741824;
        } else {
            int i5 = -i4;
            boolean z4 = e - i4 >= 0;
            i4 = i5;
            z2 = z4;
        }
        int b = mo56664b();
        collection.add(mo56676w(i));
        int i6 = i2 + i3;
        collection.add(m91938s(b, i6, e, z).mo56676w(i));
        int i7 = e + i4;
        collection.add(m91938s(b, i3, i7, z2).mo56676w(i));
        if (!z) {
            if (z2) {
                z2 = true;
            } else {
                return;
            }
        }
        if (z && z2) {
            z3 = true;
        }
        collection.add(m91938s(b, i6, i7, z3).mo56676w(i));
    }

    /* renamed from: C */
    public final boolean mo56657C(C59226t tVar) {
        return m91918I(tVar.f157334b, m91934m(this.f157334b)) && m91920K(tVar.f157334b, m91933l(this.f157334b));
    }

    /* renamed from: D */
    public final boolean mo56658D(C59226t tVar) {
        return m91918I(this.f157334b, tVar.f157334b);
    }

    /* renamed from: E */
    public final boolean mo56659E(C59226t tVar) {
        return m91919J(this.f157334b, tVar.f157334b);
    }

    /* renamed from: F */
    public final boolean mo56660F() {
        return (this.f157334b & (m91932k(0) + -1)) == 0;
    }

    /* renamed from: G */
    public final boolean mo56661G() {
        return (((int) this.f157334b) & 1) != 0;
    }

    /* renamed from: H */
    public final boolean mo56662H(C59226t tVar) {
        return m91920K(this.f157334b, tVar.f157334b);
    }

    /* renamed from: a */
    public final int compareTo(C59226t tVar) {
        long j = this.f157334b;
        long j2 = tVar.f157334b;
        if (m91921L(j, j2)) {
            return -1;
        }
        return !m91919J(j, j2) ? 0 : 1;
    }

    /* renamed from: b */
    public final int mo56664b() {
        return (int) (this.f157334b >>> 61);
    }

    /* renamed from: c */
    public final int mo56665c(C59226t tVar) {
        long j = this.f157334b;
        long[] jArr = {tVar.f157334b ^ j, Long.lowestOneBit(j), Long.lowestOneBit(tVar.f157334b)};
        long j2 = jArr[0] ^ Long.MIN_VALUE;
        for (int i = 1; i < 3; i++) {
            long j3 = jArr[i] ^ Long.MIN_VALUE;
            if (j3 > j2) {
                j2 = j3;
            }
        }
        return Math.max(Long.numberOfLeadingZeros(j2 ^ Long.MIN_VALUE) - 3, -1) >> 1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C59226t) && this.f157334b == ((C59226t) obj).f157334b) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int mo56668h() {
        if (mo56661G()) {
            return 30;
        }
        return 30 - (Long.numberOfTrailingZeros(this.f157334b) >> 1);
    }

    public final int hashCode() {
        long j = this.f157334b;
        return (int) ((j >>> 32) + j);
    }

    /* renamed from: j */
    public final long mo56670j() {
        long n = mo56671n();
        int i = (int) (n >>> 33);
        int e = m91928e(n);
        int i2 = 1;
        if (!mo56661G()) {
            i2 = (((((int) this.f157334b) >>> 2) ^ i) & 1) != 0 ? 2 : 0;
        }
        return (((long) (e + e + i2)) & 4294967295L) | (((long) ((i + i) + i2)) << 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final long mo56671n() {
        int b = mo56664b() & 1;
        int i = 0;
        int i2 = 0;
        int i3 = 7;
        while (i3 >= 0) {
            int i4 = i3 == 7 ? 2 : 4;
            int i5 = f157331d[b + ((((int) (this.f157334b >>> (((i3 + i3) * 4) + 1))) & ((1 << (i4 + i4)) - 1)) << 2)];
            int i6 = i3 * 4;
            i += (i5 >> 6) << i6;
            i2 += ((i5 >> 2) & 15) << i6;
            b = i5 & 3;
            i3--;
        }
        if ((Long.lowestOneBit(this.f157334b) & 1229782938247303440L) != 0) {
            b ^= 1;
        }
        return (((long) i) << 33) | (((long) i2) << 2) | ((long) b);
    }

    /* renamed from: p */
    public final C59226t mo56672p() {
        long j = this.f157334b;
        long lowestOneBit = Long.lowestOneBit(j);
        return new C59226t((j - lowestOneBit) + (lowestOneBit >>> 2));
    }

    public final String toString() {
        return "(face=" + mo56664b() + ", pos=" + Long.toHexString(this.f157334b & 2305843009213693951L) + ", level=" + mo56668h() + ")";
    }

    /* renamed from: u */
    public final C59226t mo56674u() {
        long j = this.f157334b;
        long lowestOneBit = Long.lowestOneBit(j);
        return new C59226t(j + lowestOneBit + lowestOneBit);
    }

    /* renamed from: v */
    public final C59226t mo56675v() {
        long j = this.f157334b;
        long lowestOneBit = Long.lowestOneBit(j) << 2;
        return new C59226t((j & (-lowestOneBit)) | lowestOneBit);
    }

    /* renamed from: w */
    public final C59226t mo56676w(int i) {
        long k = m91932k(i);
        return new C59226t(k | (this.f157334b & (-k)));
    }

    /* renamed from: x */
    public final C59226t mo56677x() {
        return new C59226t(m91933l(this.f157334b));
    }

    /* renamed from: y */
    public final C59226t mo56678y() {
        return new C59226t(m91934m(this.f157334b));
    }

    /* renamed from: z */
    public final C59136bb mo56679z() {
        long j = mo56670j();
        return C59164cc.f157204f.mo56544i(mo56664b(), (long) ((int) (j >> 32)), (long) ((int) j));
    }

    /* renamed from: M */
    public static C59226t m91922M(String str) {
        if (str == null) {
            throw new NumberFormatException("Null string in S2CellId.fromToken");
        } else if (!str.isEmpty()) {
            int length = str.length();
            if (length > 16 || "X".equals(str)) {
                return f157332e;
            }
            long j = 0;
            int i = 0;
            while (i < length) {
                int digit = Character.digit(str.charAt(i), 16);
                if (digit != -1) {
                    j = (j * 16) + ((long) digit);
                    i++;
                } else {
                    throw new NumberFormatException(str);
                }
            }
            return new C59226t(j << ((16 - length) * 4));
        } else {
            throw new NumberFormatException("Empty string in S2CellId.fromToken");
        }
    }
}
