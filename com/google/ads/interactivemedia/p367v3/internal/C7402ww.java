package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ww */
/* compiled from: PG */
public final class C7402ww extends C7290ss {

    /* renamed from: A */
    private int f24210A;

    /* renamed from: B */
    private long f24211B;

    /* renamed from: C */
    private int f24212C;

    /* renamed from: D */
    private final C7405wz f24213D;

    /* renamed from: E */
    private final acj f24214E;

    /* renamed from: F */
    private final aqd f24215F;

    /* renamed from: a */
    private final abw f24216a;

    /* renamed from: b */
    private final C7036jh f24217b;

    /* renamed from: c */
    private final long f24218c;

    /* renamed from: d */
    private final C7332ug f24219d;

    /* renamed from: e */
    private final adc f24220e;

    /* renamed from: f */
    private final C7397wr f24221f;

    /* renamed from: g */
    private final Object f24222g;

    /* renamed from: h */
    private final SparseArray f24223h;

    /* renamed from: i */
    private final Runnable f24224i;

    /* renamed from: j */
    private final Runnable f24225j;

    /* renamed from: k */
    private final C7412xf f24226k;

    /* renamed from: l */
    private final adb f24227l;

    /* renamed from: m */
    private abx f24228m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ada f24229n;

    /* renamed from: o */
    private adh f24230o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public IOException f24231p;

    /* renamed from: q */
    private Handler f24232q;

    /* renamed from: r */
    private C6873dg f24233r;

    /* renamed from: s */
    private C6872df f24234s;

    /* renamed from: t */
    private Uri f24235t;

    /* renamed from: u */
    private final Uri f24236u;

    /* renamed from: v */
    private C7416xj f24237v = null;

    /* renamed from: w */
    private boolean f24238w;

    /* renamed from: x */
    private long f24239x;

    /* renamed from: y */
    private long f24240y;

    /* renamed from: z */
    private long f24241z;

    static {
        C6861cv.m19920b("goog.exo.dash");
    }

    public /* synthetic */ C7402ww(C6873dg dgVar, abw abw, adc adc, C7405wz wzVar, aqd aqd, C7036jh jhVar, acj acj, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f24233r = dgVar;
        C6872df dfVar = dgVar.f21858b;
        ary.m19467t(dfVar);
        this.f24234s = dfVar;
        Uri uri = dfVar.f21849a;
        this.f24235t = uri;
        this.f24236u = uri;
        this.f24216a = abw;
        this.f24220e = adc;
        this.f24213D = wzVar;
        this.f24217b = jhVar;
        this.f24214E = acj;
        this.f24218c = j;
        this.f24215F = aqd;
        this.f24219d = mo16471f((C7321tw) null);
        this.f24222g = new Object();
        this.f24223h = new SparseArray();
        this.f24226k = new C7394wo(this);
        this.f24211B = -9223372036854775807L;
        this.f24241z = -9223372036854775807L;
        this.f24221f = new C7397wr(this);
        this.f24227l = new C7398ws(this);
        this.f24224i = new C7390wk(this);
        this.f24225j = new C7391wl(this);
    }

    /* renamed from: L */
    private final void m22309L(C7437yd ydVar, adc adc) {
        m22316S(new add(this.f24228m, Uri.parse(ydVar.f24374b), 5, adc), new C7400wu(this), 1);
    }

