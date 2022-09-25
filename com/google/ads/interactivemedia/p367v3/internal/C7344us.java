package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.us */
/* compiled from: PG */
final class C7344us implements C7320tv, C7056ka, act, acx, C7351uz {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Map f23924b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C6864cy f23925c;

    /* renamed from: A */
    private long f23926A;

    /* renamed from: B */
    private boolean f23927B;

    /* renamed from: C */
    private int f23928C;

    /* renamed from: D */
    private boolean f23929D;

    /* renamed from: E */
    private boolean f23930E;

    /* renamed from: F */
    private int f23931F;

    /* renamed from: G */
    private long f23932G;

    /* renamed from: H */
    private long f23933H;

    /* renamed from: I */
    private long f23934I;

    /* renamed from: J */
    private boolean f23935J;

    /* renamed from: K */
    private int f23936K;

    /* renamed from: L */
    private boolean f23937L;

    /* renamed from: M */
    private boolean f23938M;

    /* renamed from: N */
    private final acj f23939N;

    /* renamed from: O */
    private final acc f23940O;

    /* renamed from: d */
    private final Uri f23941d;

    /* renamed from: e */
    private final abx f23942e;

    /* renamed from: f */
    private final C7036jh f23943f;

    /* renamed from: g */
    private final C7332ug f23944g;

    /* renamed from: h */
    private final C7033je f23945h;

    /* renamed from: i */
    private final C7340uo f23946i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final String f23947j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final long f23948k = 1048576;

    /* renamed from: l */
    private final ada f23949l = new ada("Loader:ProgressiveMediaPeriod");

    /* renamed from: m */
    private final C7335uj f23950m;

    /* renamed from: n */
    private final adm f23951n;

    /* renamed from: o */
    private final Runnable f23952o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Runnable f23953p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Handler f23954q;

    /* renamed from: r */
    private C7319tu f23955r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C7255rk f23956s;

    /* renamed from: t */
    private C7353va[] f23957t;

    /* renamed from: u */
    private C7342uq[] f23958u;

    /* renamed from: v */
    private boolean f23959v;

    /* renamed from: w */
    private boolean f23960w;

    /* renamed from: x */
    private boolean f23961x;

    /* renamed from: y */
    private C7343ur f23962y;

