package androidx.media3.cast;

import android.net.Uri;
import android.os.Looper;
import android.view.TextureView;
import androidx.media3.common.C2585al;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2591ar;
import androidx.media3.common.C2593at;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2641bc;
import androidx.media3.common.C2642bd;
import androidx.media3.common.C2644bf;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2666j;
import androidx.media3.common.C2676t;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2616d;
import androidx.media3.common.p136b.C2632t;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.gms.cast.C143357ao;
import com.google.android.gms.cast.C143366ax;
import com.google.android.gms.cast.C143368az;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.C143410ar;
import com.google.android.gms.cast.framework.C143429e;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.cast.framework.media.C143472ae;
import com.google.android.gms.cast.framework.media.C143475ah;
import com.google.android.gms.cast.framework.media.C143480am;
import com.google.android.gms.cast.framework.media.C143499be;
import com.google.android.gms.cast.framework.media.C143500bf;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.C143919bh;
import com.google.common.p4522b.C58724pq;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.media3.cast.aa */
/* compiled from: PG */
public final class C2534aa extends C2666j {

    /* renamed from: a */
    static final C2642bd f6977a;

    /* renamed from: l */
    public static final /* synthetic */ int f6978l = 0;

    /* renamed from: n */
    private static final long[] f6979n = new long[0];

    /* renamed from: b */
    public final C2632t f6980b;

    /* renamed from: c */
    public C143500bf f6981c;

    /* renamed from: d */
    public C2657bs f6982d;

    /* renamed from: e */
    public C2642bd f6983e;

    /* renamed from: f */
    public int f6984f;

    /* renamed from: g */
    public long f6985g;

    /* renamed from: h */
    public int f6986h;

    /* renamed from: i */
    public int f6987i;

    /* renamed from: j */
    public long f6988j;

    /* renamed from: k */
    public C2593at f6989k;

    /* renamed from: o */
    private final C143429e f6990o;

    /* renamed from: p */
    private final C2537ad f6991p = new C2537ad();

    /* renamed from: q */
    private final C2649bk f6992q = new C2649bk();

    /* renamed from: r */
    private final C2563z f6993r;

    /* renamed from: s */
    private final C2561x f6994s;

    /* renamed from: t */
    private final C2562y f6995t;

    /* renamed from: u */
    private final C2562y f6996u;

    /* renamed from: v */
    private final C2562y f6997v;

    /* renamed from: w */
    private C2536ac f6998w;

    /* renamed from: x */
    private int f6999x;

    /* renamed from: y */
    private C2645bg f7000y;

    static {
        C2591ar.m6797b("media3.cast");
        C2676t tVar = new C2676t();
        tVar.mo6350c(1, 2, 3, 4, 10, 15, 13, 16, 17, 18, 19, 31, 20, 30);
        f6977a = C2641bc.m7056a(tVar);
    }

    public C2534aa(C143429e eVar) {
        this.f6990o = eVar;
        C2563z zVar = new C2563z(this);
        this.f6993r = zVar;
        this.f6994s = new C2561x(this);
        this.f6980b = new C2632t(Looper.getMainLooper(), C2616d.f7266a, new C2547j(this));
        this.f6995t = new C2562y(false);
        this.f6996u = new C2562y(0);
        this.f6997v = new C2562y(C2640bb.f7312a);
        this.f6999x = 1;
        this.f6998w = C2536ac.f7007a;
        this.f6989k = C2593at.f7182a;
        this.f6982d = C2657bs.f7406a;
        C2676t tVar = new C2676t();
        C2641bc.m7057b(f6977a, tVar);
        this.f6983e = C2641bc.m7056a(tVar);
        this.f6987i = -1;
        this.f6988j = -9223372036854775807L;
        C143410ar d = eVar.mo118637d();
        d.mo118623c(zVar, C143466m.class);
        C143466m a = d.mo118621a();
        mo5976D(a != null ? a.mo118720c() : null);
        mo5983K();
    }

    /* renamed from: aA */
    private final MediaStatus m6678aA() {
        C143500bf bfVar = this.f6981c;
        if (bfVar != null) {
            return bfVar.mo118781i();
        }
        return null;
    }

    /* renamed from: aB */
    private final void m6679aB(C2640bb bbVar) {
        if (!((C2640bb) this.f6997v.f7044a).equals(bbVar)) {
            this.f6997v.f7044a = bbVar;
            this.f6980b.mo6204c(12, new C2551n(bbVar));
            m6682aE();
        }
    }