    /* renamed from: M */
    private final void m22310M() {
        aen.m18442c(this.f24229n, new C7392wm(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void m22311N(long j) {
        this.f24241z = j;
        m22313P(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m22312O(IOException iOException) {
        adu.m18341b("DashMediaSource", "Failed to resolve time offset.", iOException);
        m22313P(true);
    }

    /* renamed from: P */
    private final void m22313P(boolean z) {
        long j;
        boolean z2;
        long j2;
        C7421xo xoVar;
        long j3;
        for (int i = 0; i < this.f24223h.size(); i++) {
            int keyAt = this.f24223h.keyAt(i);
            if (keyAt >= this.f24212C) {
                ((C7389wj) this.f24223h.valueAt(i)).mo16714p(this.f24237v, keyAt - this.f24212C);
            }
        }
        int b = this.f24237v.mo16761b() - 1;
        C7421xo c = this.f24237v.mo16762c(b);
        long e = this.f24237v.mo16764e(b);
        long b2 = C6821bi.m19755b(aeu.m18518ai(this.f24241z));
        C7399wt a = C7399wt.m22300a(this.f24237v.mo16762c(0), this.f24237v.mo16764e(0), b2);
        C7399wt a2 = C7399wt.m22300a(c, e, b2);
        long j4 = a.f24207b;
        long j5 = a2.f24208c;
        if (!this.f24237v.f24298d || a2.f24206a) {
            j = j4;
            z2 = false;
        } else {
            j5 = Math.min(j5 - C6821bi.m19755b(c.f24328b), j5);
            long j6 = this.f24237v.f24300f;
            if (j6 != -9223372036854775807L) {
                long b3 = j5 - C6821bi.m19755b(j6);
                while (b3 < 0 && b > 0) {
                    b--;
                    b3 += this.f24237v.mo16764e(b);
                }
                if (b == 0) {
                    j3 = Math.max(j4, b3);
                } else {
                    j3 = this.f24237v.mo16764e(0);
                }
                j4 = j3;
            }
            z2 = true;
            j = j4;
        }
        long j7 = j5 - j;
        long j8 = j7;
        for (int i2 = 0; i2 < this.f24237v.mo16761b() - 1; i2++) {
            j8 += this.f24237v.mo16764e(i2);
        }
        C7416xj xjVar = this.f24237v;
        long j9 = xjVar.f24295a;
        long a3 = j9 != -9223372036854775807L ? j9 + xjVar.mo16762c(0).f24328b + C6821bi.m19754a(j) : -9223372036854775807L;
        if (this.f24237v.f24298d) {
            long b4 = (j + b2) - C6821bi.m19755b(a3);
            long b5 = C6821bi.m19755b(this.f24233r.f21859c.f21846b);
            long j10 = b4 - j5;
            if (b5 < j10) {
                b5 = j10;
            }
            long j11 = b4 - j;
            if (b5 > j11) {
                b5 = j11 - Math.min(5000000, j7 / 2);
            }
            long a4 = C6821bi.m19754a(b5);
            C6873dg dgVar = this.f24233r;
            if (dgVar.f21859c.f21846b != a4) {
                C6868db a5 = dgVar.mo15665a();
                a5.mo15652d(a4);
                dgVar = a5.mo15649a();
                this.f24233r = dgVar;
                this.f24234s = dgVar.f21858b;
            }
            long b6 = b2 - C6821bi.m19755b(a3 + dgVar.f21859c.f21846b);
            long min = Math.min(5000000, j8 / 2);
            j2 = b6 < min ? min : b6;
        } else {
            j2 = 0;
        }
        C7416xj xjVar2 = this.f24237v;
        mo16470e(new C7393wn(xjVar2.f24295a, a3, this.f24241z, this.f24212C, j, j8, j2, xjVar2, this.f24233r));
        this.f24232q.removeCallbacks(this.f24225j);
        if (z2) {
            Handler handler = this.f24232q;
            Runnable runnable = this.f24225j;
            C7416xj xjVar3 = this.f24237v;
            long ai = aeu.m18518ai(this.f24241z);
            int b7 = xjVar3.mo16761b() - 1;
            C7421xo c2 = xjVar3.mo16762c(b7);
            long b8 = C6821bi.m19755b(c2.f24328b);
            long e2 = xjVar3.mo16764e(b7);
            long b9 = C6821bi.m19755b(ai);
            Handler handler2 = handler;
            long b10 = C6821bi.m19755b(xjVar3.f24295a);
            long b11 = C6821bi.m19755b(5000);
            int i3 = 0;
            while (i3 < c2.f24329c.size()) {
                List list = ((C7415xi) c2.f24329c.get(i3)).f24291c;
                if (list.isEmpty()) {
                    xoVar = c2;
                } else {
                    xoVar = c2;
                    C7403wx l = ((C7426xt) list.get(0)).mo16783l();
                    if (l != null) {
                        long i4 = ((b10 + b8) + l.mo16736i(e2, b9)) - b9;
                        if (i4 < b11 - 100000 || (i4 > b11 && i4 < b11 + 100000)) {
                            b11 = i4;
                        }
                    }
                }
                i3++;
                c2 = xoVar;
            }
            handler2.postDelayed(runnable, ast.m19542a(b11, RoundingMode.CEILING));
        }
        if (this.f24238w) {
            mo16725K();
        } else if (z) {
            C7416xj xjVar4 = this.f24237v;
            if (xjVar4.f24298d) {
                long j12 = xjVar4.f24299e;
                if (j12 != -9223372036854775807L) {
                    if (j12 == 0) {
                        j12 = 5000;
                    }
                    m22314Q(Math.max(0, (this.f24239x + j12) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* renamed from: Q */
    private final void m22314Q(long j) {
        this.f24232q.postDelayed(this.f24224i, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final void mo16725K() {
        Uri uri;
        this.f24232q.removeCallbacks(this.f24224i);
        if (!this.f24229n.mo14469c()) {
            if (this.f24229n.mo14472f()) {
                this.f24238w = true;
                return;
            }
            synchronized (this.f24222g) {
                uri = this.f24235t;
            }
            this.f24238w = false;
            m22316S(new add(this.f24228m, uri, 4, this.f24220e), this.f24221f, this.f24214E.mo14451a(4));
        }
    }

    /* renamed from: S */
    private final void m22316S(add add, act act, int i) {
        this.f24229n.mo14471e(add, act, i);
        this.f24219d.mo16555d(new C7313to(add.f20344b), add.f20345c);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        if (r13 != -9223372036854775807L) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00db, code lost:
        if (r13 != -9223372036854775807L) goto L_0x00ca;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16719A(com.google.ads.interactivemedia.p367v3.internal.add r18, long r19, long r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            com.google.ads.interactivemedia.v3.internal.to r4 = new com.google.ads.interactivemedia.v3.internal.to
            long r5 = r0.f20343a
            com.google.ads.interactivemedia.v3.internal.acb r5 = r0.f20344b
            r18.mo14480e()
            r18.mo14481f()
            r18.mo14479d()
            r4.<init>()
            long r5 = r0.f20343a
            com.google.ads.interactivemedia.v3.internal.ug r5 = r1.f24219d
            int r6 = r0.f20345c
            r5.mo16558g(r4, r6)
            java.lang.Object r4 = r18.mo14478a()
            com.google.ads.interactivemedia.v3.internal.xj r4 = (com.google.ads.interactivemedia.p367v3.internal.C7416xj) r4
            com.google.ads.interactivemedia.v3.internal.xj r5 = r1.f24237v
            r6 = 0
            if (r5 != 0) goto L_0x002e
            r5 = 0
            goto L_0x0032
        L_0x002e:
            int r5 = r5.mo16761b()
        L_0x0032:
            com.google.ads.interactivemedia.v3.internal.xo r7 = r4.mo16762c(r6)
            long r7 = r7.f24328b
            r9 = 0
        L_0x0039:
            if (r9 >= r5) goto L_0x004a
            com.google.ads.interactivemedia.v3.internal.xj r10 = r1.f24237v
            com.google.ads.interactivemedia.v3.internal.xo r10 = r10.mo16762c(r9)
            long r10 = r10.f24328b
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 >= 0) goto L_0x004a
            int r9 = r9 + 1
            goto L_0x0039
        L_0x004a:
            boolean r7 = r4.f24298d
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L_0x00be
            int r7 = r5 - r9
            int r8 = r4.mo16761b()
            if (r7 <= r8) goto L_0x0063
            java.lang.String r2 = "DashMediaSource"
            java.lang.String r3 = "Loaded out of sync manifest"
            android.util.Log.w(r2, r3)
            goto L_0x0093
        L_0x0063:
            long r7 = r1.f24211B
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00bc
            long r12 = r4.f24302h
            r14 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r12
            int r16 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r16 > 0) goto L_0x00bc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 73
            r2.<init>(r3)
            java.lang.String r3 = "Loaded stale dynamic manifest: "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "DashMediaSource"
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r3, r2)
        L_0x0093:
            int r2 = r1.f24210A
            int r3 = r2 + 1
            r1.f24210A = r3
            com.google.ads.interactivemedia.v3.internal.acj r3 = r1.f24214E
            int r0 = r0.f20345c
            int r0 = r3.mo14451a(r0)
            if (r2 >= r0) goto L_0x00b4
            int r0 = r1.f24210A
            int r0 = r0 + -1
            int r0 = r0 * 1000
            r2 = 5000(0x1388, float:7.006E-42)
            int r0 = java.lang.Math.min(r0, r2)
            long r2 = (long) r0
            r1.m22314Q(r2)
            return
        L_0x00b4:
            com.google.ads.interactivemedia.v3.internal.wh r0 = new com.google.ads.interactivemedia.v3.internal.wh
            r0.<init>()
            r1.f24231p = r0
            return
        L_0x00bc:
            r1.f24210A = r6
        L_0x00be:
            com.google.ads.interactivemedia.v3.internal.dg r6 = r1.f24233r
            long r7 = r1.f24218c
            com.google.ads.interactivemedia.v3.internal.de r12 = r6.f21859c
            long r13 = r12.f21846b
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x00cc
        L_0x00ca:
            r7 = r13
            goto L_0x00de
        L_0x00cc:
            com.google.ads.interactivemedia.v3.internal.ya r13 = r4.f24304j
            if (r13 == 0) goto L_0x00d7
            long r13 = r13.f24365a
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x00d7
            goto L_0x00ca
        L_0x00d7:
            long r13 = r4.f24301g
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x00de
            goto L_0x00ca
        L_0x00de:
            float r10 = r12.f21847c
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r13 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x00e8
            goto L_0x00f2
        L_0x00e8:
            com.google.ads.interactivemedia.v3.internal.ya r10 = r4.f24304j
            if (r10 == 0) goto L_0x00ef
            float r10 = r10.f24366b
            goto L_0x00f2
        L_0x00ef:
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x00f2:
            float r12 = r12.f21848d
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x00ff
            com.google.ads.interactivemedia.v3.internal.ya r12 = r4.f24304j
            if (r12 == 0) goto L_0x0100
            float r11 = r12.f24367c
            goto L_0x0100
        L_0x00ff:
            r11 = r12
        L_0x0100:
            com.google.ads.interactivemedia.v3.internal.db r6 = r6.mo15665a()
            r6.mo15652d(r7)
            r6.mo15651c(r10)
            r6.mo15650b(r11)
            com.google.ads.interactivemedia.v3.internal.dg r6 = r6.mo15649a()
            r1.f24233r = r6
            com.google.ads.interactivemedia.v3.internal.df r6 = r6.f21858b
            int r7 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            r1.f24234s = r6
            r1.f24237v = r4
            boolean r6 = r1.f24238w
            boolean r4 = r4.f24298d
            r4 = r4 & r6
            r1.f24238w = r4
            long r6 = r2 - r21
            r1.f24239x = r6
            r1.f24240y = r2
            java.lang.Object r2 = r1.f24222g
            monitor-enter(r2)
            com.google.ads.interactivemedia.v3.internal.acb r3 = r0.f20344b     // Catch:{ all -> 0x01d9 }
            android.net.Uri r3 = r3.f20241a     // Catch:{ all -> 0x01d9 }
            android.net.Uri r4 = r1.f24235t     // Catch:{ all -> 0x01d9 }
            if (r3 != r4) goto L_0x0140
            com.google.ads.interactivemedia.v3.internal.xj r3 = r1.f24237v     // Catch:{ all -> 0x01d9 }
            android.net.Uri r3 = r3.f24305k     // Catch:{ all -> 0x01d9 }
            if (r3 == 0) goto L_0x013a
            goto L_0x013e
        L_0x013a:
            android.net.Uri r3 = r18.mo14480e()     // Catch:{ all -> 0x01d9 }
        L_0x013e:
            r1.f24235t = r3     // Catch:{ all -> 0x01d9 }
        L_0x0140:
            monitor-exit(r2)     // Catch:{ all -> 0x01d9 }
            r0 = 1
            if (r5 != 0) goto L_0x01d0
            com.google.ads.interactivemedia.v3.internal.xj r2 = r1.f24237v
            boolean r3 = r2.f24298d
            if (r3 == 0) goto L_0x01cc
            com.google.ads.interactivemedia.v3.internal.yd r0 = r2.f24303i
            if (r0 == 0) goto L_0x01c8
            java.lang.String r2 = r0.f24373a
            java.lang.String r3 = "urn:mpeg:dash:utc:direct:2014"
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r2, r3)
            if (r3 != 0) goto L_0x01b6
            java.lang.String r3 = "urn:mpeg:dash:utc:direct:2012"
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r2, r3)
            if (r3 == 0) goto L_0x0161
            goto L_0x01b6
        L_0x0161:
            java.lang.String r3 = "urn:mpeg:dash:utc:http-iso:2014"
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r2, r3)
            if (r3 != 0) goto L_0x01ad
            java.lang.String r3 = "urn:mpeg:dash:utc:http-iso:2012"
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r2, r3)
            if (r3 == 0) goto L_0x0172
            goto L_0x01ad
        L_0x0172:
            java.lang.String r3 = "urn:mpeg:dash:utc:http-xsdate:2014"
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r2, r3)
            if (r3 != 0) goto L_0x01a3
            java.lang.String r3 = "urn:mpeg:dash:utc:http-xsdate:2012"
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r2, r3)
            if (r3 == 0) goto L_0x0183
            goto L_0x01a3
        L_0x0183:
            java.lang.String r0 = "urn:mpeg:dash:utc:ntp:2014"
            boolean r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r2, r0)
            if (r0 != 0) goto L_0x019f
            java.lang.String r0 = "urn:mpeg:dash:utc:ntp:2012"
            boolean r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r2, r0)
            if (r0 == 0) goto L_0x0194
            goto L_0x019f
        L_0x0194:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Unsupported UTC timing scheme"
            r0.<init>(r2)
            r1.m22312O(r0)
            return
        L_0x019f:
            r17.m22310M()
            return
        L_0x01a3:
            com.google.ads.interactivemedia.v3.internal.wv r2 = new com.google.ads.interactivemedia.v3.internal.wv
            r3 = 0
            r2.<init>(r3)
            r1.m22309L(r0, r2)
            return
        L_0x01ad:
            com.google.ads.interactivemedia.v3.internal.wq r2 = new com.google.ads.interactivemedia.v3.internal.wq
            r2.<init>()
            r1.m22309L(r0, r2)
            return
        L_0x01b6:
            java.lang.String r0 = r0.f24374b     // Catch:{ dt -> 0x01c3 }
            long r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18495M(r0)     // Catch:{ dt -> 0x01c3 }
            long r4 = r1.f24240y     // Catch:{ dt -> 0x01c3 }
            long r2 = r2 - r4
            r1.m22311N(r2)     // Catch:{ dt -> 0x01c3 }
            return
        L_0x01c3:
            r0 = move-exception
            r1.m22312O(r0)
            return
        L_0x01c8:
            r17.m22310M()
            return
        L_0x01cc:
            r1.m22313P(r0)
            return
        L_0x01d0:
            int r2 = r1.f24212C
            int r2 = r2 + r9
            r1.f24212C = r2
            r1.m22313P(r0)
            return
        L_0x01d9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01d9 }
            goto L_0x01dd
        L_0x01dc:
            throw r0
        L_0x01dd:
            goto L_0x01dc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7402ww.mo16719A(com.google.ads.interactivemedia.v3.internal.add, long, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final acu mo16720B(add add, long j, long j2, IOException iOException, int i) {
        acu acu;
        long j3 = add.f20343a;
        acb acb = add.f20344b;
        add.mo14480e();
        add.mo14481f();
        add.mo14479d();
        C7313to toVar = new C7313to();
        int i2 = add.f20345c;
        long c = acj.m18243c(new acr(iOException, i));
        if (c == -9223372036854775807L) {
            acu = ada.f20339b;
        } else {
            acu = ada.m18269b(false, c);
        }
        boolean z = !acu.mo14458a();
        this.f24219d.mo16564m(toVar, add.f20345c, iOException, z);
        if (z) {
            long j4 = add.f20343a;
        }
        return acu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo16721C(add add, long j, long j2) {
        long j3 = add.f20343a;
        acb acb = add.f20344b;
        add.mo14480e();
        add.mo14481f();
        add.mo14479d();
        C7313to toVar = new C7313to();
        long j4 = add.f20343a;
        this.f24219d.mo16558g(toVar, add.f20345c);
        m22311N(((Long) add.mo14478a()).longValue() - j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final acu mo16722D(add add, long j, long j2, IOException iOException) {
        C7332ug ugVar = this.f24219d;
        long j3 = add.f20343a;
        acb acb = add.f20344b;
        add.mo14480e();
        add.mo14481f();
        add.mo14479d();
        ugVar.mo16564m(new C7313to(), add.f20345c, iOException, true);
        long j4 = add.f20343a;
        m22312O(iOException);
        return ada.f20338a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo16723E(add add, long j, long j2) {
        long j3 = add.f20343a;
        acb acb = add.f20344b;
        add.mo14480e();
        add.mo14481f();
        add.mo14479d();
        C7313to toVar = new C7313to();
        long j4 = add.f20343a;
        this.f24219d.mo16561j(toVar, add.f20345c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void mo16724F() {
        m22313P(false);
    }

    /* renamed from: U */
    public final C6873dg mo16522U() {
        return this.f24233r;
    }

    /* renamed from: V */
    public final void mo16523V(C7320tv tvVar) {
        C7389wj wjVar = (C7389wj) tvVar;
        wjVar.mo16715q();
        this.f24223h.remove(wjVar.f24160a);
    }

    /* renamed from: W */
    public final C7320tv mo16524W(C7321tw twVar, acc acc, long j) {
        C7321tw twVar2 = twVar;
        int intValue = ((Integer) twVar2.f23859a).intValue() - this.f24212C;
        int i = intValue;
        C7332ug g = mo16472g(twVar2, this.f24237v.mo16762c(intValue).f24328b);
        C7033je h = mo16473h(twVar);
        C7389wj wjVar = r2;
        C7389wj wjVar2 = new C7389wj(intValue + this.f24212C, this.f24237v, i, this.f24213D, this.f24230o, this.f24217b, h, this.f24214E, g, this.f24241z, this.f24227l, acc, this.f24215F, this.f24226k, (byte[]) null, (byte[]) null, (byte[]) null);
        C7389wj wjVar3 = wjVar;
        this.f24223h.put(wjVar3.f24160a, wjVar3);
        return wjVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16467a(adh adh) {
        this.f24230o = adh;
        this.f24217b.mo16070b();
        this.f24228m = this.f24216a.mo14408a();
        this.f24229n = new ada("Loader:DashMediaSource");
        this.f24232q = aeu.m18541k();
        mo16725K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo16469d() {
        this.f24238w = false;
        this.f24228m = null;
        ada ada = this.f24229n;
        if (ada != null) {
            ada.mo14474h();
            this.f24229n = null;
        }
        this.f24239x = 0;
        this.f24240y = 0;
        this.f24237v = null;
        this.f24235t = this.f24236u;
        this.f24231p = null;
        Handler handler = this.f24232q;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f24232q = null;
        }
        this.f24241z = -9223372036854775807L;
        this.f24210A = 0;
        this.f24211B = -9223372036854775807L;
        this.f24212C = 0;
        this.f24223h.clear();
        this.f24217b.mo16071c();
    }

    /* renamed from: u */
    public final void mo16515u() {
        this.f24227l.mo14468a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo16726y() {
        this.f24232q.removeCallbacks(this.f24225j);
        mo16725K();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo16727z(long j) {
        long j2 = this.f24211B;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.f24211B = j;
        }
    }
}
