package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.SparseIntArray;
import androidx.media3.common.C2598ay;
import androidx.media3.common.C2652bn;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p145h.C3093cd;
import androidx.media3.exoplayer.p145h.C3097ch;
import androidx.media3.exoplayer.p145h.C3107cr;
import androidx.media3.exoplayer.p145h.p147b.C3050f;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3249o;
import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.exoplayer.p151k.C3253s;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3364bb;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3636z;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2510n;
import com.google.common.p4522b.C58557jl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: androidx.media3.exoplayer.hls.y */
/* compiled from: PG */
final class C3185y implements C3249o, C3253s, C3097ch, C3329ad, C3093cd {

    /* renamed from: F */
    private static final Set f9483F = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));

    /* renamed from: A */
    public boolean f9484A;

    /* renamed from: B */
    public boolean f9485B;

    /* renamed from: C */
    public DrmInitData f9486C;

    /* renamed from: D */
    public final C3245k f9487D;

    /* renamed from: G */
    private final String f9488G;

    /* renamed from: H */
    private final C3182v f9489H;

    /* renamed from: I */
    private final C2680x f9490I;

    /* renamed from: J */
    private final C2868k f9491J;

    /* renamed from: K */
    private final C2862e f9492K;

    /* renamed from: L */
    private final int f9493L;

    /* renamed from: M */
    private final C3168h f9494M = new C3168h();

    /* renamed from: N */
    private final Runnable f9495N;

    /* renamed from: O */
    private final Runnable f9496O;

    /* renamed from: P */
    private final Map f9497P;

    /* renamed from: Q */
    private C3050f f9498Q;

    /* renamed from: R */
    private int[] f9499R = new int[0];

    /* renamed from: S */
    private final SparseIntArray f9500S;

    /* renamed from: T */
    private C3368bf f9501T;

    /* renamed from: U */
    private boolean f9502U;

    /* renamed from: V */
    private long f9503V;

    /* renamed from: W */
    private boolean f9504W;

    /* renamed from: X */
    private long f9505X;

    /* renamed from: Y */
    private C3175o f9506Y;

    /* renamed from: Z */
    private final C3241g f9507Z;

    /* renamed from: a */
    public final int f9508a;

    /* renamed from: b */
    public final C3172l f9509b;

    /* renamed from: c */
    public final C3256v f9510c = new C3256v("Loader:HlsSampleStreamWrapper");

    /* renamed from: d */
    public final C3065bc f9511d;

    /* renamed from: e */
    public final ArrayList f9512e;

    /* renamed from: f */
    public final List f9513f;

    /* renamed from: g */
    public final Handler f9514g;

    /* renamed from: h */
    public final ArrayList f9515h;

    /* renamed from: i */
    public C3184x[] f9516i;

    /* renamed from: j */
    public final Set f9517j;

    /* renamed from: k */
    public int f9518k;

    /* renamed from: l */
    public int f9519l;

    /* renamed from: m */
    public boolean f9520m;

    /* renamed from: n */
    public boolean f9521n;

    /* renamed from: o */
    public int f9522o;

    /* renamed from: p */
    public C2680x f9523p;

    /* renamed from: q */
    public C2680x f9524q;

    /* renamed from: r */
    public boolean f9525r;

    /* renamed from: s */
    public C3107cr f9526s;

    /* renamed from: t */
    public Set f9527t;

    /* renamed from: u */
    public int[] f9528u;

    /* renamed from: v */
    public int f9529v;

    /* renamed from: w */
    public boolean[] f9530w;

    /* renamed from: x */
    public boolean[] f9531x;

    /* renamed from: y */
    public long f9532y;

    /* renamed from: z */
    public boolean f9533z;

    public C3185y(String str, int i, C3182v vVar, C3172l lVar, Map map, C3241g gVar, long j, C2680x xVar, C2868k kVar, C2862e eVar, C3245k kVar2, C3065bc bcVar, int i2) {
        this.f9488G = str;
        this.f9508a = i;
        this.f9489H = vVar;
        this.f9509b = lVar;
        this.f9497P = map;
        this.f9507Z = gVar;
        this.f9490I = xVar;
        this.f9491J = kVar;
        this.f9492K = eVar;
        this.f9487D = kVar2;
        this.f9511d = bcVar;
        this.f9493L = i2;
        Set set = f9483F;
        this.f9517j = new HashSet(set.size());
        this.f9500S = new SparseIntArray(set.size());
        this.f9516i = new C3184x[0];
        this.f9531x = new boolean[0];
        this.f9530w = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f9512e = arrayList;
        this.f9513f = Collections.unmodifiableList(arrayList);
        this.f9515h = new ArrayList();
        this.f9495N = new C3180t(this);
        this.f9496O = new C3181u(this);
        this.f9514g = C2612ak.m6922E((Handler.Callback) null);
        this.f9532y = j;
        this.f9503V = j;
    }

    /* renamed from: A */
    private final void m9296A(int i) {
        C2601a.m6832d(!this.f9510c.mo7253f());
        loop0:
        while (true) {
            if (i >= this.f9512e.size()) {
                i = -1;
                break;
            }
            int i2 = i;
            while (true) {
                if (i2 >= this.f9512e.size()) {
                    C3175o oVar = (C3175o) this.f9512e.get(i);
                    int i3 = 0;
                    while (i3 < this.f9516i.length) {
                        int a = oVar.mo7172a(i3);
                        C3184x xVar = this.f9516i[i3];
                        if (xVar.f9043e + xVar.f9044f <= a) {
                            i3++;
                        }
                    }
                    break loop0;
                } else if (((C3175o) this.f9512e.get(i2)).f9436d) {
                    break;
                } else {
                    i2++;
                }
            }
            i++;
        }
        if (i != -1) {
            long j = mo7179e().f8852r;
            C3175o oVar2 = (C3175o) this.f9512e.get(i);
            ArrayList arrayList = this.f9512e;
            C2612ak.m6942Y(arrayList, i, arrayList.size());
            for (int i4 = 0; i4 < this.f9516i.length; i4++) {
                this.f9516i[i4].mo7082r(oVar2.mo7172a(i4));
            }
            if (this.f9512e.isEmpty()) {
                this.f9503V = this.f9532y;
            } else {
                ((C3175o) C58557jl.m90131l(this.f9512e)).f9441i = true;
            }
            this.f9485B = false;
            this.f9511d.mo7015n(this.f9518k, oVar2.f8851q, j);
        }
    }

    /* renamed from: w */
    private static int m9297w(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: x */
    private static C2680x m9298x(C2680x xVar, C2680x xVar2, boolean z) {
        String str;
        String str2;
        if (xVar == null) {
            return xVar2;
        }
        int b = C2598ay.m6803b(xVar2.f7496n);
        if (C2612ak.m6985j(xVar.f7493k, b) == 1) {
            str2 = C2612ak.m6931N(xVar.f7493k, b);
            str = C2598ay.m6807f(str2);
        } else {
            str2 = C2598ay.m6806e(xVar.f7493k, xVar2.f7496n);
            str = xVar2.f7496n;
        }
        C2679w wVar = new C2679w(xVar2);
        wVar.f7449a = xVar.f7485c;
        wVar.f7450b = xVar.f7486d;
        wVar.f7451c = xVar.f7487e;
        wVar.f7452d = xVar.f7488f;
        wVar.f7453e = xVar.f7489g;
        wVar.f7454f = z ? xVar.f7490h : -1;
        wVar.f7455g = z ? xVar.f7491i : -1;
        wVar.f7456h = str2;
        if (b == 2) {
            wVar.f7464p = xVar.f7501s;
            wVar.f7465q = xVar.f7502t;
            wVar.f7466r = xVar.f7503u;
            b = 2;
        }
        if (str != null) {
            wVar.f7459k = str;
        }
        int i = xVar.f7477A;
        if (i != -1 && b == 1) {
            wVar.f7472x = i;
        }
        Metadata metadata = xVar.f7494l;
        if (metadata != null) {
            Metadata metadata2 = xVar2.f7494l;
            if (metadata2 != null) {
                metadata = metadata2.mo6060b(metadata);
            }
            wVar.f7457i = metadata;
        }
        return new C2680x(wVar);
    }

    /* renamed from: y */
    private final C3107cr m9299y(C2652bn[] bnVarArr) {
        for (int i = 0; i < bnVarArr.length; i++) {
            C2652bn bnVar = bnVarArr[i];
            C2680x[] xVarArr = new C2680x[bnVar.f7354a];
            for (int i2 = 0; i2 < bnVar.f7354a; i2++) {
                C2680x xVar = bnVar.f7357d[i2];
                xVarArr[i2] = xVar.mo6357b(this.f9491J.mo6610a(xVar));
            }
            bnVarArr[i] = new C2652bn(bnVar.f7355b, xVarArr);
        }
        return new C3107cr(bnVarArr);
    }

    /* renamed from: z */
    private static C3636z m9300z(int i, int i2) {
        C2633u.m7050e("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new C3636z();
    }

    /* renamed from: c */
    public final long mo6808c() {
        if (this.f9485B) {
            return Long.MIN_VALUE;
        }
        if (mo7186s()) {
            return this.f9503V;
        }
        long j = this.f9532y;
        C3175o e = mo7179e();
        if (!e.f9439g) {
            if (this.f9512e.size() > 1) {
                ArrayList arrayList = this.f9512e;
                e = (C3175o) arrayList.get(arrayList.size() - 2);
            } else {
                e = null;
            }
        }
        if (e != null) {
            j = Math.max(j, e.f8852r);
        }
        if (this.f9520m) {
            for (C3184x m : this.f9516i) {
                j = Math.max(j, m.mo7077m());
            }
        }
        return j;
    }

    /* renamed from: d */
    public final long mo6809d() {
        if (mo7186s()) {
            return this.f9503V;
        }
        if (this.f9485B) {
            return Long.MIN_VALUE;
        }
        return mo7179e().f8852r;
    }

    /* renamed from: e */
    public final C3175o mo7179e() {
        ArrayList arrayList = this.f9512e;
        return (C3175o) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: eX */
    public final /* bridge */ /* synthetic */ void mo6825eX(C3252r rVar, boolean z) {
        C3050f fVar = (C3050f) rVar;
        this.f9498Q = null;
        long j = fVar.f8845k;
        C2510n nVar = fVar.f8846l;
        C2493al alVar = fVar.f8853s;
        C3027aj ajVar = new C3027aj(nVar, (byte[]) null);
        C3065bc bcVar = this.f9511d;
        int i = fVar.f8847m;
        int i2 = this.f9508a;
        C2680x xVar = fVar.f8848n;
        int i3 = fVar.f8849o;
        Object obj = fVar.f8850p;
        bcVar.mo7017p(ajVar, i, i2, xVar, i3, fVar.f8851q, fVar.f8852r);
        if (!z) {
            if (mo7186s() || this.f9522o == 0) {
                mo7184p();
            }
            if (this.f9522o > 0) {
                ((C3177q) this.f9489H).mo7174r();
            }
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* renamed from: eZ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.extractor.C3368bf mo6987eZ(int r10, int r11) {
        /*
            r9 = this;
            java.util.Set r0 = f9483F
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            boolean r2 = r0.contains(r1)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x003b
            boolean r0 = r0.contains(r1)
            androidx.media3.common.p136b.C2601a.m6830b(r0)
            android.util.SparseIntArray r0 = r9.f9500S
            r2 = -1
            int r0 = r0.get(r11, r2)
            if (r0 != r2) goto L_0x001f
            goto L_0x004d
        L_0x001f:
            java.util.Set r2 = r9.f9517j
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L_0x002b
            int[] r1 = r9.f9499R
            r1[r0] = r10
        L_0x002b:
            int[] r1 = r9.f9499R
            r1 = r1[r0]
            if (r1 != r10) goto L_0x0036
            androidx.media3.exoplayer.hls.x[] r1 = r9.f9516i
            r3 = r1[r0]
            goto L_0x004d
        L_0x0036:
            androidx.media3.extractor.z r3 = m9300z(r10, r11)
            goto L_0x004d
        L_0x003b:
            r0 = 0
        L_0x003c:
            androidx.media3.exoplayer.hls.x[] r1 = r9.f9516i
            int r2 = r1.length
            if (r0 >= r2) goto L_0x004d
            int[] r2 = r9.f9499R
            r2 = r2[r0]
            if (r2 != r10) goto L_0x004a
            r3 = r1[r0]
            goto L_0x004d
        L_0x004a:
            int r0 = r0 + 1
            goto L_0x003c
        L_0x004d:
            if (r3 != 0) goto L_0x00dc
            boolean r0 = r9.f9504W
            if (r0 != 0) goto L_0x00d7
            androidx.media3.exoplayer.hls.x[] r0 = r9.f9516i
            int r0 = r0.length
            r1 = 1
            if (r11 == r1) goto L_0x0060
            r2 = 2
            if (r11 != r2) goto L_0x005e
            r11 = 2
            goto L_0x0061
        L_0x005e:
            r2 = r11
            goto L_0x0062
        L_0x0060:
            r2 = r11
        L_0x0061:
            r4 = 1
        L_0x0062:
            androidx.media3.exoplayer.hls.x r3 = new androidx.media3.exoplayer.hls.x
            androidx.media3.exoplayer.k.g r5 = r9.f9507Z
            androidx.media3.exoplayer.c.k r6 = r9.f9491J
            androidx.media3.exoplayer.c.e r7 = r9.f9492K
            java.util.Map r8 = r9.f9497P
            r3.<init>(r5, r6, r7, r8)
            long r5 = r9.f9532y
            r3.f9045g = r5
            if (r4 == 0) goto L_0x007b
            androidx.media3.common.DrmInitData r5 = r9.f9486C
            r3.f9481a = r5
            r3.f9046h = r1
        L_0x007b:
            long r5 = r9.f9505X
            r3.mo7087x(r5)
            androidx.media3.exoplayer.hls.o r1 = r9.f9506Y
            if (r1 == 0) goto L_0x0088
            int r1 = r1.f9433a
            r3.f9047i = r1
        L_0x0088:
            r3.f9041c = r9
            int r1 = r0 + 1
            int[] r5 = r9.f9499R
            int[] r5 = java.util.Arrays.copyOf(r5, r1)
            r9.f9499R = r5
            r5[r0] = r10
            androidx.media3.exoplayer.hls.x[] r10 = r9.f9516i
            java.lang.Object[] r10 = androidx.media3.common.p136b.C2612ak.m6963am(r10, r3)
            androidx.media3.exoplayer.hls.x[] r10 = (androidx.media3.exoplayer.hls.C3184x[]) r10
            r9.f9516i = r10
            boolean[] r10 = r9.f9531x
            boolean[] r10 = java.util.Arrays.copyOf(r10, r1)
            r9.f9531x = r10
            r10[r0] = r4
            boolean r10 = r9.f9502U
            r10 = r10 | r4
            r9.f9502U = r10
            java.util.Set r10 = r9.f9517j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r10.add(r4)
            android.util.SparseIntArray r10 = r9.f9500S
            r10.append(r11, r0)
            int r10 = m9297w(r11)
            int r4 = r9.f9518k
            int r4 = m9297w(r4)
            if (r10 <= r4) goto L_0x00cd
            r9.f9519l = r0
            r9.f9518k = r11
        L_0x00cd:
            boolean[] r10 = r9.f9530w
            boolean[] r10 = java.util.Arrays.copyOf(r10, r1)
            r9.f9530w = r10
            r11 = r2
            goto L_0x00dc
        L_0x00d7:
            androidx.media3.extractor.z r10 = m9300z(r10, r11)
            return r10
        L_0x00dc:
            r10 = 5
            if (r11 != r10) goto L_0x00ef
            androidx.media3.extractor.bf r10 = r9.f9501T
            if (r10 != 0) goto L_0x00ec
            androidx.media3.exoplayer.hls.w r10 = new androidx.media3.exoplayer.hls.w
            int r11 = r9.f9493L
            r10.<init>(r3, r11)
            r9.f9501T = r10
        L_0x00ec:
            androidx.media3.extractor.bf r10 = r9.f9501T
            return r10
        L_0x00ef:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.C3185y.mo6987eZ(int, int):androidx.media3.extractor.bf");
    }

    /* renamed from: fa */
    public final void mo6988fa() {
        this.f9504W = true;
        this.f9514g.post(this.f9496O);
    }

    /* renamed from: fb */
    public final /* bridge */ /* synthetic */ void mo6826fb(C3252r rVar, long j, long j2) {
        C3050f fVar = (C3050f) rVar;
        this.f9498Q = null;
        C3172l lVar = this.f9509b;
        if (fVar instanceof C3167g) {
            C3167g gVar = (C3167g) fVar;
            lVar.f9412l = gVar.f8890b;
            C3166f fVar2 = lVar.f9409i;
            Uri uri = gVar.f8846l.f6891a;
            byte[] bArr = gVar.f9390a;
            bArr.getClass();
            fVar2.mo7166b(uri, bArr);
        }
        long j3 = fVar.f8845k;
        C2510n nVar = fVar.f8846l;
        C2493al alVar = fVar.f8853s;
        C3027aj ajVar = new C3027aj(nVar, (byte[]) null);
        C3065bc bcVar = this.f9511d;
        int i = fVar.f8847m;
        int i2 = this.f9508a;
        C2680x xVar = fVar.f8848n;
        int i3 = fVar.f8849o;
        Object obj = fVar.f8850p;
        bcVar.mo7018q(ajVar, i, i2, xVar, i3, fVar.f8851q, fVar.f8852r);
        if (!this.f9521n) {
            mo6819n(this.f9532y);
        } else {
            ((C3177q) this.f9489H).mo7174r();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* renamed from: fe */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ androidx.media3.exoplayer.p151k.C3250p mo6827fe(androidx.media3.exoplayer.p151k.C3252r r19, java.io.IOException r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            r11 = r20
            r13 = r19
            androidx.media3.exoplayer.h.b.f r13 = (androidx.media3.exoplayer.p145h.p147b.C3050f) r13
            boolean r1 = r13 instanceof androidx.media3.exoplayer.hls.C3175o
            if (r1 == 0) goto L_0x0028
            r2 = r13
            androidx.media3.exoplayer.hls.o r2 = (androidx.media3.exoplayer.hls.C3175o) r2
            boolean r2 = r2.f9442j
            if (r2 != 0) goto L_0x0028
            boolean r2 = r11 instanceof androidx.media3.p132b.C2486ae
            if (r2 == 0) goto L_0x0028
            r2 = r11
            androidx.media3.b.ae r2 = (androidx.media3.p132b.C2486ae) r2
            int r2 = r2.f6832d
            r3 = 410(0x19a, float:5.75E-43)
            if (r2 == r3) goto L_0x0024
            r3 = 404(0x194, float:5.66E-43)
            if (r2 != r3) goto L_0x0028
        L_0x0024:
            androidx.media3.exoplayer.k.p r1 = androidx.media3.exoplayer.p151k.C3256v.f9785a
            goto L_0x010d
        L_0x0028:
            androidx.media3.b.al r2 = r13.f8853s
            long r2 = r2.f6845a
            androidx.media3.exoplayer.h.aj r4 = new androidx.media3.exoplayer.h.aj
            long r5 = r13.f8845k
            androidx.media3.b.n r5 = r13.f8846l
            androidx.media3.b.al r6 = r13.f8853s
            r14 = 0
            r4.<init>(r5, r14)
            int r5 = r13.f8847m
            androidx.media3.common.x r5 = r13.f8848n
            int r5 = r13.f8849o
            java.lang.Object r5 = r13.f8850p
            long r5 = r13.f8851q
            int r5 = androidx.media3.common.p136b.C2612ak.f7249a
            long r5 = r13.f8852r
            androidx.media3.exoplayer.k.n r5 = new androidx.media3.exoplayer.k.n
            r6 = r21
            r5.<init>(r11, r6)
            androidx.media3.exoplayer.hls.l r6 = r0.f9509b
            androidx.media3.exoplayer.j.ad r6 = r6.f9416p
            androidx.media3.exoplayer.k.l r6 = androidx.media3.exoplayer.p150j.C3202ai.m9387a(r6)
            androidx.media3.exoplayer.k.m r6 = androidx.media3.exoplayer.p151k.C3245k.m9466a(r6, r5)
            r7 = 0
            if (r6 == 0) goto L_0x0079
            int r8 = r6.f9768a
            r9 = 2
            if (r8 != r9) goto L_0x0079
            androidx.media3.exoplayer.hls.l r8 = r0.f9509b
            long r9 = r6.f9769b
            androidx.media3.exoplayer.j.ad r6 = r8.f9416p
            androidx.media3.common.bn r8 = r8.f9407g
            androidx.media3.common.x r12 = r13.f8848n
            int r8 = r8.mo6305a(r12)
            int r8 = r6.mo7029h(r8)
            boolean r6 = r6.mo7039q(r8, r9)
            r15 = r6
            goto L_0x007a
        L_0x0079:
            r15 = 0
        L_0x007a:
            r6 = 1
            if (r15 == 0) goto L_0x00b3
            if (r1 == 0) goto L_0x00b0
            r8 = 0
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00b0
            java.util.ArrayList r1 = r0.f9512e
            int r2 = r1.size()
            int r2 = r2 + -1
            java.lang.Object r1 = r1.remove(r2)
            androidx.media3.exoplayer.hls.o r1 = (androidx.media3.exoplayer.hls.C3175o) r1
            if (r1 != r13) goto L_0x0096
            r7 = 1
        L_0x0096:
            androidx.media3.common.p136b.C2601a.m6832d(r7)
            java.util.ArrayList r1 = r0.f9512e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00a6
            long r1 = r0.f9532y
            r0.f9503V = r1
            goto L_0x00b0
        L_0x00a6:
            java.util.ArrayList r1 = r0.f9512e
            java.lang.Object r1 = com.google.common.p4522b.C58557jl.m90131l(r1)
            androidx.media3.exoplayer.hls.o r1 = (androidx.media3.exoplayer.hls.C3175o) r1
            r1.f9441i = r6
        L_0x00b0:
            androidx.media3.exoplayer.k.p r1 = androidx.media3.exoplayer.p151k.C3256v.f9786b
            goto L_0x00ca
        L_0x00b3:
            long r1 = androidx.media3.exoplayer.p151k.C3245k.m9468c(r5)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00c8
            androidx.media3.exoplayer.k.p r3 = new androidx.media3.exoplayer.k.p
            r3.<init>(r7, r1)
            r16 = r3
            goto L_0x00cc
        L_0x00c8:
            androidx.media3.exoplayer.k.p r1 = androidx.media3.exoplayer.p151k.C3256v.f9787c
        L_0x00ca:
            r16 = r1
        L_0x00cc:
            boolean r1 = r16.mo7243a()
            r17 = r1 ^ 1
            androidx.media3.exoplayer.h.bc r1 = r0.f9511d
            int r3 = r13.f8847m
            int r5 = r0.f9508a
            androidx.media3.common.x r6 = r13.f8848n
            int r7 = r13.f8849o
            java.lang.Object r2 = r13.f8850p
            long r8 = r13.f8851q
            r21 = r15
            long r14 = r13.f8852r
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r14
            r11 = r20
            r12 = r17
            r1.mo7019r(r2, r3, r4, r5, r6, r7, r9, r11, r12)
            if (r17 == 0) goto L_0x00f8
            r1 = 0
            r0.f9498Q = r1
            long r1 = r13.f8845k
        L_0x00f8:
            if (r21 == 0) goto L_0x010b
            boolean r1 = r0.f9521n
            if (r1 != 0) goto L_0x0104
            long r1 = r0.f9532y
            r0.mo6819n(r1)
            goto L_0x010b
        L_0x0104:
            androidx.media3.exoplayer.hls.v r1 = r0.f9489H
            androidx.media3.exoplayer.hls.q r1 = (androidx.media3.exoplayer.hls.C3177q) r1
            r1.mo7174r()
        L_0x010b:
            r1 = r16
        L_0x010d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.C3185y.mo6827fe(androidx.media3.exoplayer.k.r, java.io.IOException, int):androidx.media3.exoplayer.k.p");
    }

    /* renamed from: g */
    public final void mo7180g() {
        C2601a.m6832d(this.f9521n);
        this.f9526s.getClass();
        this.f9527t.getClass();
    }

    /* renamed from: h */
    public final void mo7181h() {
        if (!this.f9521n) {
            mo6819n(this.f9532y);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7182j() {
        /*
            r15 = this;
            boolean r0 = r15.f9525r
            if (r0 != 0) goto L_0x0189
            int[] r0 = r15.f9528u
            if (r0 != 0) goto L_0x0189
            boolean r0 = r15.f9520m
            if (r0 != 0) goto L_0x000e
            goto L_0x0189
        L_0x000e:
            androidx.media3.exoplayer.hls.x[] r0 = r15.f9516i
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0013:
            if (r3 >= r1) goto L_0x0021
            r4 = r0[r3]
            androidx.media3.common.x r4 = r4.mo7079o()
            if (r4 != 0) goto L_0x001e
            return
        L_0x001e:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0021:
            androidx.media3.exoplayer.h.cr r0 = r15.f9526s
            r1 = 3
            r3 = -1
            if (r0 == 0) goto L_0x0099
            int r0 = r0.f9109b
            int[] r4 = new int[r0]
            r15.f9528u = r4
            java.util.Arrays.fill(r4, r3)
            r3 = 0
        L_0x0031:
            if (r3 >= r0) goto L_0x0084
            r4 = 0
        L_0x0034:
            androidx.media3.exoplayer.hls.x[] r5 = r15.f9516i
            int r6 = r5.length
            if (r4 >= r6) goto L_0x0081
            r5 = r5[r4]
            androidx.media3.common.x r5 = r5.mo7079o()
            androidx.media3.common.p136b.C2601a.m6829a(r5)
            androidx.media3.exoplayer.h.cr r6 = r15.f9526s
            androidx.media3.common.bn r6 = r6.mo7097b(r3)
            androidx.media3.common.x[] r6 = r6.f7357d
            r6 = r6[r2]
            java.lang.String r7 = r5.f7496n
            java.lang.String r8 = r6.f7496n
            int r9 = androidx.media3.common.C2598ay.m6803b(r7)
            if (r9 == r1) goto L_0x005d
            int r5 = androidx.media3.common.C2598ay.m6803b(r8)
            if (r9 != r5) goto L_0x007e
            goto L_0x0079
        L_0x005d:
            boolean r8 = androidx.media3.common.p136b.C2612ak.m6951aa(r7, r8)
            if (r8 == 0) goto L_0x007e
            java.lang.String r8 = "application/cea-608"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0073
            java.lang.String r8 = "application/cea-708"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0079
        L_0x0073:
            int r5 = r5.f7482F
            int r6 = r6.f7482F
            if (r5 != r6) goto L_0x007e
        L_0x0079:
            int[] r5 = r15.f9528u
            r5[r3] = r4
            goto L_0x0081
        L_0x007e:
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0084:
            java.util.ArrayList r0 = r15.f9515h
            int r1 = r0.size()
        L_0x008a:
            if (r2 >= r1) goto L_0x0098
            java.lang.Object r3 = r0.get(r2)
            androidx.media3.exoplayer.hls.r r3 = (androidx.media3.exoplayer.hls.C3178r) r3
            r3.mo7175d()
            int r2 = r2 + 1
            goto L_0x008a
        L_0x0098:
            return
        L_0x0099:
            androidx.media3.exoplayer.hls.x[] r0 = r15.f9516i
            int r0 = r0.length
            r4 = -2
            r5 = 0
            r6 = -2
            r7 = -1
        L_0x00a0:
            r8 = 2
            r9 = 1
            if (r5 >= r0) goto L_0x00dc
            androidx.media3.exoplayer.hls.x[] r10 = r15.f9516i
            r10 = r10[r5]
            androidx.media3.common.x r10 = r10.mo7079o()
            androidx.media3.common.p136b.C2601a.m6829a(r10)
            java.lang.String r10 = r10.f7496n
            boolean r11 = androidx.media3.common.C2598ay.m6817p(r10)
            if (r11 == 0) goto L_0x00b8
            goto L_0x00c9
        L_0x00b8:
            boolean r8 = androidx.media3.common.C2598ay.m6813l(r10)
            if (r8 == 0) goto L_0x00c0
            r8 = 1
            goto L_0x00c9
        L_0x00c0:
            boolean r8 = androidx.media3.common.C2598ay.m6816o(r10)
            if (r8 == 0) goto L_0x00c8
            r8 = 3
            goto L_0x00c9
        L_0x00c8:
            r8 = -2
        L_0x00c9:
            int r9 = m9297w(r8)
            int r10 = m9297w(r6)
            if (r9 <= r10) goto L_0x00d6
            r7 = r5
            r6 = r8
            goto L_0x00d9
        L_0x00d6:
            if (r8 != r6) goto L_0x00d9
            r7 = -1
        L_0x00d9:
            int r5 = r5 + 1
            goto L_0x00a0
        L_0x00dc:
            androidx.media3.exoplayer.hls.l r1 = r15.f9509b
            androidx.media3.common.bn r1 = r1.f9407g
            int r4 = r1.f7354a
            r15.f9529v = r3
            int[] r3 = new int[r0]
            r15.f9528u = r3
            r3 = 0
        L_0x00e9:
            if (r3 >= r0) goto L_0x00f2
            int[] r5 = r15.f9528u
            r5[r3] = r3
            int r3 = r3 + 1
            goto L_0x00e9
        L_0x00f2:
            androidx.media3.common.bn[] r3 = new androidx.media3.common.C2652bn[r0]
            r5 = 0
        L_0x00f5:
            if (r5 >= r0) goto L_0x016e
            androidx.media3.exoplayer.hls.x[] r10 = r15.f9516i
            r10 = r10[r5]
            androidx.media3.common.x r10 = r10.mo7079o()
            androidx.media3.common.p136b.C2601a.m6829a(r10)
            if (r5 != r7) goto L_0x0133
            androidx.media3.common.x[] r11 = new androidx.media3.common.C2680x[r4]
            r12 = 0
        L_0x0107:
            if (r12 >= r4) goto L_0x0127
            androidx.media3.common.x[] r13 = r1.f7357d
            r13 = r13[r12]
            if (r6 != r9) goto L_0x0117
            androidx.media3.common.x r14 = r15.f9490I
            if (r14 == 0) goto L_0x0117
            androidx.media3.common.x r13 = r13.mo6358c(r14)
        L_0x0117:
            if (r4 != r9) goto L_0x011e
            androidx.media3.common.x r13 = r10.mo6358c(r13)
            goto L_0x0122
        L_0x011e:
            androidx.media3.common.x r13 = m9298x(r13, r10, r9)
        L_0x0122:
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x0107
        L_0x0127:
            androidx.media3.common.bn r10 = new androidx.media3.common.bn
            java.lang.String r12 = r15.f9488G
            r10.<init>(r12, r11)
            r3[r5] = r10
            r15.f9529v = r5
            goto L_0x016b
        L_0x0133:
            r11 = 0
            if (r6 != r8) goto L_0x0140
            java.lang.String r12 = r10.f7496n
            boolean r12 = androidx.media3.common.C2598ay.m6813l(r12)
            if (r12 == 0) goto L_0x0140
            androidx.media3.common.x r11 = r15.f9490I
        L_0x0140:
            java.lang.String r12 = r15.f9488G
            if (r5 >= r7) goto L_0x0146
            r13 = r5
            goto L_0x0148
        L_0x0146:
            int r13 = r5 + -1
        L_0x0148:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            java.lang.String r12 = ":muxed:"
            r14.append(r12)
            r14.append(r13)
            java.lang.String r12 = r14.toString()
            androidx.media3.common.bn r13 = new androidx.media3.common.bn
            androidx.media3.common.x[] r14 = new androidx.media3.common.C2680x[r9]
            androidx.media3.common.x r10 = m9298x(r11, r10, r2)
            r14[r2] = r10
            r13.<init>(r12, r14)
            r3[r5] = r13
        L_0x016b:
            int r5 = r5 + 1
            goto L_0x00f5
        L_0x016e:
            androidx.media3.exoplayer.h.cr r0 = r15.m9299y(r3)
            r15.f9526s = r0
            java.util.Set r0 = r15.f9527t
            if (r0 != 0) goto L_0x0179
            r2 = 1
        L_0x0179:
            androidx.media3.common.p136b.C2601a.m6832d(r2)
            java.util.Set r0 = java.util.Collections.emptySet()
            r15.f9527t = r0
            r15.f9521n = r9
            androidx.media3.exoplayer.hls.v r0 = r15.f9489H
            r0.mo7173p()
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.C3185y.mo7182j():void");
    }

    /* renamed from: k */
    public final void mo7183k() {
        this.f9510c.mo7250c(LinearLayoutManager.INVALID_OFFSET);
        C3172l lVar = this.f9509b;
        IOException iOException = lVar.f9413m;
        if (iOException == null) {
            Uri uri = lVar.f9414n;
            if (uri != null && lVar.f9418r) {
                lVar.f9406f.mo7144g(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: l */
    public final void mo6995l() {
        for (C3184x u : this.f9516i) {
            u.mo7084u();
        }
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
        int i;
        C3256v vVar = this.f9510c;
        if (!vVar.mo7252e() && !mo7186s()) {
            if (vVar.mo7253f()) {
                C3050f fVar = this.f9498Q;
                fVar.getClass();
                C3172l lVar = this.f9509b;
                List list = this.f9513f;
                if (lVar.f9413m == null && lVar.f9416p.mo7041s(j, fVar, list)) {
                    this.f9510c.mo7249b();
                    return;
                }
                return;
            }
            int size = this.f9513f.size();
            while (size > 0) {
                int i2 = size - 1;
                if (this.f9509b.mo7168a((C3175o) this.f9513f.get(i2)) != 2) {
                    break;
                }
                size = i2;
            }
            if (size < this.f9513f.size()) {
                m9296A(size);
            }
            C3172l lVar2 = this.f9509b;
            List list2 = this.f9513f;
            if (lVar2.f9413m != null || lVar2.f9416p.mo7032j() < 2) {
                i = list2.size();
            } else {
                i = lVar2.f9416p.mo7025e(j, list2);
            }
            if (i < this.f9512e.size()) {
                m9296A(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0286  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6819n(long r38) {
        /*
            r37 = this;
            r0 = r37
            boolean r1 = r0.f9485B
            if (r1 != 0) goto L_0x038b
            androidx.media3.exoplayer.k.v r1 = r0.f9510c
            boolean r2 = r1.mo7253f()
            if (r2 != 0) goto L_0x038b
            boolean r1 = r1.mo7252e()
            if (r1 == 0) goto L_0x0016
            goto L_0x038b
        L_0x0016:
            boolean r1 = r37.mo7186s()
            if (r1 == 0) goto L_0x0031
            java.util.List r1 = java.util.Collections.emptyList()
            long r2 = r0.f9503V
            androidx.media3.exoplayer.hls.x[] r4 = r0.f9516i
            int r5 = r4.length
            r6 = 0
        L_0x0026:
            if (r6 >= r5) goto L_0x0046
            r7 = r4[r6]
            long r8 = r0.f9503V
            r7.f9045g = r8
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0031:
            java.util.List r1 = r0.f9513f
            androidx.media3.exoplayer.hls.o r2 = r37.mo7179e()
            boolean r3 = r2.f9439g
            if (r3 == 0) goto L_0x003e
            long r2 = r2.f8852r
            goto L_0x0046
        L_0x003e:
            long r3 = r0.f9532y
            long r5 = r2.f8851q
            long r2 = java.lang.Math.max(r3, r5)
        L_0x0046:
            r8 = r1
            r14 = r2
            androidx.media3.exoplayer.hls.h r1 = r0.f9494M
            r1.mo7167a()
            androidx.media3.exoplayer.hls.l r13 = r0.f9509b
            boolean r1 = r0.f9521n
            if (r1 != 0) goto L_0x005d
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            r19 = 0
            goto L_0x005f
        L_0x005d:
            r19 = 1
        L_0x005f:
            androidx.media3.exoplayer.hls.h r11 = r0.f9494M
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0069
            r6 = 0
            goto L_0x0070
        L_0x0069:
            java.lang.Object r1 = com.google.common.p4522b.C58557jl.m90131l(r8)
            androidx.media3.exoplayer.hls.o r1 = (androidx.media3.exoplayer.hls.C3175o) r1
            r6 = r1
        L_0x0070:
            if (r6 != 0) goto L_0x0074
            r4 = -1
            goto L_0x007d
        L_0x0074:
            androidx.media3.common.bn r1 = r13.f9407g
            androidx.media3.common.x r2 = r6.f8848n
            int r1 = r1.mo6305a(r2)
            r4 = r1
        L_0x007d:
            long r1 = r14 - r38
            long r9 = r13.f9417q
            r17 = r13
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x008f
            long r9 = r9 - r38
            goto L_0x0090
        L_0x008f:
            r9 = r12
        L_0x0090:
            if (r6 == 0) goto L_0x00bb
            r5 = r17
            boolean r3 = r5.f9415o
            if (r3 != 0) goto L_0x00b6
            r17 = r8
            long r7 = r6.f8852r
            long r12 = r6.f8851q
            long r7 = r7 - r12
            long r1 = r1 - r7
            r12 = 0
            long r1 = java.lang.Math.max(r12, r1)
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x00c1
            long r9 = r9 - r7
            long r7 = java.lang.Math.max(r12, r9)
            r9 = r7
            goto L_0x00c1
        L_0x00b6:
            r17 = r8
            r21 = r12
            goto L_0x00c1
        L_0x00bb:
            r21 = r12
            r5 = r17
            r17 = r8
        L_0x00c1:
            r7 = r1
            androidx.media3.exoplayer.h.b.q[] r12 = r5.mo7171e(r6, r14)
            androidx.media3.exoplayer.j.ad r1 = r5.f9416p
            r2 = r38
            r13 = r4
            r23 = r14
            r14 = r5
            r4 = r7
            r33 = r6
            r15 = -1
            r6 = r9
            r8 = r17
            r10 = 0
            r9 = r12
            r1.mo7024d(r2, r4, r6, r8, r9)
            androidx.media3.exoplayer.j.ad r1 = r14.f9416p
            int r4 = r1.mo7028g()
            if (r13 == r4) goto L_0x00e4
            r1 = 1
            goto L_0x00e5
        L_0x00e4:
            r1 = 0
        L_0x00e5:
            android.net.Uri[] r2 = r14.f9404d
            r2 = r2[r4]
            androidx.media3.exoplayer.hls.a.y r3 = r14.f9406f
            boolean r3 = r3.mo7145h(r2)
            if (r3 != 0) goto L_0x0102
            r11.f9393c = r2
            boolean r1 = r14.f9418r
            android.net.Uri r3 = r14.f9414n
            boolean r3 = r2.equals(r3)
            r1 = r1 & r3
            r14.f9418r = r1
            r14.f9414n = r2
            goto L_0x02e7
        L_0x0102:
            androidx.media3.exoplayer.hls.a.y r3 = r14.f9406f
            r5 = 1
            androidx.media3.exoplayer.hls.a.l r3 = r3.mo7143f(r2, r5)
            r3.getClass()
            boolean r6 = r3.f9316v
            r14.f9415o = r6
            boolean r6 = r3.f9286l
            if (r6 == 0) goto L_0x0117
            r6 = r21
            goto L_0x0123
        L_0x0117:
            long r6 = r3.f9279e
            long r8 = r3.f9292r
            long r6 = r6 + r8
            androidx.media3.exoplayer.hls.a.y r8 = r14.f9406f
            androidx.media3.exoplayer.hls.a.e r8 = (androidx.media3.exoplayer.hls.p148a.C3137e) r8
            long r8 = r8.f9249l
            long r6 = r6 - r8
        L_0x0123:
            r14.f9417q = r6
            long r6 = r3.f9279e
            androidx.media3.exoplayer.hls.a.y r8 = r14.f9406f
            androidx.media3.exoplayer.hls.a.e r8 = (androidx.media3.exoplayer.hls.p148a.C3137e) r8
            long r8 = r8.f9249l
            long r6 = r6 - r8
            r8 = r11
            r11 = r14
            r9 = 1
            r12 = r33
            r20 = r13
            r5 = r14
            r13 = r1
            r21 = r23
            r14 = r3
            r10 = -1
            r15 = r6
            r17 = r21
            android.util.Pair r11 = r11.mo7169c(r12, r13, r14, r15, r17)
            java.lang.Object r12 = r11.first
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            java.lang.Object r11 = r11.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            long r14 = r3.f9282h
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0195
            if (r33 == 0) goto L_0x0195
            if (r1 == 0) goto L_0x0195
            android.net.Uri[] r1 = r5.f9404d
            r1 = r1[r20]
            androidx.media3.exoplayer.hls.a.y r2 = r5.f9406f
            androidx.media3.exoplayer.hls.a.l r2 = r2.mo7143f(r1, r9)
            r2.getClass()
            long r3 = r2.f9279e
            androidx.media3.exoplayer.hls.a.y r6 = r5.f9406f
            androidx.media3.exoplayer.hls.a.e r6 = (androidx.media3.exoplayer.hls.p148a.C3137e) r6
            long r6 = r6.f9249l
            long r3 = r3 - r6
            r13 = 0
            r11 = r5
            r12 = r33
            r14 = r2
            r15 = r3
            r17 = r21
            android.util.Pair r6 = r11.mo7169c(r12, r13, r14, r15, r17)
            java.lang.Object r7 = r6.first
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r11 = r2
            r14 = r3
            r2 = r6
            r6 = r1
            r1 = r20
            goto L_0x019a
        L_0x0195:
            r1 = r4
            r14 = r6
            r6 = r2
            r2 = r11
            r11 = r3
        L_0x019a:
            long r3 = r11.f9282h
            int r7 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x01a9
            androidx.media3.exoplayer.h.b r1 = new androidx.media3.exoplayer.h.b
            r1.<init>()
            r5.f9413m = r1
            goto L_0x02e7
        L_0x01a9:
            long r3 = r12 - r3
            int r4 = (int) r3
            java.util.List r3 = r11.f9289o
            int r3 = r3.size()
            if (r4 != r3) goto L_0x01d0
            if (r2 != r10) goto L_0x01b7
            r2 = 0
        L_0x01b7:
            java.util.List r3 = r11.f9290p
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x01ce
            androidx.media3.exoplayer.hls.k r3 = new androidx.media3.exoplayer.hls.k
            java.util.List r4 = r11.f9290p
            java.lang.Object r4 = r4.get(r2)
            androidx.media3.exoplayer.hls.a.j r4 = (androidx.media3.exoplayer.hls.p148a.C3142j) r4
            r3.<init>(r4, r12, r2)
            r2 = r3
            goto L_0x022a
        L_0x01ce:
            r2 = 0
            goto L_0x022a
        L_0x01d0:
            java.util.List r3 = r11.f9289o
            java.lang.Object r3 = r3.get(r4)
            androidx.media3.exoplayer.hls.a.i r3 = (androidx.media3.exoplayer.hls.p148a.C3141i) r3
            if (r2 != r10) goto L_0x01e0
            androidx.media3.exoplayer.hls.k r2 = new androidx.media3.exoplayer.hls.k
            r2.<init>(r3, r12, r10)
            goto L_0x022a
        L_0x01e0:
            java.util.List r7 = r3.f9258b
            int r7 = r7.size()
            if (r2 >= r7) goto L_0x01f7
            androidx.media3.exoplayer.hls.k r4 = new androidx.media3.exoplayer.hls.k
            java.util.List r3 = r3.f9258b
            java.lang.Object r3 = r3.get(r2)
            androidx.media3.exoplayer.hls.a.j r3 = (androidx.media3.exoplayer.hls.p148a.C3142j) r3
            r4.<init>(r3, r12, r2)
            r2 = r4
            goto L_0x022a
        L_0x01f7:
            int r4 = r4 + r9
            java.util.List r2 = r11.f9289o
            int r2 = r2.size()
            r16 = 1
            if (r4 >= r2) goto L_0x0212
            androidx.media3.exoplayer.hls.k r2 = new androidx.media3.exoplayer.hls.k
            java.util.List r3 = r11.f9289o
            java.lang.Object r3 = r3.get(r4)
            androidx.media3.exoplayer.hls.a.j r3 = (androidx.media3.exoplayer.hls.p148a.C3142j) r3
            long r12 = r12 + r16
            r2.<init>(r3, r12, r10)
            goto L_0x022a
        L_0x0212:
            java.util.List r2 = r11.f9290p
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01ce
            androidx.media3.exoplayer.hls.k r2 = new androidx.media3.exoplayer.hls.k
            java.util.List r3 = r11.f9290p
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            androidx.media3.exoplayer.hls.a.j r3 = (androidx.media3.exoplayer.hls.p148a.C3142j) r3
            long r12 = r12 + r16
            r2.<init>(r3, r12, r4)
        L_0x022a:
            if (r2 != 0) goto L_0x026d
            boolean r2 = r11.f9286l
            if (r2 != 0) goto L_0x0241
            r8.f9393c = r6
            boolean r1 = r5.f9418r
            android.net.Uri r2 = r5.f9414n
            boolean r2 = r6.equals(r2)
            r1 = r1 & r2
            r5.f9418r = r1
            r5.f9414n = r6
            goto L_0x02e7
        L_0x0241:
            if (r19 != 0) goto L_0x0268
            java.util.List r2 = r11.f9289o
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x024c
            goto L_0x0268
        L_0x024c:
            androidx.media3.exoplayer.hls.k r2 = new androidx.media3.exoplayer.hls.k
            java.util.List r3 = r11.f9289o
            java.lang.Object r3 = com.google.common.p4522b.C58557jl.m90131l(r3)
            androidx.media3.exoplayer.hls.a.j r3 = (androidx.media3.exoplayer.hls.p148a.C3142j) r3
            long r12 = r11.f9282h
            java.util.List r4 = r11.f9289o
            int r4 = r4.size()
            long r9 = (long) r4
            long r12 = r12 + r9
            r9 = -1
            long r12 = r12 + r9
            r4 = -1
            r2.<init>(r3, r12, r4)
            goto L_0x026d
        L_0x0268:
            r1 = 1
            r8.f9392b = r1
            goto L_0x02e7
        L_0x026d:
            r9 = r2
            r2 = 0
            r5.f9418r = r2
            r2 = 0
            r5.f9414n = r2
            androidx.media3.exoplayer.hls.a.j r2 = r9.f9397a
            androidx.media3.exoplayer.hls.a.i r2 = r2.f9260d
            android.net.Uri r10 = androidx.media3.exoplayer.hls.C3172l.m9240b(r11, r2)
            androidx.media3.exoplayer.h.b.f r2 = r5.mo7170d(r10, r1)
            r8.f9391a = r2
            androidx.media3.exoplayer.h.b.f r2 = r8.f9391a
            if (r2 != 0) goto L_0x02e7
            androidx.media3.exoplayer.hls.a.j r2 = r9.f9397a
            android.net.Uri r12 = androidx.media3.exoplayer.hls.C3172l.m9240b(r11, r2)
            androidx.media3.exoplayer.h.b.f r2 = r5.mo7170d(r12, r1)
            r8.f9391a = r2
            androidx.media3.exoplayer.h.b.f r2 = r8.f9391a
            if (r2 != 0) goto L_0x02e7
            r2 = r33
            r3 = r6
            r4 = r11
            r13 = r5
            r5 = r9
            r16 = r6
            r6 = r14
            boolean r36 = androidx.media3.exoplayer.hls.C3175o.m9245e(r2, r3, r4, r5, r6)
            if (r36 == 0) goto L_0x02a9
            boolean r2 = r9.f9400d
            if (r2 != 0) goto L_0x02e7
        L_0x02a9:
            androidx.media3.exoplayer.hls.m r2 = r13.f9401a
            r20 = r2
            androidx.media3.b.i r2 = r13.f9402b
            r21 = r2
            androidx.media3.common.x[] r2 = r13.f9405e
            r22 = r2[r1]
            java.util.List r1 = r13.f9408h
            r28 = r1
            androidx.media3.exoplayer.j.ad r1 = r13.f9416p
            int r29 = r1.mo7022b()
            androidx.media3.exoplayer.j.ad r1 = r13.f9416p
            java.lang.Object r30 = r1.mo7023c()
            boolean r1 = r13.f9411k
            r31 = r1
            androidx.media3.exoplayer.hls.ac r1 = r13.f9403c
            r32 = r1
            androidx.media3.exoplayer.hls.f r1 = r13.f9409i
            byte[] r34 = r1.mo7165a(r12)
            androidx.media3.exoplayer.hls.f r1 = r13.f9409i
            byte[] r35 = r1.mo7165a(r10)
            r23 = r14
            r25 = r11
            r26 = r9
            r27 = r16
            androidx.media3.exoplayer.hls.o r1 = androidx.media3.exoplayer.hls.C3175o.m9246f(r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r8.f9391a = r1
        L_0x02e7:
            androidx.media3.exoplayer.hls.h r1 = r0.f9494M
            boolean r2 = r1.f9392b
            androidx.media3.exoplayer.h.b.f r3 = r1.f9391a
            android.net.Uri r1 = r1.f9393c
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x02fc
            r0.f9503V = r4
            r1 = 1
            r0.f9485B = r1
            return r1
        L_0x02fc:
            if (r3 != 0) goto L_0x0317
            if (r1 == 0) goto L_0x0315
            androidx.media3.exoplayer.hls.v r2 = r0.f9489H
            androidx.media3.exoplayer.hls.q r2 = (androidx.media3.exoplayer.hls.C3177q) r2
            androidx.media3.exoplayer.hls.a.y r2 = r2.f9448a
            androidx.media3.exoplayer.hls.a.e r2 = (androidx.media3.exoplayer.hls.p148a.C3137e) r2
            java.util.HashMap r2 = r2.f9239b
            java.lang.Object r1 = r2.get(r1)
            androidx.media3.exoplayer.hls.a.d r1 = (androidx.media3.exoplayer.hls.p148a.C3136d) r1
            android.net.Uri r2 = r1.f9227a
            r1.mo7139e(r2)
        L_0x0315:
            r1 = 0
            return r1
        L_0x0317:
            boolean r1 = r3 instanceof androidx.media3.exoplayer.hls.C3175o
            if (r1 == 0) goto L_0x0364
            r1 = r3
            androidx.media3.exoplayer.hls.o r1 = (androidx.media3.exoplayer.hls.C3175o) r1
            r0.f9506Y = r1
            androidx.media3.common.x r2 = r1.f8848n
            r0.f9523p = r2
            r0.f9503V = r4
            java.util.ArrayList r2 = r0.f9512e
            r2.add(r1)
            com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()
            androidx.media3.exoplayer.hls.x[] r4 = r0.f9516i
            int r5 = r4.length
            r6 = 0
        L_0x0333:
            if (r6 >= r5) goto L_0x0346
            r7 = r4[r6]
            int r8 = r7.f9043e
            int r7 = r7.f9042d
            int r8 = r8 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r2.mo55395g(r7)
            int r6 = r6 + 1
            goto L_0x0333
        L_0x0346:
            com.google.common.b.gu r2 = r2.mo55394f()
            r1.f9438f = r0
            r1.f9440h = r2
            androidx.media3.exoplayer.hls.x[] r2 = r0.f9516i
            int r4 = r2.length
            r10 = 0
        L_0x0352:
            if (r10 >= r4) goto L_0x0364
            r5 = r2[r10]
            int r6 = r1.f9433a
            r5.f9047i = r6
            boolean r6 = r1.f9436d
            if (r6 == 0) goto L_0x0361
            r6 = 1
            r5.f9048j = r6
        L_0x0361:
            int r10 = r10 + 1
            goto L_0x0352
        L_0x0364:
            r0.f9498Q = r3
            androidx.media3.exoplayer.k.v r1 = r0.f9510c
            int r2 = r3.f8847m
            int r2 = androidx.media3.exoplayer.p151k.C3245k.m9467b(r2)
            r1.mo7254g(r3, r0, r2)
            androidx.media3.exoplayer.h.bc r4 = r0.f9511d
            androidx.media3.exoplayer.h.aj r5 = new androidx.media3.exoplayer.h.aj
            androidx.media3.b.n r1 = r3.f8846l
            r5.<init>(r1)
            int r6 = r3.f8847m
            int r7 = r0.f9508a
            androidx.media3.common.x r8 = r3.f8848n
            int r9 = r3.f8849o
            long r10 = r3.f8851q
            long r12 = r3.f8852r
            r4.mo7020s(r5, r6, r7, r8, r9, r10, r12)
            r1 = 1
            return r1
        L_0x038b:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.C3185y.mo6819n(long):boolean");
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        return this.f9510c.mo7253f();
    }

    /* renamed from: p */
    public final void mo7184p() {
        for (C3184x w : this.f9516i) {
            w.mo7086w(this.f9533z);
        }
        this.f9533z = false;
    }

    /* renamed from: q */
    public final void mo6989q(C3364bb bbVar) {
    }

    /* renamed from: r */
    public final void mo7185r(long j) {
        if (this.f9505X != j) {
            this.f9505X = j;
            for (C3184x x : this.f9516i) {
                x.mo7087x(j);
            }
        }
    }

    /* renamed from: s */
    public final boolean mo7186s() {
        return this.f9503V != -9223372036854775807L;
    }

    /* renamed from: t */
    public final boolean mo7187t(long j, boolean z) {
        this.f9532y = j;
        if (mo7186s()) {
            this.f9503V = j;
            return true;
        }
        if (this.f9520m && !z) {
            int length = this.f9516i.length;
            int i = 0;
            while (i < length) {
                if (this.f9516i[i].mo7070C(j, false) || (!this.f9531x[i] && this.f9502U)) {
                    i++;
                }
            }
            return false;
        }
        this.f9503V = j;
        this.f9485B = false;
        this.f9512e.clear();
        C3256v vVar = this.f9510c;
        if (vVar.mo7253f()) {
            if (this.f9520m) {
                for (C3184x q : this.f9516i) {
                    q.mo7081q();
                }
            }
            this.f9510c.mo7249b();
        } else {
            vVar.f9790f = null;
            mo7184p();
        }
        return true;
    }

    /* renamed from: u */
    public final void mo7057u() {
        this.f9514g.post(this.f9495N);
    }

    /* renamed from: v */
    public final void mo7188v(C2652bn[] bnVarArr, int... iArr) {
        this.f9526s = m9299y(bnVarArr);
        this.f9527t = new HashSet();
        for (int b : iArr) {
            this.f9527t.add(this.f9526s.mo7097b(b));
        }
        this.f9529v = 0;
        Handler handler = this.f9514g;
        C3182v vVar = this.f9489H;
        Objects.requireNonNull(vVar);
        handler.post(new C3179s(vVar));
        this.f9521n = true;
    }
}
