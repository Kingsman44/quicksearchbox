package androidx.media3.exoplayer;

import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2659c;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.p137a.C2684a;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3036as;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: androidx.media3.exoplayer.ci */
/* compiled from: PG */
final class C2880ci {

    /* renamed from: a */
    public final C2684a f8125a;

    /* renamed from: b */
    public int f8126b;

    /* renamed from: c */
    public boolean f8127c;

    /* renamed from: d */
    public C2877cf f8128d;

    /* renamed from: e */
    public C2877cf f8129e;

    /* renamed from: f */
    public C2877cf f8130f;

    /* renamed from: g */
    public int f8131g;

    /* renamed from: h */
    public Object f8132h;

    /* renamed from: i */
    private final C2649bk f8133i = new C2649bk();

    /* renamed from: j */
    private final C2650bl f8134j = new C2650bl();

    /* renamed from: k */
    private final Handler f8135k;

    /* renamed from: l */
    private long f8136l;

    /* renamed from: m */
    private long f8137m;

    public C2880ci(C2684a aVar, Handler handler) {
        this.f8125a = aVar;
        this.f8135k = handler;
    }

    /* renamed from: l */
    private final long m8000l(C2651bm bmVar, Object obj, int i) {
        bmVar.mo6303n(obj, this.f8133i);
        long f = this.f8133i.mo6286f(i);
        if (f == Long.MIN_VALUE) {
            return this.f8133i.f7331d;
        }
        long j = this.f8133i.f7334g.mo6321c(i).f7223f;
        return f;
    }

    /* renamed from: m */
    private final C2878cg m8001m(C2651bm bmVar, Object obj, int i, int i2, long j, long j2) {
        int i3 = i2;
        C3036as asVar = new C3036as(obj, i, i3, j2);
        long e = bmVar.mo6303n(asVar.f7204a, this.f8133i).mo6284e(asVar.f7205b, asVar.f7206c);
        long j3 = i3 == this.f8133i.mo6283d(i) ? this.f8133i.f7334g.f7416d : 0;
        this.f8133i.mo6288h(asVar.f7205b);
        return new C2878cg(asVar, (e == -9223372036854775807L || j3 < e) ? j3 : Math.max(0, -1 + e), j, -9223372036854775807L, e, false, false, false, false);
    }

