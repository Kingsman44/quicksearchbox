package androidx.media3.exoplayer.p145h;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.C2598ay;
import androidx.media3.common.C2599az;
import androidx.media3.common.C2652bn;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2619g;
import androidx.media3.exoplayer.C2897cz;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3248n;
import androidx.media3.exoplayer.p151k.C3249o;
import androidx.media3.exoplayer.p151k.C3250p;
import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.exoplayer.p151k.C3253s;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3351az;
import androidx.media3.extractor.C3364bb;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2505i;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.h.bu */
/* compiled from: PG */
final class C3083bu implements C3034aq, C3329ad, C3249o, C3253s, C3093cd {

    /* renamed from: a */
    public static final Map f8960a;

    /* renamed from: b */
    public static final C2680x f8961b;

    /* renamed from: A */
    private C3081bs[] f8962A;

    /* renamed from: B */
    private boolean f8963B;

    /* renamed from: C */
    private boolean f8964C;

    /* renamed from: D */
    private C3082bt f8965D;

    /* renamed from: F */
    private boolean f8966F;

    /* renamed from: G */
    private boolean f8967G;

    /* renamed from: H */
    private int f8968H;

    /* renamed from: I */
    private long f8969I;

    /* renamed from: J */
    private long f8970J;

    /* renamed from: K */
    private boolean f8971K;

    /* renamed from: L */
    private int f8972L;

    /* renamed from: M */
    private final C3241g f8973M;

    /* renamed from: c */
    public final C3079bq f8974c;

    /* renamed from: d */
    public final long f8975d;

    /* renamed from: e */
    public final C3256v f8976e = new C3256v("ProgressiveMediaPeriod");

    /* renamed from: f */
    public final Runnable f8977f;

    /* renamed from: g */
    public final Handler f8978g;

    /* renamed from: h */
    public C3033ap f8979h;

    /* renamed from: i */
    public IcyHeaders f8980i;

    /* renamed from: j */
    public C3094ce[] f8981j;

    /* renamed from: k */
    public boolean f8982k;

    /* renamed from: l */
    public C3364bb f8983l;

    /* renamed from: m */
    public long f8984m;

    /* renamed from: n */
    public boolean f8985n;

    /* renamed from: o */
    public int f8986o;

    /* renamed from: p */
    public boolean f8987p;

    /* renamed from: q */
    public boolean f8988q;

    /* renamed from: r */
    public boolean f8989r;

    /* renamed from: s */
    private final Uri f8990s;

    /* renamed from: t */
    private final C2505i f8991t;

    /* renamed from: u */
    private final C2868k f8992u;

    /* renamed from: v */
    private final C3065bc f8993v;

    /* renamed from: w */
    private final C2862e f8994w;

    /* renamed from: x */
    private final C3073bk f8995x;

    /* renamed from: y */
    private final C2619g f8996y;