    /* renamed from: aC */
    private final void m6680aC(boolean z, int i, int i2) {
        boolean z2 = true;
        boolean z3 = this.f6999x == 3 && ((Boolean) this.f6995t.f7044a).booleanValue();
        boolean z4 = ((Boolean) this.f6995t.f7044a).booleanValue() != z;
        boolean z5 = this.f6999x != i2;
        if (!z4) {
            if (z5) {
                z5 = true;
            } else {
                return;
            }
        }
        this.f6999x = i2;
        this.f6995t.f7044a = Boolean.valueOf(z);
        this.f6980b.mo6204c(-1, new C2556s(z, i2));
        if (z5) {
            this.f6980b.mo6204c(4, new C2539b(i2));
        }
        if (z4) {
            this.f6980b.mo6204c(5, new C2540c(z, i));
        }
        if (i2 != 3 || !z) {
            z2 = false;
        }
        if (z3 != z2) {
            this.f6980b.mo6204c(7, new C2541d(z2));
        }
    }

    /* renamed from: aD */
    private final void m6681aD(int i) {
        if (((Integer) this.f6996u.f7044a).intValue() != i) {
            this.f6996u.f7044a = Integer.valueOf(i);
            this.f6980b.mo6204c(8, new C2546i(i));
            m6682aE();
        }
    }

    /* renamed from: aE */
    private final void m6682aE() {
        C2642bd bdVar = this.f6983e;
        C2642bd H = C2612ak.m6925H(this, f6977a);
        this.f6983e = H;
        if (!H.equals(bdVar)) {
            this.f6980b.mo6204c(13, new C2550m(this));
        }
    }

    /* renamed from: ax */
    private static int m6683ax(C143500bf bfVar, C2651bm bmVar) {
        if (bfVar == null) {
            return 0;
        }
        MediaQueueItem g = bfVar.mo118779g();
        int a = g != null ? bmVar.mo6020a(Integer.valueOf(g.f388691b)) : -1;
        if (a == -1) {
            return 0;
        }
        return a;
    }

