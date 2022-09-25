package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yq */
/* compiled from: PG */
final class C7450yq extends C7382wc {

    /* renamed from: o */
    private static final AtomicInteger f24412o = new AtomicInteger();

    /* renamed from: A */
    private final boolean f24413A;

    /* renamed from: B */
    private C7463zc f24414B;

    /* renamed from: C */
    private int f24415C;

    /* renamed from: D */
    private boolean f24416D;

    /* renamed from: E */
    private volatile boolean f24417E;

    /* renamed from: F */
    private boolean f24418F;

    /* renamed from: G */
    private arn f24419G;

    /* renamed from: H */
    private boolean f24420H;

    /* renamed from: I */
    private final C7439yf f24421I;

    /* renamed from: J */
    private C7439yf f24422J;

    /* renamed from: a */
    public final int f24423a;

    /* renamed from: b */
    public final int f24424b;

    /* renamed from: m */
    public final Uri f24425m;

    /* renamed from: n */
    public final boolean f24426n;

    /* renamed from: p */
    private final abx f24427p;

    /* renamed from: q */
    private final acb f24428q;

    /* renamed from: r */
    private final boolean f24429r;

    /* renamed from: s */
    private final boolean f24430s;

    /* renamed from: t */
    private final aes f24431t;

    /* renamed from: u */
    private final C7449yp f24432u;

    /* renamed from: v */
    private final List f24433v;

    /* renamed from: w */
    private final C7031jc f24434w;

    /* renamed from: x */
    private final C7272sa f24435x;

    /* renamed from: y */
    private final aee f24436y;