    /* renamed from: z */
    private final Runnable f8997z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f8960a = Collections.unmodifiableMap(hashMap);
        C2679w wVar = new C2679w();
        wVar.f7449a = "icy";
        wVar.f7459k = "application/x-icy";
        f8961b = new C2680x(wVar);
    }

    public C3083bu(Uri uri, C2505i iVar, C3073bk bkVar, C2868k kVar, C2862e eVar, C3065bc bcVar, C3079bq bqVar, C3241g gVar, int i) {
        this.f8990s = uri;
        this.f8991t = iVar;
        this.f8992u = kVar;
        this.f8994w = eVar;
        this.f8993v = bcVar;
        this.f8974c = bqVar;
        this.f8973M = gVar;
        this.f8975d = (long) i;
        this.f8995x = bkVar;
        this.f8996y = new C2619g((byte[]) null);
        this.f8997z = new C3074bl(this);
        this.f8977f = new C3075bm(this);
        this.f8978g = C2612ak.m6922E((Handler.Callback) null);
        this.f8962A = new C3081bs[0];
        this.f8981j = new C3094ce[0];
        this.f8970J = -9223372036854775807L;
        this.f8984m = -9223372036854775807L;
        this.f8986o = 1;
    }

    /* renamed from: A */
    private final boolean m8873A() {
        return this.f8970J != -9223372036854775807L;
    }

    /* renamed from: x */
    private final int m8874x() {
        int i = 0;
        for (C3094ce ceVar : this.f8981j) {
            i += ceVar.f9043e + ceVar.f9042d;
        }
        return i;
    }

    /* renamed from: y */
    private final void m8875y() {
        C2601a.m6832d(this.f8982k);
        this.f8965D.getClass();
        this.f8983l.getClass();
    }

    /* renamed from: z */
    private final void m8876z() {
        C3078bp bpVar = new C3078bp(this, this.f8990s, this.f8991t, this.f8995x, this, this.f8996y);
        if (this.f8982k) {
            C2601a.m6832d(m8873A());
            long j = this.f8984m;
            if (j == -9223372036854775807L || this.f8970J <= j) {
                C3364bb bbVar = this.f8983l;
                bbVar.getClass();
                bpVar.mo7048a(bbVar.mo7324b(this.f8970J).f10123a.f10175c, this.f8970J);
                for (C3094ce ceVar : this.f8981j) {
                    ceVar.f9045g = this.f8970J;
                }
                this.f8970J = -9223372036854775807L;
            } else {
                this.f8988q = true;
                this.f8970J = -9223372036854775807L;
                return;
            }
        }
        this.f8972L = m8874x();
        this.f8976e.mo7254g(bpVar, this, C3245k.m9467b(this.f8986o));
        this.f8993v.mo7020s(new C3027aj(bpVar.f8941d), 1, -1, (C2680x) null, 0, bpVar.f8940c, this.f8984m);
    }

    /* renamed from: a */
    public final long mo6807a(long j, C2897cz czVar) {
        m8875y();
        if (!this.f8983l.mo7326t()) {
            return 0;
        }
        C3351az b = this.f8983l.mo7324b(j);
        return czVar.mo6705a(j, b.f10123a.f10174b, b.f10124b.f10174b);
    }

    /* renamed from: c */
    public final long mo6808c() {
        long j;
        m8875y();
        if (this.f8988q || this.f8968H == 0) {
            return Long.MIN_VALUE;
        }
        if (m8873A()) {
            return this.f8970J;
        }
        if (this.f8964C) {
            int length = this.f8981j.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C3082bt btVar = this.f8965D;
                if (btVar.f8957b[i] && btVar.f8958c[i] && !this.f8981j[i].mo7089z()) {
                    j = Math.min(j, this.f8981j[i].mo7077m());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = mo7052k(false);
        }
        return j == Long.MIN_VALUE ? this.f8969I : j;
    }

    /* renamed from: d */
    public final long mo6809d() {
        return mo6808c();
    }

    /* renamed from: e */
    public final long mo6810e() {
        if (!this.f8967G) {
            return -9223372036854775807L;
        }
        if (!this.f8988q && m8874x() <= this.f8972L) {
            return -9223372036854775807L;
        }
        this.f8967G = false;
        return this.f8969I;
    }

    /* renamed from: eX */
    public final /* bridge */ /* synthetic */ void mo6825eX(C3252r rVar, boolean z) {
        C3078bp bpVar = (C3078bp) rVar;
        C2493al alVar = bpVar.f8939b;
        long j = bpVar.f8938a;
        this.f8993v.mo7017p(new C3027aj(bpVar.f8941d, (byte[]) null), 1, -1, (C2680x) null, 0, bpVar.f8940c, this.f8984m);
        if (!z) {
            for (C3094ce w : this.f8981j) {
                w.mo7086w(false);
            }
            if (this.f8968H > 0) {
                C3033ap apVar = this.f8979h;
                apVar.getClass();
                apVar.mo6617b(this);
            }
        }
    }

    /* renamed from: eZ */
    public final C3368bf mo6987eZ(int i, int i2) {
        return mo7053p(new C3081bs(i, false));
    }

    /* renamed from: f */
    public final long mo6811f(long j) {
        m8875y();
        boolean[] zArr = this.f8965D.f8957b;
        if (true != this.f8983l.mo7326t()) {
            j = 0;
        }
        this.f8967G = false;
        this.f8969I = j;
        if (m8873A()) {
            this.f8970J = j;
            return j;
        }
        if (this.f8986o != 7) {
            int length = this.f8981j.length;
            int i = 0;
            while (i < length) {
                if (this.f8981j[i].mo7070C(j, false) || (!zArr[i] && this.f8964C)) {
                    i++;
                }
            }
            return j;
        }
        this.f8971K = false;
        this.f8970J = j;
        this.f8988q = false;
        C3256v vVar = this.f8976e;
        if (vVar.mo7253f()) {
            for (C3094ce q : this.f8981j) {
                q.mo7081q();
            }
            this.f8976e.mo7249b();
        } else {
            vVar.f9790f = null;
            for (C3094ce w : this.f8981j) {
                w.mo7086w(false);
            }
        }
        return j;
    }

    /* renamed from: fa */
    public final void mo6988fa() {
        this.f8963B = true;
        this.f8978g.post(this.f8997z);
    }

    /* renamed from: fb */
    public final /* bridge */ /* synthetic */ void mo6826fb(C3252r rVar, long j, long j2) {
        C3364bb bbVar;
        C3078bp bpVar = (C3078bp) rVar;
        if (this.f8984m == -9223372036854775807L && (bbVar = this.f8983l) != null) {
            boolean t = bbVar.mo7326t();
            long k = mo7052k(true);
            long j3 = k == Long.MIN_VALUE ? 0 : k + 10000;
            this.f8984m = j3;
            this.f8974c.mo7049b(j3, t, this.f8985n);
        }
        C2493al alVar = bpVar.f8939b;
        long j4 = bpVar.f8938a;
        this.f8993v.mo7018q(new C3027aj(bpVar.f8941d, (byte[]) null), 1, -1, (C2680x) null, 0, bpVar.f8940c, this.f8984m);
        this.f8988q = true;
        C3033ap apVar = this.f8979h;
        apVar.getClass();
        apVar.mo6617b(this);
    }

    /* renamed from: fc */
    public final void mo6812fc(C3033ap apVar, long j) {
        this.f8979h = apVar;
        this.f8996y.mo6192d();
        m8876z();
    }

    /* renamed from: fe */
    public final /* bridge */ /* synthetic */ C3250p mo6827fe(C3252r rVar, IOException iOException, int i) {
        C3250p pVar;
        C3364bb bbVar;
        C3078bp bpVar = (C3078bp) rVar;
        C2493al alVar = bpVar.f8939b;
        long j = bpVar.f8938a;
        C3027aj ajVar = new C3027aj(bpVar.f8941d, (byte[]) null);
        long j2 = bpVar.f8940c;
        int i2 = C2612ak.f7249a;
        long c = C3245k.m9468c(new C3248n(iOException, i));
        if (c == -9223372036854775807L) {
            pVar = C3256v.f9787c;
        } else {
            int x = m8874x();
            int i3 = x > this.f8972L ? 1 : 0;
            if (this.f8987p || !((bbVar = this.f8983l) == null || bbVar.mo7325r() == -9223372036854775807L)) {
                this.f8972L = x;
            } else {
                boolean z = this.f8982k;
                if (!z || mo7059w()) {
                    this.f8967G = z;
                    this.f8969I = 0;
                    this.f8972L = 0;
                    for (C3094ce w : this.f8981j) {
                        w.mo7086w(false);
                    }
                    bpVar.mo7048a(0, 0);
                } else {
                    this.f8971K = true;
                    pVar = C3256v.f9786b;
                }
            }
            pVar = new C3250p(i3, c);
        }
        boolean z2 = !pVar.mo7243a();
        this.f8993v.mo7019r(ajVar, 1, -1, (C2680x) null, 0, bpVar.f8940c, this.f8984m, iOException, z2);
        if (z2) {
            long j3 = bpVar.f8938a;
        }
        return pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r2 == 0) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo6813g(androidx.media3.exoplayer.p150j.C3197ad[] r8, boolean[] r9, androidx.media3.exoplayer.p145h.C3095cf[] r10, boolean[] r11, long r12) {
        /*
            r7 = this;
            r7.m8875y()
            androidx.media3.exoplayer.h.bt r0 = r7.f8965D
            androidx.media3.exoplayer.h.cr r1 = r0.f8956a
            boolean[] r0 = r0.f8958c
            int r2 = r7.f8968H
            r3 = 0
            r4 = 0
        L_0x000d:
            int r5 = r8.length
            if (r4 >= r5) goto L_0x0033
            r5 = r10[r4]
            if (r5 == 0) goto L_0x0030
            r6 = r8[r4]
            if (r6 == 0) goto L_0x001c
            boolean r6 = r9[r4]
            if (r6 != 0) goto L_0x0030
        L_0x001c:
            androidx.media3.exoplayer.h.br r5 = (androidx.media3.exoplayer.p145h.C3080br) r5
            int r5 = r5.f8952a
            boolean r6 = r0[r5]
            androidx.media3.common.p136b.C2601a.m6832d(r6)
            int r6 = r7.f8968H
            int r6 = r6 + -1
            r7.f8968H = r6
            r0[r5] = r3
            r5 = 0
            r10[r4] = r5
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0033:
            boolean r9 = r7.f8966F
            r4 = 1
            if (r9 == 0) goto L_0x003b
            if (r2 != 0) goto L_0x0044
            goto L_0x0041
        L_0x003b:
            r5 = 0
            int r9 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0043
        L_0x0041:
            r9 = 1
            goto L_0x0045
        L_0x0043:
            r12 = r5
        L_0x0044:
            r9 = 0
        L_0x0045:
            r2 = 0
        L_0x0046:
            int r5 = r8.length
            if (r2 >= r5) goto L_0x00a0
            r5 = r10[r2]
            if (r5 != 0) goto L_0x009d
            r5 = r8[r2]
            if (r5 == 0) goto L_0x009d
            int r6 = r5.mo7032j()
            if (r6 != r4) goto L_0x0059
            r6 = 1
            goto L_0x005a
        L_0x0059:
            r6 = 0
        L_0x005a:
            androidx.media3.common.p136b.C2601a.m6832d(r6)
            int r6 = r5.mo7027f(r3)
            if (r6 != 0) goto L_0x0065
            r6 = 1
            goto L_0x0066
        L_0x0065:
            r6 = 0
        L_0x0066:
            androidx.media3.common.p136b.C2601a.m6832d(r6)
            androidx.media3.common.bn r5 = r5.mo7035m()
            int r5 = r1.mo7096a(r5)
            boolean r6 = r0[r5]
            r6 = r6 ^ r4
            androidx.media3.common.p136b.C2601a.m6832d(r6)
            int r6 = r7.f8968H
            int r6 = r6 + r4
            r7.f8968H = r6
            r0[r5] = r4
            androidx.media3.exoplayer.h.br r6 = new androidx.media3.exoplayer.h.br
            r6.<init>(r7, r5)
            r10[r2] = r6
            r11[r2] = r4
            if (r9 != 0) goto L_0x009d
            androidx.media3.exoplayer.h.ce[] r9 = r7.f8981j
            r9 = r9[r5]
            boolean r5 = r9.mo7070C(r12, r4)
            if (r5 != 0) goto L_0x009c
            int r5 = r9.f9043e
            int r9 = r9.f9044f
            int r5 = r5 + r9
            if (r5 == 0) goto L_0x009c
            r9 = 1
            goto L_0x009d
        L_0x009c:
            r9 = 0
        L_0x009d:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x00a0:
            int r8 = r7.f8968H
            if (r8 != 0) goto L_0x00d1
            r7.f8971K = r3
            r7.f8967G = r3
            androidx.media3.exoplayer.k.v r8 = r7.f8976e
            boolean r8 = r8.mo7253f()
            if (r8 == 0) goto L_0x00c3
            androidx.media3.exoplayer.h.ce[] r8 = r7.f8981j
            int r9 = r8.length
        L_0x00b3:
            if (r3 >= r9) goto L_0x00bd
            r10 = r8[r3]
            r10.mo7081q()
            int r3 = r3 + 1
            goto L_0x00b3
        L_0x00bd:
            androidx.media3.exoplayer.k.v r8 = r7.f8976e
            r8.mo7249b()
            goto L_0x00e3
        L_0x00c3:
            androidx.media3.exoplayer.h.ce[] r8 = r7.f8981j
            int r9 = r8.length
            r10 = 0
        L_0x00c7:
            if (r10 >= r9) goto L_0x00e3
            r11 = r8[r10]
            r11.mo7086w(r3)
            int r10 = r10 + 1
            goto L_0x00c7
        L_0x00d1:
            if (r9 == 0) goto L_0x00e3
            long r12 = r7.mo6811f(r12)
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
            r7.f8966F = r4
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3083bu.mo6813g(androidx.media3.exoplayer.j.ad[], boolean[], androidx.media3.exoplayer.h.cf[], boolean[], long):long");
    }

    /* renamed from: h */
    public final C3107cr mo6814h() {
        m8875y();
        return this.f8965D.f8956a;
    }

    /* renamed from: i */
    public final void mo6815i(long j, boolean z) {
        m8875y();
        if (!m8873A()) {
            boolean[] zArr = this.f8965D.f8958c;
            int length = this.f8981j.length;
            for (int i = 0; i < length; i++) {
                this.f8981j[i].mo7080p(j, z, zArr[i]);
            }
        }
    }

    /* renamed from: j */
    public final void mo6816j() {
        mo7058v();
        if (this.f8988q && !this.f8982k) {
            throw C2599az.m6819a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* renamed from: k */
    public final long mo7052k(boolean z) {
        long j = Long.MIN_VALUE;
        int i = 0;
        while (true) {
            C3094ce[] ceVarArr = this.f8981j;
            if (i >= ceVarArr.length) {
                return j;
            }
            if (!z) {
                C3082bt btVar = this.f8965D;
                btVar.getClass();
                if (!btVar.f8958c[i]) {
                    i++;
                }
            }
            j = Math.max(j, ceVarArr[i].mo7077m());
            i++;
        }
    }

    /* renamed from: l */
    public final void mo6995l() {
        for (C3094ce u : this.f8981j) {
            u.mo7084u();
        }
        C3089c cVar = (C3089c) this.f8995x;
        if (cVar.f9019a != null) {
            cVar.f9019a = null;
        }
        cVar.f9020b = null;
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
    }

    /* renamed from: n */
    public final boolean mo6819n(long j) {
        if (this.f8988q || this.f8976e.mo7252e() || this.f8971K) {
            return false;
        }
        if (this.f8982k && this.f8968H == 0) {
            return false;
        }
        boolean d = this.f8996y.mo6192d();
        if (this.f8976e.mo7253f()) {
            return d;
        }
        m8876z();
        return true;
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        return this.f8976e.mo7253f() && this.f8996y.mo6191c();
    }

    /* renamed from: p */
    public final C3368bf mo7053p(C3081bs bsVar) {
        int length = this.f8981j.length;
        for (int i = 0; i < length; i++) {
            if (bsVar.equals(this.f8962A[i])) {
                return this.f8981j[i];
            }
        }
        C3094ce D = C3094ce.m8931D(this.f8973M, this.f8992u, this.f8994w);
        D.f9041c = this;
        int i2 = length + 1;
        C3081bs[] bsVarArr = (C3081bs[]) Arrays.copyOf(this.f8962A, i2);
        bsVarArr[length] = bsVar;
        this.f8962A = (C3081bs[]) C2612ak.m6962al(bsVarArr);
        C3094ce[] ceVarArr = (C3094ce[]) Arrays.copyOf(this.f8981j, i2);
        ceVarArr[length] = D;
        this.f8981j = (C3094ce[]) C2612ak.m6962al(ceVarArr);
        return D;
    }

    /* renamed from: q */
    public final void mo6989q(C3364bb bbVar) {
        this.f8978g.post(new C3077bo(this, bbVar));
    }

    /* renamed from: r */
    public final void mo7054r() {
        int i;
        Metadata metadata;
        if (!this.f8989r && !this.f8982k && this.f8963B && this.f8983l != null) {
            C3094ce[] ceVarArr = this.f8981j;
            int length = ceVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (ceVarArr[i2].mo7079o() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.f8996y.mo6193e();
            int length2 = this.f8981j.length;
            C2652bn[] bnVarArr = new C2652bn[length2];
            boolean[] zArr = new boolean[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                C2680x o = this.f8981j[i3].mo7079o();
                o.getClass();
                String str = o.f7496n;
                boolean l = C2598ay.m6813l(str);
                boolean z = l || C2598ay.m6817p(str);
                zArr[i3] = z;
                this.f8964C = z | this.f8964C;
                IcyHeaders icyHeaders = this.f8980i;
                if (icyHeaders != null) {
                    if (l || this.f8962A[i3].f8955b) {
                        Metadata metadata2 = o.f7494l;
                        if (metadata2 == null) {
                            metadata = new Metadata(-9223372036854775807L, icyHeaders);
                        } else {
                            metadata = metadata2.mo6059a(icyHeaders);
                        }
                        C2679w wVar = new C2679w(o);
                        wVar.f7457i = metadata;
                        o = new C2680x(wVar);
                    }
                    if (l && o.f7490h == -1 && o.f7491i == -1 && (i = icyHeaders.f11446a) != -1) {
                        C2679w wVar2 = new C2679w(o);
                        wVar2.f7454f = i;
                        o = new C2680x(wVar2);
                    }
                }
                bnVarArr[i3] = new C2652bn(Integer.toString(i3), o.mo6357b(this.f8992u.mo6610a(o)));
            }
            this.f8965D = new C3082bt(new C3107cr(bnVarArr), zArr);
            this.f8982k = true;
            C3033ap apVar = this.f8979h;
            apVar.getClass();
            apVar.mo6620eY(this);
        }
    }

    /* renamed from: s */
    public final void mo7055s(int i) {
        m8875y();
        C3082bt btVar = this.f8965D;
        boolean[] zArr = btVar.f8959d;
        if (!zArr[i]) {
            C2680x xVar = btVar.f8956a.mo7097b(i).f7357d[0];
            this.f8993v.mo7016o(C2598ay.m6803b(xVar.f7496n), xVar, 0, this.f8969I);
            zArr[i] = true;
        }
    }

    /* renamed from: t */
    public final void mo7056t(int i) {
        m8875y();
        boolean[] zArr = this.f8965D.f8957b;
        if (this.f8971K && zArr[i] && !this.f8981j[i].mo7068A(false)) {
            this.f8970J = 0;
            this.f8971K = false;
            this.f8967G = true;
            this.f8969I = 0;
            this.f8972L = 0;
            for (C3094ce w : this.f8981j) {
                w.mo7086w(false);
            }
            C3033ap apVar = this.f8979h;
            apVar.getClass();
            apVar.mo6617b(this);
        }
    }

    /* renamed from: u */
    public final void mo7057u() {
        this.f8978g.post(this.f8997z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo7058v() {
        this.f8976e.mo7250c(C3245k.m9467b(this.f8986o));
    }

    /* renamed from: w */
    public final boolean mo7059w() {
        return this.f8967G || m8873A();
    }
}