    /* renamed from: ay */
    private static int m6684ay(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: az */
    private final C2645bg m6685az() {
        Object obj;
        C2590aq aqVar;
        Object obj2;
        C2536ac acVar = this.f6998w;
        if (!acVar.mo6304o()) {
            int c = mo5996c();
            C2649bk bkVar = this.f6992q;
            acVar.mo6023d(c, bkVar, true);
            Object obj3 = bkVar.f7329b;
            int i = this.f6992q.f7330c;
            C2650bl blVar = this.f7427m;
            acVar.mo6024e(i, blVar, 0);
            obj2 = blVar.f7337b;
            obj = obj3;
            aqVar = this.f7427m.f7338c;
        } else {
            obj2 = null;
            aqVar = null;
            obj = null;
        }
        return new C2645bg(obj2, mo5996c(), aqVar, obj, mo5996c(), mo6004k(), mo6004k(), -1, -1);
    }

    /* renamed from: A */
    public final void mo5973A(int i, long j) {
        MediaStatus aA = m6678aA();
        if (j == -9223372036854775807L) {
            j = 0;
        }
        if (aA != null) {
            if (mo5996c() != i) {
                C143500bf bfVar = this.f6981c;
                C2536ac acVar = this.f6998w;
                C2649bk bkVar = this.f6992q;
                acVar.mo6023d(i, bkVar, false);
                bfVar.mo118768H(((Integer) bkVar.f7329b).intValue(), j).mo117321f(this.f6994s);
            } else {
                this.f6981c.mo118783k(new C143368az(j)).mo117321f(this.f6994s);
            }
            C2645bg az = m6685az();
            this.f6986h++;
            this.f6987i = i;
            this.f6988j = j;
            C2645bg az2 = m6685az();
            this.f6980b.mo6204c(11, new C2552o(az, az2));
            if (az.f7320b != az2.f7320b) {
                C2536ac acVar2 = this.f6998w;
                C2650bl blVar = this.f7427m;
                acVar2.mo6024e(i, blVar, 0);
                this.f6980b.mo6204c(1, new C2553p(blVar.f7338c));
                C2593at atVar = this.f6989k;
                C2593at q = mo6010q();
                this.f6989k = q;
                if (!atVar.equals(q)) {
                    this.f6980b.mo6204c(14, new C2554q(this));
                }
            }
            m6682aE();
        } else if (this.f6986h == 0) {
            this.f6980b.mo6204c(-1, C2555r.f7036a);
        }
        this.f6980b.mo6203b();
    }

    /* renamed from: B */
    public final void mo5974B(boolean z) {
        if (this.f6981c != null) {
            m6680aC(z, 1, this.f6999x);
            this.f6980b.mo6203b();
            C143854z G = z ? this.f6981c.mo118767G() : this.f6981c.mo118766F();
            C2562y yVar = this.f6995t;
            yVar.f7045b = new C2557t(this);
            G.mo117321f(yVar.f7045b);
        }
    }

    /* renamed from: C */
    public final void mo5975C(C2640bb bbVar) {
        if (this.f6981c != null) {
            C2640bb bbVar2 = new C2640bb(C2612ak.m6944a(bbVar.f7313b, 0.5f, 2.0f), 1.0f);
            m6679aB(bbVar2);
            this.f6980b.mo6203b();
            C143854z L = this.f6981c.mo118772L((double) bbVar2.f7313b);
            C2562y yVar = this.f6997v;
            yVar.f7045b = new C2558u(this);
            L.mo117321f(yVar.f7045b);
        }
    }

    /* renamed from: D */
    public final void mo5976D(C143500bf bfVar) {
        C143500bf bfVar2 = this.f6981c;
        if (bfVar2 != bfVar) {
            if (bfVar2 != null) {
                bfVar2.mo118790r(this.f6993r);
                C143500bf bfVar3 = this.f6981c;
                C2563z zVar = this.f6993r;
                C143919bh.m233964g("Must be called from the main thread.");
                C143499be beVar = (C143499be) bfVar3.f389133h.remove(zVar);
                if (beVar != null) {
                    beVar.f389121a.remove(zVar);
                    if (beVar.f389121a.isEmpty()) {
                        bfVar3.f389134i.remove(Long.valueOf(beVar.f389122b));
                        beVar.mo118761b();
                    }
                }
            }
            this.f6981c = bfVar;
            if (bfVar != null) {
                bfVar.mo118786n(this.f6993r);
                bfVar.mo118764C(this.f6993r, 1000);
                mo5983K();
                return;
            }
            mo5990R();
        }
    }

    /* renamed from: E */
    public final void mo5977E(int i) {
        C143854z zVar;
        if (this.f6981c != null) {
            m6681aD(i);
            this.f6980b.mo6203b();
            C143500bf bfVar = this.f6981c;
            int ay = m6684ay(i);
            C143919bh.m233964g("Must be called from the main thread.");
            if (!bfVar.mo118792t()) {
                zVar = C143500bf.m232974D();
            } else {
                C143475ah ahVar = new C143475ah(bfVar, ay);
                bfVar.mo118765E(ahVar);
                zVar = ahVar;
            }
            C2562y yVar = this.f6996u;
            yVar.f7045b = new C2559v(this);
            zVar.mo117321f(yVar.f7045b);
        }
    }

    /* renamed from: F */
    public final void mo5978F(boolean z) {
    }

    /* renamed from: G */
    public final void mo5979G(TextureView textureView) {
        throw null;
    }

    /* renamed from: H */
    public final void mo5980H(float f) {
        throw null;
    }

    /* renamed from: I */
    public final void mo5981I() {
        mo5982J(false);
    }

    @Deprecated
    /* renamed from: J */
    public final void mo5982J(boolean z) {
        this.f6999x = 1;
        C143500bf bfVar = this.f6981c;
        if (bfVar != null) {
            C143919bh.m233964g("Must be called from the main thread.");
            if (!bfVar.mo118792t()) {
                C143500bf.m232974D();
            } else {
                bfVar.mo118765E(new C143480am(bfVar));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016f, code lost:
        if ((!r1) != false) goto L_0x0171;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5983K() {
        /*
            r24 = this;
            r0 = r24
            com.google.android.gms.cast.framework.media.bf r1 = r0.f6981c
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            int r1 = r0.f6984f
            androidx.media3.common.at r2 = r0.f6989k
            androidx.media3.cast.ac r3 = r0.f6998w
            boolean r3 = r3.mo6304o()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x001f
            androidx.media3.cast.ac r3 = r0.f6998w
            androidx.media3.common.bk r6 = r0.f6992q
            r3.mo6023d(r1, r6, r5)
            java.lang.Object r3 = r6.f7329b
            goto L_0x0020
        L_0x001f:
            r3 = r4
        L_0x0020:
            r0.mo5985M(r4)
            r0.mo5986N(r4)
            r0.mo5984L(r4)
            boolean r6 = r24.mo5990R()
            androidx.media3.cast.ac r7 = r0.f6998w
            com.google.android.gms.cast.framework.media.bf r8 = r0.f6981c
            int r8 = m6683ax(r8, r7)
            r0.f6984f = r8
            androidx.media3.common.at r8 = r24.mo6010q()
            r0.f6989k = r8
            boolean r8 = r7.mo6304o()
            if (r8 != 0) goto L_0x004d
            int r8 = r0.f6984f
            androidx.media3.common.bk r9 = r0.f6992q
            r7.mo6023d(r8, r9, r5)
            java.lang.Object r8 = r9.f7329b
            goto L_0x004e
        L_0x004d:
            r8 = r4
        L_0x004e:
            if (r6 != 0) goto L_0x00ce
            boolean r3 = androidx.media3.common.p136b.C2612ak.m6951aa(r3, r8)
            if (r3 != 0) goto L_0x00ce
            int r3 = r0.f6986h
            if (r3 != 0) goto L_0x00ce
            androidx.media3.common.bk r3 = r0.f6992q
            r7.mo6023d(r1, r3, r5)
            androidx.media3.common.bl r3 = r0.f7427m
            r8 = 0
            r7.mo6024e(r1, r3, r8)
            androidx.media3.common.bl r1 = r0.f7427m
            long r10 = r1.f7349n
            long r20 = androidx.media3.common.p136b.C2612ak.m6918A(r10)
            androidx.media3.common.bg r3 = new androidx.media3.common.bg
            java.lang.Object r13 = r1.f7337b
            androidx.media3.common.bk r6 = r0.f6992q
            int r10 = r6.f7330c
            androidx.media3.common.aq r15 = r1.f7338c
            java.lang.Object r1 = r6.f7329b
            r22 = -1
            r23 = -1
            r12 = r3
            r14 = r10
            r16 = r1
            r17 = r10
            r18 = r20
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r23)
            int r1 = r0.f6984f
            androidx.media3.common.bk r6 = r0.f6992q
            r7.mo6023d(r1, r6, r5)
            int r1 = r0.f6984f
            androidx.media3.common.bl r6 = r0.f7427m
            r7.mo6024e(r1, r6, r8)
            androidx.media3.common.bg r1 = new androidx.media3.common.bg
            androidx.media3.common.bl r6 = r0.f7427m
            java.lang.Object r11 = r6.f7337b
            androidx.media3.common.bk r7 = r0.f6992q
            int r15 = r7.f7330c
            androidx.media3.common.aq r13 = r6.f7338c
            java.lang.Object r14 = r7.f7329b
            long r6 = r6.f7348m
            long r16 = androidx.media3.common.p136b.C2612ak.m6918A(r6)
            long r18 = androidx.media3.common.p136b.C2612ak.m6918A(r6)
            r20 = -1
            r21 = -1
            r10 = r1
            r12 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16, r18, r20, r21)
            androidx.media3.common.b.t r6 = r0.f6980b
            androidx.media3.cast.e r7 = new androidx.media3.cast.e
            r7.<init>(r3, r1)
            r1 = 11
            r6.mo6204c(r1, r7)
            androidx.media3.common.b.t r1 = r0.f6980b
            androidx.media3.cast.f r3 = new androidx.media3.cast.f
            r3.<init>(r0)
            r1.mo6204c(r5, r3)
        L_0x00ce:
            com.google.android.gms.cast.framework.media.bf r1 = r0.f6981c
            if (r1 != 0) goto L_0x00d4
            goto L_0x017c
        L_0x00d4:
            com.google.android.gms.cast.MediaStatus r1 = r24.m6678aA()
            if (r1 == 0) goto L_0x00dd
            com.google.android.gms.cast.MediaInfo r3 = r1.f388699a
            goto L_0x00de
        L_0x00dd:
            r3 = r4
        L_0x00de:
            if (r3 == 0) goto L_0x00e2
            java.util.List r4 = r3.f388639f
        L_0x00e2:
            if (r4 == 0) goto L_0x0162
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x00ec
            goto L_0x0162
        L_0x00ec:
            long[] r1 = r1.f388709k
            if (r1 != 0) goto L_0x00f2
            long[] r1 = f6979n
        L_0x00f2:
            int r3 = r4.size()
            androidx.media3.common.br[] r3 = new androidx.media3.common.C2656br[r3]
            r6 = 0
            r7 = 0
        L_0x00fa:
            int r8 = r4.size()
            if (r7 >= r8) goto L_0x014e
            java.lang.Object r8 = r4.get(r7)
            com.google.android.gms.cast.MediaTrack r8 = (com.google.android.gms.cast.MediaTrack) r8
            androidx.media3.common.bn r9 = new androidx.media3.common.bn
            java.lang.String r10 = java.lang.Integer.toString(r7)
            androidx.media3.common.x[] r11 = new androidx.media3.common.C2680x[r5]
            androidx.media3.common.w r12 = new androidx.media3.common.w
            r12.<init>()
            java.lang.String r13 = r8.f388725c
            r12.f7449a = r13
            java.lang.String r13 = r8.f388726d
            r12.f7458j = r13
            java.lang.String r13 = r8.f388728f
            r12.f7451c = r13
            androidx.media3.common.x r13 = new androidx.media3.common.x
            r13.<init>(r12)
            r11[r6] = r13
            r9.<init>(r10, r11)
            int[] r10 = new int[r5]
            r11 = 4
            r10[r6] = r11
            boolean[] r11 = new boolean[r5]
            long r12 = r8.f388723a
            int r8 = r1.length
            r14 = 0
        L_0x0134:
            if (r14 >= r8) goto L_0x0141
            r15 = r1[r14]
            int r17 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r17 != 0) goto L_0x013e
            r8 = 1
            goto L_0x0142
        L_0x013e:
            int r14 = r14 + 1
            goto L_0x0134
        L_0x0141:
            r8 = 0
        L_0x0142:
            r11[r6] = r8
            androidx.media3.common.br r8 = new androidx.media3.common.br
            r8.<init>(r9, r6, r10, r11)
            r3[r7] = r8
            int r7 = r7 + 1
            goto L_0x00fa
        L_0x014e:
            androidx.media3.common.bs r1 = new androidx.media3.common.bs
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89844l(r3)
            r1.<init>(r3)
            androidx.media3.common.bs r3 = r0.f6982d
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x017c
            r0.f6982d = r1
            goto L_0x0171
        L_0x0162:
            androidx.media3.common.bs r1 = androidx.media3.common.C2657bs.f7406a
            androidx.media3.common.bs r3 = r0.f6982d
            boolean r1 = r1.equals(r3)
            androidx.media3.common.bs r3 = androidx.media3.common.C2657bs.f7406a
            r0.f6982d = r3
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x017c
        L_0x0171:
            androidx.media3.common.b.t r1 = r0.f6980b
            androidx.media3.cast.g r3 = new androidx.media3.cast.g
            r3.<init>(r0)
            r4 = 2
            r1.mo6204c(r4, r3)
        L_0x017c:
            androidx.media3.common.at r1 = r0.f6989k
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0190
            androidx.media3.common.b.t r1 = r0.f6980b
            androidx.media3.cast.h r2 = new androidx.media3.cast.h
            r2.<init>(r0)
            r3 = 14
            r1.mo6204c(r3, r2)
        L_0x0190:
            r24.m6682aE()
            androidx.media3.common.b.t r1 = r0.f6980b
            r1.mo6203b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.cast.C2534aa.mo5983K():void");
    }

    /* renamed from: L */
    public final void mo5984L(C143712ae aeVar) {
        float f;
        if (this.f6997v.mo6031a(aeVar)) {
            MediaStatus i = this.f6981c.mo118781i();
            if (i != null) {
                f = (float) i.f388702d;
            } else {
                f = C2640bb.f7312a.f7313b;
            }
            if (f > 0.0f) {
                m6679aB(new C2640bb(f, 1.0f));
            }
            this.f6997v.f7045b = null;
        }
    }

    /* renamed from: M */
    public final void mo5985M(C143712ae aeVar) {
        boolean booleanValue = ((Boolean) this.f6995t.f7044a).booleanValue();
        int i = 1;
        if (this.f6995t.mo6031a(aeVar)) {
            booleanValue = !this.f6981c.mo118798z();
            this.f6995t.f7045b = null;
        }
        int i2 = booleanValue != ((Boolean) this.f6995t.f7044a).booleanValue() ? 4 : 1;
        int c = this.f6981c.mo118775c();
        if (c == 2 || c == 3) {
            i = 3;
        } else if (c == 4) {
            i = 2;
        }
        m6680aC(booleanValue, i2, i);
    }

    /* renamed from: N */
    public final void mo5986N(C143712ae aeVar) {
        int i;
        if (this.f6996u.mo6031a(aeVar)) {
            MediaStatus i2 = this.f6981c.mo118781i();
            int i3 = 0;
            if (!(i2 == null || (i = i2.f388714p) == 0)) {
                i3 = 2;
                if (i != 1) {
                    if (i == 2) {
                        i3 = 1;
                    } else if (i != 3) {
                        throw new IllegalStateException();
                    }
                }
            }
            m6681aD(i3);
            this.f6996u.f7045b = null;
        }
    }

    /* renamed from: O */
    public final boolean mo5987O() {
        return ((Boolean) this.f6995t.f7044a).booleanValue();
    }

    /* renamed from: P */
    public final boolean mo5988P() {
        return false;
    }

    /* renamed from: Q */
    public final boolean mo5989Q() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0181  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5990R() {
        /*
            r22 = this;
            r0 = r22
            androidx.media3.cast.ac r1 = r0.f6998w
            int r2 = r0.f6984f
            com.google.android.gms.cast.MediaStatus r3 = r22.m6678aA()
            r4 = 0
            if (r3 == 0) goto L_0x00ec
            androidx.media3.cast.ad r3 = r0.f6991p
            com.google.android.gms.cast.framework.media.bf r5 = r0.f6981c
            com.google.android.gms.cast.framework.media.v r6 = r5.mo118782j()
            java.lang.String r7 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C143919bh.m233964g(r7)
            java.util.List r6 = r6.f389216d
            int[] r12 = com.google.android.gms.cast.internal.C143596v.m233279l(r6)
            int r6 = r12.length
            if (r6 <= 0) goto L_0x006a
            java.util.HashSet r7 = new java.util.HashSet
            int r8 = r6 + r6
            r7.<init>(r8)
            r8 = 0
        L_0x002b:
            if (r8 >= r6) goto L_0x0039
            r9 = r12[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.add(r9)
            int r8 = r8 + 1
            goto L_0x002b
        L_0x0039:
            r6 = 0
        L_0x003a:
            android.util.SparseArray r8 = r3.f7014a
            int r8 = r8.size()
            if (r6 >= r8) goto L_0x006a
            android.util.SparseArray r8 = r3.f7014a
            int r8 = r8.keyAt(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto L_0x0067
            android.util.SparseArray r8 = r3.f7014a
            java.lang.Object r8 = r8.valueAt(r6)
            androidx.media3.cast.ab r8 = (androidx.media3.cast.C2535ab) r8
            java.util.HashMap r9 = r3.f7015b
            java.lang.String r8 = r8.f7006f
            r9.remove(r8)
            android.util.SparseArray r8 = r3.f7014a
            r8.removeAt(r6)
            goto L_0x003a
        L_0x0067:
            int r6 = r6 + 1
            goto L_0x003a
        L_0x006a:
            com.google.android.gms.cast.MediaStatus r13 = r5.mo118781i()
            if (r13 != 0) goto L_0x0074
            androidx.media3.cast.ac r3 = androidx.media3.cast.C2536ac.f7007a
            goto L_0x00ee
        L_0x0074:
            int r6 = r13.f388701c
            com.google.android.gms.cast.MediaInfo r5 = r13.f388699a
            androidx.media3.common.p136b.C2601a.m6829a(r5)
            java.lang.String r9 = r5.mo118403a()
            java.util.HashMap r5 = r3.f7015b
            java.lang.Object r5 = r5.get(r9)
            androidx.media3.common.aq r5 = (androidx.media3.common.C2590aq) r5
            if (r5 != 0) goto L_0x008b
            androidx.media3.common.aq r5 = androidx.media3.common.C2590aq.f7152a
        L_0x008b:
            r7 = r5
            com.google.android.gms.cast.MediaInfo r8 = r13.f388699a
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r3
            r5.mo6028a(r6, r7, r8, r9, r10)
            java.util.List r5 = r13.f388715q
            java.util.Iterator r13 = r5.iterator()
        L_0x009d:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x00e3
            java.lang.Object r5 = r13.next()
            com.google.android.gms.cast.MediaQueueItem r5 = (com.google.android.gms.cast.MediaQueueItem) r5
            double r6 = r5.f388693d
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 * r8
            long r10 = (long) r6
            com.google.android.gms.cast.MediaInfo r8 = r5.f388690a
            if (r8 == 0) goto L_0x00bc
            java.lang.String r6 = r8.mo118403a()
            goto L_0x00be
        L_0x00bc:
            java.lang.String r6 = "UNKNOWN_CONTENT_ID"
        L_0x00be:
            r9 = r6
            java.util.HashMap r6 = r3.f7015b
            java.lang.Object r6 = r6.get(r9)
            androidx.media3.common.aq r6 = (androidx.media3.common.C2590aq) r6
            int r7 = r5.f388691b
            if (r6 == 0) goto L_0x00cd
            r14 = r6
            goto L_0x00dc
        L_0x00cd:
            java.lang.String r6 = "mediaQueueItem"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r6)
            androidx.media3.common.ac r5 = new androidx.media3.common.ac
            r5.<init>()
            androidx.media3.common.aq r5 = r5.mo6082a()
            r14 = r5
        L_0x00dc:
            r5 = r3
            r6 = r7
            r7 = r14
            r5.mo6028a(r6, r7, r8, r9, r10)
            goto L_0x009d
        L_0x00e3:
            androidx.media3.cast.ac r5 = new androidx.media3.cast.ac
            android.util.SparseArray r3 = r3.f7014a
            r5.<init>(r12, r3)
            r3 = r5
            goto L_0x00ee
        L_0x00ec:
            androidx.media3.cast.ac r3 = androidx.media3.cast.C2536ac.f7007a
        L_0x00ee:
            r0.f6998w = r3
            boolean r3 = r1.equals(r3)
            r5 = 1
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x018e
            com.google.android.gms.cast.framework.media.bf r3 = r0.f6981c
            androidx.media3.cast.ac r6 = r0.f6998w
            int r3 = m6683ax(r3, r6)
            r0.f6984f = r3
            androidx.media3.cast.ac r3 = r0.f6998w
            androidx.media3.common.b.t r6 = r0.f6980b
            androidx.media3.cast.a r7 = new androidx.media3.cast.a
            r7.<init>(r3)
            r6.mo6204c(r4, r7)
            androidx.media3.cast.ac r3 = r0.f6998w
            boolean r6 = r1.mo6304o()
            if (r6 != 0) goto L_0x0128
            androidx.media3.common.bk r6 = r0.f6992q
            r1.mo6023d(r2, r6, r5)
            java.lang.Object r6 = r6.f7329b
            int r7 = androidx.media3.common.p136b.C2612ak.f7249a
            int r6 = r3.mo6020a(r6)
            r7 = -1
            if (r6 != r7) goto L_0x0128
            r6 = 1
            goto L_0x0129
        L_0x0128:
            r6 = 0
        L_0x0129:
            if (r6 == 0) goto L_0x0172
            androidx.media3.common.bg r7 = r0.f7000y
            if (r7 == 0) goto L_0x0133
            r2 = 0
            r0.f7000y = r2
            goto L_0x0162
        L_0x0133:
            androidx.media3.common.bk r7 = r0.f6992q
            r1.mo6023d(r2, r7, r5)
            androidx.media3.common.bk r2 = r0.f6992q
            int r2 = r2.f7330c
            androidx.media3.common.bl r7 = r0.f7427m
            r8 = 0
            r1.mo6024e(r2, r7, r8)
            androidx.media3.common.bg r7 = new androidx.media3.common.bg
            androidx.media3.common.bl r2 = r0.f7427m
            java.lang.Object r11 = r2.f7337b
            androidx.media3.common.bk r8 = r0.f6992q
            int r15 = r8.f7330c
            androidx.media3.common.aq r13 = r2.f7338c
            java.lang.Object r14 = r8.f7329b
            long r16 = r22.mo6004k()
            long r18 = r22.mo6004k()
            r20 = -1
            r21 = -1
            r10 = r7
            r12 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16, r18, r20, r21)
        L_0x0162:
            androidx.media3.common.bg r2 = r22.m6685az()
            androidx.media3.common.b.t r8 = r0.f6980b
            androidx.media3.cast.k r9 = new androidx.media3.cast.k
            r9.<init>(r7, r2)
            r2 = 11
            r8.mo6204c(r2, r9)
        L_0x0172:
            boolean r2 = r3.mo6304o()
            boolean r1 = r1.mo6304o()
            if (r2 != r1) goto L_0x017e
            if (r6 == 0) goto L_0x017f
        L_0x017e:
            r4 = 1
        L_0x017f:
            if (r4 == 0) goto L_0x018b
            androidx.media3.common.b.t r1 = r0.f6980b
            androidx.media3.cast.l r2 = new androidx.media3.cast.l
            r2.<init>(r0)
            r1.mo6204c(r5, r2)
        L_0x018b:
            r22.m6682aE()
        L_0x018e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.cast.C2534aa.mo5990R():boolean");
    }

    /* renamed from: S */
    public final void mo5991S() {
        int min = Math.min(Integer.MAX_VALUE, this.f6998w.f7008b.length);
        if (min != 0) {
            int[] iArr = new int[min];
            int i = 0;
            for (int i2 = 0; i2 < min; i2++) {
                C2536ac acVar = this.f6998w;
                C2650bl blVar = this.f7427m;
                acVar.mo6024e(i2, blVar, 0);
                iArr[i2] = ((Integer) blVar.f7337b).intValue();
            }
            if (this.f6981c != null && m6678aA() != null) {
                C2536ac acVar2 = this.f6998w;
                if (!acVar2.mo6304o()) {
                    int c = mo5996c();
                    C2649bk bkVar = this.f6992q;
                    acVar2.mo6023d(c, bkVar, true);
                    Object obj = bkVar.f7329b;
                    int i3 = C2612ak.f7249a;
                    while (true) {
                        if (i >= min) {
                            break;
                        } else if (obj.equals(Integer.valueOf(iArr[i]))) {
                            this.f7000y = m6685az();
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                C143500bf bfVar = this.f6981c;
                C143919bh.m233964g("Must be called from the main thread.");
                if (!bfVar.mo118792t()) {
                    C143500bf.m232974D();
                } else {
                    bfVar.mo118765E(new C143472ae(bfVar, iArr));
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo5992T(List list) {
        throw null;
    }

    /* renamed from: U */
    public final void mo5993U(List list, long j) {
        String str;
        int intValue = ((Integer) this.f6996u.f7044a).intValue();
        if (this.f6981c != null && !list.isEmpty()) {
            if (j == -9223372036854775807L) {
                j = 0;
            }
            long j2 = j;
            if (!this.f6998w.mo6304o()) {
                this.f7000y = m6685az();
            }
            C58724pq pqVar = (C58724pq) list;
            MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[pqVar.f156474d];
            for (int i = 0; i < pqVar.f156474d; i++) {
                C2590aq aqVar = (C2590aq) list.get(i);
                C69664n.m101061g(aqVar, "mediaItem");
                C69664n.m101061g(aqVar, "<this>");
                C2585al alVar = aqVar.f7155d;
                C69664n.m101058d(alVar);
                Object obj = alVar.f7138h;
                C69664n.m101059e(obj, "null cannot be cast to non-null type com.google.android.apps.search.podcasts.proto.episode.EpisodeProto.EpisodeItem");
                C140641b bVar = (C140641b) obj;
                MediaMetadata mediaMetadata = new MediaMetadata(3);
                mediaMetadata.mo118417d("com.google.android.gms.cast.metadata.TITLE", bVar.f381976c);
                C140646b bVar2 = bVar.f381974a;
                if (bVar2 == null) {
                    bVar2 = C140646b.f381993r;
                }
                mediaMetadata.mo118417d("com.google.android.gms.cast.metadata.ARTIST", bVar2.f381997c);
                C140646b bVar3 = bVar.f381974a;
                if (bVar3 == null) {
                    bVar3 = C140646b.f381993r;
                }
                String str2 = bVar3.f381999e;
                if (str2 == null || str2.length() == 0) {
                    C140646b bVar4 = bVar.f381974a;
                    if (bVar4 == null) {
                        bVar4 = C140646b.f381993r;
                    }
                    str = bVar4.f381998d;
                } else {
                    C140646b bVar5 = bVar.f381974a;
                    if (bVar5 == null) {
                        bVar5 = C140646b.f381993r;
                    }
                    str = bVar5.f381999e;
                }
                C69664n.m101060f(str, "if (episode.show.hiresCo…ow.hiresCoverArtUrl\n    }");
                mediaMetadata.mo118415b(new WebImage(Uri.parse(str), 0, 0));
                C2585al alVar2 = aqVar.f7155d;
                C143357ao aoVar = new C143357ao(String.valueOf(alVar2 != null ? alVar2.f7131a : null));
                aoVar.f388801a = 1;
                aoVar.f388802b = "audio/mpeg";
                aoVar.f388803c = mediaMetadata;
                MediaQueueItem mediaQueueItem = new MediaQueueItem(aoVar.mo118504a());
                C143366ax.m232629a(mediaQueueItem);
                mediaQueueItemArr[i] = mediaQueueItem;
            }
            C2537ad adVar = this.f6991p;
            adVar.f7015b.clear();
            int i2 = 0;
            while (true) {
                int i3 = pqVar.f156474d;
                if (i2 < i3) {
                    HashMap hashMap = adVar.f7015b;
                    MediaInfo mediaInfo = mediaQueueItemArr[i2].f388690a;
                    mediaInfo.getClass();
                    hashMap.put(mediaInfo.mo118403a(), (C2590aq) list.get(i2));
                    i2++;
                } else {
                    this.f6981c.mo118769I(mediaQueueItemArr, Math.min(0, i3 - 1), m6684ay(intValue), j2, (JSONObject) null);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo5994a() {
        throw null;
    }

    /* renamed from: b */
    public final int mo5995b() {
        throw null;
    }

    /* renamed from: c */
    public final int mo5996c() {
        int i = this.f6987i;
        return i != -1 ? i : this.f6984f;
    }

    /* renamed from: d */
    public final int mo5997d() {
        throw null;
    }

    /* renamed from: e */
    public final int mo5998e() {
        return this.f6999x;
    }

    /* renamed from: f */
    public final int mo5999f() {
        return 0;
    }

    /* renamed from: g */
    public final int mo6000g() {
        return ((Integer) this.f6996u.f7044a).intValue();
    }

    /* renamed from: h */
    public final long mo6001h() {
        return mo6004k();
    }

    /* renamed from: i */
    public final long mo6002i() {
        return mo6004k();
    }

    /* renamed from: j */
    public final long mo6003j() {
        return mo6004k();
    }

    /* renamed from: k */
    public final long mo6004k() {
        long j = this.f6988j;
        if (j != -9223372036854775807L) {
            return j;
        }
        C143500bf bfVar = this.f6981c;
        return bfVar != null ? bfVar.mo118776d() : this.f6985g;
    }

    /* renamed from: l */
    public final long mo6005l() {
        return mo6337bg();
    }

    /* renamed from: m */
    public final long mo6006m() {
        return 3000;
    }

    /* renamed from: n */
    public final long mo6007n() {
        return 10000;
    }

    /* renamed from: o */
    public final long mo6008o() {
        return 30000;
    }

    /* renamed from: p */
    public final Looper mo6009p() {
        return Looper.getMainLooper();
    }

    /* renamed from: q */
    public final C2593at mo6010q() {
        C2590aq aa = mo6256aa();
        return aa != null ? aa.f7157f : C2593at.f7182a;
    }

    /* renamed from: r */
    public final C2639ba mo6011r() {
        return null;
    }

    /* renamed from: s */
    public final C2640bb mo6012s() {
        return (C2640bb) this.f6997v.f7044a;
    }

    /* renamed from: t */
    public final C2642bd mo6013t() {
        return this.f6983e;
    }

    /* renamed from: u */
    public final C2651bm mo6014u() {
        return this.f6998w;
    }

    /* renamed from: v */
    public final C2657bs mo6015v() {
        throw null;
    }

    /* renamed from: w */
    public final void mo6016w(C2644bf bfVar) {
        this.f6980b.mo6202a(bfVar);
    }

    /* renamed from: x */
    public final void mo6017x() {
    }

    /* renamed from: y */
    public final void mo6018y() {
        C143410ar d = this.f6990o.mo118637d();
        d.mo118625e(this.f6993r, C143466m.class);
        d.mo118624d(false);
    }

    /* renamed from: z */
    public final void mo6019z(C2644bf bfVar) {
        this.f6980b.mo6206e(bfVar);
    }
}
