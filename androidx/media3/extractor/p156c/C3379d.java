package androidx.media3.extractor.p156c;

import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3332ag;
import androidx.media3.extractor.C3333ah;
import androidx.media3.extractor.C3334ai;
import androidx.media3.extractor.C3337al;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.c.d */
/* compiled from: PG */
public final class C3379d implements C3326aa {

    /* renamed from: a */
    private final byte[] f10210a;

    /* renamed from: b */
    private final C2604ac f10211b;

    /* renamed from: c */
    private final C3332ag f10212c;

    /* renamed from: d */
    private C3329ad f10213d;

    /* renamed from: e */
    private C3368bf f10214e;

    /* renamed from: f */
    private int f10215f;

    /* renamed from: g */
    private Metadata f10216g;

    /* renamed from: h */
    private C3337al f10217h;

    /* renamed from: i */
    private int f10218i;

    /* renamed from: j */
    private int f10219j;

    /* renamed from: k */
    private C3378c f10220k;

    /* renamed from: l */
    private int f10221l;

    /* renamed from: m */
    private long f10222m;

    public C3379d() {
        this((byte[]) null);
    }

    public C3379d(byte[] bArr) {
        this.f10210a = new byte[42];
        this.f10211b = new C2604ac(new byte[32768], 0);
        this.f10212c = new C3332ag();
        this.f10215f = 0;
    }

    /* renamed from: f */
    private final long m9767f(C2604ac acVar, boolean z) {
        boolean z2;
        this.f10217h.getClass();
        int i = acVar.f7235b;
        while (i <= acVar.f7236c - 16) {
            acVar.mo6131A(i);
            if (C3333ah.m9653c(acVar, this.f10217h, this.f10219j, this.f10212c)) {
                acVar.mo6131A(i);
                return this.f10212c.f10054a;
            }
            i++;
        }
        if (z) {
            while (true) {
                int i2 = acVar.f7236c;
                if (i <= i2 - this.f10218i) {
                    acVar.mo6131A(i);
                    try {
                        z2 = C3333ah.m9653c(acVar, this.f10217h, this.f10219j, this.f10212c);
                    } catch (IndexOutOfBoundsException unused) {
                        z2 = false;
                    }
                    if (acVar.f7235b <= acVar.f7236c && z2) {
                        acVar.mo6131A(i);
                        return this.f10212c.f10054a;
                    }
                    i++;
                } else {
                    acVar.mo6131A(i2);
                    return -1;
                }
            }
        } else {
            acVar.mo6131A(i);
            return -1;
        }
    }

