package com.google.ads.interactivemedia.p367v3.internal;

import android.os.SystemClock;
import com.google.common.p4535g.C59203do;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aai */
/* compiled from: PG */
public final class aai extends aak {

    /* renamed from: d */
    private final long f20059d = 10000000;

    /* renamed from: e */
    private final long f20060e = 25000000;

    /* renamed from: f */
    private final long f20061f = 25000000;

    /* renamed from: g */
    private final float f20062g = 0.75f;

    /* renamed from: h */
    private final adk f20063h;

    /* renamed from: i */
    private float f20064i;

    /* renamed from: j */
    private int f20065j;

    /* renamed from: k */
    private int f20066k;

    /* renamed from: l */
    private long f20067l;

    /* renamed from: m */
    private C7382wc f20068m;

    /* renamed from: n */
    private final aag f20069n;

    public /* synthetic */ aai(C7360vh vhVar, int[] iArr, aag aag, long j, long j2, long j3, float f, adk adk) {
        super(vhVar, iArr);
        this.f20069n = aag;
        this.f20063h = adk;
        this.f20064i = 1.0f;
        this.f20066k = 0;
        this.f20067l = -9223372036854775807L;
    }

    /* renamed from: j */
    static /* synthetic */ long[][][] m18055j(long[][] jArr) {
        int i;
        long[][] jArr2 = jArr;
        int length = jArr2.length;
        double[][] dArr = new double[length][];
        for (int i2 = 0; i2 < jArr2.length; i2++) {
            dArr[i2] = new double[jArr2[i2].length];
            int i3 = 0;
            while (true) {
                long[] jArr3 = jArr2[i2];
                if (i3 >= jArr3.length) {
                    break;
                }
                double[] dArr2 = dArr[i2];
                long j = jArr3[i3];
                dArr2[i3] = j == -1 ? 0.0d : Math.log((double) j);
                i3++;
            }
        }
        double[][] dArr3 = new double[length][];
        for (int i4 = 0; i4 < length; i4++) {
            double[] dArr4 = dArr[i4];
            int length2 = dArr4.length - 1;
            dArr3[i4] = new double[length2];
            if (length2 != 0) {
                double d = dArr4[length2] - dArr4[0];
                int i5 = 0;
                while (true) {
                    double[] dArr5 = dArr[i4];
                    if (i5 >= dArr5.length - 1) {
                        break;
                    }
                    int i6 = i5 + 1;
                    dArr3[i4][i5] = d == C59203do.f157270a ? 1.0d : (((dArr5[i5] + dArr5[i6]) * 0.5d) - dArr5[0]) / d;
                    i5 = i6;
                }
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            i7 += dArr3[i8].length;
        }
        int i9 = i7 + 3;
        int[] iArr = new int[3];
        int i10 = 2;
        iArr[2] = 2;
        iArr[1] = i9;
        iArr[0] = length;
        long[][][] jArr4 = (long[][][]) Array.newInstance(Long.TYPE, iArr);
        int[] iArr2 = new int[length];
        m18057w(jArr4, 1, jArr2, iArr2);
        while (true) {
            i = i9 - 1;
            if (i10 >= i) {
                break;
            }
            double d2 = Double.MAX_VALUE;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                int i13 = iArr2[i12];
                if (i13 + 1 != dArr[i12].length) {
                    double d3 = dArr3[i12][i13];
                    if (d3 < d2) {
                        i11 = i12;
                        d2 = d3;
                    }
                }
            }
            iArr2[i11] = iArr2[i11] + 1;
            m18057w(jArr4, i10, jArr2, iArr2);
            i10++;
        }
        for (long[][] jArr5 : jArr4) {
            long[] jArr6 = jArr5[i];
            long[] jArr7 = jArr5[i9 - 2];
            long j2 = jArr7[0];
            jArr6[0] = j2 + j2;
            long j3 = jArr7[1];
            jArr6[1] = j3 + j3;
        }
        return jArr4;
    }

