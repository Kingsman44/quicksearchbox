package androidx.media3.extractor.p173l;

import androidx.media3.common.C2599az;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.l.a */
/* compiled from: PG */
final class C3575a implements C3576b {

    /* renamed from: a */
    private static final int[] f11377a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: b */
    private static final int[] f11378b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: c */
    private final C3329ad f11379c;

    /* renamed from: d */
    private final C3368bf f11380d;

    /* renamed from: e */
    private final C3579e f11381e;

    /* renamed from: f */
    private final int f11382f;

    /* renamed from: g */
    private final byte[] f11383g;

    /* renamed from: h */
    private final C2604ac f11384h;

    /* renamed from: i */
    private final int f11385i;

    /* renamed from: j */
    private final C2680x f11386j;

    /* renamed from: k */
    private int f11387k;

    /* renamed from: l */
    private long f11388l;

    /* renamed from: m */
    private int f11389m;

    /* renamed from: n */
    private long f11390n;

    public C3575a(C3329ad adVar, C3368bf bfVar, C3579e eVar) {
        this.f11379c = adVar;
        this.f11380d = bfVar;
        this.f11381e = eVar;
        int max = Math.max(1, eVar.f11408c / 10);
        this.f11385i = max;
        C2604ac acVar = new C2604ac(eVar.f11411f);
        acVar.mo6137e();
        int e = acVar.mo6137e();
        this.f11382f = e;
        int i = eVar.f11407b;
        int i2 = (((eVar.f11409d - (i * 4)) * 8) / (eVar.f11410e * i)) + 1;
        if (e == i2) {
            int d = C2612ak.m6979d(max, e);
            this.f11383g = new byte[(eVar.f11409d * d)];
            this.f11384h = new C2604ac(d * (e + e) * i);
            int i3 = eVar.f11408c;
            int i4 = ((eVar.f11409d * i3) * 8) / e;
            C2679w wVar = new C2679w();
            wVar.f7459k = "audio/raw";
            wVar.f7454f = i4;
            wVar.f7455g = i4;
            wVar.f7460l = (max + max) * i;
            wVar.f7472x = eVar.f11407b;
            wVar.f7473y = i3;
            wVar.f7474z = 2;
            this.f11386j = new C2680x(wVar);
            return;
        }
        throw C2599az.m6819a("Expected frames per block: " + i2 + "; got: " + e, (Throwable) null);
    }

    /* renamed from: d */
    private final int m10347d(int i) {
        int i2 = this.f11381e.f11407b;
        return i / (i2 + i2);
    }

    /* renamed from: e */
    private final int m10348e(int i) {
        return (i + i) * this.f11381e.f11407b;
    }

    /* renamed from: f */
    private final void m10349f(int i) {
        long j = this.f11388l;
        long y = C2612ak.m7000y(this.f11390n, 1000000, (long) this.f11381e.f11408c);
        int e = m10348e(i);
        this.f11380d.mo6852d(j + y, 1, e, this.f11389m - e, (C3367be) null);
        this.f11390n += (long) i;
        this.f11389m -= e;
    }

    /* renamed from: a */
    public final void mo7484a(int i, long j) {
        this.f11379c.mo6989q(new C3582h(this.f11381e, this.f11382f, (long) i, j));
        this.f11380d.mo6850b(this.f11386j);
    }