    /* renamed from: z */
    private final boolean f24437z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C7450yq(C7449yp ypVar, abx abx, acb acb, C6864cy cyVar, boolean z, abx abx2, acb acb2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, boolean z4, aes aes, C7031jc jcVar, C7439yf yfVar, C7272sa saVar, aee aee, boolean z5) {
        super(abx, acb, cyVar, i, obj, j, j2, j3);
        acb acb3 = acb2;
        this.f24437z = z;
        this.f24424b = i2;
        this.f24428q = acb3;
        this.f24427p = abx2;
        this.f24416D = acb3 != null;
        this.f24413A = z2;
        this.f24425m = uri;
        this.f24429r = z4;
        this.f24431t = aes;
        this.f24430s = z3;
        this.f24432u = ypVar;
        this.f24433v = list;
        this.f24434w = jcVar;
        this.f24421I = yfVar;
        this.f24435x = saVar;
        this.f24436y = aee;
        this.f24426n = z5;
        this.f24419G = arn.m19402i();
        this.f24423a = f24412o.getAndIncrement();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (r20 >= r3.f24095j) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.ads.interactivemedia.p367v3.internal.C7450yq m22531a(com.google.ads.interactivemedia.p367v3.internal.C7449yp r37, com.google.ads.interactivemedia.p367v3.internal.abx r38, com.google.ads.interactivemedia.p367v3.internal.C6864cy r39, long r40, com.google.ads.interactivemedia.p367v3.internal.C7480zt r42, int r43, android.net.Uri r44, java.util.List r45, int r46, java.lang.Object r47, boolean r48, com.google.ads.interactivemedia.p367v3.internal.C7469zi r49, com.google.ads.interactivemedia.p367v3.internal.C7450yq r50, byte[] r51, byte[] r52) {
        /*
            r0 = r38
            r1 = r42
            r2 = r43
            r3 = r50
            r4 = r51
            r5 = r52
            java.util.List r6 = r1.f24634m
            java.lang.Object r6 = r6.get(r2)
            com.google.ads.interactivemedia.v3.internal.zs r6 = (com.google.ads.interactivemedia.p367v3.internal.C7479zs) r6
            com.google.ads.interactivemedia.v3.internal.acb r13 = new com.google.ads.interactivemedia.v3.internal.acb
            java.lang.String r7 = r1.f24637p
            java.lang.String r8 = r6.f24611a
            android.net.Uri r8 = com.google.ads.interactivemedia.p367v3.internal.atv.m19617i(r7, r8)
            long r9 = r6.f24619i
            long r11 = r6.f24620j
            r7 = r13
            r7.<init>(r8, r9, r11)
            if (r4 == 0) goto L_0x002a
            r12 = 1
            goto L_0x002b
        L_0x002a:
            r12 = 0
        L_0x002b:
            if (r12 == 0) goto L_0x0037
            java.lang.String r10 = r6.f24618h
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r10)
            byte[] r10 = m22533m(r10)
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            com.google.ads.interactivemedia.v3.internal.abx r4 = m22534n(r0, r4, r10)
            com.google.ads.interactivemedia.v3.internal.zs r10 = r6.f24612b
            if (r10 == 0) goto L_0x0073
            if (r5 == 0) goto L_0x0044
            r11 = 1
            goto L_0x0045
        L_0x0044:
            r11 = 0
        L_0x0045:
            if (r11 == 0) goto L_0x0051
            java.lang.String r14 = r10.f24618h
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r14)
            byte[] r14 = m22533m(r14)
            goto L_0x0052
        L_0x0051:
            r14 = 0
        L_0x0052:
            java.lang.String r15 = r1.f24637p
            java.lang.String r7 = r10.f24611a
            android.net.Uri r18 = com.google.ads.interactivemedia.p367v3.internal.atv.m19617i(r15, r7)
            com.google.ads.interactivemedia.v3.internal.acb r7 = new com.google.ads.interactivemedia.v3.internal.acb
            long r8 = r10.f24619i
            r51 = r11
            long r10 = r10.f24620j
            r17 = r7
            r19 = r8
            r21 = r10
            r17.<init>(r18, r19, r21)
            com.google.ads.interactivemedia.v3.internal.abx r0 = m22534n(r0, r5, r14)
            r5 = r51
            r14 = r7
            goto L_0x0076
        L_0x0073:
            r0 = 0
            r5 = 0
            r14 = 0
        L_0x0076:
            long r7 = r6.f24615e
            long r20 = r40 + r7
            long r7 = r6.f24613c
            long r31 = r20 + r7
            int r7 = r1.f24626e
            int r8 = r6.f24614d
            int r11 = r7 + r8
            if (r3 == 0) goto L_0x00cc
            android.net.Uri r7 = r3.f24425m
            r10 = r44
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x0096
            boolean r7 = r3.f24418F
            if (r7 == 0) goto L_0x0096
            r7 = 1
            goto L_0x0097
        L_0x0096:
            r7 = 0
        L_0x0097:
            com.google.ads.interactivemedia.v3.internal.sa r8 = r3.f24435x
            com.google.ads.interactivemedia.v3.internal.aee r9 = r3.f24436y
            if (r7 != 0) goto L_0x00b1
            boolean r15 = r1.f24639r
            if (r15 == 0) goto L_0x00ab
            r15 = r8
            r17 = r9
            long r8 = r3.f24095j
            int r18 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r18 < 0) goto L_0x00ae
            goto L_0x00b4
        L_0x00ab:
            r15 = r8
            r17 = r9
        L_0x00ae:
            r16 = 1
            goto L_0x00b6
        L_0x00b1:
            r15 = r8
            r17 = r9
        L_0x00b4:
            r16 = 0
        L_0x00b6:
            if (r7 == 0) goto L_0x00c3
            boolean r7 = r3.f24420H
            if (r7 != 0) goto L_0x00c3
            int r7 = r3.f24424b
            if (r7 != r11) goto L_0x00c3
            com.google.ads.interactivemedia.v3.internal.yf r9 = r3.f24422J
            goto L_0x00c4
        L_0x00c3:
            r9 = 0
        L_0x00c4:
            r3 = r9
            r33 = r15
            r35 = r16
            r34 = r17
            goto L_0x00e2
        L_0x00cc:
            r10 = r44
            com.google.ads.interactivemedia.v3.internal.sa r3 = new com.google.ads.interactivemedia.v3.internal.sa
            r7 = 0
            r3.<init>(r7)
            com.google.ads.interactivemedia.v3.internal.aee r8 = new com.google.ads.interactivemedia.v3.internal.aee
            r9 = 10
            r8.<init>((int) r9)
            r33 = r3
            r3 = r7
            r34 = r8
            r35 = 0
        L_0x00e2:
            com.google.ads.interactivemedia.v3.internal.yq r36 = new com.google.ads.interactivemedia.v3.internal.yq
            r7 = r36
            long r8 = r1.f24627f
            long r1 = (long) r2
            long r24 = r8 + r1
            boolean r1 = r6.f24621k
            r27 = r1
            r1 = r49
            com.google.ads.interactivemedia.v3.internal.aes r29 = r1.mo16878a(r11)
            com.google.ads.interactivemedia.v3.internal.jc r1 = r6.f24616f
            r30 = r1
            r8 = r37
            r9 = r4
            r10 = r13
            r1 = r11
            r11 = r39
            r13 = r0
            r15 = r5
            r16 = r44
            r17 = r45
            r18 = r46
            r19 = r47
            r22 = r31
            r26 = r1
            r28 = r48
            r31 = r3
            r32 = r33
            r33 = r34
            r34 = r35
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7450yq.m22531a(com.google.ads.interactivemedia.v3.internal.yp, com.google.ads.interactivemedia.v3.internal.abx, com.google.ads.interactivemedia.v3.internal.cy, long, com.google.ads.interactivemedia.v3.internal.zt, int, android.net.Uri, java.util.List, int, java.lang.Object, boolean, com.google.ads.interactivemedia.v3.internal.zi, com.google.ads.interactivemedia.v3.internal.yq, byte[], byte[]):com.google.ads.interactivemedia.v3.internal.yq");
    }

    /* renamed from: m */
    private static byte[] m22533m(String str) {
        if (aeu.m18485C(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length;
        int i = length > 16 ? length - 16 : 0;
        System.arraycopy(byteArray, i, bArr, (16 - length) + i, length - i);
        return bArr;
    }

    /* renamed from: n */
    private static abx m22534n(abx abx, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return abx;
        }
        ary.m19467t(bArr2);
        return new C7438ye(abx, bArr, bArr2);
    }

    /* renamed from: o */
    private final long m22535o(C7050jv jvVar) {
        jvVar.mo16097j();
        try {
            jvVar.mo16094g(this.f24436y.mo14555i(), 0, 10);
            this.f24436y.mo14547a(10);
            if (this.f24436y.mo14564r() != 4801587) {
                return -9223372036854775807L;
            }
            this.f24436y.mo14557k(3);
            int A = this.f24436y.mo14537A();
            int i = A + 10;
            if (i > this.f24436y.mo14556j()) {
                byte[] i2 = this.f24436y.mo14555i();
                this.f24436y.mo14547a(i);
                System.arraycopy(i2, 0, this.f24436y.mo14555i(), 0, 10);
            }
            jvVar.mo16094g(this.f24436y.mo14555i(), 10, A);
            C7243qz c = this.f24435x.mo16424c(this.f24436y.mo14555i(), A);
            if (c == null) {
                return -9223372036854775807L;
            }
            int a = c.mo16341a();
            for (int i3 = 0; i3 < a; i3++) {
                C7242qy b = c.mo16342b(i3);
                if (b instanceof C7279sh) {
                    C7279sh shVar = (C7279sh) b;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(shVar.f23748a)) {
                        System.arraycopy(shVar.f23749b, 0, this.f24436y.mo14555i(), 0, 8);
                        this.f24436y.mo14547a(8);
                        return this.f24436y.mo14570x() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    /* renamed from: b */
    public final void mo14464b() {
        this.f24417E = true;
    }

    /* renamed from: c */
    public final void mo14465c() {
        C7439yf yfVar;
        ary.m19467t(this.f24414B);
        if (this.f24422J == null && (yfVar = this.f24421I) != null && yfVar.mo16801c()) {
            this.f24422J = this.f24421I;
            this.f24416D = false;
        }
        if (this.f24416D) {
            ary.m19467t(this.f24427p);
            ary.m19467t(this.f24428q);
            m22532l(this.f24427p, this.f24428q, this.f24413A);
            this.f24415C = 0;
            this.f24416D = false;
        }
        if (!this.f24417E) {
            if (!this.f24430s) {
                if (!this.f24429r) {
                    try {
                        this.f24431t.mo14604h();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } else if (this.f24431t.mo14598b() == Long.MAX_VALUE) {
                    this.f24431t.mo14597a(this.f24094i);
                }
                m22532l(this.f24096k, this.f24089d, this.f24437z);
            }
            this.f24418F = !this.f24417E;
        }
    }

    /* renamed from: d */
    public final void mo16825d(C7463zc zcVar, arn arn) {
        this.f24414B = zcVar;
        this.f24419G = arn;
    }

    /* renamed from: e */
    public final int mo16826e(int i) {
        ary.m19464q(!this.f24426n);
        if (i >= this.f24419G.size()) {
            return 0;
        }
        return ((Integer) this.f24419G.get(i)).intValue();
    }

    /* renamed from: j */
    public final boolean mo16703j() {
        return this.f24418F;
    }

    /* renamed from: k */
    public final void mo16827k() {
        this.f24420H = true;
    }

    /* renamed from: l */
    private final void m22532l(abx abx, acb acb, boolean z) {
        abx abx2;
        acb acb2;
        C7050jv jvVar;
        C7439yf yfVar;
        long j;
        acb acb3 = acb;
        boolean z2 = false;
        if (z) {
            if (this.f24415C != 0) {
                z2 = true;
            }
            abx2 = abx;
            acb2 = acb3;
        } else {
            acb2 = acb3.mo14433c((long) this.f24415C);
            abx2 = abx;
        }
        try {
            abx abx3 = abx;
            C7050jv jvVar2 = new C7050jv(abx3, acb2.f20245e, abx2.mo14389c(acb2));
            if (this.f24422J == null) {
                long o = m22535o(jvVar2);
                jvVar2.mo16097j();
                C7439yf yfVar2 = this.f24421I;
                if (yfVar2 != null) {
                    yfVar = yfVar2.mo16803e();
                    jvVar = jvVar2;
                } else {
                    jvVar = jvVar2;
                    yfVar = this.f24432u.mo16805a(acb2.f20241a, this.f24091f, this.f24433v, this.f24431t, abx.mo14403e(), jvVar);
                }
                this.f24422J = yfVar;
                if (yfVar.mo16800b()) {
                    C7463zc zcVar = this.f24414B;
                    if (o != -9223372036854775807L) {
                        j = this.f24431t.mo14602f(o);
                    } else {
                        j = this.f24094i;
                    }
                    zcVar.mo16846D(j);
                } else {
                    this.f24414B.mo16846D(0);
                }
                this.f24414B.mo16845C();
                this.f24422J.mo16799a(this.f24414B);
            } else {
                jvVar = jvVar2;
            }
            this.f24414B.mo16847E(this.f24434w);
            if (z2) {
                jvVar.mo16091d(this.f24415C);
            }
            do {
                if (this.f24417E || !this.f24422J.mo16802d(jvVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f24422J.mo16802d(jvVar));
            break;
            this.f24415C = (int) (jvVar.mo16099l() - acb3.f20245e);
            aeu.m18547q(abx);
        } catch (Throwable th) {
            aeu.m18547q(abx);
            throw th;
        }
    }
}