    /* renamed from: v */
    private final int m18056v(long j) {
        long a = this.f20069n.mo14316a();
        int i = 0;
        for (int i2 = 0; i2 < this.f20072b; i2++) {
            if (j == Long.MIN_VALUE || !mo14340t(i2, j)) {
                if (((long) Math.round(((float) mo14333m(i2).f21808h) * this.f20064i)) <= a) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: w */
    private static void m18057w(long[][][] jArr, int i, long[][] jArr2, int[] iArr) {
        long j = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= r4) {
                break;
            }
            long[] jArr3 = jArr[i2][i];
            long j2 = jArr2[i2][iArr[i2]];
            jArr3[1] = j2;
            j += j2;
            i2++;
        }
        for (long[][] jArr4 : jArr) {
            jArr4[i][0] = j;
        }
    }

    /* renamed from: a */
    public final int mo14319a() {
        return this.f20065j;
    }

    /* renamed from: b */
    public final int mo14320b() {
        return this.f20066k;
    }

    /* renamed from: c */
    public final Object mo14321c() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r8 < ((r10 == -9223372036854775807L || r10 > r7.f20059d) ? r7.f20059d : (long) (((float) r10) * 0.75f))) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r8 >= r7.f20060e) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        r12 = r3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14322d(long r8, long r10, java.util.List r12) {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r7.f20066k
            if (r2 != 0) goto L_0x0012
            r8 = 1
            r7.f20066k = r8
            int r8 = r7.m18056v(r0)
            r7.f20065j = r8
            return
        L_0x0012:
            int r3 = r7.f20065j
            boolean r4 = r12.isEmpty()
            r5 = -1
            if (r4 == 0) goto L_0x001d
            r4 = -1
            goto L_0x0029
        L_0x001d:
            java.lang.Object r4 = com.google.ads.interactivemedia.p367v3.internal.ary.m19448a(r12)
            com.google.ads.interactivemedia.v3.internal.wc r4 = (com.google.ads.interactivemedia.p367v3.internal.C7382wc) r4
            com.google.ads.interactivemedia.v3.internal.cy r4 = r4.f24091f
            int r4 = r7.mo14335o(r4)
        L_0x0029:
            if (r4 == r5) goto L_0x0034
            java.lang.Object r12 = com.google.ads.interactivemedia.p367v3.internal.ary.m19448a(r12)
            com.google.ads.interactivemedia.v3.internal.wc r12 = (com.google.ads.interactivemedia.p367v3.internal.C7382wc) r12
            int r2 = r12.f24092g
            r3 = r4
        L_0x0034:
            int r12 = r7.m18056v(r0)
            boolean r0 = r7.mo14340t(r3, r0)
            if (r0 != 0) goto L_0x0072
            com.google.ads.interactivemedia.v3.internal.cy r0 = r7.mo14333m(r3)
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.mo14333m(r12)
            int r1 = r1.f21808h
            int r0 = r0.f21808h
            if (r1 <= r0) goto L_0x0069
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0062
            long r4 = r7.f20059d
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0062
            float r10 = (float) r10
            r11 = 1061158912(0x3f400000, float:0.75)
            float r10 = r10 * r11
            long r10 = (long) r10
            goto L_0x0064
        L_0x0062:
            long r10 = r7.f20059d
        L_0x0064:
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            if (r1 >= r0) goto L_0x0072
            long r10 = r7.f20060e
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0072
        L_0x0071:
            r12 = r3
        L_0x0072:
            if (r12 != r3) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r2 = 3
        L_0x0076:
            r7.f20066k = r2
            r7.f20065j = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aai.mo14322d(long, long, java.util.List):void");
    }

    /* renamed from: e */
    public final void mo14323e(long[][] jArr) {
        this.f20069n.mo14317b(jArr);
    }

    /* renamed from: f */
    public final void mo14324f() {
        this.f20067l = -9223372036854775807L;
        this.f20068m = null;
    }

    /* renamed from: g */
    public final void mo14325g() {
        this.f20068m = null;
    }

    /* renamed from: h */
    public final void mo14326h(float f) {
        this.f20064i = f;
    }

    /* renamed from: i */
    public final int mo14327i(long j, List list) {
        int i;
        int i2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f20067l;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((C7382wc) ary.m19448a(list)).equals(this.f20068m))) {
            return list.size();
        }
        this.f20067l = elapsedRealtime;
        this.f20068m = list.isEmpty() ? null : (C7382wc) ary.m19448a(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long P = aeu.m18498P(((C7382wc) list.get(size - 1)).f24094i - j, this.f20064i);
        long j3 = this.f20061f;
        if (P < j3) {
            return size;
        }
        C6864cy m = mo14333m(m18056v(elapsedRealtime));
        for (int i3 = 0; i3 < size; i3++) {
            C7382wc wcVar = (C7382wc) list.get(i3);
            C6864cy cyVar = wcVar.f24091f;
            if (aeu.m18498P(wcVar.f24094i - j, this.f20064i) >= j3 && cyVar.f21808h < m.f21808h && (i = cyVar.f21818r) != -1 && i < 720 && (i2 = cyVar.f21817q) != -1 && i2 < 1280 && i < m.f21818r) {
                return i3;
            }
        }
        return size;
    }
}