    /* renamed from: n */
    private final C2878cg m8002n(C2651bm bmVar, Object obj, long j, long j2, long j3) {
        C2651bm bmVar2 = bmVar;
        Object obj2 = obj;
        long j4 = j;
        bmVar2.mo6303n(obj2, this.f8133i);
        int b = this.f8133i.mo6281b(j4);
        if (b == -1) {
            C2649bk bkVar = this.f8133i;
            C2659c cVar = bkVar.f7334g;
            if (cVar.f7415c > 0) {
                int i = cVar.f7418f;
                bkVar.mo6288h(0);
            }
        } else {
            this.f8133i.mo6288h(b);
        }
        C3036as asVar = new C3036as(obj2, j3, b);
        boolean r = m8006r(asVar);
        boolean q = m8005q(bmVar2, asVar);
        boolean p = m8004p(bmVar2, asVar, r);
        if (b != -1) {
            this.f8133i.mo6288h(b);
        }
        long f = b != -1 ? this.f8133i.mo6286f(b) : -9223372036854775807L;
        long j5 = (f == -9223372036854775807L || f == Long.MIN_VALUE) ? this.f8133i.f7331d : f;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0, j5 - ((long) 1));
        }
        return new C2878cg(asVar, j4, j2, f, j5, false, r, q, p);
    }

    /* renamed from: o */
    private static C3036as m8003o(C2651bm bmVar, Object obj, long j, long j2, C2650bl blVar, C2649bk bkVar) {
        bmVar.mo6303n(obj, bkVar);
        bmVar.mo6024e(bkVar.f7330c, blVar, 0);
        bmVar.mo6020a(obj);
        if (bkVar.f7331d == 0) {
            C2659c cVar = bkVar.f7334g;
            if (cVar.f7415c > 0) {
                int i = cVar.f7418f;
                bkVar.mo6288h(0);
            }
        }
        bmVar.mo6303n(obj, bkVar);
        int c = bkVar.mo6282c(j);
        if (c == -1) {
            return new C3036as(obj, j2, bkVar.mo6281b(j));
        }
        return new C3036as(obj, c, bkVar.mo6283d(c), j2);
    }

    /* renamed from: p */
    private final boolean m8004p(C2651bm bmVar, C3036as asVar, boolean z) {
        int a = bmVar.mo6020a(asVar.f7204a);
        if (!bmVar.mo6024e(bmVar.mo6023d(a, this.f8133i, false).f7330c, this.f8134j, 0).f7344i) {
            if (bmVar.mo6298i(a, this.f8133i, this.f8134j, this.f8126b, this.f8127c) != -1 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private final boolean m8005q(C2651bm bmVar, C3036as asVar) {
        if (!m8006r(asVar)) {
            return false;
        }
        int i = bmVar.mo6303n(asVar.f7204a, this.f8133i).f7330c;
        if (bmVar.mo6024e(i, this.f8134j, 0).f7351p == bmVar.mo6020a(asVar.f7204a)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private static final boolean m8006r(C3036as asVar) {
        return !asVar.mo6102a() && asVar.f7208e == -1;
    }

    /* renamed from: a */
    public final C2877cf mo6647a() {
        C2877cf cfVar = this.f8128d;
        if (cfVar == null) {
            return null;
        }
        if (cfVar == this.f8129e) {
            this.f8129e = cfVar.f8105h;
        }
        cfVar.mo6635e();
        int i = this.f8131g - 1;
        this.f8131g = i;
        if (i == 0) {
            this.f8130f = null;
            C2877cf cfVar2 = this.f8128d;
            this.f8132h = cfVar2.f8099b;
            this.f8137m = cfVar2.f8103f.f8113a.f7207d;
        }
        this.f8128d = this.f8128d.f8105h;
        mo6653g();
        return this.f8128d;
    }

    /* renamed from: b */
    public final C2878cg mo6648b(C2651bm bmVar, C2877cf cfVar, long j) {
        long j2;
        C2651bm bmVar2 = bmVar;
        C2877cf cfVar2 = cfVar;
        C2878cg cgVar = cfVar2.f8103f;
        long j3 = (cfVar2.f8108k + cgVar.f8117e) - j;
        if (cgVar.f8119g) {
            long j4 = 0;
            int i = bmVar.mo6298i(bmVar2.mo6020a(cgVar.f8113a.f7204a), this.f8133i, this.f8134j, this.f8126b, this.f8127c);
            if (i == -1) {
                return null;
            }
            int i2 = bmVar2.mo6023d(i, this.f8133i, true).f7330c;
            Object obj = this.f8133i.f7329b;
            obj.getClass();
            long j5 = cgVar.f8113a.f7207d;
            if (bmVar2.mo6024e(i2, this.f8134j, 0).f7350o == i) {
                Pair m = bmVar.mo6302m(this.f8134j, this.f8133i, i2, -9223372036854775807L, Math.max(0, j3));
                if (m == null) {
                    return null;
                }
                obj = m.first;
                long longValue = ((Long) m.second).longValue();
                C2877cf cfVar3 = cfVar2.f8105h;
                if (cfVar3 == null || !cfVar3.f8099b.equals(obj)) {
                    j5 = this.f8136l;
                    this.f8136l = 1 + j5;
                } else {
                    j5 = cfVar3.f8103f.f8113a.f7207d;
                }
                j2 = longValue;
                j4 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            C3036as o = m8003o(bmVar, obj, j2, j5, this.f8134j, this.f8133i);
            if (!(j4 == -9223372036854775807L || cgVar.f8115c == -9223372036854775807L || bmVar2.mo6303n(cgVar.f8113a.f7204a, this.f8133i).f7334g.f7415c <= 0)) {
                C2649bk bkVar = this.f8133i;
                int i3 = bkVar.f7334g.f7418f;
                bkVar.mo6288h(0);
            }
            return mo6649c(bmVar, o, j4, j2);
        }
        C3036as asVar = cgVar.f8113a;
        bmVar2.mo6303n(asVar.f7204a, this.f8133i);
        if (asVar.mo6102a()) {
            int i4 = asVar.f7205b;
            int a = this.f8133i.mo6280a(i4);
            if (a == -1) {
                return null;
            }
            int a2 = this.f8133i.f7334g.mo6321c(i4).mo6108a(asVar.f7206c);
            if (a2 < a) {
                return m8001m(bmVar, asVar.f7204a, i4, a2, cgVar.f8115c, asVar.f7207d);
            }
            long j6 = cgVar.f8115c;
            if (j6 == -9223372036854775807L) {
                C2650bl blVar = this.f8134j;
                C2649bk bkVar2 = this.f8133i;
                Pair m2 = bmVar.mo6302m(blVar, bkVar2, bkVar2.f7330c, -9223372036854775807L, Math.max(0, j3));
                if (m2 == null) {
                    return null;
                }
                j6 = ((Long) m2.second).longValue();
            }
            return m8002n(bmVar, asVar.f7204a, Math.max(m8000l(bmVar2, asVar.f7204a, asVar.f7205b), j6), cgVar.f8115c, asVar.f7207d);
        }
        int d = this.f8133i.mo6283d(asVar.f7208e);
        this.f8133i.mo6288h(asVar.f7208e);
        if (d != this.f8133i.mo6280a(asVar.f7208e)) {
            return m8001m(bmVar, asVar.f7204a, asVar.f7208e, d, cgVar.f8117e, asVar.f7207d);
        }
        return m8002n(bmVar, asVar.f7204a, m8000l(bmVar2, asVar.f7204a, asVar.f7208e), cgVar.f8117e, asVar.f7207d);
    }

    /* renamed from: c */
    public final C2878cg mo6649c(C2651bm bmVar, C3036as asVar, long j, long j2) {
        C3036as asVar2 = asVar;
        C2651bm bmVar2 = bmVar;
        bmVar.mo6303n(asVar2.f7204a, this.f8133i);
        if (asVar.mo6102a()) {
            return m8001m(bmVar, asVar2.f7204a, asVar2.f7205b, asVar2.f7206c, j, asVar2.f7207d);
        }
        return m8002n(bmVar, asVar2.f7204a, j2, j, asVar2.f7207d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
        r1 = r3.f7208e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.exoplayer.C2878cg mo6650d(androidx.media3.common.C2651bm r19, androidx.media3.exoplayer.C2878cg r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            androidx.media3.exoplayer.h.as r3 = r2.f8113a
            boolean r12 = m8006r(r3)
            boolean r13 = r0.m8005q(r1, r3)
            boolean r14 = r0.m8004p(r1, r3, r12)
            androidx.media3.exoplayer.h.as r4 = r2.f8113a
            java.lang.Object r4 = r4.f7204a
            androidx.media3.common.bk r5 = r0.f8133i
            r1.mo6303n(r4, r5)
            boolean r1 = r3.mo6102a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0035
            int r1 = r3.f7208e
            if (r1 != r4) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            androidx.media3.common.bk r7 = r0.f8133i
            long r7 = r7.mo6286f(r1)
            goto L_0x0036
        L_0x0035:
            r7 = r5
        L_0x0036:
            boolean r1 = r3.mo6102a()
            if (r1 == 0) goto L_0x0048
            androidx.media3.common.bk r1 = r0.f8133i
            int r5 = r3.f7205b
            int r6 = r3.f7206c
            long r5 = r1.mo6284e(r5, r6)
        L_0x0046:
            r9 = r5
            goto L_0x005a
        L_0x0048:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0055
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r9 = r7
            goto L_0x005a
        L_0x0055:
            androidx.media3.common.bk r1 = r0.f8133i
            long r5 = r1.f7331d
            goto L_0x0046
        L_0x005a:
            boolean r1 = r3.mo6102a()
            if (r1 == 0) goto L_0x0068
            androidx.media3.common.bk r1 = r0.f8133i
            int r4 = r3.f7205b
            r1.mo6288h(r4)
            goto L_0x0071
        L_0x0068:
            int r1 = r3.f7208e
            if (r1 == r4) goto L_0x0071
            androidx.media3.common.bk r4 = r0.f8133i
            r4.mo6288h(r1)
        L_0x0071:
            androidx.media3.exoplayer.cg r15 = new androidx.media3.exoplayer.cg
            long r4 = r2.f8114b
            long r1 = r2.f8115c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2880ci.mo6650d(androidx.media3.common.bm, androidx.media3.exoplayer.cg):androidx.media3.exoplayer.cg");
    }

    /* renamed from: e */
    public final C3036as mo6651e(C2651bm bmVar, Object obj, long j) {
        long j2;
        int a;
        C2651bm bmVar2 = bmVar;
        Object obj2 = obj;
        int i = bmVar2.mo6303n(obj2, this.f8133i).f7330c;
        Object obj3 = this.f8132h;
        if (obj3 == null || (a = bmVar2.mo6020a(obj3)) == -1 || bmVar2.mo6023d(a, this.f8133i, false).f7330c != i) {
            C2877cf cfVar = this.f8128d;
            while (true) {
                if (cfVar == null) {
                    C2877cf cfVar2 = this.f8128d;
                    while (true) {
                        if (cfVar2 != null) {
                            int a2 = bmVar2.mo6020a(cfVar2.f8099b);
                            if (a2 != -1 && bmVar2.mo6023d(a2, this.f8133i, false).f7330c == i) {
                                j2 = cfVar2.f8103f.f8113a.f7207d;
                                break;
                            }
                            cfVar2 = cfVar2.f8105h;
                        } else {
                            j2 = this.f8136l;
                            this.f8136l = 1 + j2;
                            if (this.f8128d == null) {
                                this.f8132h = obj2;
                                this.f8137m = j2;
                            }
                        }
                    }
                } else if (cfVar.f8099b.equals(obj2)) {
                    j2 = cfVar.f8103f.f8113a.f7207d;
                    break;
                } else {
                    cfVar = cfVar.f8105h;
                }
            }
        } else {
            j2 = this.f8137m;
        }
        long j3 = j2;
        bmVar2.mo6303n(obj2, this.f8133i);
        bmVar2.mo6024e(this.f8133i.f7330c, this.f8134j, 0);
        boolean z = false;
        for (int a3 = bmVar.mo6020a(obj); a3 >= this.f8134j.f7350o; a3--) {
            boolean z2 = true;
            bmVar2.mo6023d(a3, this.f8133i, true);
            C2649bk bkVar = this.f8133i;
            if (bkVar.f7334g.f7415c <= 0) {
                z2 = false;
            }
            z |= z2;
            if (bkVar.mo6282c(bkVar.f7331d) != -1) {
                obj2 = this.f8133i.f7329b;
                obj2.getClass();
            }
            if (z && (!z2 || this.f8133i.f7331d != 0)) {
                break;
            }
        }
        return m8003o(bmVar, obj2, j, j3, this.f8134j, this.f8133i);
    }

    /* renamed from: f */
    public final void mo6652f() {
        if (this.f8131g != 0) {
            C2877cf cfVar = this.f8128d;
            C2601a.m6829a(cfVar);
            this.f8132h = cfVar.f8099b;
            this.f8137m = cfVar.f8103f.f8113a.f7207d;
            while (cfVar != null) {
                cfVar.mo6635e();
                cfVar = cfVar.f8105h;
            }
            this.f8128d = null;
            this.f8130f = null;
            this.f8129e = null;
            this.f8131g = 0;
            mo6653g();
        }
    }

    /* renamed from: g */
    public final void mo6653g() {
        C3036as asVar;
        C58480gp e = C58485gu.m89837e();
        for (C2877cf cfVar = this.f8128d; cfVar != null; cfVar = cfVar.f8105h) {
            e.mo55395g(cfVar.f8103f.f8113a);
        }
        C2877cf cfVar2 = this.f8129e;
        if (cfVar2 == null) {
            asVar = null;
        } else {
            asVar = cfVar2.f8103f.f8113a;
        }
        this.f8135k.post(new C2879ch(this, e, asVar));
    }

    /* renamed from: h */
    public final void mo6654h(long j) {
        C2877cf cfVar = this.f8130f;
        if (cfVar != null) {
            C2601a.m6832d(cfVar.mo6639i());
            if (cfVar.f8101d) {
                cfVar.f8098a.mo6818m(j - cfVar.f8108k);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo6655i(C3034aq aqVar) {
        C2877cf cfVar = this.f8130f;
        return cfVar != null && cfVar.f8098a == aqVar;
    }

    /* renamed from: j */
    public final boolean mo6656j(C2877cf cfVar) {
        boolean z = false;
        C2601a.m6832d(cfVar != null);
        if (cfVar.equals(this.f8130f)) {
            return false;
        }
        this.f8130f = cfVar;
        while (true) {
            cfVar = cfVar.f8105h;
            if (cfVar != null) {
                if (cfVar == this.f8129e) {
                    this.f8129e = this.f8128d;
                    z = true;
                }
                cfVar.mo6635e();
                this.f8131g--;
            } else {
                this.f8130f.mo6636f((C2877cf) null);
                mo6653g();
                return z;
            }
        }
    }

    /* renamed from: k */
    public final boolean mo6657k(C2651bm bmVar) {
        C2877cf cfVar;
        C2877cf cfVar2 = this.f8128d;
        if (cfVar2 == null) {
            return true;
        }
        int a = bmVar.mo6020a(cfVar2.f8099b);
        while (true) {
            a = bmVar.mo6298i(a, this.f8133i, this.f8134j, this.f8126b, this.f8127c);
            while (true) {
                cfVar = cfVar2.f8105h;
                if (cfVar != null && !cfVar2.f8103f.f8119g) {
                    cfVar2 = cfVar;
                }
            }
            if (a == -1 || cfVar == null || bmVar.mo6020a(cfVar.f8099b) != a) {
                boolean j = mo6656j(cfVar2);
                cfVar2.f8103f = mo6650d(bmVar, cfVar2.f8103f);
            } else {
                cfVar2 = cfVar;
            }
        }
        boolean j2 = mo6656j(cfVar2);
        cfVar2.f8103f = mo6650d(bmVar, cfVar2.f8103f);
        if (!j2) {
            return true;
        }
        return false;
    }
}
