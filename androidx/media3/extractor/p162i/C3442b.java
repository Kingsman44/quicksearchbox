package androidx.media3.extractor.p162i;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3364bb;

/* renamed from: androidx.media3.extractor.i.b */
/* compiled from: PG */
final class C3442b implements C3448h {

    /* renamed from: a */
    public final long f10618a;

    /* renamed from: b */
    public final long f10619b;

    /* renamed from: c */
    public final C3452l f10620c;

    /* renamed from: d */
    public long f10621d;

    /* renamed from: e */
    private final C3447g f10622e;

    /* renamed from: f */
    private int f10623f;

    /* renamed from: g */
    private long f10624g;

    /* renamed from: h */
    private long f10625h;

    /* renamed from: i */
    private long f10626i;

    /* renamed from: j */
    private long f10627j;

    /* renamed from: k */
    private long f10628k;

    /* renamed from: l */
    private long f10629l;

    public C3442b(C3452l lVar, long j, long j2, long j3, long j4, boolean z) {
        C2601a.m6830b(j >= 0 && j2 > j);
        this.f10620c = lVar;
        this.f10618a = j;
        this.f10619b = j2;
        if (j3 == j2 - j || z) {
            this.f10621d = j4;
            this.f10623f = 4;
        } else {
            this.f10623f = 0;
        }
        this.f10622e = new C3447g();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3364bb mo7401b() {
        if (this.f10621d != 0) {
            return new C3441a(this);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo7402c(long j) {
        this.f10625h = C2612ak.m6994s(j, 0, -1 + this.f10621d);
        this.f10623f = 2;
        this.f10626i = this.f10618a;
        this.f10627j = this.f10619b;
        this.f10628k = 0;
        this.f10629l = this.f10621d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo7400a(androidx.media3.extractor.C3327ab r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r0.f10623f
            r3 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L_0x00ec
            if (r2 == r3) goto L_0x00ff
            r3 = 2
            r10 = 3
            if (r2 == r3) goto L_0x0015
            if (r2 == r10) goto L_0x00af
            return r6
        L_0x0015:
            long r2 = r0.f10626i
            long r11 = r0.f10627j
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0020
        L_0x001d:
            r2 = r6
            goto L_0x00a7
        L_0x0020:
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r13 = r2.f11566c
            androidx.media3.extractor.i.g r3 = r0.f10622e
            boolean r3 = r3.mo7409c(r1, r11)
            if (r3 != 0) goto L_0x003d
            long r2 = r0.f10626i
            int r11 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0035
            goto L_0x00a7
        L_0x0035:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x003d:
            androidx.media3.extractor.i.g r3 = r0.f10622e
            r3.mo7408b(r1, r5)
            r2.f11568e = r5
            long r11 = r0.f10625h
            androidx.media3.extractor.i.g r3 = r0.f10622e
            long r8 = r3.f10645b
            long r11 = r11 - r8
            int r15 = r3.f10647d
            int r3 = r3.f10648e
            int r15 = r15 + r3
            r16 = 0
            int r3 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r3 < 0) goto L_0x005e
            r18 = 72000(0x11940, double:3.55727E-319)
            int r3 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x005e
            goto L_0x001d
        L_0x005e:
            int r3 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x0067
            r0.f10627j = r13
            r0.f10629l = r8
            goto L_0x006f
        L_0x0067:
            long r13 = r2.f11566c
            long r4 = (long) r15
            long r13 = r13 + r4
            r0.f10626i = r13
            r0.f10628k = r8
        L_0x006f:
            long r3 = r0.f10627j
            long r8 = r0.f10626i
            long r13 = r3 - r8
            r19 = 100000(0x186a0, double:4.94066E-319)
            int r5 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r5 >= 0) goto L_0x0080
            r0.f10627j = r8
            r2 = r8
            goto L_0x00a7
        L_0x0080:
            long r6 = (long) r15
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 > 0) goto L_0x008a
            r19 = r11
            r16 = 2
            goto L_0x008e
        L_0x008a:
            r16 = 1
            r19 = r11
        L_0x008e:
            long r10 = r2.f11566c
            long r6 = r6 * r16
            long r10 = r10 - r6
            long r6 = r19 * r13
            long r12 = r0.f10629l
            long r14 = r0.f10628k
            long r12 = r12 - r14
            long r6 = r6 / r12
            long r19 = r10 + r6
            r6 = -1
            long r23 = r3 + r6
            r21 = r8
            long r2 = androidx.media3.common.p136b.C2612ak.m6994s(r19, r21, r23)
        L_0x00a7:
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x00ac
            return r2
        L_0x00ac:
            r2 = 3
            r0.f10623f = r2
        L_0x00af:
            androidx.media3.extractor.i.g r2 = r0.f10622e
            r2.mo7409c(r1, r6)
            androidx.media3.extractor.i.g r2 = r0.f10622e
            r3 = 0
            r2.mo7408b(r1, r3)
            androidx.media3.extractor.i.g r2 = r0.f10622e
            long r4 = r2.f10645b
            long r6 = r0.f10625h
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d2
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r1.f11568e = r3
            r1 = 4
            r0.f10623f = r1
            long r1 = r0.f10628k
            r4 = 2
            long r1 = r1 + r4
            long r1 = -r1
            return r1
        L_0x00d2:
            r4 = 2
            int r3 = r2.f10647d
            int r2 = r2.f10648e
            r6 = r1
            androidx.media3.extractor.q r6 = (androidx.media3.extractor.C3627q) r6
            int r3 = r3 + r2
            r6.mo7639q(r3)
            long r2 = r6.f11566c
            r0.f10626i = r2
            androidx.media3.extractor.i.g r2 = r0.f10622e
            long r2 = r2.f10645b
            r0.f10628k = r2
            r6 = -1
            goto L_0x00af
        L_0x00ec:
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r4 = r2.f11566c
            r0.f10624g = r4
            r0.f10623f = r3
            long r6 = r0.f10619b
            r8 = -65307(0xffffffffffff00e5, double:NaN)
            long r6 = r6 + r8
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0166
        L_0x00ff:
            androidx.media3.extractor.i.g r2 = r0.f10622e
            r2.mo7407a()
            androidx.media3.extractor.i.g r2 = r0.f10622e
            r4 = -1
            boolean r2 = r2.mo7409c(r1, r4)
            if (r2 == 0) goto L_0x0160
            androidx.media3.extractor.i.g r2 = r0.f10622e
            r4 = 0
            r2.mo7408b(r1, r4)
            androidx.media3.extractor.i.g r2 = r0.f10622e
            int r4 = r2.f10647d
            int r2 = r2.f10648e
            r5 = r1
            androidx.media3.extractor.q r5 = (androidx.media3.extractor.C3627q) r5
            int r4 = r4 + r2
            r5.mo7639q(r4)
            androidx.media3.extractor.i.g r2 = r0.f10622e
            long r6 = r2.f10645b
        L_0x0125:
            androidx.media3.extractor.i.g r2 = r0.f10622e
            int r4 = r2.f10644a
            r8 = 4
            r4 = r4 & r8
            if (r4 == r8) goto L_0x0158
            r8 = -1
            boolean r2 = r2.mo7409c(r1, r8)
            if (r2 == 0) goto L_0x0158
            long r10 = r5.f11566c
            long r12 = r0.f10619b
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0158
            androidx.media3.extractor.i.g r2 = r0.f10622e
            boolean r2 = r2.mo7408b(r1, r3)
            if (r2 == 0) goto L_0x0158
            androidx.media3.extractor.i.g r2 = r0.f10622e
            int r4 = r2.f10647d
            int r2 = r2.f10648e
            int r4 = r4 + r2
            boolean r2 = androidx.media3.extractor.C3330ae.m9647d(r1, r4)
            if (r2 != 0) goto L_0x0153
            goto L_0x0158
        L_0x0153:
            androidx.media3.extractor.i.g r2 = r0.f10622e
            long r6 = r2.f10645b
            goto L_0x0125
        L_0x0158:
            r0.f10621d = r6
            r1 = 4
            r0.f10623f = r1
            long r1 = r0.f10624g
            return r1
        L_0x0160:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x0166:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p162i.C3442b.mo7400a(androidx.media3.extractor.ab):long");
    }
}
