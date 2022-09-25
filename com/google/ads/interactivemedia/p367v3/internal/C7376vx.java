package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vx */
/* compiled from: PG */
public final class C7376vx implements C7354vb, C7356vd, act, acx {

    /* renamed from: a */
    public final int f24104a;

    /* renamed from: b */
    boolean f24105b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int[] f24106c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6864cy[] f24107d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean[] f24108e;

    /* renamed from: f */
    private final C7377vy f24109f;

    /* renamed from: g */
    private final C7355vc f24110g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C7332ug f24111h;

    /* renamed from: i */
    private final ada f24112i = new ada("Loader:ChunkSampleStream");

    /* renamed from: j */
    private final C7373vu f24113j = new C7373vu();

    /* renamed from: k */
    private final ArrayList f24114k;

    /* renamed from: l */
    private final List f24115l;

    /* renamed from: m */
    private final C7353va f24116m;

    /* renamed from: n */
    private final C7353va[] f24117n;

    /* renamed from: o */
    private final C7369vq f24118o;

    /* renamed from: p */
    private C7372vt f24119p;

    /* renamed from: q */
    private C6864cy f24120q;

    /* renamed from: r */
    private C7375vw f24121r;

    /* renamed from: s */
    private long f24122s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f24123t;

    /* renamed from: u */
    private int f24124u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C7367vo f24125v;

    /* renamed from: w */
    private final acj f24126w;

    public C7376vx(int i, int[] iArr, C6864cy[] cyVarArr, C7377vy vyVar, C7355vc vcVar, acc acc, long j, C7036jh jhVar, C7033je jeVar, acj acj, C7332ug ugVar) {
        this.f24104a = i;
        this.f24106c = iArr;
        this.f24107d = cyVarArr;
        this.f24109f = vyVar;
        this.f24110g = vcVar;
        this.f24111h = ugVar;
        this.f24126w = acj;
        ArrayList arrayList = new ArrayList();
        this.f24114k = arrayList;
        this.f24115l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f24117n = new C7353va[length];
        this.f24108e = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        C7353va[] vaVarArr = new C7353va[i2];
        Looper myLooper = Looper.myLooper();
        ary.m19467t(myLooper);
        C7353va vaVar = new C7353va(acc, myLooper, jhVar, jeVar);
        this.f24116m = vaVar;
        int i3 = 0;
        iArr2[0] = i;
        vaVarArr[0] = vaVar;
        while (i3 < length) {
            Looper myLooper2 = Looper.myLooper();
            ary.m19467t(myLooper2);
            C7353va vaVar2 = new C7353va(acc, myLooper2, C7036jh.f22541a, jeVar);
            this.f24117n[i3] = vaVar2;
            int i4 = i3 + 1;
            vaVarArr[i4] = vaVar2;
            iArr2[i4] = this.f24106c[i3];
            i3 = i4;
        }
        this.f24118o = new C7369vq(iArr2, vaVarArr);
        this.f24122s = j;
        this.f24123t = j;
    }

    /* renamed from: A */
    private final void m22195A() {
        this.f24116m.mo16619h();
        for (C7353va h : this.f24117n) {
            h.mo16619h();
        }
    }

    /* renamed from: B */
    private final boolean m22196B(int i) {
        C7367vo voVar = (C7367vo) this.f24114k.get(i);
        if (this.f24116m.mo16629r() > voVar.mo16671d(0)) {
            return true;
        }
        int i2 = 0;
        while (true) {
            C7353va[] vaVarArr = this.f24117n;
            if (i2 >= vaVarArr.length) {
                return false;
            }
            int i3 = i2 + 1;
            if (vaVarArr[i2].mo16629r() > voVar.mo16671d(i3)) {
                return true;
            }
            i2 = i3;
        }
    }

    /* renamed from: C */
    private final void m22197C() {
        int D = m22198D(this.f24116m.mo16629r(), this.f24124u - 1);
        while (true) {
            int i = this.f24124u;
            if (i <= D) {
                this.f24124u = i + 1;
                C7367vo voVar = (C7367vo) this.f24114k.get(i);
                C6864cy cyVar = voVar.f24091f;
                if (!cyVar.equals(this.f24120q)) {
                    this.f24111h.mo16569r(this.f24104a, cyVar, voVar.f24092g, voVar.f24093h, voVar.f24094i);
                }
                this.f24120q = cyVar;
            } else {
                return;
            }
        }
    }