    /* renamed from: g */
    private final void m9768g() {
        long j = this.f10222m;
        C3337al alVar = this.f10217h;
        int i = C2612ak.f7249a;
        this.f10214e.mo6852d((j * 1000000) / ((long) alVar.f10063e), 1, this.f10221l, 0, (C3367be) null);
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        C3334ai.m9654a(abVar, false);
        C2604ac acVar = new C2604ac(4);
        ((C3627q) abVar).mo7320o(acVar.f7234a, 0, 4, false);
        if (acVar.mo6146n() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f10213d = adVar;
        this.f10214e = adVar.mo6987eZ(0, 1);
        adVar.mo6988fa();
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f10215f = 0;
        } else {
            C3378c cVar = this.f10220k;
            if (cVar != null) {
                cVar.mo7488b(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f10222m = j3;
        this.f10221l = 0;
        this.f10211b.mo6156x(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x026e A[LOOP:0: B:65:0x016c->B:83:0x026e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0250 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7152a(androidx.media3.extractor.C3327ab r24, androidx.media3.extractor.C3350ay r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.f10215f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x02aa
            r5 = 2
            if (r2 == r3) goto L_0x029c
            r6 = 3
            r7 = 0
            r8 = 4
            if (r2 == r5) goto L_0x0279
            r9 = 7
            r10 = 6
            if (r2 == r6) goto L_0x016a
            r11 = -1
            if (r2 == r8) goto L_0x0101
            androidx.media3.extractor.bf r2 = r0.f10214e
            r2.getClass()
            androidx.media3.extractor.al r2 = r0.f10217h
            r2.getClass()
            androidx.media3.extractor.c.c r6 = r0.f10220k
            if (r6 == 0) goto L_0x0036
            boolean r8 = r6.mo7489c()
            if (r8 == 0) goto L_0x0036
            r8 = r25
            int r4 = r6.mo7487a(r1, r8)
            goto L_0x00f0
        L_0x0036:
            long r13 = r0.f10222m
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x007b
            r6 = r1
            androidx.media3.extractor.q r6 = (androidx.media3.extractor.C3627q) r6
            r6.f11568e = r4
            r6.mo7319n(r3, r4)
            byte[] r8 = new byte[r3]
            r6.mo7320o(r8, r4, r3, r4)
            byte r8 = r8[r4]
            r8 = r8 & r3
            r6.mo7319n(r5, r4)
            if (r3 == r8) goto L_0x0052
            r9 = 6
        L_0x0052:
            androidx.media3.common.b.ac r5 = new androidx.media3.common.b.ac
            r5.<init>((int) r9)
            byte[] r10 = r5.f7234a
            int r1 = androidx.media3.extractor.C3330ae.m9644a(r1, r10, r4, r9)
            r5.mo6158z(r1)
            r6.f11568e = r4
            androidx.media3.extractor.ag r1 = new androidx.media3.extractor.ag
            r1.<init>()
            if (r3 == r8) goto L_0x006a
            r3 = 0
        L_0x006a:
            boolean r2 = androidx.media3.extractor.C3333ah.m9652b(r5, r2, r3, r1)
            if (r2 == 0) goto L_0x0076
            long r1 = r1.f10054a
            r0.f10222m = r1
            goto L_0x00f0
        L_0x0076:
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r7, r7)
            throw r1
        L_0x007b:
            androidx.media3.common.b.ac r2 = r0.f10211b
            int r5 = r2.f7236c
            r6 = 32768(0x8000, float:4.5918E-41)
            if (r5 >= r6) goto L_0x00a7
            byte[] r2 = r2.f7234a
            int r6 = r6 - r5
            int r1 = r1.mo5879a(r2, r5, r6)
            r2 = -1
            if (r1 != r2) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r3 = 0
        L_0x0090:
            if (r3 != 0) goto L_0x0099
            androidx.media3.common.b.ac r2 = r0.f10211b
            int r5 = r5 + r1
            r2.mo6158z(r5)
            goto L_0x00a8
        L_0x0099:
            androidx.media3.common.b.ac r1 = r0.f10211b
            int r5 = r1.f7236c
            int r1 = r1.f7235b
            int r5 = r5 - r1
            if (r5 != 0) goto L_0x00a8
            r23.m9768g()
            r4 = -1
            goto L_0x00f0
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            androidx.media3.common.b.ac r1 = r0.f10211b
            int r2 = r1.f7235b
            int r5 = r0.f10221l
            int r6 = r0.f10218i
            if (r5 >= r6) goto L_0x00c0
            int r7 = r1.f7236c
            int r6 = r6 - r5
            int r7 = r7 - r2
            int r5 = java.lang.Math.min(r6, r7)
            int r6 = r1.f7235b
            int r6 = r6 + r5
            r1.mo6131A(r6)
        L_0x00c0:
            androidx.media3.common.b.ac r1 = r0.f10211b
            long r5 = r0.m9767f(r1, r3)
            androidx.media3.common.b.ac r1 = r0.f10211b
            int r3 = r1.f7235b
            int r3 = r3 - r2
            r1.mo6131A(r2)
            androidx.media3.extractor.bf r1 = r0.f10214e
            androidx.media3.common.b.ac r2 = r0.f10211b
            r1.mo6851c(r2, r3)
            int r1 = r0.f10221l
            int r1 = r1 + r3
            r0.f10221l = r1
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x00e5
            r23.m9768g()
            r0.f10221l = r4
            r0.f10222m = r5
        L_0x00e5:
            androidx.media3.common.b.ac r1 = r0.f10211b
            int r2 = r1.f7236c
            int r3 = r1.f7235b
            int r2 = r2 - r3
            r5 = 16
            if (r2 < r5) goto L_0x00f1
        L_0x00f0:
            return r4
        L_0x00f1:
            byte[] r1 = r1.f7234a
            java.lang.System.arraycopy(r1, r3, r1, r4, r2)
            androidx.media3.common.b.ac r1 = r0.f10211b
            r1.mo6131A(r4)
            androidx.media3.common.b.ac r1 = r0.f10211b
            r1.mo6158z(r2)
            return r4
        L_0x0101:
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r1.f11568e = r4
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            r2.<init>((int) r5)
            byte[] r3 = r2.f7234a
            r1.mo7320o(r3, r4, r5, r4)
            int r2 = r2.mo6142j()
            int r3 = r2 >> 2
            r5 = 16382(0x3ffe, float:2.2956E-41)
            if (r3 != r5) goto L_0x0161
            r1.f11568e = r4
            r0.f10219j = r2
            androidx.media3.extractor.ad r2 = r0.f10213d
            int r3 = androidx.media3.common.p136b.C2612ak.f7249a
            long r5 = r1.f11566c
            long r7 = r1.f11565b
            androidx.media3.extractor.al r14 = r0.f10217h
            r14.getClass()
            androidx.media3.extractor.ak r1 = r14.f10069k
            if (r1 == 0) goto L_0x0134
            androidx.media3.extractor.aj r1 = new androidx.media3.extractor.aj
            r1.<init>(r14, r5)
            goto L_0x015a
        L_0x0134:
            r9 = 0
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x0151
            long r11 = r14.f10068j
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0151
            androidx.media3.extractor.c.c r1 = new androidx.media3.extractor.c.c
            int r15 = r0.f10219j
            r13 = r1
            r16 = r5
            r18 = r7
            r13.<init>(r14, r15, r16, r18)
            r0.f10220k = r1
            androidx.media3.extractor.g r1 = r1.f11419a
            goto L_0x015a
        L_0x0151:
            androidx.media3.extractor.ba r1 = new androidx.media3.extractor.ba
            long r5 = r14.mo7327a()
            r1.<init>(r5, r9)
        L_0x015a:
            r2.mo6989q(r1)
            r1 = 5
            r0.f10215f = r1
            return r4
        L_0x0161:
            r1.f11568e = r4
            java.lang.String r1 = "First frame does not start with sync code."
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r7)
            throw r1
        L_0x016a:
            androidx.media3.extractor.al r2 = r0.f10217h
        L_0x016c:
            r3 = r1
            androidx.media3.extractor.q r3 = (androidx.media3.extractor.C3627q) r3
            r3.f11568e = r4
            androidx.media3.common.b.ab r5 = new androidx.media3.common.b.ab
            byte[] r7 = new byte[r8]
            r5.<init>(r7, r8)
            byte[] r7 = r5.f7230a
            r3.mo7320o(r7, r4, r8, r4)
            boolean r7 = r5.mo6128m()
            int r11 = r5.mo6119d(r9)
            r12 = 24
            int r5 = r5.mo6119d(r12)
            int r5 = r5 + r8
            if (r11 != 0) goto L_0x019e
            r2 = 38
            byte[] r5 = new byte[r2]
            r3.mo7321p(r5, r4, r2, r4)
            androidx.media3.extractor.al r2 = new androidx.media3.extractor.al
            r2.<init>(r5, r8)
        L_0x019a:
            r25 = r7
            goto L_0x024a
        L_0x019e:
            if (r2 == 0) goto L_0x0273
            if (r11 != r6) goto L_0x01b5
            androidx.media3.common.b.ac r11 = new androidx.media3.common.b.ac
            r11.<init>((int) r5)
            byte[] r12 = r11.f7234a
            r3.mo7321p(r12, r4, r5, r4)
            androidx.media3.extractor.ak r3 = androidx.media3.extractor.C3334ai.m9655b(r11)
            androidx.media3.extractor.al r2 = r2.mo7331e(r3)
            goto L_0x019a
        L_0x01b5:
            if (r11 != r8) goto L_0x01ff
            androidx.media3.common.b.ac r11 = new androidx.media3.common.b.ac
            r11.<init>((int) r5)
            byte[] r12 = r11.f7234a
            r3.mo7321p(r12, r4, r5, r4)
            int r3 = r11.f7235b
            int r3 = r3 + r8
            r11.mo6131A(r3)
            androidx.media3.extractor.bi r3 = androidx.media3.extractor.C3374bl.m9760c(r11, r4, r4)
            java.lang.String[] r3 = r3.f10191a
            java.util.List r3 = java.util.Arrays.asList(r3)
            androidx.media3.common.Metadata r3 = androidx.media3.extractor.C3374bl.m9759b(r3)
            androidx.media3.common.Metadata r22 = r2.mo7330d(r3)
            androidx.media3.extractor.al r3 = new androidx.media3.extractor.al
            int r12 = r2.f10059a
            int r13 = r2.f10060b
            int r14 = r2.f10061c
            int r15 = r2.f10062d
            int r5 = r2.f10063e
            int r11 = r2.f10065g
            int r9 = r2.f10066h
            r25 = r7
            long r6 = r2.f10068j
            androidx.media3.extractor.ak r2 = r2.f10069k
            r17 = r11
            r11 = r3
            r16 = r5
            r18 = r9
            r19 = r6
            r21 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r21, r22)
        L_0x01fd:
            r2 = r3
            goto L_0x024a
        L_0x01ff:
            r25 = r7
            if (r11 != r10) goto L_0x0247
            androidx.media3.common.b.ac r6 = new androidx.media3.common.b.ac
            r6.<init>((int) r5)
            byte[] r7 = r6.f7234a
            r3.mo7321p(r7, r4, r5, r4)
            int r3 = r6.f7235b
            int r3 = r3 + r8
            r6.mo6131A(r3)
            androidx.media3.extractor.metadata.flac.PictureFrame r3 = androidx.media3.extractor.metadata.flac.PictureFrame.m10391d(r6)
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89846n(r3)
            androidx.media3.common.Metadata r5 = new androidx.media3.common.Metadata
            r5.<init>((java.util.List) r3)
            androidx.media3.common.Metadata r22 = r2.mo7330d(r5)
            androidx.media3.extractor.al r3 = new androidx.media3.extractor.al
            int r12 = r2.f10059a
            int r13 = r2.f10060b
            int r14 = r2.f10061c
            int r15 = r2.f10062d
            int r5 = r2.f10063e
            int r6 = r2.f10065g
            int r7 = r2.f10066h
            long r8 = r2.f10068j
            androidx.media3.extractor.ak r2 = r2.f10069k
            r11 = r3
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r21 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r21, r22)
            goto L_0x01fd
        L_0x0247:
            r3.mo7639q(r5)
        L_0x024a:
            int r3 = androidx.media3.common.p136b.C2612ak.f7249a
            r0.f10217h = r2
            if (r25 == 0) goto L_0x026e
            r2.getClass()
            int r1 = r2.f10061c
            int r1 = java.lang.Math.max(r1, r10)
            r0.f10218i = r1
            androidx.media3.extractor.bf r1 = r0.f10214e
            androidx.media3.extractor.al r2 = r0.f10217h
            byte[] r3 = r0.f10210a
            androidx.media3.common.Metadata r5 = r0.f10216g
            androidx.media3.common.x r2 = r2.mo7329c(r3, r5)
            r1.mo6850b(r2)
            r3 = 4
            r0.f10215f = r3
            return r4
        L_0x026e:
            r6 = 3
            r8 = 4
            r9 = 7
            goto L_0x016c
        L_0x0273:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x0279:
            r3 = 4
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            r2.<init>((int) r3)
            byte[] r5 = r2.f7234a
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r1.mo7321p(r5, r4, r3, r4)
            long r1 = r2.mo6146n()
            r5 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0295
            r1 = 3
            r0.f10215f = r1
            return r4
        L_0x0295:
            java.lang.String r1 = "Failed to read FLAC stream marker."
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r7)
            throw r1
        L_0x029c:
            byte[] r2 = r0.f10210a
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r3 = 42
            r1.mo7320o(r2, r4, r3, r4)
            r1.f11568e = r4
            r0.f10215f = r5
            return r4
        L_0x02aa:
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            r2.f11568e = r4
            long r5 = r24.mo7312e()
            androidx.media3.common.Metadata r7 = androidx.media3.extractor.C3334ai.m9654a(r1, r3)
            long r8 = r24.mo7312e()
            long r8 = r8 - r5
            int r1 = (int) r8
            r2.mo7639q(r1)
            r0.f10216g = r7
            r0.f10215f = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p156c.C3379d.mo7152a(androidx.media3.extractor.ab, androidx.media3.extractor.ay):int");
    }
}
