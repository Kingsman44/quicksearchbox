package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3347av;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.r */
/* compiled from: PG */
public final class C3565r implements C3557j {

    /* renamed from: a */
    private final C3535ah f11277a;

    /* renamed from: b */
    private final boolean f11278b;

    /* renamed from: c */
    private final boolean f11279c;

    /* renamed from: d */
    private final C3571x f11280d = new C3571x(7);

    /* renamed from: e */
    private final C3571x f11281e = new C3571x(8);

    /* renamed from: f */
    private final C3571x f11282f = new C3571x(6);

    /* renamed from: g */
    private long f11283g;

    /* renamed from: h */
    private final boolean[] f11284h = new boolean[3];

    /* renamed from: i */
    private String f11285i;

    /* renamed from: j */
    private C3368bf f11286j;

    /* renamed from: k */
    private C3564q f11287k;

    /* renamed from: l */
    private boolean f11288l;

    /* renamed from: m */
    private long f11289m = -9223372036854775807L;

    /* renamed from: n */
    private boolean f11290n;

    /* renamed from: o */
    private final C2604ac f11291o = new C2604ac();

    public C3565r(C3535ah ahVar, boolean z, boolean z2) {
        this.f11277a = ahVar;
        this.f11278b = z;
        this.f11279c = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10304f(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r0.f11288l
            if (r4 == 0) goto L_0x0012
            androidx.media3.extractor.k.q r4 = r0.f11287k
            boolean r4 = r4.f11261c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            androidx.media3.extractor.k.x r4 = r0.f11280d
            r4.mo7480a(r1, r2, r3)
            androidx.media3.extractor.k.x r4 = r0.f11281e
            r4.mo7480a(r1, r2, r3)
        L_0x001c:
            androidx.media3.extractor.k.x r4 = r0.f11282f
            r4.mo7480a(r1, r2, r3)
            androidx.media3.extractor.k.q r4 = r0.f11287k
            boolean r5 = r4.f11269k
            if (r5 != 0) goto L_0x0029
            goto L_0x01a9
        L_0x0029:
            int r3 = r3 - r2
            byte[] r5 = r4.f11265g
            int r6 = r5.length
            int r7 = r4.f11266h
            int r7 = r7 + r3
            if (r6 >= r7) goto L_0x0039
            int r7 = r7 + r7
            byte[] r5 = java.util.Arrays.copyOf(r5, r7)
            r4.f11265g = r5
        L_0x0039:
            byte[] r5 = r4.f11265g
            int r6 = r4.f11266h
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            int r1 = r4.f11266h
            int r1 = r1 + r3
            r4.f11266h = r1
            androidx.media3.extractor.ax r2 = r4.f11264f
            byte[] r3 = r4.f11265g
            r5 = 0
            r2.mo7339d(r3, r5, r1)
            androidx.media3.extractor.ax r1 = r4.f11264f
            r2 = 8
            boolean r1 = r1.mo7342g(r2)
            if (r1 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r1 = r4.f11264f
            r1.mo7340e()
            androidx.media3.extractor.ax r1 = r4.f11264f
            r2 = 2
            int r1 = r1.mo7336a(r2)
            androidx.media3.extractor.ax r3 = r4.f11264f
            r6 = 5
            r3.mo7341f(r6)
            androidx.media3.extractor.ax r3 = r4.f11264f
            boolean r3 = r3.mo7343h()
            if (r3 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r3 = r4.f11264f
            r3.mo7337b()
            androidx.media3.extractor.ax r3 = r4.f11264f
            boolean r3 = r3.mo7343h()
            if (r3 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r3 = r4.f11264f
            int r3 = r3.mo7337b()
            boolean r7 = r4.f11261c
            r8 = 1
            if (r7 != 0) goto L_0x0092
            r4.f11269k = r5
            androidx.media3.extractor.k.p r1 = r4.f11272n
            r1.f11247e = r3
            r1.f11244b = r8
            return
        L_0x0092:
            androidx.media3.extractor.ax r7 = r4.f11264f
            boolean r7 = r7.mo7343h()
            if (r7 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r7 = r4.f11264f
            int r7 = r7.mo7337b()
            android.util.SparseArray r9 = r4.f11263e
            int r9 = r9.indexOfKey(r7)
            if (r9 >= 0) goto L_0x00ab
            r4.f11269k = r5
            return
        L_0x00ab:
            android.util.SparseArray r9 = r4.f11263e
            java.lang.Object r9 = r9.get(r7)
            androidx.media3.extractor.at r9 = (androidx.media3.extractor.C3345at) r9
            android.util.SparseArray r10 = r4.f11262d
            int r11 = r9.f10099b
            java.lang.Object r10 = r10.get(r11)
            androidx.media3.extractor.au r10 = (androidx.media3.extractor.C3346au) r10
            boolean r11 = r10.f10108h
            if (r11 == 0) goto L_0x00ce
            androidx.media3.extractor.ax r11 = r4.f11264f
            boolean r11 = r11.mo7342g(r2)
            if (r11 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r11 = r4.f11264f
            r11.mo7341f(r2)
        L_0x00ce:
            androidx.media3.extractor.ax r2 = r4.f11264f
            int r11 = r10.f10110j
            boolean r2 = r2.mo7342g(r11)
            if (r2 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r2 = r4.f11264f
            int r11 = r10.f10110j
            int r2 = r2.mo7336a(r11)
            boolean r11 = r10.f10109i
            if (r11 != 0) goto L_0x0104
            androidx.media3.extractor.ax r11 = r4.f11264f
            boolean r11 = r11.mo7342g(r8)
            if (r11 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r11 = r4.f11264f
            boolean r11 = r11.mo7344i()
            if (r11 == 0) goto L_0x0105
            androidx.media3.extractor.ax r12 = r4.f11264f
            boolean r12 = r12.mo7342g(r8)
            if (r12 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r12 = r4.f11264f
            boolean r12 = r12.mo7344i()
            r13 = 1
            goto L_0x0107
        L_0x0104:
            r11 = 0
        L_0x0105:
            r12 = 0
            r13 = 0
        L_0x0107:
            int r14 = r4.f11267i
            if (r14 != r6) goto L_0x010d
            r6 = 1
            goto L_0x010e
        L_0x010d:
            r6 = 0
        L_0x010e:
            if (r6 == 0) goto L_0x011f
            androidx.media3.extractor.ax r14 = r4.f11264f
            boolean r14 = r14.mo7343h()
            if (r14 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r14 = r4.f11264f
            int r14 = r14.mo7337b()
            goto L_0x0120
        L_0x011f:
            r14 = 0
        L_0x0120:
            int r15 = r10.f10111k
            if (r15 != 0) goto L_0x014e
            androidx.media3.extractor.ax r15 = r4.f11264f
            int r5 = r10.f10112l
            boolean r5 = r15.mo7342g(r5)
            if (r5 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r5 = r4.f11264f
            int r15 = r10.f10112l
            int r5 = r5.mo7336a(r15)
            boolean r9 = r9.f10100c
            if (r9 == 0) goto L_0x0180
            if (r11 != 0) goto L_0x0180
            androidx.media3.extractor.ax r9 = r4.f11264f
            boolean r9 = r9.mo7343h()
            if (r9 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r9 = r4.f11264f
            int r9 = r9.mo7338c()
            r15 = r9
            r8 = 0
            r9 = 0
            goto L_0x0183
        L_0x014e:
            if (r15 != r8) goto L_0x017f
            boolean r5 = r10.f10113m
            if (r5 != 0) goto L_0x017f
            androidx.media3.extractor.ax r5 = r4.f11264f
            boolean r5 = r5.mo7343h()
            if (r5 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r5 = r4.f11264f
            int r5 = r5.mo7338c()
            boolean r9 = r9.f10100c
            if (r9 == 0) goto L_0x017b
            if (r11 != 0) goto L_0x017b
            androidx.media3.extractor.ax r9 = r4.f11264f
            boolean r9 = r9.mo7343h()
            if (r9 == 0) goto L_0x01a9
            androidx.media3.extractor.ax r9 = r4.f11264f
            int r9 = r9.mo7338c()
            r8 = r9
            r15 = 0
            r9 = r5
            r5 = 0
            goto L_0x0183
        L_0x017b:
            r9 = r5
            r5 = 0
            r8 = 0
            goto L_0x0182
        L_0x017f:
            r5 = 0
        L_0x0180:
            r8 = 0
            r9 = 0
        L_0x0182:
            r15 = 0
        L_0x0183:
            androidx.media3.extractor.k.p r0 = r4.f11272n
            r0.f11245c = r10
            r0.f11246d = r1
            r0.f11247e = r3
            r0.f11248f = r2
            r0.f11249g = r7
            r0.f11250h = r11
            r0.f11251i = r13
            r0.f11252j = r12
            r0.f11253k = r6
            r0.f11254l = r14
            r0.f11255m = r5
            r0.f11256n = r15
            r0.f11257o = r9
            r0.f11258p = r8
            r1 = 1
            r0.f11243a = r1
            r0.f11244b = r1
            r0 = 0
            r4.f11269k = r0
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3565r.m10304f(byte[], int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0266, code lost:
        if (r6 != 1) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0194, code lost:
        if (r7.f11252j == r10.f11252j) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x019e, code lost:
        if (r14 != 0) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d4, code lost:
        if (r7.f11254l == r10.f11254l) goto L_0x0211;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x026e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0287 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x022d A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7466a(androidx.media3.common.p136b.C2604ac r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            androidx.media3.extractor.bf r2 = r0.f11286j
            androidx.media3.common.p136b.C2601a.m6829a(r2)
            int r2 = androidx.media3.common.p136b.C2612ak.f7249a
            int r2 = r1.f7235b
            int r3 = r1.f7236c
            byte[] r4 = r1.f7234a
            int r5 = r3 - r2
            long r6 = r0.f11283g
            long r8 = (long) r5
            long r6 = r6 + r8
            r0.f11283g = r6
            androidx.media3.extractor.bf r6 = r0.f11286j
            r6.mo6851c(r1, r5)
        L_0x001e:
            boolean[] r1 = r0.f11284h
            int r1 = androidx.media3.extractor.C3347av.m9692a(r4, r2, r3, r1)
            if (r1 == r3) goto L_0x028d
            int r5 = r1 + 3
            byte r6 = r4[r5]
            r6 = r6 & 31
            int r7 = r1 - r2
            if (r7 <= 0) goto L_0x0033
            r0.m10304f(r4, r2, r1)
        L_0x0033:
            int r1 = r3 - r1
            long r8 = r0.f11283g
            long r10 = (long) r1
            long r8 = r8 - r10
            if (r7 >= 0) goto L_0x003d
            int r7 = -r7
            goto L_0x003e
        L_0x003d:
            r7 = 0
        L_0x003e:
            long r10 = r0.f11289m
            boolean r12 = r0.f11288l
            r13 = 4
            if (r12 == 0) goto L_0x0052
            androidx.media3.extractor.k.q r12 = r0.f11287k
            boolean r12 = r12.f11261c
            if (r12 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            r17 = r3
            r16 = r5
            goto L_0x0122
        L_0x0052:
            androidx.media3.extractor.k.x r12 = r0.f11280d
            r12.mo7483d(r7)
            androidx.media3.extractor.k.x r12 = r0.f11281e
            r12.mo7483d(r7)
            boolean r12 = r0.f11288l
            if (r12 != 0) goto L_0x00ec
            androidx.media3.extractor.k.x r12 = r0.f11280d
            boolean r12 = r12.f11358a
            if (r12 == 0) goto L_0x004c
            androidx.media3.extractor.k.x r12 = r0.f11281e
            boolean r12 = r12.f11358a
            if (r12 == 0) goto L_0x004c
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            androidx.media3.extractor.k.x r15 = r0.f11280d
            byte[] r2 = r15.f11359b
            int r15 = r15.f11360c
            byte[] r2 = java.util.Arrays.copyOf(r2, r15)
            r12.add(r2)
            androidx.media3.extractor.k.x r2 = r0.f11281e
            byte[] r15 = r2.f11359b
            int r2 = r2.f11360c
            byte[] r2 = java.util.Arrays.copyOf(r15, r2)
            r12.add(r2)
            androidx.media3.extractor.k.x r2 = r0.f11280d
            byte[] r15 = r2.f11359b
            int r2 = r2.f11360c
            androidx.media3.extractor.au r2 = androidx.media3.extractor.C3347av.m9694c(r15, r13, r2)
            androidx.media3.extractor.k.x r15 = r0.f11281e
            byte[] r13 = r15.f11359b
            int r15 = r15.f11360c
            androidx.media3.extractor.at r13 = androidx.media3.extractor.C3347av.m9696e(r13, r15)
            int r15 = r2.f10101a
            int r14 = r2.f10102b
            r16 = r5
            int r5 = r2.f10103c
            java.lang.String r5 = androidx.media3.common.p136b.C2617e.m7013a(r15, r14, r5)
            androidx.media3.extractor.bf r14 = r0.f11286j
            androidx.media3.common.w r15 = new androidx.media3.common.w
            r15.<init>()
            r17 = r3
            java.lang.String r3 = r0.f11285i
            r15.f7449a = r3
            java.lang.String r3 = "video/avc"
            r15.f7459k = r3
            r15.f7456h = r5
            int r3 = r2.f10105e
            r15.f7464p = r3
            int r3 = r2.f10106f
            r15.f7465q = r3
            float r3 = r2.f10107g
            r15.f7468t = r3
            r15.f7461m = r12
            androidx.media3.common.x r3 = new androidx.media3.common.x
            r3.<init>(r15)
            r14.mo6850b(r3)
            r3 = 1
            r0.f11288l = r3
            androidx.media3.extractor.k.q r3 = r0.f11287k
            r3.mo7477b(r2)
            androidx.media3.extractor.k.q r2 = r0.f11287k
            r2.mo7476a(r13)
            androidx.media3.extractor.k.x r2 = r0.f11280d
            r2.mo7481b()
            androidx.media3.extractor.k.x r2 = r0.f11281e
            r2.mo7481b()
            goto L_0x0122
        L_0x00ec:
            r17 = r3
            r16 = r5
            androidx.media3.extractor.k.x r2 = r0.f11280d
            boolean r3 = r2.f11358a
            if (r3 == 0) goto L_0x010a
            byte[] r3 = r2.f11359b
            int r2 = r2.f11360c
            r5 = 4
            androidx.media3.extractor.au r2 = androidx.media3.extractor.C3347av.m9694c(r3, r5, r2)
            androidx.media3.extractor.k.q r3 = r0.f11287k
            r3.mo7477b(r2)
            androidx.media3.extractor.k.x r2 = r0.f11280d
            r2.mo7481b()
            goto L_0x0122
        L_0x010a:
            androidx.media3.extractor.k.x r2 = r0.f11281e
            boolean r3 = r2.f11358a
            if (r3 == 0) goto L_0x0122
            byte[] r3 = r2.f11359b
            int r2 = r2.f11360c
            androidx.media3.extractor.at r2 = androidx.media3.extractor.C3347av.m9696e(r3, r2)
            androidx.media3.extractor.k.q r3 = r0.f11287k
            r3.mo7476a(r2)
            androidx.media3.extractor.k.x r2 = r0.f11281e
            r2.mo7481b()
        L_0x0122:
            androidx.media3.extractor.k.x r2 = r0.f11282f
            boolean r2 = r2.mo7483d(r7)
            if (r2 == 0) goto L_0x014c
            androidx.media3.extractor.k.x r2 = r0.f11282f
            byte[] r3 = r2.f11359b
            int r2 = r2.f11360c
            int r2 = androidx.media3.extractor.C3347av.m9693b(r3, r2)
            androidx.media3.common.b.ac r3 = r0.f11291o
            androidx.media3.extractor.k.x r5 = r0.f11282f
            byte[] r5 = r5.f11359b
            r3.mo6157y(r5, r2)
            androidx.media3.common.b.ac r2 = r0.f11291o
            r3 = 4
            r2.mo6131A(r3)
            androidx.media3.extractor.k.ah r2 = r0.f11277a
            androidx.media3.common.b.ac r3 = r0.f11291o
            androidx.media3.extractor.bf[] r2 = r2.f11064a
            androidx.media3.extractor.C3624n.m10438a(r10, r3, r2)
        L_0x014c:
            androidx.media3.extractor.k.q r2 = r0.f11287k
            boolean r3 = r0.f11288l
            boolean r5 = r0.f11290n
            int r7 = r2.f11267i
            r10 = 9
            if (r7 == r10) goto L_0x01d6
            boolean r7 = r2.f11261c
            if (r7 == 0) goto L_0x0211
            androidx.media3.extractor.k.p r7 = r2.f11272n
            androidx.media3.extractor.k.p r10 = r2.f11271m
            boolean r11 = r7.f11243a
            if (r11 != 0) goto L_0x0166
            goto L_0x0211
        L_0x0166:
            boolean r11 = r10.f11243a
            if (r11 != 0) goto L_0x016c
            goto L_0x01d6
        L_0x016c:
            androidx.media3.extractor.au r11 = r7.f11245c
            androidx.media3.common.p136b.C2601a.m6829a(r11)
            androidx.media3.extractor.au r12 = r10.f11245c
            androidx.media3.common.p136b.C2601a.m6829a(r12)
            int r13 = r7.f11248f
            int r14 = r10.f11248f
            if (r13 != r14) goto L_0x01d6
            int r13 = r7.f11249g
            int r14 = r10.f11249g
            if (r13 != r14) goto L_0x01d6
            boolean r13 = r7.f11250h
            boolean r14 = r10.f11250h
            if (r13 != r14) goto L_0x01d6
            boolean r13 = r7.f11251i
            if (r13 == 0) goto L_0x0196
            boolean r13 = r10.f11251i
            if (r13 == 0) goto L_0x0196
            boolean r13 = r7.f11252j
            boolean r14 = r10.f11252j
            if (r13 != r14) goto L_0x01d6
        L_0x0196:
            int r13 = r7.f11246d
            int r14 = r10.f11246d
            if (r13 == r14) goto L_0x01a0
            if (r13 == 0) goto L_0x01d6
            if (r14 == 0) goto L_0x01d6
        L_0x01a0:
            int r11 = r11.f10111k
            if (r11 != 0) goto L_0x01b5
            int r11 = r12.f10111k
            if (r11 != 0) goto L_0x01c8
            int r11 = r7.f11255m
            int r12 = r10.f11255m
            if (r11 != r12) goto L_0x01d6
            int r11 = r7.f11256n
            int r12 = r10.f11256n
            if (r11 != r12) goto L_0x01d6
            goto L_0x01c8
        L_0x01b5:
            r13 = 1
            if (r11 != r13) goto L_0x01c8
            int r11 = r12.f10111k
            if (r11 != r13) goto L_0x01c8
            int r11 = r7.f11257o
            int r12 = r10.f11257o
            if (r11 != r12) goto L_0x01d6
            int r11 = r7.f11258p
            int r12 = r10.f11258p
            if (r11 != r12) goto L_0x01d6
        L_0x01c8:
            boolean r11 = r7.f11253k
            boolean r12 = r10.f11253k
            if (r11 != r12) goto L_0x01d6
            if (r11 == 0) goto L_0x0211
            int r7 = r7.f11254l
            int r10 = r10.f11254l
            if (r7 == r10) goto L_0x0211
        L_0x01d6:
            if (r3 == 0) goto L_0x0203
            boolean r3 = r2.f11273o
            if (r3 == 0) goto L_0x0203
            long r10 = r2.f11268j
            long r12 = r8 - r10
            int r3 = (int) r12
            int r23 = r1 + r3
            long r12 = r2.f11275q
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0203
            boolean r1 = r2.f11276r
            long r14 = r2.f11274p
            androidx.media3.extractor.bf r3 = r2.f11259a
            long r10 = r10 - r14
            int r7 = (int) r10
            r24 = 0
            r18 = r3
            r19 = r12
            r21 = r1
            r22 = r7
            r18.mo6852d(r19, r21, r22, r23, r24)
        L_0x0203:
            long r10 = r2.f11268j
            r2.f11274p = r10
            long r10 = r2.f11270l
            r2.f11275q = r10
            r1 = 0
            r2.f11276r = r1
            r1 = 1
            r2.f11273o = r1
        L_0x0211:
            boolean r1 = r2.f11260b
            r3 = 2
            if (r1 == 0) goto L_0x0226
            androidx.media3.extractor.k.p r1 = r2.f11272n
            boolean r5 = r1.f11244b
            if (r5 == 0) goto L_0x0225
            int r1 = r1.f11247e
            r5 = 7
            if (r1 == r5) goto L_0x0223
            if (r1 != r3) goto L_0x0225
        L_0x0223:
            r5 = 1
            goto L_0x0226
        L_0x0225:
            r5 = 0
        L_0x0226:
            boolean r1 = r2.f11276r
            int r7 = r2.f11267i
            r10 = 5
            if (r7 == r10) goto L_0x0235
            if (r5 == 0) goto L_0x0233
            r5 = 1
            if (r7 != r5) goto L_0x0233
            goto L_0x0235
        L_0x0233:
            r5 = 0
            goto L_0x0236
        L_0x0235:
            r5 = 1
        L_0x0236:
            r1 = r1 | r5
            r2.f11276r = r1
            if (r1 == 0) goto L_0x023e
            r1 = 0
            r0.f11290n = r1
        L_0x023e:
            long r1 = r0.f11289m
            boolean r5 = r0.f11288l
            if (r5 == 0) goto L_0x024a
            androidx.media3.extractor.k.q r5 = r0.f11287k
            boolean r5 = r5.f11261c
            if (r5 == 0) goto L_0x0254
        L_0x024a:
            androidx.media3.extractor.k.x r5 = r0.f11280d
            r5.mo7482c(r6)
            androidx.media3.extractor.k.x r5 = r0.f11281e
            r5.mo7482c(r6)
        L_0x0254:
            androidx.media3.extractor.k.x r5 = r0.f11282f
            r5.mo7482c(r6)
            androidx.media3.extractor.k.q r5 = r0.f11287k
            r5.f11267i = r6
            r5.f11270l = r1
            r5.f11268j = r8
            boolean r1 = r5.f11260b
            if (r1 == 0) goto L_0x0269
            r1 = 1
            if (r6 == r1) goto L_0x0274
            goto L_0x026a
        L_0x0269:
            r1 = 1
        L_0x026a:
            boolean r2 = r5.f11261c
            if (r2 == 0) goto L_0x0287
            if (r6 == r10) goto L_0x0274
            if (r6 == r1) goto L_0x0274
            if (r6 != r3) goto L_0x0287
        L_0x0274:
            androidx.media3.extractor.k.p r1 = r5.f11271m
            androidx.media3.extractor.k.p r2 = r5.f11272n
            r5.f11271m = r2
            r5.f11272n = r1
            androidx.media3.extractor.k.p r1 = r5.f11272n
            r1.mo7475a()
            r1 = 0
            r5.f11266h = r1
            r1 = 1
            r5.f11269k = r1
        L_0x0287:
            r2 = r16
            r3 = r17
            goto L_0x001e
        L_0x028d:
            r1 = r3
            r0.m10304f(r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3565r.mo7466a(androidx.media3.common.b.ac):void");
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        this.f11285i = arVar.f11109b;
        arVar.mo7463b();
        this.f11286j = adVar.mo6987eZ(arVar.f11108a, 2);
        this.f11287k = new C3564q(this.f11286j, this.f11278b, this.f11279c);
        this.f11277a.mo7459a(adVar, arVar);
    }

    /* renamed from: c */
    public final void mo7468c() {
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f11289m = j;
        }
        this.f11290n |= (i & 2) != 0;
    }

    /* renamed from: e */
    public final void mo7470e() {
        this.f11283g = 0;
        this.f11290n = false;
        this.f11289m = -9223372036854775807L;
        C3347av.m9695d(this.f11284h);
        this.f11280d.mo7481b();
        this.f11281e.mo7481b();
        this.f11282f.mo7481b();
        C3564q qVar = this.f11287k;
        if (qVar != null) {
            qVar.mo7478c();
        }
    }
}