    /* renamed from: D */
    private final int m22198D(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f24114k.size()) {
                return this.f24114k.size() - 1;
            }
        } while (((C7367vo) this.f24114k.get(i2)).mo16671d(0) <= i);
        return i2 - 1;
    }

    /* renamed from: E */
    private final C7367vo m22199E() {
        ArrayList arrayList = this.f24114k;
        return (C7367vo) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: F */
    private final C7367vo m22200F(int i) {
        C7367vo voVar = (C7367vo) this.f24114k.get(i);
        ArrayList arrayList = this.f24114k;
        aeu.m18535e(arrayList, i, arrayList.size());
        this.f24124u = Math.max(this.f24124u, this.f24114k.size());
        int i2 = 0;
        this.f24116m.mo16625n(voVar.mo16671d(0));
        while (true) {
            C7353va[] vaVarArr = this.f24117n;
            if (i2 >= vaVarArr.length) {
                return voVar;
            }
            int i3 = i2 + 1;
            vaVarArr[i2].mo16625n(voVar.mo16671d(i3));
            i2 = i3;
        }
    }

    /* renamed from: a */
    public final void mo16687a(long j, boolean z) {
        if (!mo16693q()) {
            int q = this.f24116m.mo16628q();
            this.f24116m.mo16610E(j, false, true);
            int q2 = this.f24116m.mo16628q();
            if (q2 > q) {
                long x = this.f24116m.mo16635x();
                int i = 0;
                while (true) {
                    C7353va[] vaVarArr = this.f24117n;
                    if (i >= vaVarArr.length) {
                        break;
                    }
                    vaVarArr[i].mo16610E(x, false, this.f24108e[i]);
                    i++;
                }
            }
            int min = Math.min(m22198D(q2, 0), this.f24124u);
            if (min > 0) {
                aeu.m18535e(this.f24114k, 0, min);
                this.f24124u -= min;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo16493b() {
        return !mo16693q() && this.f24116m.mo16636y(this.f24105b);
    }

    /* renamed from: c */
    public final void mo16494c() {
        this.f24112i.mo14468a();
        this.f24116m.mo16627p();
        if (!this.f24112i.mo14472f()) {
            this.f24109f.mo16695b();
        }
    }

    /* renamed from: d */
    public final int mo16495d(C6865cz czVar, C7024iw iwVar, boolean z) {
        if (mo16693q()) {
            return -3;
        }
        C7367vo voVar = this.f24125v;
        if (voVar != null && voVar.mo16671d(0) <= this.f24116m.mo16629r()) {
            return -3;
        }
        m22197C();
        return this.f24116m.mo16637z(czVar, iwVar, z, this.f24105b);
    }

    /* renamed from: e */
    public final int mo16496e(long j) {
        if (mo16693q()) {
            return 0;
        }
        int C = this.f24116m.mo16608C(j, this.f24105b);
        C7367vo voVar = this.f24125v;
        if (voVar != null) {
            C = Math.min(C, voVar.mo16671d(0) - this.f24116m.mo16629r());
        }
        this.f24116m.mo16609D(C);
        m22197C();
        return C;
    }

    /* renamed from: f */
    public final void mo16502f(long j) {
        if (!this.f24112i.mo14469c() && !mo16693q()) {
            if (this.f24112i.mo14472f()) {
                C7372vt vtVar = this.f24119p;
                ary.m19467t(vtVar);
                boolean z = vtVar instanceof C7367vo;
                if ((!z || !m22196B(this.f24114k.size() - 1)) && this.f24109f.mo16697d(j, vtVar, this.f24115l)) {
                    this.f24112i.mo14473g();
                    if (z) {
                        this.f24125v = (C7367vo) vtVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int c = this.f24109f.mo16696c(j, this.f24115l);
            if (c < this.f24114k.size()) {
                ary.m19464q(!this.f24112i.mo14472f());
                int size = this.f24114k.size();
                while (true) {
                    if (c < size) {
                        if (!m22196B(c)) {
                            break;
                        }
                        c++;
                    } else {
                        c = -1;
                        break;
                    }
                }
                if (c != -1) {
                    long j2 = m22199E().f24095j;
                    C7367vo F = m22200F(c);
                    if (this.f24114k.isEmpty()) {
                        this.f24122s = this.f24123t;
                    }
                    this.f24105b = false;
                    this.f24111h.mo16567p(this.f24104a, F.f24094i, j2);
                }
            }
        }
    }

    /* renamed from: g */
    public final C7374vv mo16688g(long j, int i) {
        for (int i2 = 0; i2 < this.f24117n.length; i2++) {
            if (this.f24106c[i2] == i) {
                ary.m19464q(!this.f24108e[i2]);
                this.f24108e[i2] = true;
                this.f24117n[i2].mo16607B(j, true);
                return new C7374vv(this, this, this.f24117n[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final long mo16504h() {
        if (this.f24105b) {
            return Long.MIN_VALUE;
        }
        if (mo16693q()) {
            return this.f24122s;
        }
        long j = this.f24123t;
        C7367vo E = m22199E();
        if (!E.mo16703j()) {
            if (this.f24114k.size() > 1) {
                ArrayList arrayList = this.f24114k;
                E = (C7367vo) arrayList.get(arrayList.size() - 2);
            } else {
                E = null;
            }
        }
        if (E != null) {
            j = Math.max(j, E.f24095j);
        }
        return Math.max(j, this.f24116m.mo16632u());
    }

    /* renamed from: i */
    public final C7377vy mo16689i() {
        return this.f24109f;
    }

    /* renamed from: j */
    public final long mo16690j(long j, C6900eg egVar) {
        return this.f24109f.mo16694a(j, egVar);
    }

    /* renamed from: k */
    public final void mo16691k(long j) {
        C7367vo voVar;
        boolean z;
        this.f24123t = j;
        if (!mo16693q()) {
            int i = 0;
            while (true) {
                voVar = null;
                if (i >= this.f24114k.size()) {
                    break;
                }
                C7367vo voVar2 = (C7367vo) this.f24114k.get(i);
                long j2 = voVar2.f24094i;
                if (j2 == j && voVar2.f24064a == -9223372036854775807L) {
                    voVar = voVar2;
                    break;
                } else if (j2 > j) {
                    break;
                } else {
                    i++;
                }
            }
            if (voVar != null) {
                z = this.f24116m.mo16606A(voVar.mo16671d(0));
            } else {
                z = this.f24116m.mo16607B(j, j < mo16507l());
            }
            if (z) {
                this.f24124u = m22198D(this.f24116m.mo16629r(), 0);
                for (C7353va B : this.f24117n) {
                    B.mo16607B(j, true);
                }
                return;
            }
            this.f24122s = j;
            this.f24105b = false;
            this.f24114k.clear();
            this.f24124u = 0;
            if (this.f24112i.mo14472f()) {
                this.f24112i.mo14473g();
                return;
            }
            this.f24112i.mo14470d();
            m22195A();
            return;
        }
        this.f24122s = j;
    }

    /* renamed from: l */
    public final long mo16507l() {
        if (mo16693q()) {
            return this.f24122s;
        }
        if (this.f24105b) {
            return Long.MIN_VALUE;
        }
        return m22199E().f24095j;
    }

    /* renamed from: m */
    public final void mo14466m() {
        this.f24116m.mo16618g();
        for (C7353va g : this.f24117n) {
            g.mo16618g();
        }
        this.f24109f.mo16701h();
        C7375vw vwVar = this.f24121r;
        if (vwVar != null) {
            vwVar.mo16686k(this);
        }
    }

    /* renamed from: n */
    public final boolean mo16508n(long j) {
        long j2;
        List list;
        if (this.f24105b || this.f24112i.mo14472f() || this.f24112i.mo14469c()) {
            return false;
        }
        boolean q = mo16693q();
        if (q) {
            list = Collections.emptyList();
            j2 = this.f24122s;
        } else {
            list = this.f24115l;
            j2 = m22199E().f24095j;
        }
        this.f24109f.mo16698e(j, j2, list, this.f24113j);
        C7373vu vuVar = this.f24113j;
        boolean z = vuVar.f24098b;
        C7372vt vtVar = vuVar.f24097a;
        vuVar.f24097a = null;
        vuVar.f24098b = false;
        if (z) {
            this.f24122s = -9223372036854775807L;
            this.f24105b = true;
            return true;
        } else if (vtVar == null) {
            return false;
        } else {
            this.f24119p = vtVar;
            if (vtVar instanceof C7367vo) {
                C7367vo voVar = (C7367vo) vtVar;
                if (q) {
                    long j3 = voVar.f24094i;
                    long j4 = this.f24122s;
                    if (j3 != j4) {
                        this.f24116m.mo16621j(j4);
                        for (C7353va j5 : this.f24117n) {
                            j5.mo16621j(this.f24122s);
                        }
                    }
                    this.f24122s = -9223372036854775807L;
                }
                voVar.mo16670a(this.f24118o);
                this.f24114k.add(voVar);
            } else if (vtVar instanceof C7381wb) {
                ((C7381wb) vtVar).mo16711a(this.f24118o);
            }
            this.f24112i.mo14471e(vtVar, this, this.f24126w.mo14451a(vtVar.f24090e));
            this.f24111h.mo16556e(new C7313to(vtVar.f24089d), vtVar.f24090e, this.f24104a, vtVar.f24091f, vtVar.f24092g, vtVar.f24093h, vtVar.f24094i, vtVar.f24095j);
            return true;
        }
    }

    /* renamed from: o */
    public final boolean mo16509o() {
        return this.f24112i.mo14472f();
    }

    /* renamed from: p */
    public final void mo16692p(C7375vw vwVar) {
        this.f24121r = vwVar;
        this.f24116m.mo16626o();
        for (C7353va o : this.f24117n) {
            o.mo16626o();
        }
        this.f24112i.mo14475i(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo16693q() {
        return this.f24122s != -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.ads.interactivemedia.p367v3.internal.acu mo14455v(com.google.ads.interactivemedia.p367v3.internal.acw r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r7 = r27
            com.google.ads.interactivemedia.v3.internal.vt r7 = (com.google.ads.interactivemedia.p367v3.internal.C7372vt) r7
            long r1 = r7.mo16682f()
            boolean r8 = r7 instanceof com.google.ads.interactivemedia.p367v3.internal.C7367vo
            java.util.ArrayList r3 = r0.f24114k
            int r3 = r3.size()
            int r9 = r3 + -1
            r3 = 0
            r10 = 0
            r11 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0027
            if (r8 == 0) goto L_0x0027
            boolean r1 = r0.m22196B(r9)
            if (r1 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r12 = 0
            goto L_0x0028
        L_0x0027:
            r12 = 1
        L_0x0028:
            com.google.ads.interactivemedia.v3.internal.to r14 = new com.google.ads.interactivemedia.v3.internal.to
            long r1 = r7.f24088c
            com.google.ads.interactivemedia.v3.internal.acb r1 = r7.f24089d
            r7.mo16683g()
            r7.mo16684h()
            r14.<init>()
            int r1 = r7.f24090e
            com.google.ads.interactivemedia.v3.internal.cy r1 = r7.f24091f
            int r1 = r7.f24092g
            java.lang.Object r1 = r7.f24093h
            long r1 = r7.f24094i
            java.util.UUID r1 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.f21605a
            long r1 = r7.f24095j
            com.google.ads.interactivemedia.v3.internal.acr r13 = new com.google.ads.interactivemedia.v3.internal.acr
            r15 = r32
            r1 = r33
            r13.<init>(r15, r1)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r12 == 0) goto L_0x005b
            long r1 = com.google.ads.interactivemedia.p367v3.internal.acj.m18242b(r13)
            r5 = r1
            goto L_0x005d
        L_0x005b:
            r5 = r16
        L_0x005d:
            com.google.ads.interactivemedia.v3.internal.vy r1 = r0.f24109f
            r2 = r7
            r3 = r12
            r4 = r32
            boolean r1 = r1.mo16700g(r2, r3, r4, r5)
            if (r1 == 0) goto L_0x008f
            if (r12 == 0) goto L_0x0088
            com.google.ads.interactivemedia.v3.internal.acu r1 = com.google.ads.interactivemedia.p367v3.internal.ada.f20338a
            if (r8 == 0) goto L_0x0090
            com.google.ads.interactivemedia.v3.internal.vo r3 = r0.m22200F(r9)
            if (r3 != r7) goto L_0x0077
            r3 = 1
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r3)
            java.util.ArrayList r3 = r0.f24114k
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0090
            long r3 = r0.f24123t
            r0.f24122s = r3
            goto L_0x0090
        L_0x0088:
            java.lang.String r1 = "ChunkSampleStream"
            java.lang.String r3 = "Ignoring attempt to cancel non-cancelable load."
            android.util.Log.w(r1, r3)
        L_0x008f:
            r1 = 0
        L_0x0090:
            if (r1 != 0) goto L_0x00a1
            long r3 = com.google.ads.interactivemedia.p367v3.internal.acj.m18243c(r13)
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 == 0) goto L_0x009f
            com.google.ads.interactivemedia.v3.internal.acu r1 = com.google.ads.interactivemedia.p367v3.internal.ada.m18269b(r10, r3)
            goto L_0x00a1
        L_0x009f:
            com.google.ads.interactivemedia.v3.internal.acu r1 = com.google.ads.interactivemedia.p367v3.internal.ada.f20339b
        L_0x00a1:
            boolean r3 = r1.mo14458a()
            r3 = r3 ^ r11
            com.google.ads.interactivemedia.v3.internal.ug r13 = r0.f24111h
            int r4 = r7.f24090e
            int r5 = r0.f24104a
            com.google.ads.interactivemedia.v3.internal.cy r6 = r7.f24091f
            int r8 = r7.f24092g
            java.lang.Object r9 = r7.f24093h
            long r10 = r7.f24094i
            r28 = r3
            long r2 = r7.f24095j
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r8
            r19 = r9
            r20 = r10
            r22 = r2
            r24 = r32
            r25 = r28
            r13.mo16565n(r14, r15, r16, r17, r18, r19, r20, r22, r24, r25)
            if (r28 == 0) goto L_0x00d8
            r2 = 0
            r0.f24119p = r2
            long r2 = r7.f24088c
            com.google.ads.interactivemedia.v3.internal.vc r2 = r0.f24110g
            r2.mo15598m(r0)
        L_0x00d8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7376vx.mo14455v(com.google.ads.interactivemedia.v3.internal.acw, long, long, java.io.IOException, int):com.google.ads.interactivemedia.v3.internal.acu");
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo14456w(acw acw, long j, long j2, boolean z) {
        C7372vt vtVar = (C7372vt) acw;
        this.f24119p = null;
        this.f24125v = null;
        long j3 = vtVar.f24088c;
        acb acb = vtVar.f24089d;
        vtVar.mo16683g();
        vtVar.mo16684h();
        vtVar.mo16682f();
        C7313to toVar = new C7313to();
        long j4 = vtVar.f24088c;
        this.f24111h.mo16562k(toVar, vtVar.f24090e, this.f24104a, vtVar.f24091f, vtVar.f24092g, vtVar.f24093h, vtVar.f24094i, vtVar.f24095j);
        if (!z) {
            if (mo16693q()) {
                m22195A();
            } else if (vtVar instanceof C7367vo) {
                m22200F(this.f24114k.size() - 1);
                if (this.f24114k.isEmpty()) {
                    this.f24122s = this.f24123t;
                }
            }
            this.f24110g.mo15598m(this);
        }
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo14457x(acw acw, long j, long j2) {
        C7372vt vtVar = (C7372vt) acw;
        this.f24119p = null;
        this.f24109f.mo16699f(vtVar);
        long j3 = vtVar.f24088c;
        acb acb = vtVar.f24089d;
        vtVar.mo16683g();
        vtVar.mo16684h();
        vtVar.mo16682f();
        C7313to toVar = new C7313to();
        long j4 = vtVar.f24088c;
        this.f24111h.mo16559h(toVar, vtVar.f24090e, this.f24104a, vtVar.f24091f, vtVar.f24092g, vtVar.f24093h, vtVar.f24094i, vtVar.f24095j);
        this.f24110g.mo15598m(this);
    }
}