    /* renamed from: z */
    private C7070ko f23963z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f23924b = Collections.unmodifiableMap(hashMap);
        C6863cx cxVar = new C6863cx();
        cxVar.mo15617S("icy");
        cxVar.mo15630ae("application/x-icy");
        f23925c = cxVar.mo15625a();
    }

    public C7344us(Uri uri, abx abx, C7058kc kcVar, C7036jh jhVar, C7033je jeVar, acj acj, C7332ug ugVar, C7340uo uoVar, acc acc, int i) {
        this.f23941d = uri;
        this.f23942e = abx;
        this.f23943f = jhVar;
        this.f23945h = jeVar;
        this.f23939N = acj;
        this.f23944g = ugVar;
        this.f23946i = uoVar;
        this.f23940O = acc;
        C7335uj ujVar = null;
        C7335uj suVar = new C7292su(kcVar);
        if (aeu.f20466a >= 30) {
            try {
                ujVar = (C7335uj) Class.forName("com.google.ads.interactivemedia.v3.exoplayer2.source.MediaParserExtractorAdapter").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
            }
        }
        this.f23950m = ujVar != null ? ujVar : suVar;
        this.f23951n = new adm();
        this.f23952o = new C7336uk(this);
        this.f23953p = new C7337ul(this);
        this.f23954q = aeu.m18541k();
        this.f23958u = new C7342uq[0];
        this.f23957t = new C7353va[0];
        this.f23934I = -9223372036854775807L;
        this.f23932G = -1;
        this.f23926A = -9223372036854775807L;
        this.f23928C = 1;
    }

    /* renamed from: L */
    private final void m21995L(int i) {
        m22005V();
        C7343ur urVar = this.f23962y;
        boolean[] zArr = urVar.f23923d;
        if (!zArr[i]) {
            C6864cy a = urVar.f23920a.mo16656a(i).mo16648a(0);
            this.f23944g.mo16569r(adz.m18358j(a.f21812l), a, 0, (Object) null, this.f23933H);
            zArr[i] = true;
        }
    }

    /* renamed from: M */
    private final void m21996M(int i) {
        m22005V();
        boolean[] zArr = this.f23962y.f23921b;
        if (this.f23935J && zArr[i]) {
            if (!this.f23957t[i].mo16636y(false)) {
                this.f23934I = 0;
                this.f23935J = false;
                this.f23930E = true;
                this.f23933H = 0;
                this.f23936K = 0;
                for (C7353va h : this.f23957t) {
                    h.mo16619h();
                }
                C7319tu tuVar = this.f23955r;
                ary.m19467t(tuVar);
                tuVar.mo15598m(this);
            }
        }
    }

    /* renamed from: N */
    private final boolean m21997N() {
        return this.f23930E || m22004U();
    }

    /* renamed from: O */
    private final C7073kr m21998O(C7342uq uqVar) {
        int length = this.f23957t.length;
        for (int i = 0; i < length; i++) {
            if (uqVar.equals(this.f23958u[i])) {
                return this.f23957t[i];
            }
        }
        C7353va vaVar = new C7353va(this.f23940O, this.f23954q.getLooper(), this.f23943f, this.f23945h);
        vaVar.mo16614I(this);
        int i2 = length + 1;
        C7342uq[] uqVarArr = (C7342uq[]) Arrays.copyOf(this.f23958u, i2);
        uqVarArr[length] = uqVar;
        this.f23958u = (C7342uq[]) aeu.m18537g(uqVarArr);
        C7353va[] vaVarArr = (C7353va[]) Arrays.copyOf(this.f23957t, i2);
        vaVarArr[length] = vaVar;
        this.f23957t = (C7353va[]) aeu.m18537g(vaVarArr);
        return vaVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void mo16577I() {
        C7243qz qzVar;
        if (!this.f23938M && !this.f23960w && this.f23959v && this.f23963z != null) {
            C7353va[] vaVarArr = this.f23957t;
            int length = vaVarArr.length;
            int i = 0;
            while (i < length) {
                if (vaVarArr[i].mo16631t() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f23951n.mo14492d();
            int length2 = this.f23957t.length;
            C7360vh[] vhVarArr = new C7360vh[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                C6864cy t = this.f23957t[i2].mo16631t();
                ary.m19467t(t);
                String str = t.f21812l;
                boolean a = adz.m18349a(str);
                boolean z = a || adz.m18350b(str);
                zArr[i2] = z;
                this.f23961x = z | this.f23961x;
                C7255rk rkVar = this.f23956s;
                if (rkVar != null) {
                    if (a || this.f23958u[i2].f23919b) {
                        C7243qz qzVar2 = t.f21810j;
                        if (qzVar2 == null) {
                            qzVar = new C7243qz(rkVar);
                        } else {
                            qzVar = qzVar2.mo16344d(rkVar);
                        }
                        C6863cx a2 = t.mo15636a();
                        a2.mo15622X(qzVar);
                        t = a2.mo15625a();
                    }
                    if (a && t.f21806f == -1 && t.f21807g == -1 && rkVar.f23700a != -1) {
                        C6863cx a3 = t.mo15636a();
                        a3.mo15605G(rkVar.f23700a);
                        t = a3.mo15625a();
                    }
                }
                vhVarArr[i2] = new C7360vh(t.mo15638c(this.f23943f.mo16069a(t)));
            }
            this.f23962y = new C7343ur(new C7362vj(vhVarArr), zArr);
            this.f23960w = true;
            C7319tu tuVar = this.f23955r;
            ary.m19467t(tuVar);
            tuVar.mo15597k(this);
        }
    }

    /* renamed from: Q */
    private final void m22000Q(C7339un unVar) {
        if (this.f23932G == -1) {
            this.f23932G = unVar.f23913m;
        }
    }

    /* renamed from: R */
    private final void m22001R() {
        C7339un unVar = new C7339un(this, this.f23941d, this.f23942e, this.f23950m, this, this.f23951n);
        if (this.f23960w) {
            ary.m19464q(m22004U());
            long j = this.f23926A;
            if (j == -9223372036854775807L || this.f23934I <= j) {
                C7070ko koVar = this.f23963z;
                ary.m19467t(koVar);
                C7339un.m21975i(unVar, koVar.mo16075b(this.f23934I).f22625a.f22631c, this.f23934I);
                for (C7353va j2 : this.f23957t) {
                    j2.mo16621j(this.f23934I);
                }
                this.f23934I = -9223372036854775807L;
            } else {
                this.f23937L = true;
                this.f23934I = -9223372036854775807L;
                return;
            }
        }
        this.f23936K = m22002S();
        this.f23949l.mo14471e(unVar, this, this.f23939N.mo14451a(this.f23928C));
        acb f = unVar.f23912l;
        C7332ug ugVar = this.f23944g;
        long unused = unVar.f23902b;
        ugVar.mo16556e(new C7313to(f), 1, -1, (C6864cy) null, 0, (Object) null, unVar.f23911k, this.f23926A);
    }

    /* renamed from: S */
    private final int m22002S() {
        int i = 0;
        for (C7353va m : this.f23957t) {
            i += m.mo16624m();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public final long m22003T() {
        long j = Long.MIN_VALUE;
        for (C7353va u : this.f23957t) {
            j = Math.max(j, u.mo16632u());
        }
        return j;
    }

    /* renamed from: U */
    private final boolean m22004U() {
        return this.f23934I != -9223372036854775807L;
    }

    /* renamed from: V */
    private final void m22005V() {
        ary.m19464q(this.f23960w);
        ary.m19467t(this.f23962y);
        ary.m19467t(this.f23963z);
    }

    /* renamed from: K */
    public final void mo16578K() {
        this.f23954q.post(this.f23952o);
    }

    /* renamed from: a */
    public final void mo16497a(C7319tu tuVar, long j) {
        this.f23955r = tuVar;
        this.f23951n.mo14489a();
        m22001R();
    }

    /* renamed from: ak */
    public final C7073kr mo16113ak(int i, int i2) {
        return m21998O(new C7342uq(i, false));
    }

    /* renamed from: al */
    public final void mo16114al() {
        this.f23959v = true;
        this.f23954q.post(this.f23952o);
    }

    /* renamed from: am */
    public final void mo16115am(C7070ko koVar) {
        this.f23954q.post(new C7338um(this, koVar));
    }

    /* renamed from: b */
    public final void mo16498b() {
        mo16582r();
        if (this.f23937L && !this.f23960w) {
            throw new C6886dt("Loading finished before preparation is complete.");
        }
    }

    /* renamed from: c */
    public final C7362vj mo16499c() {
        m22005V();
        return this.f23962y.f23920a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r2 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo16500d(com.google.ads.interactivemedia.p367v3.internal.aba[] r8, boolean[] r9, com.google.ads.interactivemedia.p367v3.internal.C7354vb[] r10, boolean[] r11, long r12) {
        /*
            r7 = this;
            r7.m22005V()
            com.google.ads.interactivemedia.v3.internal.ur r0 = r7.f23962y
            com.google.ads.interactivemedia.v3.internal.vj r1 = r0.f23920a
            boolean[] r0 = r0.f23922c
            int r2 = r7.f23931F
            r3 = 0
            r4 = 0
        L_0x000d:
            int r5 = r8.length
            if (r4 >= r5) goto L_0x0035
            r5 = r10[r4]
            if (r5 == 0) goto L_0x0032
            r6 = r8[r4]
            if (r6 == 0) goto L_0x001c
            boolean r6 = r9[r4]
            if (r6 != 0) goto L_0x0032
        L_0x001c:
            com.google.ads.interactivemedia.v3.internal.up r5 = (com.google.ads.interactivemedia.p367v3.internal.C7341up) r5
            int r5 = r5.f23917b
            boolean r6 = r0[r5]
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r6)
            int r6 = r7.f23931F
            int r6 = r6 + -1
            r7.f23931F = r6
            r0[r5] = r3
            r5 = 0
            r10[r4] = r5
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0035:
            boolean r9 = r7.f23929D
            r4 = 1
            if (r9 == 0) goto L_0x003d
            if (r2 != 0) goto L_0x0046
            goto L_0x0043
        L_0x003d:
            r5 = 0
            int r9 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0045
        L_0x0043:
            r9 = 1
            goto L_0x0047
        L_0x0045:
            r12 = r5
        L_0x0046:
            r9 = 0
        L_0x0047:
            r2 = 0
        L_0x0048:
            int r5 = r8.length
            if (r2 >= r5) goto L_0x00a1
            r5 = r10[r2]
            if (r5 != 0) goto L_0x009e
            r5 = r8[r2]
            if (r5 == 0) goto L_0x009e
            int r6 = r5.mo14332l()
            if (r6 != r4) goto L_0x005b
            r6 = 1
            goto L_0x005c
        L_0x005b:
            r6 = 0
        L_0x005c:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r6)
            int r6 = r5.mo14334n(r3)
            if (r6 != 0) goto L_0x0067
            r6 = 1
            goto L_0x0068
        L_0x0067:
            r6 = 0
        L_0x0068:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r6)
            com.google.ads.interactivemedia.v3.internal.vh r5 = r5.mo14331k()
            int r5 = r1.mo16657b(r5)
            boolean r6 = r0[r5]
            r6 = r6 ^ r4
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r6)
            int r6 = r7.f23931F
            int r6 = r6 + r4
            r7.f23931F = r6
            r0[r5] = r4
            com.google.ads.interactivemedia.v3.internal.up r6 = new com.google.ads.interactivemedia.v3.internal.up
            r6.<init>(r7, r5)
            r10[r2] = r6
            r11[r2] = r4
            if (r9 != 0) goto L_0x009e
            com.google.ads.interactivemedia.v3.internal.va[] r9 = r7.f23957t
            r9 = r9[r5]
            boolean r5 = r9.mo16607B(r12, r4)
            if (r5 != 0) goto L_0x009d
            int r9 = r9.mo16629r()
            if (r9 == 0) goto L_0x009d
            r9 = 1
            goto L_0x009e
        L_0x009d:
            r9 = 0
        L_0x009e:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x00a1:
            int r8 = r7.f23931F
            if (r8 != 0) goto L_0x00d1
            r7.f23935J = r3
            r7.f23930E = r3
            com.google.ads.interactivemedia.v3.internal.ada r8 = r7.f23949l
            boolean r8 = r8.mo14472f()
            if (r8 == 0) goto L_0x00c4
            com.google.ads.interactivemedia.v3.internal.va[] r8 = r7.f23957t
            int r9 = r8.length
        L_0x00b4:
            if (r3 >= r9) goto L_0x00be
            r10 = r8[r3]
            r10.mo16612G()
            int r3 = r3 + 1
            goto L_0x00b4
        L_0x00be:
            com.google.ads.interactivemedia.v3.internal.ada r8 = r7.f23949l
            r8.mo14473g()
            goto L_0x00e3
        L_0x00c4:
            com.google.ads.interactivemedia.v3.internal.va[] r8 = r7.f23957t
            int r9 = r8.length
        L_0x00c7:
            if (r3 >= r9) goto L_0x00e3
            r10 = r8[r3]
            r10.mo16619h()
            int r3 = r3 + 1
            goto L_0x00c7
        L_0x00d1:
            if (r9 == 0) goto L_0x00e3
            long r12 = r7.mo16505i(r12)
        L_0x00d7:
            int r8 = r10.length
            if (r3 >= r8) goto L_0x00e3
            r8 = r10[r3]
            if (r8 == 0) goto L_0x00e0
            r11[r3] = r4
        L_0x00e0:
            int r3 = r3 + 1
            goto L_0x00d7
        L_0x00e3:
            r7.f23929D = r4
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7344us.mo16500d(com.google.ads.interactivemedia.v3.internal.aba[], boolean[], com.google.ads.interactivemedia.v3.internal.vb[], boolean[], long):long");
    }

    /* renamed from: e */
    public final void mo16501e(long j, boolean z) {
        m22005V();
        if (!m22004U()) {
            boolean[] zArr = this.f23962y.f23922c;
            int length = this.f23957t.length;
            for (int i = 0; i < length; i++) {
                this.f23957t[i].mo16610E(j, false, zArr[i]);
            }
        }
    }

    /* renamed from: f */
    public final void mo16502f(long j) {
    }

    /* renamed from: g */
    public final long mo16503g() {
        if (!this.f23930E) {
            return -9223372036854775807L;
        }
        if (!this.f23937L && m22002S() <= this.f23936K) {
            return -9223372036854775807L;
        }
        this.f23930E = false;
        return this.f23933H;
    }

    /* renamed from: h */
    public final long mo16504h() {
        long j;
        m22005V();
        boolean[] zArr = this.f23962y.f23921b;
        if (this.f23937L) {
            return Long.MIN_VALUE;
        }
        if (m22004U()) {
            return this.f23934I;
        }
        if (this.f23961x) {
            int length = this.f23957t.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f23957t[i].mo16634w()) {
                    j = Math.min(j, this.f23957t[i].mo16632u());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m22003T();
        }
        return j == Long.MIN_VALUE ? this.f23933H : j;
    }

    /* renamed from: i */
    public final long mo16505i(long j) {
        m22005V();
        boolean[] zArr = this.f23962y.f23921b;
        if (true != this.f23963z.mo16074a()) {
            j = 0;
        }
        this.f23930E = false;
        this.f23933H = j;
        if (m22004U()) {
            this.f23934I = j;
            return j;
        }
        if (this.f23928C != 7) {
            int length = this.f23957t.length;
            int i = 0;
            while (i < length) {
                if (this.f23957t[i].mo16607B(j, false) || (!zArr[i] && this.f23961x)) {
                    i++;
                }
            }
            return j;
        }
        this.f23935J = false;
        this.f23934I = j;
        this.f23937L = false;
        if (this.f23949l.mo14472f()) {
            this.f23949l.mo14473g();
        } else {
            this.f23949l.mo14470d();
            for (C7353va h : this.f23957t) {
                h.mo16619h();
            }
        }
        return j;
    }

    /* renamed from: j */
    public final long mo16506j(long j, C6900eg egVar) {
        m22005V();
        if (!this.f23963z.mo16074a()) {
            return 0;
        }
        C7068km b = this.f23963z.mo16075b(j);
        return egVar.mo15787a(j, b.f22625a.f22630b, b.f22626b.f22630b);
    }

    /* renamed from: k */
    public final void mo16579k() {
        if (this.f23960w) {
            for (C7353va o : this.f23957t) {
                o.mo16626o();
            }
        }
        this.f23949l.mo14475i(this);
        this.f23954q.removeCallbacksAndMessages((Object) null);
        this.f23955r = null;
        this.f23938M = true;
    }

    /* renamed from: l */
    public final long mo16507l() {
        if (this.f23931F == 0) {
            return Long.MIN_VALUE;
        }
        return mo16504h();
    }

    /* renamed from: m */
    public final void mo14466m() {
        for (C7353va g : this.f23957t) {
            g.mo16618g();
        }
        this.f23950m.mo16487b();
    }

    /* renamed from: n */
    public final boolean mo16508n(long j) {
        if (this.f23937L || this.f23949l.mo14469c() || this.f23935J) {
            return false;
        }
        if (this.f23960w && this.f23931F == 0) {
            return false;
        }
        boolean a = this.f23951n.mo14489a();
        if (this.f23949l.mo14472f()) {
            return a;
        }
        m22001R();
        return true;
    }

    /* renamed from: o */
    public final boolean mo16509o() {
        return this.f23949l.mo14472f() && this.f23951n.mo14491c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo16580p(int i) {
        return !m21997N() && this.f23957t[i].mo16636y(this.f23937L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo16581q(int i) {
        this.f23957t[i].mo16627p();
        mo16582r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo16582r() {
        this.f23949l.mo14476j(this.f23939N.mo14451a(this.f23928C));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final int mo16583s(int i, C6865cz czVar, C7024iw iwVar, boolean z) {
        if (m21997N()) {
            return -3;
        }
        m21995L(i);
        int z2 = this.f23957t[i].mo16637z(czVar, iwVar, z, this.f23937L);
        if (z2 != -3) {
            return z2;
        }
        m21996M(i);
        return -3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final int mo16584t(int i, long j) {
        if (m21997N()) {
            return 0;
        }
        m21995L(i);
        C7353va vaVar = this.f23957t[i];
        int C = vaVar.mo16608C(j, this.f23937L);
        vaVar.mo16609D(C);
        if (C != 0) {
            return C;
        }
        m21996M(i);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final C7073kr mo16585u() {
        return m21998O(new C7342uq(0, true));
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ acu mo14455v(acw acw, long j, long j2, IOException iOException, int i) {
        acu b;
        C7070ko koVar;
        C7339un unVar = (C7339un) acw;
        m22000Q(unVar);
        adg unused = unVar.f23904d;
        long unused2 = unVar.f23902b;
        acb unused3 = unVar.f23912l;
        C7313to toVar = new C7313to();
        long unused4 = unVar.f23911k;
        UUID uuid = C6821bi.f21605a;
        long c = acj.m18243c(new acr(iOException, i));
        if (c == -9223372036854775807L) {
            b = ada.f20339b;
        } else {
            int S = m22002S();
            boolean z = S > this.f23936K;
            if (this.f23932G == -1 && ((koVar = this.f23963z) == null || koVar.mo16076c() == -9223372036854775807L)) {
                boolean z2 = this.f23960w;
                if (!z2 || m21997N()) {
                    this.f23930E = z2;
                    this.f23933H = 0;
                    this.f23936K = 0;
                    for (C7353va h : this.f23957t) {
                        h.mo16619h();
                    }
                    C7339un.m21975i(unVar, 0, 0);
                } else {
                    this.f23935J = true;
                    b = ada.f20338a;
                }
            } else {
                this.f23936K = S;
            }
            b = ada.m18269b(z, c);
        }
        acu acu = b;
        boolean z3 = !acu.mo14458a();
        this.f23944g.mo16565n(toVar, 1, -1, (C6864cy) null, 0, (Object) null, unVar.f23911k, this.f23926A, iOException, z3);
        if (z3) {
            long unused5 = unVar.f23902b;
        }
        return acu;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo14456w(acw acw, long j, long j2, boolean z) {
        C7339un unVar = (C7339un) acw;
        adg unused = unVar.f23904d;
        long unused2 = unVar.f23902b;
        acb unused3 = unVar.f23912l;
        C7313to toVar = new C7313to();
        long unused4 = unVar.f23902b;
        this.f23944g.mo16562k(toVar, 1, -1, (C6864cy) null, 0, (Object) null, unVar.f23911k, this.f23926A);
        if (!z) {
            m22000Q(unVar);
            for (C7353va h : this.f23957t) {
                h.mo16619h();
            }
            if (this.f23931F > 0) {
                C7319tu tuVar = this.f23955r;
                ary.m19467t(tuVar);
                tuVar.mo15598m(this);
            }
        }
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo14457x(acw acw, long j, long j2) {
        C7070ko koVar;
        C7339un unVar = (C7339un) acw;
        if (this.f23926A == -9223372036854775807L && (koVar = this.f23963z) != null) {
            boolean a = koVar.mo16074a();
            long T = m22003T();
            long j3 = T == Long.MIN_VALUE ? 0 : T + 10000;
            this.f23926A = j3;
            this.f23946i.mo16574b(j3, a, this.f23927B);
        }
        adg unused = unVar.f23904d;
        long unused2 = unVar.f23902b;
        acb unused3 = unVar.f23912l;
        C7313to toVar = new C7313to();
        long unused4 = unVar.f23902b;
        this.f23944g.mo16559h(toVar, 1, -1, (C6864cy) null, 0, (Object) null, unVar.f23911k, this.f23926A);
        m22000Q(unVar);
        this.f23937L = true;
        C7319tu tuVar = this.f23955r;
        ary.m19467t(tuVar);
        tuVar.mo15598m(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ void mo16586y(C7070ko koVar) {
        this.f23963z = this.f23956s == null ? koVar : new C7069kn(-9223372036854775807L);
        this.f23926A = koVar.mo16076c();
        boolean z = false;
        int i = 1;
        if (this.f23932G == -1 && koVar.mo16076c() == -9223372036854775807L) {
            z = true;
        }
        this.f23927B = z;
        if (true == z) {
            i = 7;
        }
        this.f23928C = i;
        this.f23946i.mo16574b(this.f23926A, koVar.mo16074a(), this.f23927B);
        if (!this.f23960w) {
            mo16577I();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ void mo16587z() {
        if (!this.f23938M) {
            C7319tu tuVar = this.f23955r;
            ary.m19467t(tuVar);
            tuVar.mo15598m(this);
        }
    }
}
