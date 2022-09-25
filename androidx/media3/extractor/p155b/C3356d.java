package androidx.media3.extractor.p155b;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3627q;
import androidx.media3.extractor.C3635y;

/* renamed from: androidx.media3.extractor.b.d */
/* compiled from: PG */
public final class C3356d implements C3326aa {

    /* renamed from: a */
    public C3359g[] f10133a = new C3359g[0];

    /* renamed from: b */
    private final C2604ac f10134b = new C2604ac(12);

    /* renamed from: c */
    private final C3355c f10135c = new C3355c();

    /* renamed from: d */
    private int f10136d;

    /* renamed from: e */
    private C3329ad f10137e = new C3635y();

    /* renamed from: f */
    private C3357e f10138f;

    /* renamed from: g */
    private long f10139g = -9223372036854775807L;

    /* renamed from: h */
    private long f10140h;

    /* renamed from: i */
    private C3359g f10141i;

    /* renamed from: j */
    private int f10142j = -1;

    /* renamed from: k */
    private long f10143k = -1;

    /* renamed from: l */
    private long f10144l = -1;

    /* renamed from: m */
    private int f10145m;

    /* renamed from: n */
    private boolean f10146n;

    /* renamed from: f */
    private final C3359g m9720f(int i) {
        for (C3359g gVar : this.f10133a) {
            if (gVar.f10156b == i || gVar.f10157c == i) {
                return gVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0350  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7152a(androidx.media3.extractor.C3327ab r24, androidx.media3.extractor.C3350ay r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            long r2 = r0.f10140h
            r4 = 1
            r5 = 0
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x002c
            r8 = r1
            androidx.media3.extractor.q r8 = (androidx.media3.extractor.C3627q) r8
            long r9 = r8.f11566c
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0026
            r11 = 262144(0x40000, double:1.295163E-318)
            long r11 = r11 + r9
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0020
            goto L_0x0026
        L_0x0020:
            long r2 = r2 - r9
            int r3 = (int) r2
            r8.mo7639q(r3)
            goto L_0x002c
        L_0x0026:
            r8 = r25
            r8.f10122a = r2
            r2 = 1
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            r0.f10140h = r6
            if (r2 == 0) goto L_0x0032
            return r4
        L_0x0032:
            int r2 = r0.f10136d
            r3 = 12
            r8 = 0
            if (r2 == 0) goto L_0x03e2
            r9 = 1819436136(0x6c726468, float:1.1721368E27)
            r10 = 1414744396(0x5453494c, float:3.62987127E12)
            r11 = 2
            if (r2 == r4) goto L_0x038c
            r12 = 3
            if (r2 == r11) goto L_0x026e
            r9 = 6
            r13 = 1769369453(0x69766f6d, float:1.8620122E25)
            r14 = 4
            r17 = 8
            r15 = 16
            if (r2 == r12) goto L_0x01e5
            r6 = 5
            r7 = 8
            if (r2 == r14) goto L_0x01ba
            if (r2 == r6) goto L_0x00ff
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r11 = r2.f11566c
            long r14 = r0.f10144l
            int r6 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r6 < 0) goto L_0x0065
            r5 = -1
            goto L_0x00fe
        L_0x0065:
            androidx.media3.extractor.b.g r6 = r0.f10141i
            if (r6 == 0) goto L_0x009e
            int r2 = r6.f10159e
            androidx.media3.extractor.bf r3 = r6.f10155a
            int r1 = r3.mo6849a(r1, r2, r5)
            int r2 = r2 - r1
            r6.f10159e = r2
            if (r2 != 0) goto L_0x00fe
            int r1 = r6.f10158d
            if (r1 <= 0) goto L_0x0096
            androidx.media3.extractor.bf r9 = r6.f10155a
            int r1 = r6.f10160f
            long r10 = r6.mo7350a(r1)
            int[] r1 = r6.f10164j
            int r2 = r6.f10160f
            int r1 = java.util.Arrays.binarySearch(r1, r2)
            if (r1 < 0) goto L_0x008e
            r12 = 1
            goto L_0x008f
        L_0x008e:
            r12 = 0
        L_0x008f:
            int r13 = r6.f10158d
            r14 = 0
            r15 = 0
            r9.mo6852d(r10, r12, r13, r14, r15)
        L_0x0096:
            int r1 = r6.f10160f
            int r1 = r1 + r4
            r6.f10160f = r1
            r0.f10141i = r8
            return r5
        L_0x009e:
            r8 = 1
            long r11 = r11 & r8
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00a8
            r2.mo7639q(r4)
        L_0x00a8:
            androidx.media3.common.b.ac r1 = r0.f10134b
            byte[] r1 = r1.f7234a
            r2.mo7320o(r1, r5, r3, r5)
            androidx.media3.common.b.ac r1 = r0.f10134b
            r1.mo6131A(r5)
            androidx.media3.common.b.ac r1 = r0.f10134b
            int r1 = r1.mo6135c()
            if (r1 != r10) goto L_0x00d2
            androidx.media3.common.b.ac r1 = r0.f10134b
            r1.mo6131A(r7)
            androidx.media3.common.b.ac r1 = r0.f10134b
            int r1 = r1.mo6135c()
            if (r1 != r13) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r3 = 8
        L_0x00cc:
            r2.mo7639q(r3)
            r2.f11568e = r5
            goto L_0x00fe
        L_0x00d2:
            androidx.media3.common.b.ac r3 = r0.f10134b
            int r3 = r3.mo6135c()
            r4 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r1 != r4) goto L_0x00e6
            long r1 = r2.f11566c
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r17
            r0.f10140h = r1
            goto L_0x00fe
        L_0x00e6:
            r2.mo7639q(r7)
            r2.f11568e = r5
            androidx.media3.extractor.b.g r1 = r0.m9720f(r1)
            if (r1 != 0) goto L_0x00f8
            long r1 = r2.f11566c
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f10140h = r1
            goto L_0x00fe
        L_0x00f8:
            r1.f10158d = r3
            r1.f10159e = r3
            r0.f10141i = r1
        L_0x00fe:
            return r5
        L_0x00ff:
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            int r3 = r0.f10145m
            r2.<init>((int) r3)
            byte[] r3 = r2.f7234a
            int r6 = r0.f10145m
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r1.mo7321p(r3, r5, r6, r5)
            int r1 = r2.f7236c
            int r3 = r2.f7235b
            int r1 = r1 - r3
            if (r1 >= r15) goto L_0x0119
            r6 = 0
            goto L_0x0131
        L_0x0119:
            int r1 = r3 + 8
            r2.mo6131A(r1)
            int r1 = r2.mo6135c()
            long r6 = r0.f10143k
            long r13 = (long) r1
            int r1 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x012c
            r6 = 0
            goto L_0x012e
        L_0x012c:
            long r6 = r6 + r17
        L_0x012e:
            r2.mo6131A(r3)
        L_0x0131:
            int r1 = r2.f7236c
            int r3 = r2.f7235b
            int r1 = r1 - r3
            if (r1 < r15) goto L_0x0186
            int r1 = r2.mo6135c()
            int r3 = r2.mo6135c()
            int r8 = r2.mo6135c()
            long r13 = (long) r8
            long r13 = r13 + r6
            r2.mo6135c()
            androidx.media3.extractor.b.g r1 = r0.m9720f(r1)
            if (r1 == 0) goto L_0x0131
            r3 = r3 & r15
            if (r3 != r15) goto L_0x0180
            int r3 = r1.f10162h
            int[] r8 = r1.f10164j
            int r8 = r8.length
            if (r3 != r8) goto L_0x0171
            long[] r3 = r1.f10163i
            int r8 = r3.length
            int r8 = r8 * 3
            int r8 = r8 / r11
            long[] r3 = java.util.Arrays.copyOf(r3, r8)
            r1.f10163i = r3
            int[] r3 = r1.f10164j
            int r8 = r3.length
            int r8 = r8 * 3
            int r8 = r8 / r11
            int[] r3 = java.util.Arrays.copyOf(r3, r8)
            r1.f10164j = r3
        L_0x0171:
            long[] r3 = r1.f10163i
            int r8 = r1.f10162h
            r3[r8] = r13
            int[] r3 = r1.f10164j
            int r10 = r1.f10161g
            r3[r8] = r10
            int r8 = r8 + r4
            r1.f10162h = r8
        L_0x0180:
            int r3 = r1.f10161g
            int r3 = r3 + r4
            r1.f10161g = r3
            goto L_0x0131
        L_0x0186:
            androidx.media3.extractor.b.g[] r1 = r0.f10133a
            int r2 = r1.length
            r3 = 0
        L_0x018a:
            if (r3 >= r2) goto L_0x01a5
            r6 = r1[r3]
            long[] r7 = r6.f10163i
            int r8 = r6.f10162h
            long[] r7 = java.util.Arrays.copyOf(r7, r8)
            r6.f10163i = r7
            int[] r7 = r6.f10164j
            int r8 = r6.f10162h
            int[] r7 = java.util.Arrays.copyOf(r7, r8)
            r6.f10164j = r7
            int r3 = r3 + 1
            goto L_0x018a
        L_0x01a5:
            r0.f10146n = r4
            androidx.media3.extractor.ad r1 = r0.f10137e
            androidx.media3.extractor.b.b r2 = new androidx.media3.extractor.b.b
            long r3 = r0.f10139g
            r2.<init>(r0, r3)
            r1.mo6989q(r2)
            r0.f10136d = r9
            long r1 = r0.f10143k
            r0.f10140h = r1
            return r5
        L_0x01ba:
            androidx.media3.common.b.ac r2 = r0.f10134b
            byte[] r2 = r2.f7234a
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r1.mo7321p(r2, r5, r7, r5)
            androidx.media3.common.b.ac r2 = r0.f10134b
            r2.mo6131A(r5)
            androidx.media3.common.b.ac r2 = r0.f10134b
            int r2 = r2.mo6135c()
            androidx.media3.common.b.ac r3 = r0.f10134b
            int r3 = r3.mo6135c()
            r4 = 829973609(0x31786469, float:3.6145826E-9)
            if (r2 != r4) goto L_0x01de
            r0.f10136d = r6
            r0.f10145m = r3
            goto L_0x01e4
        L_0x01de:
            long r1 = r1.f11566c
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f10140h = r1
        L_0x01e4:
            return r5
        L_0x01e5:
            long r6 = r0.f10143k
            r11 = -1
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x01fa
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r11 = r2.f11566c
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x01f7
            goto L_0x01fa
        L_0x01f7:
            r0.f10140h = r6
            return r5
        L_0x01fa:
            androidx.media3.common.b.ac r2 = r0.f10134b
            byte[] r2 = r2.f7234a
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r1.mo7320o(r2, r5, r3, r5)
            r1.f11568e = r5
            androidx.media3.common.b.ac r2 = r0.f10134b
            r2.mo6131A(r5)
            androidx.media3.extractor.b.c r2 = r0.f10135c
            androidx.media3.common.b.ac r6 = r0.f10134b
            r2.mo7349a(r6)
            androidx.media3.common.b.ac r2 = r0.f10134b
            int r2 = r2.mo6135c()
            androidx.media3.extractor.b.c r6 = r0.f10135c
            int r7 = r6.f10130a
            r8 = 1179011410(0x46464952, float:12690.33)
            if (r7 != r8) goto L_0x0224
            r1.mo7639q(r3)
            return r5
        L_0x0224:
            if (r7 != r10) goto L_0x0263
            if (r2 == r13) goto L_0x0229
            goto L_0x0263
        L_0x0229:
            long r2 = r1.f11566c
            r0.f10143k = r2
            int r6 = r6.f10131b
            long r6 = (long) r6
            long r2 = r2 + r6
            long r2 = r2 + r17
            r0.f10144l = r2
            boolean r6 = r0.f10146n
            if (r6 != 0) goto L_0x0259
            androidx.media3.extractor.b.e r6 = r0.f10138f
            r6.getClass()
            int r6 = r6.f10148b
            r6 = r6 & r15
            if (r6 == r15) goto L_0x0254
            androidx.media3.extractor.ad r2 = r0.f10137e
            androidx.media3.extractor.ba r3 = new androidx.media3.extractor.ba
            long r6 = r0.f10139g
            r10 = 0
            r3.<init>(r6, r10)
            r2.mo6989q(r3)
            r0.f10146n = r4
            goto L_0x0259
        L_0x0254:
            r0.f10136d = r14
            r0.f10140h = r2
            return r5
        L_0x0259:
            long r1 = r1.f11566c
            r3 = 12
            long r1 = r1 + r3
            r0.f10140h = r1
            r0.f10136d = r9
            return r5
        L_0x0263:
            long r1 = r1.f11566c
            int r3 = r6.f10131b
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r17
            r0.f10140h = r1
            return r5
        L_0x026e:
            int r2 = r0.f10142j
            int r2 = r2 + -4
            androidx.media3.common.b.ac r3 = new androidx.media3.common.b.ac
            r3.<init>((int) r2)
            byte[] r6 = r3.f7234a
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r1.mo7321p(r6, r5, r2, r5)
            androidx.media3.extractor.b.h r1 = androidx.media3.extractor.p155b.C3360h.m9732c(r9, r3)
            int r2 = r1.f10168b
            if (r2 != r9) goto L_0x0378
            java.lang.Class<androidx.media3.extractor.b.e> r2 = androidx.media3.extractor.p155b.C3357e.class
            androidx.media3.extractor.b.a r2 = r1.mo7352b(r2)
            androidx.media3.extractor.b.e r2 = (androidx.media3.extractor.p155b.C3357e) r2
            if (r2 == 0) goto L_0x0370
            r0.f10138f = r2
            int r3 = r2.f10149c
            long r6 = (long) r3
            int r2 = r2.f10147a
            long r2 = (long) r2
            long r6 = r6 * r2
            r0.f10139g = r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.common.b.gu r1 = r1.f10167a
            r3 = r1
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            r6 = 0
            r14 = 0
        L_0x02aa:
            if (r6 >= r3) goto L_0x035e
            java.lang.Object r7 = r1.get(r6)
            androidx.media3.extractor.b.a r7 = (androidx.media3.extractor.p155b.C3353a) r7
            int r9 = r7.mo7348a()
            r10 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r9 != r10) goto L_0x0356
            androidx.media3.extractor.b.h r7 = (androidx.media3.extractor.p155b.C3360h) r7
            int r9 = r14 + 1
            java.lang.Class<androidx.media3.extractor.b.f> r10 = androidx.media3.extractor.p155b.C3358f.class
            androidx.media3.extractor.b.a r10 = r7.mo7352b(r10)
            androidx.media3.extractor.b.f r10 = (androidx.media3.extractor.p155b.C3358f) r10
            java.lang.Class<androidx.media3.extractor.b.i> r13 = androidx.media3.extractor.p155b.C3361i.class
            androidx.media3.extractor.b.a r13 = r7.mo7352b(r13)
            androidx.media3.extractor.b.i r13 = (androidx.media3.extractor.p155b.C3361i) r13
            java.lang.String r15 = "AviExtractor"
            if (r10 != 0) goto L_0x02de
            java.lang.String r7 = "Missing Stream Header"
            androidx.media3.common.p136b.C2633u.m7050e(r15, r7)
        L_0x02d8:
            r22 = r6
            r24 = r9
            goto L_0x034e
        L_0x02de:
            if (r13 != 0) goto L_0x02e6
            java.lang.String r7 = "Missing Stream Format"
            androidx.media3.common.p136b.C2633u.m7050e(r15, r7)
            goto L_0x02d8
        L_0x02e6:
            int r15 = r10.f10153d
            r24 = r9
            long r8 = (long) r15
            int r15 = r10.f10151b
            r22 = r6
            long r5 = (long) r15
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r18 = r5 * r15
            int r5 = r10.f10152c
            long r5 = (long) r5
            r16 = r8
            r20 = r5
            long r5 = androidx.media3.common.p136b.C2612ak.m7000y(r16, r18, r20)
            androidx.media3.common.x r8 = r13.f10169a
            androidx.media3.common.w r9 = new androidx.media3.common.w
            r9.<init>(r8)
            java.lang.String r13 = java.lang.Integer.toString(r14)
            r9.f7449a = r13
            int r13 = r10.f10154e
            if (r13 == 0) goto L_0x0313
            r9.f7460l = r13
        L_0x0313:
            java.lang.Class<androidx.media3.extractor.b.j> r13 = androidx.media3.extractor.p155b.C3362j.class
            androidx.media3.extractor.b.a r7 = r7.mo7352b(r13)
            androidx.media3.extractor.b.j r7 = (androidx.media3.extractor.p155b.C3362j) r7
            if (r7 == 0) goto L_0x0321
            java.lang.String r7 = r7.f10170a
            r9.f7450b = r7
        L_0x0321:
            java.lang.String r7 = r8.f7496n
            int r7 = androidx.media3.common.C2598ay.m6803b(r7)
            if (r7 == r4) goto L_0x032f
            if (r7 != r11) goto L_0x032d
            r15 = 2
            goto L_0x0330
        L_0x032d:
            r8 = 0
            goto L_0x034e
        L_0x032f:
            r15 = r7
        L_0x0330:
            androidx.media3.extractor.ad r7 = r0.f10137e
            androidx.media3.extractor.bf r7 = r7.mo6987eZ(r14, r15)
            androidx.media3.common.x r8 = new androidx.media3.common.x
            r8.<init>(r9)
            r7.mo6850b(r8)
            androidx.media3.extractor.b.g r8 = new androidx.media3.extractor.b.g
            int r9 = r10.f10153d
            r13 = r8
            r16 = r5
            r18 = r9
            r19 = r7
            r13.<init>(r14, r15, r16, r18, r19)
            r0.f10139g = r5
        L_0x034e:
            if (r8 == 0) goto L_0x0353
            r2.add(r8)
        L_0x0353:
            r14 = r24
            goto L_0x0358
        L_0x0356:
            r22 = r6
        L_0x0358:
            int r6 = r22 + 1
            r5 = 0
            r8 = 0
            goto L_0x02aa
        L_0x035e:
            androidx.media3.extractor.b.g[] r1 = new androidx.media3.extractor.p155b.C3359g[r5]
            java.lang.Object[] r1 = r2.toArray(r1)
            androidx.media3.extractor.b.g[] r1 = (androidx.media3.extractor.p155b.C3359g[]) r1
            r0.f10133a = r1
            androidx.media3.extractor.ad r1 = r0.f10137e
            r1.mo6988fa()
            r0.f10136d = r12
            return r5
        L_0x0370:
            java.lang.String r1 = "AviHeader not found"
            r3 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r3)
            throw r1
        L_0x0378:
            r3 = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected header list type "
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r3)
            throw r1
        L_0x038c:
            androidx.media3.common.b.ac r2 = r0.f10134b
            byte[] r2 = r2.f7234a
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r4 = 0
            r1.mo7321p(r2, r4, r3, r4)
            androidx.media3.common.b.ac r1 = r0.f10134b
            r1.mo6131A(r4)
            androidx.media3.extractor.b.c r1 = r0.f10135c
            androidx.media3.common.b.ac r2 = r0.f10134b
            r1.mo7349a(r2)
            int r3 = r1.f10130a
            if (r3 != r10) goto L_0x03ce
            int r2 = r2.mo6135c()
            r1.f10132c = r2
            androidx.media3.extractor.b.c r1 = r0.f10135c
            int r2 = r1.f10132c
            if (r2 != r9) goto L_0x03ba
            int r1 = r1.f10131b
            r0.f10142j = r1
            r0.f10136d = r11
        L_0x03b8:
            r1 = 0
            return r1
        L_0x03ba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "hdrl expected, found: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x03ce:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "LIST expected, found: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x03e2:
            r2 = r8
            boolean r5 = r23.mo7155e(r24)
            if (r5 == 0) goto L_0x03f1
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r1.mo7639q(r3)
            r0.f10136d = r4
            goto L_0x03b8
        L_0x03f1:
            java.lang.String r1 = "AVI Header List not found"
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            goto L_0x03f9
        L_0x03f8:
            throw r1
        L_0x03f9:
            goto L_0x03f8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p155b.C3356d.mo7152a(androidx.media3.extractor.ab, androidx.media3.extractor.ay):int");
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        int i;
        this.f10140h = -1;
        this.f10141i = null;
        for (C3359g gVar : this.f10133a) {
            if (gVar.f10162h == 0) {
                gVar.f10160f = 0;
            } else {
                gVar.f10160f = gVar.f10164j[C2612ak.m6973aw(gVar.f10163i, j, true)];
            }
        }
        if (j != 0) {
            i = 6;
        } else if (this.f10133a.length == 0) {
            this.f10136d = 0;
            return;
        } else {
            i = 3;
        }
        this.f10136d = i;
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        ((C3627q) abVar).mo7320o(this.f10134b.f7234a, 0, 12, false);
        this.f10134b.mo6131A(0);
        if (this.f10134b.mo6135c() != 1179011410) {
            return false;
        }
        C2604ac acVar = this.f10134b;
        acVar.mo6131A(acVar.f7235b + 4);
        if (this.f10134b.mo6135c() == 541677121) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f10136d = 0;
        this.f10137e = adVar;
        this.f10140h = -1;
    }
}