    /* renamed from: b */
    public final void mo7485b(long j) {
        this.f11387k = 0;
        this.f11388l = j;
        this.f11389m = 0;
        this.f11390n = 0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0044 A[EDGE_INSN: B:38:0x0044->B:10:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    /* renamed from: c */
    public final boolean mo7486c(androidx.media3.extractor.C3327ab r20, long r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r3 = r0.f11385i
            int r4 = r0.f11389m
            int r4 = r0.m10347d(r4)
            int r3 = r3 - r4
            int r4 = r0.f11382f
            int r3 = androidx.media3.common.p136b.C2612ak.m6979d(r3, r4)
            androidx.media3.extractor.l.e r4 = r0.f11381e
            int r4 = r4.f11409d
            int r3 = r3 * r4
            r4 = 0
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0021
        L_0x001f:
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r4 != 0) goto L_0x0044
            int r5 = r0.f11387k
            if (r5 >= r3) goto L_0x0044
            int r5 = r3 - r5
            long r8 = (long) r5
            long r8 = java.lang.Math.min(r8, r1)
            byte[] r5 = r0.f11383g
            int r10 = r0.f11387k
            int r9 = (int) r8
            r8 = r20
            int r5 = r8.mo5879a(r5, r10, r9)
            r9 = -1
            if (r5 != r9) goto L_0x003e
            goto L_0x001f
        L_0x003e:
            int r9 = r0.f11387k
            int r9 = r9 + r5
            r0.f11387k = r9
            goto L_0x0022
        L_0x0044:
            int r1 = r0.f11387k
            androidx.media3.extractor.l.e r2 = r0.f11381e
            int r2 = r2.f11409d
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x0144
            byte[] r2 = r0.f11383g
            androidx.media3.common.b.ac r3 = r0.f11384h
            r5 = 0
        L_0x0052:
            if (r5 >= r1) goto L_0x0111
            r8 = 0
        L_0x0055:
            androidx.media3.extractor.l.e r9 = r0.f11381e
            int r10 = r9.f11407b
            if (r8 >= r10) goto L_0x0109
            byte[] r11 = r3.f7234a
            int r9 = r9.f11409d
            int r12 = r5 * r9
            int r13 = r8 * 4
            int r12 = r12 + r13
            int r13 = r10 * 4
            int r13 = r13 + r12
            int r9 = r9 / r10
            int r9 = r9 + -4
            int r14 = r12 + 1
            byte r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            byte r15 = r2[r12]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r14 = r14 | r15
            short r14 = (short) r14
            int r12 = r12 + 2
            byte r12 = r2[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r15 = 88
            int r12 = java.lang.Math.min(r12, r15)
            int[] r16 = f11378b
            r16 = r16[r12]
            int r6 = r0.f11382f
            int r6 = r6 * r5
            int r6 = r6 * r10
            int r6 = r6 + r8
            int r6 = r6 + r6
            r15 = r14 & 255(0xff, float:3.57E-43)
            byte r15 = (byte) r15
            r11[r6] = r15
            int r15 = r6 + 1
            int r7 = r14 >> 8
            byte r7 = (byte) r7
            r11[r15] = r7
            r7 = 0
        L_0x009d:
            int r15 = r9 + r9
            if (r7 >= r15) goto L_0x0101
            int r15 = r7 / 8
            int r15 = r15 * r10
            int r15 = r15 * 4
            int r15 = r15 + r13
            int r18 = r7 / 2
            int r18 = r18 % 4
            int r15 = r15 + r18
            byte r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r18 = r7 % 2
            if (r18 != 0) goto L_0x00b9
            r15 = r15 & 15
            goto L_0x00bb
        L_0x00b9:
            int r15 = r15 >> 4
        L_0x00bb:
            r18 = r15 & 7
            int r18 = r18 + r18
            r17 = 1
            int r18 = r18 + 1
            int r18 = r18 * r16
            r16 = r2
            int r2 = r18 >> 3
            r18 = r15 & 8
            if (r18 == 0) goto L_0x00ce
            int r2 = -r2
        L_0x00ce:
            int r14 = r14 + r2
            r2 = -32768(0xffffffffffff8000, float:NaN)
            r21 = r9
            r9 = 32767(0x7fff, float:4.5916E-41)
            int r14 = androidx.media3.common.p136b.C2612ak.m6981f(r14, r2, r9)
            int r2 = r10 + r10
            int r6 = r6 + r2
            r2 = r14 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r11[r6] = r2
            int r2 = r6 + 1
            int r9 = r14 >> 8
            byte r9 = (byte) r9
            r11[r2] = r9
            int[] r2 = f11377a
            r2 = r2[r15]
            int r12 = r12 + r2
            r2 = 88
            r9 = 0
            int r12 = androidx.media3.common.p136b.C2612ak.m6981f(r12, r9, r2)
            int[] r9 = f11378b
            r9 = r9[r12]
            int r7 = r7 + 1
            r2 = r16
            r16 = r9
            r9 = r21
            goto L_0x009d
        L_0x0101:
            r16 = r2
            r17 = 1
            int r8 = r8 + 1
            goto L_0x0055
        L_0x0109:
            r16 = r2
            r17 = 1
            int r5 = r5 + 1
            goto L_0x0052
        L_0x0111:
            int r2 = r0.f11382f
            int r2 = r2 * r1
            int r2 = r0.m10348e(r2)
            r5 = 0
            r3.mo6131A(r5)
            r3.mo6158z(r2)
            int r2 = r0.f11387k
            androidx.media3.extractor.l.e r3 = r0.f11381e
            int r3 = r3.f11409d
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.f11387k = r2
            androidx.media3.common.b.ac r1 = r0.f11384h
            int r2 = r1.f7236c
            androidx.media3.extractor.bf r3 = r0.f11380d
            r3.mo6851c(r1, r2)
            int r1 = r0.f11389m
            int r1 = r1 + r2
            r0.f11389m = r1
            int r1 = r0.m10347d(r1)
            int r2 = r0.f11385i
            if (r1 < r2) goto L_0x0144
            r0.m10349f(r2)
        L_0x0144:
            if (r4 == 0) goto L_0x0151
            int r1 = r0.f11389m
            int r1 = r0.m10347d(r1)
            if (r1 <= 0) goto L_0x0151
            r0.m10349f(r1)
        L_0x0151:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p173l.C3575a.mo7486c(androidx.media3.extractor.ab, long):boolean");
    }
}
