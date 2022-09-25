package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zc */
/* compiled from: PG */
final class C7463zc implements act, acx, C7356vd, C7056ka, C7351uz {

    /* renamed from: b */
    private static final Set f24494b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 4})));

    /* renamed from: A */
    private int f24495A;

    /* renamed from: B */
    private boolean f24496B;

    /* renamed from: C */
    private boolean f24497C;

    /* renamed from: D */
    private int f24498D;

    /* renamed from: E */
    private C6864cy f24499E;

    /* renamed from: F */
    private C6864cy f24500F;

    /* renamed from: G */
    private boolean f24501G;

    /* renamed from: H */
    private C7362vj f24502H;

    /* renamed from: I */
    private Set f24503I;

    /* renamed from: J */
    private int[] f24504J;

    /* renamed from: K */
    private int f24505K;

    /* renamed from: L */
    private boolean f24506L;

    /* renamed from: M */
    private boolean[] f24507M;

    /* renamed from: N */
    private boolean[] f24508N;

    /* renamed from: O */
    private long f24509O;

    /* renamed from: P */
    private long f24510P;

    /* renamed from: Q */
    private boolean f24511Q;

    /* renamed from: R */
    private boolean f24512R;

    /* renamed from: S */
    private boolean f24513S;

    /* renamed from: T */
    private boolean f24514T;

    /* renamed from: U */
    private long f24515U;

    /* renamed from: V */
    private C7031jc f24516V;

    /* renamed from: W */
    private C7450yq f24517W;

    /* renamed from: X */
    private final acc f24518X;

    /* renamed from: Y */
    private final acj f24519Y;

    /* renamed from: c */
    private final int f24520c;

    /* renamed from: d */
    private final C7459yz f24521d;

    /* renamed from: e */
    private final C7448yo f24522e;

    /* renamed from: f */
    private final C6864cy f24523f;

    /* renamed from: g */
    private final C7036jh f24524g;

    /* renamed from: h */
    private final C7033je f24525h;

    /* renamed from: i */
    private final ada f24526i = new ada("Loader:HlsSampleStreamWrapper");

    /* renamed from: j */
    private final C7332ug f24527j;

    /* renamed from: k */
    private final int f24528k;

    /* renamed from: l */
    private final C7445yl f24529l = new C7445yl();

    /* renamed from: m */
    private final ArrayList f24530m;

    /* renamed from: n */
    private final List f24531n;

    /* renamed from: o */
    private final Runnable f24532o;

    /* renamed from: p */
    private final Runnable f24533p;

    /* renamed from: q */
    private final Handler f24534q;

    /* renamed from: r */
    private final ArrayList f24535r;

    /* renamed from: s */
    private final Map f24536s;

    /* renamed from: t */
    private C7372vt f24537t;

    /* renamed from: u */
    private C7462zb[] f24538u;

    /* renamed from: v */
    private int[] f24539v = new int[0];

    /* renamed from: w */
    private final Set f24540w;

    /* renamed from: x */
    private final SparseIntArray f24541x;

    /* renamed from: y */
    private C7073kr f24542y;

    /* renamed from: z */
    private int f24543z;

    public C7463zc(int i, C7459yz yzVar, C7448yo yoVar, Map map, acc acc, long j, C6864cy cyVar, C7036jh jhVar, C7033je jeVar, acj acj, C7332ug ugVar, int i2) {
        this.f24520c = i;
        this.f24521d = yzVar;
        this.f24522e = yoVar;
        this.f24536s = map;
        this.f24518X = acc;
        this.f24523f = cyVar;
        this.f24524g = jhVar;
        this.f24525h = jeVar;
        this.f24519Y = acj;
        this.f24527j = ugVar;
        this.f24528k = i2;
        Set set = f24494b;
        this.f24540w = new HashSet(set.size());
        this.f24541x = new SparseIntArray(set.size());
        this.f24538u = new C7462zb[0];
        this.f24508N = new boolean[0];
        this.f24507M = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f24530m = arrayList;
        this.f24531n = Collections.unmodifiableList(arrayList);
        this.f24535r = new ArrayList();
        this.f24532o = new C7455yv(this);
        this.f24533p = new C7456yw(this);
        this.f24534q = aeu.m18541k();
        this.f24509O = j;
        this.f24510P = j;
    }

    /* renamed from: I */
    private final void m22601I() {
        for (C7462zb i : this.f24538u) {
            i.mo16620i(this.f24511Q);
        }
        this.f24511Q = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16848F() {
        /*
            r14 = this;
            boolean r0 = r14.f24501G
            if (r0 != 0) goto L_0x016a
            int[] r0 = r14.f24504J
            if (r0 != 0) goto L_0x016a
            boolean r0 = r14.f24496B
            if (r0 != 0) goto L_0x000e
            goto L_0x016a
        L_0x000e:
            com.google.ads.interactivemedia.v3.internal.zb[] r0 = r14.f24538u
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0013:
            if (r3 >= r1) goto L_0x0021
            r4 = r0[r3]
            com.google.ads.interactivemedia.v3.internal.cy r4 = r4.mo16631t()
            if (r4 != 0) goto L_0x001e
            return
        L_0x001e:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0021:
            com.google.ads.interactivemedia.v3.internal.vj r0 = r14.f24502H
            r1 = 3
            r3 = -1
            if (r0 == 0) goto L_0x0099
            int r0 = r0.f24052b
            int[] r4 = new int[r0]
            r14.f24504J = r4
            java.util.Arrays.fill(r4, r3)
            r3 = 0
        L_0x0031:
            if (r3 >= r0) goto L_0x0084
            r4 = 0
        L_0x0034:
            com.google.ads.interactivemedia.v3.internal.zb[] r5 = r14.f24538u
            int r6 = r5.length
            if (r4 >= r6) goto L_0x0081
            r5 = r5[r4]
            com.google.ads.interactivemedia.v3.internal.cy r5 = r5.mo16631t()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r5)
            com.google.ads.interactivemedia.v3.internal.vj r6 = r14.f24502H
            com.google.ads.interactivemedia.v3.internal.vh r6 = r6.mo16656a(r3)
            com.google.ads.interactivemedia.v3.internal.cy r6 = r6.mo16648a(r2)
            java.lang.String r7 = r5.f21812l
            java.lang.String r8 = r6.f21812l
            int r9 = com.google.ads.interactivemedia.p367v3.internal.adz.m18358j(r7)
            if (r9 == r1) goto L_0x005d
            int r5 = com.google.ads.interactivemedia.p367v3.internal.adz.m18358j(r8)
            if (r9 != r5) goto L_0x007e
            goto L_0x0079
        L_0x005d:
            boolean r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r7, r8)
            if (r8 == 0) goto L_0x007e
            java.lang.String r8 = "application/cea-608"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0073
            java.lang.String r8 = "application/cea-708"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0079
        L_0x0073:
            int r5 = r5.f21798D
            int r6 = r6.f21798D
            if (r5 != r6) goto L_0x007e
        L_0x0079:
            int[] r5 = r14.f24504J
            r5[r3] = r4
            goto L_0x0081
        L_0x007e:
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0084:
            java.util.ArrayList r0 = r14.f24535r
            int r1 = r0.size()
        L_0x008a:
            if (r2 >= r1) goto L_0x0098
            java.lang.Object r3 = r0.get(r2)
            com.google.ads.interactivemedia.v3.internal.yu r3 = (com.google.ads.interactivemedia.p367v3.internal.C7454yu) r3
            r3.mo16834a()
            int r2 = r2 + 1
            goto L_0x008a
        L_0x0098:
            return
        L_0x0099:
            com.google.ads.interactivemedia.v3.internal.zb[] r0 = r14.f24538u
            int r0 = r0.length
            r4 = 6
            r5 = 0
            r6 = 6
            r7 = -1
        L_0x00a0:
            r8 = 2
            r9 = 1
            if (r5 >= r0) goto L_0x00dc
            com.google.ads.interactivemedia.v3.internal.zb[] r10 = r14.f24538u
            r10 = r10[r5]
            com.google.ads.interactivemedia.v3.internal.cy r10 = r10.mo16631t()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r10)
            java.lang.String r10 = r10.f21812l
            boolean r11 = com.google.ads.interactivemedia.p367v3.internal.adz.m18350b(r10)
            if (r11 == 0) goto L_0x00b8
            goto L_0x00c9
        L_0x00b8:
            boolean r8 = com.google.ads.interactivemedia.p367v3.internal.adz.m18349a(r10)
            if (r8 == 0) goto L_0x00c0
            r8 = 1
            goto L_0x00c9
        L_0x00c0:
            boolean r8 = com.google.ads.interactivemedia.p367v3.internal.adz.m18351c(r10)
            if (r8 == 0) goto L_0x00c8
            r8 = 3
            goto L_0x00c9
        L_0x00c8:
            r8 = 6
        L_0x00c9:
            int r9 = m22608Q(r8)
            int r10 = m22608Q(r6)
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
            com.google.ads.interactivemedia.v3.internal.yo r1 = r14.f24522e
            com.google.ads.interactivemedia.v3.internal.vh r1 = r1.mo16813b()
            int r4 = r1.f24048a
            r14.f24505K = r3
            int[] r3 = new int[r0]
            r14.f24504J = r3
            r3 = 0
        L_0x00eb:
            if (r3 >= r0) goto L_0x00f4
            int[] r5 = r14.f24504J
            r5[r3] = r3
            int r3 = r3 + 1
            goto L_0x00eb
        L_0x00f4:
            com.google.ads.interactivemedia.v3.internal.vh[] r3 = new com.google.ads.interactivemedia.p367v3.internal.C7360vh[r0]
            r5 = 0
        L_0x00f7:
            if (r5 >= r0) goto L_0x014e
            com.google.ads.interactivemedia.v3.internal.zb[] r10 = r14.f24538u
            r10 = r10[r5]
            com.google.ads.interactivemedia.v3.internal.cy r10 = r10.mo16631t()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19466s(r10)
            if (r5 != r7) goto L_0x012f
            com.google.ads.interactivemedia.v3.internal.cy[] r11 = new com.google.ads.interactivemedia.p367v3.internal.C6864cy[r4]
            if (r4 != r9) goto L_0x0115
            com.google.ads.interactivemedia.v3.internal.cy r12 = r1.mo16648a(r2)
            com.google.ads.interactivemedia.v3.internal.cy r10 = r10.mo15637b(r12)
            r11[r2] = r10
            goto L_0x0125
        L_0x0115:
            r12 = 0
        L_0x0116:
            if (r12 >= r4) goto L_0x0125
            com.google.ads.interactivemedia.v3.internal.cy r13 = r1.mo16648a(r12)
            com.google.ads.interactivemedia.v3.internal.cy r13 = m22609R(r13, r10, r9)
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x0116
        L_0x0125:
            com.google.ads.interactivemedia.v3.internal.vh r10 = new com.google.ads.interactivemedia.v3.internal.vh
            r10.<init>((com.google.ads.interactivemedia.p367v3.internal.C6864cy[]) r11)
            r3[r5] = r10
            r14.f24505K = r5
            goto L_0x014b
        L_0x012f:
            r11 = 0
            if (r6 != r8) goto L_0x013c
            java.lang.String r12 = r10.f21812l
            boolean r12 = com.google.ads.interactivemedia.p367v3.internal.adz.m18349a(r12)
            if (r12 == 0) goto L_0x013c
            com.google.ads.interactivemedia.v3.internal.cy r11 = r14.f24523f
        L_0x013c:
            com.google.ads.interactivemedia.v3.internal.vh r12 = new com.google.ads.interactivemedia.v3.internal.vh
            com.google.ads.interactivemedia.v3.internal.cy[] r13 = new com.google.ads.interactivemedia.p367v3.internal.C6864cy[r9]
            com.google.ads.interactivemedia.v3.internal.cy r10 = m22609R(r11, r10, r2)
            r13[r2] = r10
            r12.<init>((com.google.ads.interactivemedia.p367v3.internal.C6864cy[]) r13)
            r3[r5] = r12
        L_0x014b:
            int r5 = r5 + 1
            goto L_0x00f7
        L_0x014e:
            com.google.ads.interactivemedia.v3.internal.vj r0 = r14.m22603L(r3)
            r14.f24502H = r0
            java.util.Set r0 = r14.f24503I
            if (r0 != 0) goto L_0x0159
            r2 = 1
        L_0x0159:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r2)
            java.util.Set r0 = java.util.Collections.emptySet()
            r14.f24503I = r0
            r14.m22606O()
            com.google.ads.interactivemedia.v3.internal.yz r0 = r14.f24521d
            r0.mo16829p()
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7463zc.mo16848F():void");
    }

    /* renamed from: L */
    private final C7362vj m22603L(C7360vh[] vhVarArr) {
        for (int i = 0; i < vhVarArr.length; i++) {
            C7360vh vhVar = vhVarArr[i];
            C6864cy[] cyVarArr = new C6864cy[vhVar.f24048a];
            for (int i2 = 0; i2 < vhVar.f24048a; i2++) {
                C6864cy a = vhVar.mo16648a(i2);
                cyVarArr[i2] = a.mo15638c(this.f24524g.mo16069a(a));
            }
            vhVarArr[i] = new C7360vh(cyVarArr);
        }
        return new C7362vj(vhVarArr);
    }

    /* renamed from: M */
    private final C7450yq m22604M() {
        ArrayList arrayList = this.f24530m;
        return (C7450yq) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: N */
    private final boolean m22605N() {
        return this.f24510P != -9223372036854775807L;
    }

    /* renamed from: O */
    private final void m22606O() {
        this.f24497C = true;
    }

    /* renamed from: P */
    private final void m22607P() {
        ary.m19464q(this.f24497C);
        ary.m19467t(this.f24502H);
        ary.m19467t(this.f24503I);
    }

    /* renamed from: Q */
    private static int m22608Q(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: R */
    private static C6864cy m22609R(C6864cy cyVar, C6864cy cyVar2, boolean z) {
        if (cyVar == null) {
            return cyVar2;
        }
        String T = aeu.m18502T(cyVar.f21809i, adz.m18358j(cyVar2.f21812l));
        String h = adz.m18356h(T);
        C6863cx a = cyVar2.mo15636a();
        a.mo15617S(cyVar.f21801a);
        a.mo15619U(cyVar.f21802b);
        a.mo15620V(cyVar.f21803c);
        a.mo15632ag(cyVar.f21804d);
        a.mo15628ac(cyVar.f21805e);
        a.mo15605G(z ? cyVar.f21806f : -1);
        a.mo15624Z(z ? cyVar.f21807g : -1);
        a.mo15607I(T);
        a.mo15635aj(cyVar.f21817q);
        a.mo15615Q(cyVar.f21818r);
        if (h != null) {
            a.mo15630ae(h);
        }
        int i = cyVar.f21825y;
        if (i != -1) {
            a.mo15606H(i);
        }
        C7243qz qzVar = cyVar.f21810j;
        if (qzVar != null) {
            C7243qz qzVar2 = cyVar2.f21810j;
            if (qzVar2 != null) {
                qzVar = qzVar2.mo16343c(qzVar);
            }
            a.mo15622X(qzVar);
        }
        return a.mo15625a();
    }

    /* renamed from: S */
    private static C7052jx m22610S(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        Log.w("HlsSampleStreamWrapper", sb.toString());
        return new C7052jx();
    }

    /* renamed from: A */
    public final int mo16843A(int i, C6865cz czVar, C7024iw iwVar, boolean z) {
        C6864cy cyVar;
        if (m22605N()) {
            return -3;
        }
        int i2 = 0;
        if (!this.f24530m.isEmpty()) {
            int i3 = 0;
            loop0:
            while (i3 < this.f24530m.size() - 1) {
                int i4 = ((C7450yq) this.f24530m.get(i3)).f24423a;
                int length = this.f24538u.length;
                for (int i5 = 0; i5 < length; i5++) {
                    if (this.f24507M[i5] && this.f24538u[i5].mo16630s() == i4) {
                        break loop0;
                    }
                }
                i3++;
            }
            aeu.m18535e(this.f24530m, 0, i3);
            C7450yq yqVar = (C7450yq) this.f24530m.get(0);
            C6864cy cyVar2 = yqVar.f24091f;
            if (!cyVar2.equals(this.f24500F)) {
                this.f24527j.mo16569r(this.f24520c, cyVar2, yqVar.f24092g, yqVar.f24093h, yqVar.f24094i);
            }
            this.f24500F = cyVar2;
        }
        int z2 = this.f24538u[i].mo16637z(czVar, iwVar, z, this.f24513S);
        if (z2 != -5) {
            return z2;
        }
        C6864cy cyVar3 = czVar.f21827a;
        ary.m19467t(cyVar3);
        if (i == this.f24495A) {
            int s = this.f24538u[i].mo16630s();
            while (i2 < this.f24530m.size() && ((C7450yq) this.f24530m.get(i2)).f24423a != s) {
                i2++;
            }
            if (i2 < this.f24530m.size()) {
                cyVar = ((C7450yq) this.f24530m.get(i2)).f24091f;
            } else {
                cyVar = this.f24499E;
                ary.m19467t(cyVar);
            }
            cyVar3 = cyVar3.mo15637b(cyVar);
        }
        czVar.f21827a = cyVar3;
        return -5;
    }

    /* renamed from: B */
    public final int mo16844B(int i, long j) {
        if (m22605N()) {
            return 0;
        }
        C7462zb zbVar = this.f24538u[i];
        int C = zbVar.mo16608C(j, this.f24513S);
        zbVar.mo16609D(C);
        return C;
    }

    /* renamed from: C */
    public final void mo16845C() {
        this.f24540w.clear();
    }

    /* renamed from: D */
    public final void mo16846D(long j) {
        if (this.f24515U != j) {
            this.f24515U = j;
            for (C7462zb H : this.f24538u) {
                H.mo16613H(j);
            }
        }
    }

    /* renamed from: E */
    public final void mo16847E(C7031jc jcVar) {
        if (!aeu.m18533c(this.f24516V, jcVar)) {
            this.f24516V = jcVar;
            int i = 0;
            while (true) {
                C7462zb[] zbVarArr = this.f24538u;
                if (i < zbVarArr.length) {
                    if (this.f24508N[i]) {
                        zbVarArr[i].mo16842N(jcVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ void mo16849G() {
        this.f24496B = true;
        mo16848F();
    }

    /* renamed from: H */
    public final void mo16850H(C7360vh[] vhVarArr, int... iArr) {
        this.f24502H = m22603L(vhVarArr);
        this.f24503I = new HashSet();
        for (int a : iArr) {
            this.f24503I.add(this.f24502H.mo16656a(a));
        }
        this.f24505K = 0;
        Handler handler = this.f24534q;
        C7459yz yzVar = this.f24521d;
        yzVar.getClass();
        handler.post(C7457yx.m22577a(yzVar));
        m22606O();
    }

    /* renamed from: K */
    public final void mo16578K() {
        this.f24534q.post(this.f24532o);
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [com.google.ads.interactivemedia.v3.internal.jx] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb  */
    /* renamed from: ak */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p367v3.internal.C7073kr mo16113ak(int r12, int r13) {
        /*
            r11 = this;
            java.util.Set r0 = f24494b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r2 = r0.contains(r1)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x003b
            boolean r0 = r0.contains(r1)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19462o(r0)
            android.util.SparseIntArray r0 = r11.f24541x
            r2 = -1
            int r0 = r0.get(r13, r2)
            if (r0 != r2) goto L_0x001f
            goto L_0x004d
        L_0x001f:
            java.util.Set r2 = r11.f24540w
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L_0x002b
            int[] r1 = r11.f24539v
            r1[r0] = r12
        L_0x002b:
            int[] r1 = r11.f24539v
            r1 = r1[r0]
            if (r1 != r12) goto L_0x0036
            com.google.ads.interactivemedia.v3.internal.zb[] r1 = r11.f24538u
            r3 = r1[r0]
            goto L_0x004d
        L_0x0036:
            com.google.ads.interactivemedia.v3.internal.jx r3 = m22610S(r12, r13)
            goto L_0x004d
        L_0x003b:
            r0 = 0
        L_0x003c:
            com.google.ads.interactivemedia.v3.internal.zb[] r1 = r11.f24538u
            int r2 = r1.length
            if (r0 >= r2) goto L_0x004d
            int[] r2 = r11.f24539v
            r2 = r2[r0]
            if (r2 != r12) goto L_0x004a
            r3 = r1[r0]
            goto L_0x004d
        L_0x004a:
            int r0 = r0 + 1
            goto L_0x003c
        L_0x004d:
            if (r3 != 0) goto L_0x00de
            boolean r0 = r11.f24514T
            if (r0 != 0) goto L_0x00d9
            com.google.ads.interactivemedia.v3.internal.zb[] r0 = r11.f24538u
            int r0 = r0.length
            r1 = 1
            if (r13 == r1) goto L_0x0060
            r2 = 2
            if (r13 != r2) goto L_0x005e
            r13 = 2
            goto L_0x0061
        L_0x005e:
            r2 = r13
            goto L_0x0062
        L_0x0060:
            r2 = r13
        L_0x0061:
            r4 = 1
        L_0x0062:
            com.google.ads.interactivemedia.v3.internal.zb r3 = new com.google.ads.interactivemedia.v3.internal.zb
            com.google.ads.interactivemedia.v3.internal.acc r6 = r11.f24518X
            android.os.Handler r1 = r11.f24534q
            android.os.Looper r7 = r1.getLooper()
            com.google.ads.interactivemedia.v3.internal.jh r8 = r11.f24524g
            com.google.ads.interactivemedia.v3.internal.je r9 = r11.f24525h
            java.util.Map r10 = r11.f24536s
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x007d
            com.google.ads.interactivemedia.v3.internal.jc r1 = r11.f24516V
            r3.mo16842N(r1)
        L_0x007d:
            long r5 = r11.f24515U
            r3.mo16613H(r5)
            com.google.ads.interactivemedia.v3.internal.yq r1 = r11.f24517W
            if (r1 == 0) goto L_0x0089
            r3.mo16841M(r1)
        L_0x0089:
            r3.mo16614I(r11)
            int r1 = r0 + 1
            int[] r5 = r11.f24539v
            int[] r5 = java.util.Arrays.copyOf(r5, r1)
            r11.f24539v = r5
            r5[r0] = r12
            com.google.ads.interactivemedia.v3.internal.zb[] r12 = r11.f24538u
            java.lang.Object[] r12 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18539i(r12, r3)
            com.google.ads.interactivemedia.v3.internal.zb[] r12 = (com.google.ads.interactivemedia.p367v3.internal.C7462zb[]) r12
            r11.f24538u = r12
            boolean[] r12 = r11.f24508N
            boolean[] r12 = java.util.Arrays.copyOf(r12, r1)
            r11.f24508N = r12
            r12[r0] = r4
            boolean r12 = r11.f24506L
            r12 = r12 | r4
            r11.f24506L = r12
            java.util.Set r12 = r11.f24540w
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r12.add(r4)
            android.util.SparseIntArray r12 = r11.f24541x
            r12.append(r13, r0)
            int r12 = m22608Q(r13)
            int r4 = r11.f24543z
            int r4 = m22608Q(r4)
            if (r12 <= r4) goto L_0x00cf
            r11.f24495A = r0
            r11.f24543z = r13
        L_0x00cf:
            boolean[] r12 = r11.f24507M
            boolean[] r12 = java.util.Arrays.copyOf(r12, r1)
            r11.f24507M = r12
            r13 = r2
            goto L_0x00de
        L_0x00d9:
            com.google.ads.interactivemedia.v3.internal.jx r12 = m22610S(r12, r13)
            return r12
        L_0x00de:
            r12 = 4
            if (r13 != r12) goto L_0x00f1
            com.google.ads.interactivemedia.v3.internal.kr r12 = r11.f24542y
            if (r12 != 0) goto L_0x00ee
            com.google.ads.interactivemedia.v3.internal.za r12 = new com.google.ads.interactivemedia.v3.internal.za
            int r13 = r11.f24528k
            r12.<init>(r3, r13)
            r11.f24542y = r12
        L_0x00ee:
            com.google.ads.interactivemedia.v3.internal.kr r12 = r11.f24542y
            return r12
        L_0x00f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7463zc.mo16113ak(int, int):com.google.ads.interactivemedia.v3.internal.kr");
    }

    /* renamed from: al */
    public final void mo16114al() {
        this.f24514T = true;
        this.f24534q.post(this.f24533p);
    }

    /* renamed from: am */
    public final void mo16115am(C7070ko koVar) {
    }

    /* renamed from: d */
    public final void mo16851d() {
        if (!this.f24497C) {
            mo16508n(this.f24509O);
        }
    }

    /* renamed from: e */
    public final void mo16852e() {
        mo16864z();
        if (this.f24513S && !this.f24497C) {
            throw new C6886dt("Loading finished before preparation is complete.");
        }
    }

    /* renamed from: f */
    public final void mo16502f(long j) {
        if (!this.f24526i.mo14469c() && !m22605N()) {
            if (this.f24526i.mo14472f()) {
                ary.m19467t(this.f24537t);
                if (this.f24522e.mo16824m(j, this.f24537t, this.f24531n)) {
                    this.f24526i.mo14473g();
                    return;
                }
                return;
            }
            int l = this.f24522e.mo16823l(j, this.f24531n);
            if (l < this.f24530m.size()) {
                ary.m19464q(!this.f24526i.mo14472f());
                loop0:
                while (true) {
                    if (l >= this.f24530m.size()) {
                        l = -1;
                        break;
                    }
                    int i = l;
                    while (true) {
                        if (i >= this.f24530m.size()) {
                            C7450yq yqVar = (C7450yq) this.f24530m.get(l);
                            int i2 = 0;
                            while (i2 < this.f24538u.length) {
                                if (this.f24538u[i2].mo16629r() <= yqVar.mo16826e(i2)) {
                                    i2++;
                                }
                            }
                            break loop0;
                        } else if (((C7450yq) this.f24530m.get(i)).f24426n) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    l++;
                }
                if (l != -1) {
                    long j2 = m22604M().f24095j;
                    C7450yq yqVar2 = (C7450yq) this.f24530m.get(l);
                    ArrayList arrayList = this.f24530m;
                    aeu.m18535e(arrayList, l, arrayList.size());
                    for (int i3 = 0; i3 < this.f24538u.length; i3++) {
                        this.f24538u[i3].mo16625n(yqVar2.mo16826e(i3));
                    }
                    if (this.f24530m.isEmpty()) {
                        this.f24510P = this.f24509O;
                    } else {
                        ((C7450yq) ary.m19448a(this.f24530m)).mo16827k();
                    }
                    this.f24513S = false;
                    this.f24527j.mo16567p(this.f24543z, yqVar2.f24094i, j2);
                }
            }
        }
    }

    /* renamed from: g */
    public final C7362vj mo16853g() {
        m22607P();
        return this.f24502H;
    }

    /* renamed from: h */
    public final long mo16504h() {
        if (this.f24513S) {
            return Long.MIN_VALUE;
        }
        if (m22605N()) {
            return this.f24510P;
        }
        long j = this.f24509O;
        C7450yq M = m22604M();
        if (!M.mo16703j()) {
            if (this.f24530m.size() > 1) {
                ArrayList arrayList = this.f24530m;
                M = (C7450yq) arrayList.get(arrayList.size() - 2);
            } else {
                M = null;
            }
        }
        if (M != null) {
            j = Math.max(j, M.f24095j);
        }
        if (this.f24496B) {
            for (C7462zb u : this.f24538u) {
                j = Math.max(j, u.mo16632u());
            }
        }
        return j;
    }

    /* renamed from: i */
    public final int mo16854i(int i) {
        m22607P();
        ary.m19467t(this.f24504J);
        int i2 = this.f24504J[i];
        if (i2 != -1) {
            boolean[] zArr = this.f24507M;
            if (zArr[i2]) {
                return -2;
            }
            zArr[i2] = true;
            return i2;
        } else if (this.f24503I.contains(this.f24502H.mo16656a(i))) {
            return -3;
        } else {
            return -2;
        }
    }

    /* renamed from: j */
    public final void mo16855j(int i) {
        m22607P();
        ary.m19467t(this.f24504J);
        int i2 = this.f24504J[i];
        ary.m19464q(this.f24507M[i2]);
        this.f24507M[i2] = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0115, code lost:
        if (r14.mo14338r() != r0.f24522e.mo16813b().mo16649b(r1.f24091f)) goto L_0x0117;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0120  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16856k(com.google.ads.interactivemedia.p367v3.internal.aba[] r19, boolean[] r20, com.google.ads.interactivemedia.p367v3.internal.C7354vb[] r21, boolean[] r22, long r23, boolean r25) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r23
            r18.m22607P()
            int r5 = r0.f24498D
            r6 = 0
            r7 = 0
        L_0x000f:
            int r8 = r1.length
            r9 = 0
            if (r7 >= r8) goto L_0x002f
            r8 = r2[r7]
            com.google.ads.interactivemedia.v3.internal.yu r8 = (com.google.ads.interactivemedia.p367v3.internal.C7454yu) r8
            if (r8 == 0) goto L_0x002c
            r10 = r1[r7]
            if (r10 == 0) goto L_0x0021
            boolean r10 = r20[r7]
            if (r10 != 0) goto L_0x002c
        L_0x0021:
            int r10 = r0.f24498D
            int r10 = r10 + -1
            r0.f24498D = r10
            r8.mo16835f()
            r2[r7] = r9
        L_0x002c:
            int r7 = r7 + 1
            goto L_0x000f
        L_0x002f:
            r7 = 1
            if (r25 != 0) goto L_0x0042
            boolean r8 = r0.f24512R
            if (r8 == 0) goto L_0x0039
            if (r5 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0039:
            long r10 = r0.f24509O
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r5 = 0
            goto L_0x0043
        L_0x0042:
            r5 = 1
        L_0x0043:
            com.google.ads.interactivemedia.v3.internal.yo r8 = r0.f24522e
            com.google.ads.interactivemedia.v3.internal.aba r8 = r8.mo16815d()
            r14 = r8
            r10 = 0
        L_0x004b:
            int r11 = r1.length
            if (r10 >= r11) goto L_0x009c
            r11 = r1[r10]
            if (r11 != 0) goto L_0x0053
            goto L_0x0099
        L_0x0053:
            com.google.ads.interactivemedia.v3.internal.vj r12 = r0.f24502H
            com.google.ads.interactivemedia.v3.internal.vh r13 = r11.mo14331k()
            int r12 = r12.mo16657b(r13)
            int r13 = r0.f24505K
            if (r12 != r13) goto L_0x0067
            com.google.ads.interactivemedia.v3.internal.yo r13 = r0.f24522e
            r13.mo16814c(r11)
            r14 = r11
        L_0x0067:
            r11 = r2[r10]
            if (r11 != 0) goto L_0x0099
            int r11 = r0.f24498D
            int r11 = r11 + r7
            r0.f24498D = r11
            com.google.ads.interactivemedia.v3.internal.yu r11 = new com.google.ads.interactivemedia.v3.internal.yu
            r11.<init>(r0, r12)
            r2[r10] = r11
            r22[r10] = r7
            int[] r13 = r0.f24504J
            if (r13 == 0) goto L_0x0099
            r11.mo16834a()
            if (r5 != 0) goto L_0x0099
            com.google.ads.interactivemedia.v3.internal.zb[] r5 = r0.f24538u
            int[] r11 = r0.f24504J
            r11 = r11[r12]
            r5 = r5[r11]
            boolean r11 = r5.mo16607B(r3, r7)
            if (r11 != 0) goto L_0x0098
            int r5 = r5.mo16629r()
            if (r5 == 0) goto L_0x0098
            r5 = 1
            goto L_0x0099
        L_0x0098:
            r5 = 0
        L_0x0099:
            int r10 = r10 + 1
            goto L_0x004b
        L_0x009c:
            int r1 = r0.f24498D
            if (r1 != 0) goto L_0x00d2
            com.google.ads.interactivemedia.v3.internal.yo r1 = r0.f24522e
            r1.mo16816e()
            r0.f24500F = r9
            r0.f24511Q = r7
            java.util.ArrayList r1 = r0.f24530m
            r1.clear()
            com.google.ads.interactivemedia.v3.internal.ada r1 = r0.f24526i
            boolean r1 = r1.mo14472f()
            if (r1 == 0) goto L_0x00ce
            boolean r1 = r0.f24496B
            if (r1 == 0) goto L_0x00c8
            com.google.ads.interactivemedia.v3.internal.zb[] r1 = r0.f24538u
            int r3 = r1.length
            r4 = 0
        L_0x00be:
            if (r4 >= r3) goto L_0x00c8
            r8 = r1[r4]
            r8.mo16612G()
            int r4 = r4 + 1
            goto L_0x00be
        L_0x00c8:
            com.google.ads.interactivemedia.v3.internal.ada r1 = r0.f24526i
            r1.mo14473g()
            goto L_0x0130
        L_0x00ce:
            r18.m22601I()
            goto L_0x0130
        L_0x00d2:
            java.util.ArrayList r1 = r0.f24530m
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x011c
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r14, r8)
            if (r1 != 0) goto L_0x011c
            boolean r1 = r0.f24512R
            if (r1 != 0) goto L_0x0117
            r8 = 0
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x00eb
            long r8 = -r3
        L_0x00eb:
            r12 = r8
            com.google.ads.interactivemedia.v3.internal.yq r1 = r18.m22604M()
            com.google.ads.interactivemedia.v3.internal.yo r8 = r0.f24522e
            r8.mo16822k(r1, r3)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List r10 = r0.f24531n
            r11 = r14
            r17 = r14
            r14 = r8
            r16 = r10
            r11.mo14322d(r12, r14, r16)
            com.google.ads.interactivemedia.v3.internal.yo r8 = r0.f24522e
            com.google.ads.interactivemedia.v3.internal.vh r8 = r8.mo16813b()
            com.google.ads.interactivemedia.v3.internal.cy r1 = r1.f24091f
            int r1 = r8.mo16649b(r1)
            int r8 = r17.mo14338r()
            if (r8 == r1) goto L_0x011c
        L_0x0117:
            r0.f24511Q = r7
            r1 = 1
            r5 = 1
            goto L_0x011e
        L_0x011c:
            r1 = r25
        L_0x011e:
            if (r5 == 0) goto L_0x0130
            r0.mo16858q(r3, r1)
            r1 = 0
        L_0x0124:
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0130
            r3 = r2[r1]
            if (r3 == 0) goto L_0x012d
            r22[r1] = r7
        L_0x012d:
            int r1 = r1 + 1
            goto L_0x0124
        L_0x0130:
            java.util.ArrayList r1 = r0.f24535r
            r1.clear()
            int r1 = r2.length
        L_0x0136:
            if (r6 >= r1) goto L_0x0146
            r3 = r2[r6]
            if (r3 == 0) goto L_0x0143
            java.util.ArrayList r4 = r0.f24535r
            com.google.ads.interactivemedia.v3.internal.yu r3 = (com.google.ads.interactivemedia.p367v3.internal.C7454yu) r3
            r4.add(r3)
        L_0x0143:
            int r6 = r6 + 1
            goto L_0x0136
        L_0x0146:
            r0.f24512R = r7
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7463zc.mo16856k(com.google.ads.interactivemedia.v3.internal.aba[], boolean[], com.google.ads.interactivemedia.v3.internal.vb[], boolean[], long, boolean):boolean");
    }

    /* renamed from: l */
    public final long mo16507l() {
        if (m22605N()) {
            return this.f24510P;
        }
        if (this.f24513S) {
            return Long.MIN_VALUE;
        }
        return m22604M().f24095j;
    }

    /* renamed from: m */
    public final void mo14466m() {
        for (C7462zb g : this.f24538u) {
            g.mo16618g();
        }
    }

    /* renamed from: n */
    public final boolean mo16508n(long j) {
        long j2;
        List list;
        if (this.f24513S || this.f24526i.mo14472f() || this.f24526i.mo14469c()) {
            return false;
        }
        if (m22605N()) {
            list = Collections.emptyList();
            j2 = this.f24510P;
            for (C7462zb j3 : this.f24538u) {
                j3.mo16621j(this.f24510P);
            }
        } else {
            list = this.f24531n;
            C7450yq M = m22604M();
            if (M.mo16703j()) {
                j2 = M.f24095j;
            } else {
                j2 = Math.max(this.f24509O, M.f24094i);
            }
        }
        List list2 = list;
        this.f24522e.mo16818g(j, j2, list2, this.f24497C || !list2.isEmpty(), this.f24529l);
        C7445yl ylVar = this.f24529l;
        boolean z = ylVar.f24390b;
        C7372vt vtVar = ylVar.f24389a;
        Uri uri = ylVar.f24391c;
        ylVar.mo16811a();
        if (z) {
            this.f24510P = -9223372036854775807L;
            this.f24513S = true;
            return true;
        } else if (vtVar == null) {
            if (uri != null) {
                this.f24521d.mo16830q(uri);
            }
            return false;
        } else {
            if (vtVar instanceof C7450yq) {
                C7450yq yqVar = (C7450yq) vtVar;
                this.f24517W = yqVar;
                this.f24499E = yqVar.f24091f;
                this.f24510P = -9223372036854775807L;
                this.f24530m.add(yqVar);
                ark r = arn.m19409r();
                for (C7462zb m : this.f24538u) {
                    r.mo15288d(Integer.valueOf(m.mo16624m()));
                }
                yqVar.mo16825d(this, r.mo15287c());
                for (C7462zb zbVar : this.f24538u) {
                    zbVar.mo16841M(yqVar);
                    if (yqVar.f24426n) {
                        zbVar.mo16623l();
                    }
                }
            }
            this.f24537t = vtVar;
            this.f24526i.mo14471e(vtVar, this, this.f24519Y.mo14451a(vtVar.f24090e));
            this.f24527j.mo16556e(new C7313to(vtVar.f24089d), vtVar.f24090e, this.f24520c, vtVar.f24091f, vtVar.f24092g, vtVar.f24093h, vtVar.f24094i, vtVar.f24095j);
            return true;
        }
    }

    /* renamed from: o */
    public final boolean mo16509o() {
        return this.f24526i.mo14472f();
    }

    /* renamed from: p */
    public final void mo16857p(long j, boolean z) {
        if (this.f24496B && !m22605N()) {
            int length = this.f24538u.length;
            for (int i = 0; i < length; i++) {
                this.f24538u[i].mo16610E(j, false, this.f24507M[i]);
            }
        }
    }

    /* renamed from: q */
    public final boolean mo16858q(long j, boolean z) {
        this.f24509O = j;
        if (m22605N()) {
            this.f24510P = j;
            return true;
        }
        if (this.f24496B && !z) {
            int length = this.f24538u.length;
            int i = 0;
            while (i < length) {
                if (this.f24538u[i].mo16607B(j, false) || (!this.f24508N[i] && this.f24506L)) {
                    i++;
                }
            }
            return false;
        }
        this.f24510P = j;
        this.f24513S = false;
        this.f24530m.clear();
        if (this.f24526i.mo14472f()) {
            this.f24526i.mo14473g();
        } else {
            this.f24526i.mo14470d();
            m22601I();
        }
        return true;
    }

    /* renamed from: r */
    public final void mo16859r() {
        if (this.f24497C) {
            for (C7462zb o : this.f24538u) {
                o.mo16626o();
            }
        }
        this.f24526i.mo14475i(this);
        this.f24534q.removeCallbacksAndMessages((Object) null);
        this.f24501G = true;
        this.f24535r.clear();
    }

    /* renamed from: s */
    public final void mo16860s(boolean z) {
        this.f24522e.mo16817f(z);
    }

    /* renamed from: t */
    public final boolean mo16861t(Uri uri, long j) {
        return this.f24522e.mo16821j(uri, j);
    }

    /* renamed from: u */
    public final boolean mo16862u(int i) {
        return !m22605N() && this.f24538u[i].mo16636y(this.f24513S);
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ acu mo14455v(acw acw, long j, long j2, IOException iOException, int i) {
        acu acu;
        C7372vt vtVar = (C7372vt) acw;
        long f = vtVar.mo16682f();
        boolean z = vtVar instanceof C7450yq;
        long j3 = vtVar.f24088c;
        acb acb = vtVar.f24089d;
        vtVar.mo16683g();
        vtVar.mo16684h();
        C7313to toVar = new C7313to();
        int i2 = vtVar.f24090e;
        C6864cy cyVar = vtVar.f24091f;
        int i3 = vtVar.f24092g;
        Object obj = vtVar.f24093h;
        long j4 = vtVar.f24094i;
        UUID uuid = C6821bi.f21605a;
        long j5 = vtVar.f24095j;
        acr acr = new acr(iOException, i);
        long b = acj.m18242b(acr);
        boolean z2 = false;
        boolean i4 = b != -9223372036854775807L ? this.f24522e.mo16820i(vtVar, b) : false;
        if (i4) {
            if (z && f == 0) {
                ArrayList arrayList = this.f24530m;
                if (((C7450yq) arrayList.remove(arrayList.size() - 1)) == vtVar) {
                    z2 = true;
                }
                ary.m19464q(z2);
                if (this.f24530m.isEmpty()) {
                    this.f24510P = this.f24509O;
                } else {
                    ((C7450yq) ary.m19448a(this.f24530m)).mo16827k();
                }
            }
            acu = ada.f20338a;
        } else {
            long c = acj.m18243c(acr);
            acu = c != -9223372036854775807L ? ada.m18269b(false, c) : ada.f20339b;
        }
        boolean z3 = !acu.mo14458a();
        this.f24527j.mo16565n(toVar, vtVar.f24090e, this.f24520c, vtVar.f24091f, vtVar.f24092g, vtVar.f24093h, vtVar.f24094i, vtVar.f24095j, iOException, z3);
        if (z3) {
            this.f24537t = null;
            long j6 = vtVar.f24088c;
        }
        if (i4) {
            if (!this.f24497C) {
                mo16508n(this.f24509O);
            } else {
                this.f24521d.mo15598m(this);
            }
        }
        return acu;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo14456w(acw acw, long j, long j2, boolean z) {
        C7372vt vtVar = (C7372vt) acw;
        this.f24537t = null;
        long j3 = vtVar.f24088c;
        acb acb = vtVar.f24089d;
        vtVar.mo16683g();
        vtVar.mo16684h();
        vtVar.mo16682f();
        C7313to toVar = new C7313to();
        long j4 = vtVar.f24088c;
        this.f24527j.mo16562k(toVar, vtVar.f24090e, this.f24520c, vtVar.f24091f, vtVar.f24092g, vtVar.f24093h, vtVar.f24094i, vtVar.f24095j);
        if (!z) {
            if (m22605N() || this.f24498D == 0) {
                m22601I();
            }
            if (this.f24498D > 0) {
                this.f24521d.mo15598m(this);
            }
        }
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo14457x(acw acw, long j, long j2) {
        C7372vt vtVar = (C7372vt) acw;
        this.f24537t = null;
        this.f24522e.mo16819h(vtVar);
        long j3 = vtVar.f24088c;
        acb acb = vtVar.f24089d;
        vtVar.mo16683g();
        vtVar.mo16684h();
        vtVar.mo16682f();
        C7313to toVar = new C7313to();
        long j4 = vtVar.f24088c;
        this.f24527j.mo16559h(toVar, vtVar.f24090e, this.f24520c, vtVar.f24091f, vtVar.f24092g, vtVar.f24093h, vtVar.f24094i, vtVar.f24095j);
        if (!this.f24497C) {
            mo16508n(this.f24509O);
        } else {
            this.f24521d.mo15598m(this);
        }
    }

    /* renamed from: y */
    public final void mo16863y(int i) {
        mo16864z();
        this.f24538u[i].mo16627p();
    }

    /* renamed from: z */
    public final void mo16864z() {
        this.f24526i.mo14468a();
        this.f24522e.mo16812a();
    }
}
